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

import com.googleapis.maps.services.DirectionsQueryImpl;
import com.googleapis.maps.services.ElevationQueryImpl;
import com.googleapis.maps.services.GeocodingQueryImpl;
import com.googleapis.maps.services.PlacesQueryImpl;



/**
 * A factory for creating GoogleMapsQuery objects.
 */
public class BingMapsQueryFactory {

    /** The application key. */
    private String applicationKey;

    /**
     * Instantiates a new google maps query factory.
     * 
     * @param applicationKey the application key
     */
	private BingMapsQueryFactory(String applicationKey) {
        this.applicationKey = applicationKey;
    }
	
    /**
     * New instance.
     * 
     * @param applicationKey the application key
     * 
     * @return the google maps query factory
     */
    public static BingMapsQueryFactory newInstance(String applicationKey) {
        return new BingMapsQueryFactory(applicationKey);
    }
    
    /**
     * New geocoding query.
     * 
     * @return the geocoding query
     */
    public GeocodingQuery newGeocodingQuery() {
    	return new GeocodingQueryImpl(applicationKey);
    }
    
    /**
     * New directions query.
     * 
     * @return the directions query
     */
    public DirectionsQuery newDirectionsQuery() {
    	return new DirectionsQueryImpl(applicationKey);
    }
    
    /**
     * New elevation query.
     * 
     * @return the elevation query
     */
    public ElevationQuery newElevationQuery() {
    	return new ElevationQueryImpl(applicationKey);
    }
    
    /**
     * New places query.
     * 
     * @return the places query
     */
    public PlacesQuery newPlacesQuery() {
    	return new PlacesQueryImpl(applicationKey);
    }
}
