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

import com.bing.maps.rest.schema.ElevationResult;
import com.bing.maps.rest.schema.GeoLocation;
import com.bing.maps.rest.services.ElevationQuery;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.googleapis.maps.services.BaseGoogleMapsApiQuery;
import com.googleapis.maps.services.GoogleMapsApiUrls;
import com.googleapis.maps.services.ParameterNames;

/**
 * The Class ElevationQueryImpl.
 */
public class ElevationQueryImpl extends BaseBingMapsApiQuery<ElevationResult> implements
	ElevationQuery {
	
	/**
	 * Instantiates a new elevation query impl.
	 * 
	 * @param applicationId the application id
	 */
	public ElevationQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.GoogleSearchQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(BingMapsApiUrls.ELEVATION_URL);
	}

	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.impl.BaseGoogleSearchApiQuery#unmarshall(com.google.gson.JsonElement)
	 */
	@Override
	protected ElevationResult unmarshall(JsonElement object) {
		Gson gson = getGsonBuilder().create();
		return gson.fromJson(object, ElevationResult.class);
	}


	/* (non-Javadoc)
	 * @see com.googleapis.maps.services.ElevationQuery#withLocations(com.googleapis.maps.schema.GeoLocation[])
	 */
	@Override
	public ElevationQuery withLocations(GeoLocation... locations) {
		apiUrlBuilder.withParameter(ParameterNames.LOCATIONS, toParameterString(locations));
		return this;
	}


	/* (non-Javadoc)
	 * @see com.googleapis.maps.services.ElevationQuery#withPath(com.googleapis.maps.schema.GeoLocation[])
	 */
	@Override
	public ElevationQuery withPath(GeoLocation... path) {
		apiUrlBuilder.withParameter(ParameterNames.PATH, toParameterString(path));
		return this;
	}


	/* (non-Javadoc)
	 * @see com.googleapis.maps.services.ElevationQuery#withSamples(int)
	 */
	@Override
	public ElevationQuery withSamples(int samples) {
		apiUrlBuilder.withParameter(ParameterNames.SAMPLES, String.valueOf(samples));
		return this;
	}


	/* (non-Javadoc)
	 * @see com.googleapis.maps.services.ElevationQuery#withSensor(boolean)
	 */
	@Override
	public ElevationQuery withSensor(boolean sensor) {
		apiUrlBuilder.withParameter(ParameterNames.SENSOR, String.valueOf(sensor));
		return this;
	}
}
