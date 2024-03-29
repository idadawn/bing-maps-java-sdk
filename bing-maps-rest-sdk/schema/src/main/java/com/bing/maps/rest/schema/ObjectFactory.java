
package com.bing.maps.rest.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.google.code.bing.maps.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Response_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "Response");
    private final static QName _ArrayOfDoubleDouble_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "double");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.google.code.bing.maps.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CoverageArea }
     * 
     */
    public CoverageArea createCoverageArea() {
        return new CoverageArea();
    }

    /**
     * Create an instance of {@link BirdseyeMetadata }
     * 
     */
    public BirdseyeMetadata createBirdseyeMetadata() {
        return new BirdseyeMetadata();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link RoutePath }
     * 
     */
    public RoutePath createRoutePath() {
        return new RoutePath();
    }

    /**
     * Create an instance of {@link ImageryProvider }
     * 
     */
    public ImageryProvider createImageryProvider() {
        return new ImageryProvider();
    }

    /**
     * Create an instance of {@link Link }
     * 
     */
    public Link createLink() {
        return new Link();
    }

    /**
     * Create an instance of {@link ImageryMetadata }
     * 
     */
    public ImageryMetadata createImageryMetadata() {
        return new ImageryMetadata();
    }

    /**
     * Create an instance of {@link ArrayOfChoice1 }
     * 
     */
    public ArrayOfChoice1 createArrayOfChoice1() {
        return new ArrayOfChoice1();
    }

    /**
     * Create an instance of {@link DataflowJob }
     * 
     */
    public DataflowJob createDataflowJob() {
        return new DataflowJob();
    }

    /**
     * Create an instance of {@link Line }
     * 
     */
    public Line createLine() {
        return new Line();
    }

    /**
     * Create an instance of {@link RouteLeg }
     * 
     */
    public RouteLeg createRouteLeg() {
        return new RouteLeg();
    }

    /**
     * Create an instance of {@link Route }
     * 
     */
    public Route createRoute() {
        return new Route();
    }

    /**
     * Create an instance of {@link Point }
     * 
     */
    public Point createPoint() {
        return new Point();
    }

    /**
     * Create an instance of {@link Hint }
     * 
     */
    public Hint createHint() {
        return new Hint();
    }

    /**
     * Create an instance of {@link BoundingBox }
     * 
     */
    public BoundingBox createBoundingBox() {
        return new BoundingBox();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link ResourceSet }
     * 
     */
    public ResourceSet createResourceSet() {
        return new ResourceSet();
    }

    /**
     * Create an instance of {@link ItineraryItem }
     * 
     */
    public ItineraryItem createItineraryItem() {
        return new ItineraryItem();
    }

    /**
     * Create an instance of {@link Warning }
     * 
     */
    public Warning createWarning() {
        return new Warning();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Instruction }
     * 
     */
    public Instruction createInstruction() {
        return new Instruction();
    }

    /**
     * Create an instance of {@link ArrayOfDouble }
     * 
     */
    public ArrayOfDouble createArrayOfDouble() {
        return new ArrayOfDouble();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link ArrayOfResourceSet }
     * 
     */
    public ArrayOfResourceSet createArrayOfResourceSet() {
        return new ArrayOfResourceSet();
    }

    /**
     * Create an instance of {@link Resource }
     * 
     */
    public Resource createResource() {
        return new Resource();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "Response")
    public JAXBElement<Response> createResponse(Response value) {
        return new JAXBElement<Response>(_Response_QNAME, Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "double", scope = ArrayOfDouble.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Double> createArrayOfDoubleDouble(Double value) {
        return new JAXBElement<Double>(_ArrayOfDoubleDouble_QNAME, Double.class, ArrayOfDouble.class, value);
    }

}
