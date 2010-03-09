package com.google.code.bing.webservices.client.search.impl;

import javax.xml.ws.WebServiceRef;

import net.virtualearth.dev.webservices.v1.search.ISearchService;
import net.virtualearth.dev.webservices.v1.search.SearchService;

import com.google.code.bing.webservices.client.search.BingMapsSearchServiceClient;

public class BingMapsSearchServiceClientImpl implements
		BingMapsSearchServiceClient {
	
	@WebServiceRef(wsdlLocation="http://dev.virtualearth.net/webservices/v1/metadata/searchservice/dev.virtualearth.net.webservices.v1.search.wsdl")
	static SearchService searchService;
	
	public static void main(String[] args) throws Exception {
		searchService = new SearchService();
		ISearchService proxy = searchService.getBasicHttpBindingISearchService();
		proxy.search(null);
	}
}
