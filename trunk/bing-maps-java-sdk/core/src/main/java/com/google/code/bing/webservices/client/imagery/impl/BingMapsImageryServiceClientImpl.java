package com.google.code.bing.webservices.client.imagery.impl;

import javax.xml.ws.WebServiceRef;

import net.virtualearth.dev.webservices.v1.common.Credentials;
import net.virtualearth.dev.webservices.v1.common.Heading;
import net.virtualearth.dev.webservices.v1.common.ImageType;
import net.virtualearth.dev.webservices.v1.common.Location;
import net.virtualearth.dev.webservices.v1.common.MapStyle;
import net.virtualearth.dev.webservices.v1.common.SizeOfint;
import net.virtualearth.dev.webservices.v1.common.UriScheme;
import net.virtualearth.dev.webservices.v1.imagery.IImageryService;
import net.virtualearth.dev.webservices.v1.imagery.ImageryMetadataRequest;
import net.virtualearth.dev.webservices.v1.imagery.ImageryService;
import net.virtualearth.dev.webservices.v1.imagery.MapUriOptions;
import net.virtualearth.dev.webservices.v1.imagery.MapUriRequest;
import net.virtualearth.dev.webservices.v1.imagery.MapUriResponse;
import net.virtualearth.dev.webservices.v1.imagery.ObjectFactory;

import com.google.code.bing.webservices.client.BaseBingMapsServiceClientImpl;
import com.google.code.bing.webservices.client.imagery.BingMapsImageryServiceClient;

public class BingMapsImageryServiceClientImpl extends BaseBingMapsServiceClientImpl implements
		BingMapsImageryServiceClient {
	
	private static final ObjectFactory IMAGERY_FACTORY = new ObjectFactory();
	private static final com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory ARRAYS_FACTORY = new com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory();
	
	@WebServiceRef(wsdlLocation="http://dev.virtualearth.net/webservices/v1/metadata/imageryservice/imageryservice.wsdl")
	static ImageryService imageryService;
	
	@Override
	public ImageryMetadataRequestBuilder newImageryMetadataRequestBuilder() {
		return new ImageryMetadataRequestBuilderImpl();
	}

	@Override
	public MapUriRequestBuilder newMapUriRequestBuilder() {
		return new MapUriRequestBuilderImpl();
	}
	
	public static void main(String[] args) throws Exception {
		imageryService = new ImageryService();
		IImageryService proxy = imageryService.getBasicHttpBindingIImageryService();
		MapUriResponse response = proxy.getMapUri(createMapUriRequest());
		System.out.println(response.getUri());
	}
	
	private static MapUriRequest createMapUriRequest() {
		MapUriRequest request = IMAGERY_FACTORY.createMapUriRequest();
		
		Credentials credential = COMMON_FACTORY.createCredentials();
		credential.setApplicationId("AgBXisHgZAEfpDnT95skGJiYu_Oh9XgeAi7O0UJfhg_GdEYB2yeeETJ8ayQ-3kNE");
		request.setCredentials(credential);
		
		Location location = COMMON_FACTORY.createLocation();
		location.setLatitude(24.826942);
		location.setLongitude(67.033665);
		request.setCenter(location);
		
		MapUriOptions mapUriOptions = IMAGERY_FACTORY.createMapUriOptions();
		mapUriOptions.setStyle(MapStyle.AERIAL_WITH_LABELS);
		mapUriOptions.setZoomLevel(10);
		
		SizeOfint sizeOfInt = COMMON_FACTORY.createSizeOfint();
		sizeOfInt.setHeight(400);
		sizeOfInt.setWidth(400);
		mapUriOptions.setImageSize(sizeOfInt);
		request.setOptions(mapUriOptions);
		
		return request;
	}
	
	private static class MapUriRequestBuilderImpl extends BaseRequestBuilderImpl<MapUriRequest, MapUriRequestBuilder> implements MapUriRequestBuilder {
		protected MapUriRequestBuilderImpl() {
			super(IMAGERY_FACTORY.createMapUriRequest());
		}

		@Override
		public MapUriRequestBuilder withCenter(Double altitude,
				Double latitude, Double longitude) {
			if (result.getCenter() == null) {
				result.setCenter(COMMON_FACTORY.createLocation());
			}
			result.getCenter().setAltitude(altitude);
			result.getCenter().setLatitude(latitude);
			result.getCenter().setLongitude(longitude);
			return this;
		}

		@Override
		public MapUriRequestBuilder withMajorRoutesDestination(Double altitude,
				Double latitude, Double longitude) {
			if (result.getMajorRoutesDestination() == null) {
				result.setMajorRoutesDestination(COMMON_FACTORY.createLocation());
			}
			result.getMajorRoutesDestination().setAltitude(altitude);
			result.getMajorRoutesDestination().setLatitude(latitude);
			result.getMajorRoutesDestination().setLongitude(longitude);
			return this;
		}

		@Override
		public MapUriRequestBuilder withOptionsDisplayLayer(String displayLayer) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createMapUriOptions());
			}
			if (result.getOptions().getDisplayLayers() == null) {
				result.getOptions().setDisplayLayers(ARRAYS_FACTORY.createArrayOfstring());
			}
			result.getOptions().getDisplayLayers().getString().add(displayLayer);
			return this;
		}

		@Override
		public MapUriRequestBuilder withOptionsImageSize(Integer width,
				Integer height) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createMapUriOptions());
			}
			SizeOfint sizeOfint = COMMON_FACTORY.createSizeOfint();
			sizeOfint.setWidth(width);
			sizeOfint.setHeight(height);
			result.getOptions().setImageSize(sizeOfint);
			return this;
		}

		@Override
		public MapUriRequestBuilder withOptionsImageType(ImageType imageType) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createMapUriOptions());
			}
			result.getOptions().setImageType(imageType);
			return this;
		}

		@Override
		public MapUriRequestBuilder withOptionsPreventIconCollision(
				Boolean preventIconCollision) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createMapUriOptions());
			}
			result.getOptions().setPreventIconCollision(preventIconCollision);
			return this;
		}

		@Override
		public MapUriRequestBuilder withOptionsStyle(MapStyle mapStyle) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createMapUriOptions());
			}
			result.getOptions().setStyle(mapStyle);
			return this;
		}

		@Override
		public MapUriRequestBuilder withOptionsUriScheme(UriScheme uriScheme) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createMapUriOptions());
			}
			result.getOptions().setUriScheme(uriScheme);
			return this;
		}

		@Override
		public MapUriRequestBuilder withOptionsZoomLevel(Integer zoomLevel) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createMapUriOptions());
			}
			result.getOptions().setZoomLevel(zoomLevel);
			return this;
		}

		@Override
		public MapUriRequestBuilder withPushpin(String iconStyle, String label,
				Double altitude, Double latitude, Double longitude) {
			if (result.getPushpins() == null) {
//				result.setPushpins(COMMON_FACTORY_FACTORY.c);
			}
			// TODO Auto-generated method stub
			return this;
		}
	}
	
	private static class ImageryMetadataRequestBuilderImpl extends BaseRequestBuilderImpl<ImageryMetadataRequest, ImageryMetadataRequestBuilder> implements ImageryMetadataRequestBuilder {

		protected ImageryMetadataRequestBuilderImpl() {
			super(IMAGERY_FACTORY.createImageryMetadataRequest());
		}

		@Override
		public ImageryMetadataRequestBuilder withOptionsHeading(
				Double orientation) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createImageryMetadataOptions());
			}
			Heading heading = COMMON_FACTORY.createHeading();
			heading.setOrientation(orientation);
			result.getOptions().setHeading(heading);
			return this;
		}

		@Override
		public ImageryMetadataRequestBuilder withOptionsLocation(
				Double altitude, Double latitude, Double longitude) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createImageryMetadataOptions());
			}
			Location location = COMMON_FACTORY.createLocation();
			location.setAltitude(altitude);
			location.setLatitude(latitude);
			location.setLongitude(longitude);
			result.getOptions().setLocation(location);
			return this;
		}

		@Override
		public ImageryMetadataRequestBuilder withOptionsReturnImageryProviders(
				Boolean returnImageryProviders) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createImageryMetadataOptions());
			}
			result.getOptions().setReturnImageryProviders(returnImageryProviders);
			return this;
		}

		@Override
		public ImageryMetadataRequestBuilder withOptionsUriScheme(
				UriScheme uriScheme) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createImageryMetadataOptions());
			}
			result.getOptions().setUriScheme(uriScheme);
			return this;
		}

		@Override
		public ImageryMetadataRequestBuilder withOptionsZoomLevel(
				Integer zoomLevel) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createImageryMetadataOptions());
			}
			result.getOptions().setZoomLevel(zoomLevel);
			return this;
		}

		@Override
		public ImageryMetadataRequestBuilder withStyle(MapStyle mapStyle) {
			result.setStyle(mapStyle);
			return this;
		}
	}
}