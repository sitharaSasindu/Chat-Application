
package chat;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the chat package. 
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

    private final static QName _LoginOperation_QNAME = new QName("http://Chat/", "LoginOperation");
    private final static QName _LoginOperationResponse_QNAME = new QName("http://Chat/", "LoginOperationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: chat
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginOperation }
     * 
     */
    public LoginOperation createLoginOperation() {
        return new LoginOperation();
    }

    /**
     * Create an instance of {@link LoginOperationResponse }
     * 
     */
    public LoginOperationResponse createLoginOperationResponse() {
        return new LoginOperationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chat/", name = "LoginOperation")
    public JAXBElement<LoginOperation> createLoginOperation(LoginOperation value) {
        return new JAXBElement<LoginOperation>(_LoginOperation_QNAME, LoginOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chat/", name = "LoginOperationResponse")
    public JAXBElement<LoginOperationResponse> createLoginOperationResponse(LoginOperationResponse value) {
        return new JAXBElement<LoginOperationResponse>(_LoginOperationResponse_QNAME, LoginOperationResponse.class, null, value);
    }

}
