package com.google.code.bing.webservices.client.geocode.impl;

import java.util.concurrent.Future;

import javax.xml.ws.WebServiceRef;

import net.virtualearth.dev.webservices.v1.common.Confidence;
import net.virtualearth.dev.webservices.v1.common.Credentials;
import net.virtualearth.dev.webservices.v1.common.ResponseSummary;
import net.virtualearth.dev.webservices.v1.geocode.ArrayOfFilterBase;
import net.virtualearth.dev.webservices.v1.geocode.ConfidenceFilter;
import net.virtualearth.dev.webservices.v1.geocode.GeocodeOptions;
import net.virtualearth.dev.webservices.v1.geocode.GeocodeRequest;
import net.virtualearth.dev.webservices.v1.geocode.GeocodeResponse;
import net.virtualearth.dev.webservices.v1.geocode.GeocodeService;
import net.virtualearth.dev.webservices.v1.geocode.IGeocodeService;
import net.virtualearth.dev.webservices.v1.geocode.IGeocodeServiceGeocodeResponseSummaryFaultFaultMessage;
import net.virtualearth.dev.webservices.v1.geocode.IGeocodeServiceReverseGeocodeResponseSummaryFaultFaultMessage;
import net.virtualearth.dev.webservices.v1.geocode.ObjectFactory;
import net.virtualearth.dev.webservices.v1.geocode.ReverseGeocodeRequest;
import net.virtualearth.dev.webservices.v1.geocode.contracts.ReverseGeocodeResponse;

import com.google.code.bing.webservices.client.Adaptable;
import com.google.code.bing.webservices.client.AdaptableFuture;
import com.google.code.bing.webservices.client.BaseBingMapsServiceClientImpl;
import com.google.code.bing.webservices.client.exception.BingMapsGeocodeServiceClientException;
import com.google.code.bing.webservices.client.geocode.BingMapsGeocodeServiceClient;

public class BingMapsGeocodeServiceClientImpl extends BaseBingMapsServiceClientImpl implements
		BingMapsGeocodeServiceClient {
	private static final ObjectFactory GEOCODE_FACTORY = new ObjectFactory();
	
	@WebServiceRef(wsdlLocation="geocodeservice.wsdl")
	static GeocodeService geocodeService;
	
	@Override
	public GeocodeResponse geocode(GeocodeRequest request) {
		IGeocodeService proxy = geocodeService.getBasicHttpBindingIGeocodeService();
		try {
			return proxy.geocode(request);
		} catch (IGeocodeServiceGeocodeResponseSummaryFaultFaultMessage e) {
			throw createException(e.getMessage(), e.getCause(), e.getFaultInfo());
		}
	}

	@Override
	public Future<GeocodeResponse> geocodeAsync(GeocodeRequest request) {
		IGeocodeService proxy = geocodeService.getBasicHttpBindingIGeocodeService();
		return new AdaptableFuture<GeocodeResponse, net.virtualearth.dev.webservices.v1.geocode.contracts.GeocodeResponse>(proxy.geocodeAsync(request), new Adaptable<GeocodeResponse, net.virtualearth.dev.webservices.v1.geocode.contracts.GeocodeResponse>() {
			@Override
			public GeocodeResponse adaptFrom(
					net.virtualearth.dev.webservices.v1.geocode.contracts.GeocodeResponse adaptee) {
				return adaptee.getGeocodeResult();
			}

			@Override
			public net.virtualearth.dev.webservices.v1.geocode.contracts.GeocodeResponse adaptTo(
					GeocodeResponse adapter) {
				return null;
			}
		});
	}

	@Override
	public GeocodeResponse reverseGeocode(ReverseGeocodeRequest request) {
		IGeocodeService proxy = geocodeService.getBasicHttpBindingIGeocodeService();
		try {
			return proxy.reverseGeocode(request);
		} catch (IGeocodeServiceReverseGeocodeResponseSummaryFaultFaultMessage e) {
			throw createException(e.getMessage(), e.getCause(), e.getFaultInfo());
		}
	}

	@Override
	public Future<GeocodeResponse> reverseGeocodeAsync(
			ReverseGeocodeRequest request) {
		IGeocodeService proxy = geocodeService.getBasicHttpBindingIGeocodeService();
		return new AdaptableFuture<GeocodeResponse, net.virtualearth.dev.webservices.v1.geocode.contracts.ReverseGeocodeResponse>(proxy.reverseGeocodeAsync(request), new Adaptable<GeocodeResponse, net.virtualearth.dev.webservices.v1.geocode.contracts.ReverseGeocodeResponse>() {
			@Override
			public GeocodeResponse adaptFrom(ReverseGeocodeResponse adaptee) {
				return adaptee.getReverseGeocodeResult();
			}

			@Override
			public ReverseGeocodeResponse adaptTo(GeocodeResponse adapter) {
				return null;
			}
		});
	}
	
	@Override
	public GeocodeRequestBuilder newGeocodeRequestBuilder() {
		return new GeocodeRequestBuilderImpl();
	}

	@Override
	public ReverseGeocodeRequestBuilder newReverseGeocodeRequestBuilder() {
		return new ReverseGeocodeRequestBuilderImpl();
	}
	
	/**
	 * @param e
	 */
	private BingMapsGeocodeServiceClientException createException(String message, Throwable cause, ResponseSummary faultInfo) {
		String authenticationResultCode = (faultInfo.getAuthenticationResultCode() == null) ? null : faultInfo.getAuthenticationResultCode().value();
		String statusCode = (faultInfo.getStatusCode() == null)? null : faultInfo.getStatusCode().value();
		return new BingMapsGeocodeServiceClientException(message, cause, authenticationResultCode, faultInfo.getCopyright(), faultInfo.getFaultReason(), statusCode, faultInfo.getTraceId());
	}

	public static void main(String[] args) throws Exception {
		geocodeService = new GeocodeService();
		IGeocodeService proxy = geocodeService.getBasicHttpBindingIGeocodeService();
		GeocodeResponse response = proxy.geocode(createGeocodeRequest());
		System.out.println(response.getResults().getGeocodeResult().get(0).getDisplayName());
	}
	
	private static GeocodeRequest createGeocodeRequest() {
		GeocodeRequest request = GEOCODE_FACTORY.createGeocodeRequest();
		
		Credentials credential = COMMON_FACTORY.createCredentials();
		credential.setApplicationId("AgBXisHgZAEfpDnT95skGJiYu_Oh9XgeAi7O0UJfhg_GdEYB2yeeETJ8ayQ-3kNE");
		request.setCredentials(credential);
		request.setQuery("1 Microsoft Way, Redmond, WA");
		
		GeocodeOptions geocodeOptions = GEOCODE_FACTORY.createGeocodeOptions();

		ArrayOfFilterBase array = GEOCODE_FACTORY.createArrayOfFilterBase();
		ConfidenceFilter filter = GEOCODE_FACTORY.createConfidenceFilter();
		filter.setMinimumConfidence(Confidence.HIGH);
		array.getFilterBase().add(filter);
		geocodeOptions.setFilters(array);
		request.setOptions(geocodeOptions);
		
		return request;
	}
	
	private static class GeocodeRequestBuilderImpl extends BaseRequestBuilderImpl<GeocodeRequest, GeocodeRequestBuilder> implements GeocodeRequestBuilder {

		protected GeocodeRequestBuilderImpl() {
			super(GEOCODE_FACTORY.createGeocodeRequest());
		}

		@Override
		public GeocodeRequestBuilder withAddressAdminDistrict(
				String adminDistrict) {
			if (result.getAddress() == null) {
				result.setAddress(COMMON_FACTORY.createAddress());				
			}
			result.getAddress().setAdminDistrict(adminDistrict);
			return this;
		}

		@Override
		public GeocodeRequestBuilder withAddressCountryRegion(
				String countryRegion) {
			if (result.getAddress() == null) {
				result.setAddress(COMMON_FACTORY.createAddress());				
			}
			result.getAddress().setCountryRegion(countryRegion);
			return this;
		}

		@Override
		public GeocodeRequestBuilder withAddressDistrict(String district) {
			if (result.getAddress() == null) {
				result.setAddress(COMMON_FACTORY.createAddress());				
			}
			result.getAddress().setDistrict(district);
			return this;
		}

		@Override
		public GeocodeRequestBuilder withAddressFormattedAddress(
				String formattedAddress) {
			if (result.getAddress() == null) {
				result.setAddress(COMMON_FACTORY.createAddress());				
			}
			result.getAddress().setFormattedAddress(formattedAddress);
			return this;
		}

		@Override
		public GeocodeRequestBuilder withAddressLine(String addressLine) {
			if (result.getAddress() == null) {
				result.setAddress(COMMON_FACTORY.createAddress());				
			}
			result.getAddress().setAddressLine(addressLine);
			return this;
		}

		@Override
		public GeocodeRequestBuilder withAddressLocality(String locality) {
			if (result.getAddress() == null) {
				result.setAddress(COMMON_FACTORY.createAddress());				
			}
			result.getAddress().setLocality(locality);
			return this;
		}

		@Override
		public GeocodeRequestBuilder withAddressPostalCode(String postalCode) {
			if (result.getAddress() == null) {
				result.setAddress(COMMON_FACTORY.createAddress());				
			}
			result.getAddress().setPostalCode(postalCode);
			return this;
		}

		@Override
		public GeocodeRequestBuilder withAddressPostalTown(String postalTown) {
			if (result.getAddress() == null) {
				result.setAddress(COMMON_FACTORY.createAddress());				
			}
			result.getAddress().setPostalTown(postalTown);
			return this;
		}

		@Override
		public GeocodeRequestBuilder withOptionsCount(Integer count) {
			if (result.getOptions() == null) {
				result.setOptions(GEOCODE_FACTORY.createGeocodeOptions());
			}
			result.getOptions().setCount(count);
			return this;
		}

		@Override
		public GeocodeRequestBuilder withOptionsFilter(Confidence confidence) {
			if (result.getOptions() == null) {
				result.setOptions(GEOCODE_FACTORY.createGeocodeOptions());
			}
			if (result.getOptions().getFilters() == null) {
				result.getOptions().setFilters(GEOCODE_FACTORY.createArrayOfFilterBase());
			}
			ConfidenceFilter confidenceFilter = GEOCODE_FACTORY.createConfidenceFilter();
			confidenceFilter.setMinimumConfidence(confidence);
			result.getOptions().getFilters().getFilterBase().add(confidenceFilter);
			return this;
		}

		@Override
		public GeocodeRequestBuilder withQuery(String query) {
			result.setQuery(query);
			return this;
		}
	}
	
	private static class ReverseGeocodeRequestBuilderImpl extends BaseRequestBuilderImpl<ReverseGeocodeRequest, ReverseGeocodeRequestBuilder> implements ReverseGeocodeRequestBuilder {

		protected ReverseGeocodeRequestBuilderImpl() {
			super(GEOCODE_FACTORY.createReverseGeocodeRequest());
		}

		@Override
		public ReverseGeocodeRequestBuilder withLocation(Double altitude,
				Double latitude, Double longitude) {
			if (result.getLocation() == null) {
				result.setLocation(COMMON_FACTORY.createLocation());
			}
			result.getLocation().setAltitude(altitude);
			result.getLocation().setLatitude(latitude);
			result.getLocation().setLongitude(longitude);
			return this;
		}
	}
}