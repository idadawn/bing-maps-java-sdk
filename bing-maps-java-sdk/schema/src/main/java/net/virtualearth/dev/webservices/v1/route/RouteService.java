
package net.virtualearth.dev.webservices.v1.route;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.4-hudson-208-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "RouteService", targetNamespace = "http://dev.virtualearth.net/webservices/v1/route", wsdlLocation = "routeservice.wsdl")
public class RouteService
    extends Service
{

    private final static URL ROUTESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(net.virtualearth.dev.webservices.v1.route.RouteService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = net.virtualearth.dev.webservices.v1.route.RouteService.class.getResource(".");
            url = new URL(baseUrl, "routeservice.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'routeservice.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        ROUTESERVICE_WSDL_LOCATION = url;
    }

    public RouteService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RouteService() {
        super(ROUTESERVICE_WSDL_LOCATION, new QName("http://dev.virtualearth.net/webservices/v1/route", "RouteService"));
    }

    /**
     * 
     * @return
     *     returns IRouteService
     */
    @WebEndpoint(name = "BasicHttpBinding_IRouteService")
    public IRouteService getBasicHttpBindingIRouteService() {
        return super.getPort(new QName("http://dev.virtualearth.net/webservices/v1/route", "BasicHttpBinding_IRouteService"), IRouteService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IRouteService
     */
    @WebEndpoint(name = "BasicHttpBinding_IRouteService")
    public IRouteService getBasicHttpBindingIRouteService(WebServiceFeature... features) {
        return super.getPort(new QName("http://dev.virtualearth.net/webservices/v1/route", "BasicHttpBinding_IRouteService"), IRouteService.class, features);
    }

    /**
     * 
     * @return
     *     returns IRouteService
     */
    @WebEndpoint(name = "CustomBinding_IRouteService")
    public IRouteService getCustomBindingIRouteService() {
        return super.getPort(new QName("http://dev.virtualearth.net/webservices/v1/route", "CustomBinding_IRouteService"), IRouteService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IRouteService
     */
    @WebEndpoint(name = "CustomBinding_IRouteService")
    public IRouteService getCustomBindingIRouteService(WebServiceFeature... features) {
        return super.getPort(new QName("http://dev.virtualearth.net/webservices/v1/route", "CustomBinding_IRouteService"), IRouteService.class, features);
    }

}
