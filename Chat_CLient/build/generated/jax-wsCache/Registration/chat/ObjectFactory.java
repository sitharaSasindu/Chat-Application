
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

    private final static QName _RagisterResponse_QNAME = new QName("http://Chat/", "ragisterResponse");
    private final static QName _Valid_QNAME = new QName("http://Chat/", "valid");
    private final static QName _ValidResponse_QNAME = new QName("http://Chat/", "validResponse");
    private final static QName _Ragister_QNAME = new QName("http://Chat/", "ragister");
    private final static QName _AddUser_QNAME = new QName("http://Chat/", "AddUser");
    private final static QName _AddUserResponse_QNAME = new QName("http://Chat/", "AddUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: chat
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Valid }
     * 
     */
    public Valid createValid() {
        return new Valid();
    }

    /**
     * Create an instance of {@link ValidResponse }
     * 
     */
    public ValidResponse createValidResponse() {
        return new ValidResponse();
    }

    /**
     * Create an instance of {@link RagisterResponse }
     * 
     */
    public RagisterResponse createRagisterResponse() {
        return new RagisterResponse();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link Ragister }
     * 
     */
    public Ragister createRagister() {
        return new Ragister();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RagisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chat/", name = "ragisterResponse")
    public JAXBElement<RagisterResponse> createRagisterResponse(RagisterResponse value) {
        return new JAXBElement<RagisterResponse>(_RagisterResponse_QNAME, RagisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Valid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chat/", name = "valid")
    public JAXBElement<Valid> createValid(Valid value) {
        return new JAXBElement<Valid>(_Valid_QNAME, Valid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chat/", name = "validResponse")
    public JAXBElement<ValidResponse> createValidResponse(ValidResponse value) {
        return new JAXBElement<ValidResponse>(_ValidResponse_QNAME, ValidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ragister }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chat/", name = "ragister")
    public JAXBElement<Ragister> createRagister(Ragister value) {
        return new JAXBElement<Ragister>(_Ragister_QNAME, Ragister.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chat/", name = "AddUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chat/", name = "AddUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

}
