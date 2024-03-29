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
package com.bing.maps.rest.services;

import com.bing.maps.rest.schema.ElevationResult;
import com.bing.maps.rest.schema.GeoLocation;

/**
 * The Interface ElevationQuery.
 */
public interface ElevationQuery extends BingMapsQuery<ElevationResult> {
	
	/**
	 * With locations.
	 * 
	 * @param locations the locations
	 * 
	 * @return the elevation query
	 */
	public ElevationQuery withLocations(GeoLocation... locations);
	
	/**
	 * With path.
	 * 
	 * @param path the path
	 * 
	 * @return the elevation query
	 */
	public ElevationQuery withPath(GeoLocation... path);
	
	/**
	 * With samples.
	 * 
	 * @param samples the samples
	 * 
	 * @return the elevation query
	 */
	public ElevationQuery withSamples(int samples);
	
	/**
	 * With sensor.
	 * 
	 * @param sensor the sensor
	 * 
	 * @return the elevation query
	 */
	public ElevationQuery withSensor(boolean sensor);
}
