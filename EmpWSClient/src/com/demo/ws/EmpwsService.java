
package com.demo.ws;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EmpwsService", targetNamespace = "http://ws.demo.com/", wsdlLocation = "http://localhost:8080/Emp/saveEmp?wsdl")
public class EmpwsService
    extends Service
{

    private final static URL EMPWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException EMPWSSERVICE_EXCEPTION;
    private final static QName EMPWSSERVICE_QNAME = new QName("http://ws.demo.com/", "EmpwsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Emp/saveEmp?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EMPWSSERVICE_WSDL_LOCATION = url;
        EMPWSSERVICE_EXCEPTION = e;
    }

    public EmpwsService() {
        super(__getWsdlLocation(), EMPWSSERVICE_QNAME);
    }

    public EmpwsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EMPWSSERVICE_QNAME, features);
    }

    public EmpwsService(URL wsdlLocation) {
        super(wsdlLocation, EMPWSSERVICE_QNAME);
    }

    public EmpwsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EMPWSSERVICE_QNAME, features);
    }

    public EmpwsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmpwsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Empws
     */
    @WebEndpoint(name = "EmpwsPort")
    public Empws getEmpwsPort() {
        return super.getPort(new QName("http://ws.demo.com/", "EmpwsPort"), Empws.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Empws
     */
    @WebEndpoint(name = "EmpwsPort")
    public Empws getEmpwsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.demo.com/", "EmpwsPort"), Empws.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EMPWSSERVICE_EXCEPTION!= null) {
            throw EMPWSSERVICE_EXCEPTION;
        }
        return EMPWSSERVICE_WSDL_LOCATION;
    }

}
