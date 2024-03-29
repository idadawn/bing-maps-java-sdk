/*
 * Copyright 2010 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.bing.maps.rest.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.bing.maps.rest.schema.DirectionsResult;
import com.bing.maps.rest.schema.GeoLocation;
import com.bing.maps.rest.schema.Language;
import com.bing.maps.rest.schema.RouteType;
import com.bing.maps.rest.schema.TravelMode;
import com.bing.maps.rest.schema.UnitSystem;
import com.bing.maps.rest.services.DirectionsQuery;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.googleapis.maps.services.BaseGoogleMapsApiQuery;
import com.googleapis.maps.services.GoogleMapsApiUrls;
import com.googleapis.maps.services.ParameterNames;

/**
 * The Class DirectionsQueryImpl.
 */
public class DirectionsQueryImpl extends BaseBingMapsApiQuery<DirectionsResult> implements
	DirectionsQuery {
	
	/**
	 * Instantiates a new directions query impl.
	 * 
	 * @param applicationId the application id
	 */
	public DirectionsQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.GoogleSearchQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(BingMapsApiUrls.DIRECTIONS_URL);
	}

	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.impl.BaseGoogleSearchApiQuery#unmarshall(com.google.gson.JsonElement)
	 */
	@Override
	protected DirectionsResult unmarshall(JsonElement object) {
		Gson gson = getGsonBuilder().create();
		return gson.fromJson(object, DirectionsResult.class);
	}


	/* (non-Javadoc)
	 * @see com.googleapis.maps.services.DirectionsQuery#withAlternatives(boolean)
	 */
	@Override
	public DirectionsQuery withAlternatives(boolean alternatives) {
		apiUrlBuilder.withParameter(ParameterNames.ALTERNATIVES, String.valueOf(alternatives));
		return this;
	}


	/* (non-Javadoc)
	 * @see com.googleapis.maps.services.DirectionsQuery#withAvoid(com.googleapis.maps.schema.RouteType)
	 */
	@Override
	public DirectionsQuery withAvoid(RouteType avoid) {
		apiUrlBuilder.withParameterEnum(ParameterNames.AVOID, avoid);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.googleapis.maps.services.DirectionsQuery#withDestination(java.lang.String)
	 */
	@Override
	public DirectionsQuery withDestination(String destination) {
		apiUrlBuilder.withParameter(ParameterNames.DESTINATION, destination);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.googleapis.maps.services.DirectionsQuery#withDestination(com.googleapis.maps.schema.GeoLocation)
	 */
	@Override
	public DirectionsQuery withDestination(GeoLocation destination) {
		apiUrlBuilder.withParameter(ParameterNames.DESTINATION, toParameterString(destination));
		return this;
	}


	/* (non-Javadoc)
	 * @see com.googleapis.maps.services.DirectionsQuery#withLanguage(com.googleapis.maps.schema.Language)
	 */
	@Override
	public DirectionsQuery withLanguage(Language language) {
		apiUrlBuilder.withParameterEnum(ParameterNames.LANGUAGE, language);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.googleapis.maps.services.DirectionsQuery#withMode(com.googleapis.maps.schema.TravelMode)
	 */
	@Override
	public DirectionsQuery withMode(TravelMode mode) {
		apiUrlBuilder.withParameterEnum(ParameterNames.MODE, mode);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.googleapis.maps.services.DirectionsQuery#withOrigin(java.lang.String)
	 */
	@Override
	public DirectionsQuery withOrigin(String origin) {
		apiUrlBuilder.withParameter(ParameterNames.ORIGIN, origin);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.googleapis.maps.services.DirectionsQuery#withOrigin(com.googleapis.maps.schema.GeoLocation)
	 */
	@Override
	public DirectionsQuery withOrigin(GeoLocation origin) {
		apiUrlBuilder.withParameter(ParameterNames.ORIGIN, toParameterString(origin));
		return this;
	}


	/* (non-Javadoc)
	 * @see com.googleapis.maps.services.DirectionsQuery#withSensor(boolean)
	 */
	@Override
	public DirectionsQuery withSensor(boolean sensor) {
		apiUrlBuilder.withParameter(ParameterNames.SENSOR, String.valueOf(sensor));
		return this;
	}


	/* (non-Javadoc)
	 * @see com.googleapis.maps.services.DirectionsQuery#withUnits(com.googleapis.maps.schema.UnitSystem)
	 */
	@Override
	public DirectionsQuery withUnits(UnitSystem units) {
		apiUrlBuilder.withParameterEnum(ParameterNames.UNITS, units);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.googleapis.maps.services.DirectionsQuery#withWaypoints(java.lang.String[])
	 */
	@Override
	public DirectionsQuery withWaypoints(String... waypoints) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < waypoints.length; i++) {
			builder.append(waypoints[i]);
			if (i < waypoints.length - 1) {
				builder.append("|");
			}
		}
		apiUrlBuilder.withParameter(ParameterNames.WAYPOINTS, builder.toString());
		return this;
	}


	/* (non-Javadoc)
	 * @see com.googleapis.maps.services.DirectionsQuery#withWaypoints(com.googleapis.maps.schema.GeoLocation[])
	 */
	@Override
	public DirectionsQuery withWaypoints(GeoLocation... waypoints) {
		apiUrlBuilder.withParameter(ParameterNames.WAYPOINTS, toParameterString(waypoints));
		return this;
	}
	
	/* (non-Javadoc)
	 * @see com.googleapis.maps.services.impl.BaseGoogleMapsApiQuery#unmarshallList(com.google.gson.JsonObject)
	 */
	protected List<DirectionsResult> unmarshallList(JsonObject response) {
		String status = response.get("status").getAsString();
		if (!"OK".equals(status) && !"ZERO_RESULTS".equals(status)) {
			throw createGoogleMapsException(status);
		}
		ArrayList<DirectionsResult> list = new ArrayList<DirectionsResult>();
		JsonArray results = response.get("routes").getAsJsonArray();
		for (JsonElement object : results) {
			DirectionsResult element = unmarshall(object);
			list.add(element);
		}
		return list;
	}
}
