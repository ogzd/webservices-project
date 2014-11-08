
package org.netbeans.j2ee.wsdl.niceviewservice.java.hotels;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "hotelsService", targetNamespace = "http://j2ee.netbeans.org/wsdl/NiceViewService/java/hotels", wsdlLocation = "file:/C:/Users/Caecilie/Documents/DTU/Kandidat/E14/02267_SoftwareDevelopmentOfWebServices/webservices-project/NiceViewService/src/conf/xml-resources/web-services/HotelService/wsdl/hotels.wsdl")
public class HotelsService
    extends Service
{

    private final static URL HOTELSSERVICE_WSDL_LOCATION;
    private final static WebServiceException HOTELSSERVICE_EXCEPTION;
    private final static QName HOTELSSERVICE_QNAME = new QName("http://j2ee.netbeans.org/wsdl/NiceViewService/java/hotels", "hotelsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Caecilie/Documents/DTU/Kandidat/E14/02267_SoftwareDevelopmentOfWebServices/webservices-project/NiceViewService/src/conf/xml-resources/web-services/HotelService/wsdl/hotels.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HOTELSSERVICE_WSDL_LOCATION = url;
        HOTELSSERVICE_EXCEPTION = e;
    }

    public HotelsService() {
        super(__getWsdlLocation(), HOTELSSERVICE_QNAME);
    }

    public HotelsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns HotelsPortType
     */
    @WebEndpoint(name = "hotelsPortTypeBindingPort")
    public HotelsPortType getHotelsPortTypeBindingPort() {
        return super.getPort(new QName("http://j2ee.netbeans.org/wsdl/NiceViewService/java/hotels", "hotelsPortTypeBindingPort"), HotelsPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelsPortType
     */
    @WebEndpoint(name = "hotelsPortTypeBindingPort")
    public HotelsPortType getHotelsPortTypeBindingPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://j2ee.netbeans.org/wsdl/NiceViewService/java/hotels", "hotelsPortTypeBindingPort"), HotelsPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HOTELSSERVICE_EXCEPTION!= null) {
            throw HOTELSSERVICE_EXCEPTION;
        }
        return HOTELSSERVICE_WSDL_LOCATION;
    }

}