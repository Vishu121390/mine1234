
package com.demo.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.demo.ws package. 
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

    private final static QName _SaveEmpResponse_QNAME = new QName("http://ws.demo.com/", "saveEmpResponse");
    private final static QName _SaveEmp_QNAME = new QName("http://ws.demo.com/", "saveEmp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.demo.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveEmp }
     * 
     */
    public SaveEmp createSaveEmp() {
        return new SaveEmp();
    }

    /**
     * Create an instance of {@link SaveEmpResponse }
     * 
     */
    public SaveEmpResponse createSaveEmpResponse() {
        return new SaveEmpResponse();
    }

    /**
     * Create an instance of {@link Emp }
     * 
     */
    public Emp createEmp() {
        return new Emp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveEmpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demo.com/", name = "saveEmpResponse")
    public JAXBElement<SaveEmpResponse> createSaveEmpResponse(SaveEmpResponse value) {
        return new JAXBElement<SaveEmpResponse>(_SaveEmpResponse_QNAME, SaveEmpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveEmp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demo.com/", name = "saveEmp")
    public JAXBElement<SaveEmp> createSaveEmp(SaveEmp value) {
        return new JAXBElement<SaveEmp>(_SaveEmp_QNAME, SaveEmp.class, null, value);
    }

}
