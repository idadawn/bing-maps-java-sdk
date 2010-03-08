
package net.virtualearth.dev.webservices.v1.imagery;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.0_02-b08-fcs
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "ImageryService", targetNamespace = "http://dev.virtualearth.net/webservices/v1/imagery", wsdlLocation = "imageryservice.wsdl")
public class ImageryService
    extends Service
{

    private final static URL IMAGERYSERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("file:/E:/workspace/opensource/bing-maps-java-sdk/schema/src/main/resources/com/google/code/bing/webservices/schema/imageryservice.wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        IMAGERYSERVICE_WSDL_LOCATION = url;
    }

    public ImageryService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ImageryService() {
        super(IMAGERYSERVICE_WSDL_LOCATION, new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ImageryService"));
    }

    /**
     * 
     * @return
     *     returns IImageryService
     */
    @WebEndpoint(name = "BasicHttpBinding_IImageryService")
    public IImageryService getBasicHttpBindingIImageryService() {
        return (IImageryService)super.getPort(new QName("http://dev.virtualearth.net/webservices/v1/imagery", "BasicHttpBinding_IImageryService"), IImageryService.class);
    }

    /**
     * 
     * @return
     *     returns IImageryService
     */
    @WebEndpoint(name = "CustomBinding_IImageryService")
    public IImageryService getCustomBindingIImageryService() {
        return (IImageryService)super.getPort(new QName("http://dev.virtualearth.net/webservices/v1/imagery", "CustomBinding_IImageryService"), IImageryService.class);
    }

}