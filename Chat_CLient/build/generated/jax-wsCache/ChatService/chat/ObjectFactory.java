
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

    private final static QName _GetThreadData_QNAME = new QName("http://Chat/", "getThreadData");
    private final static QName _ShowChats_QNAME = new QName("http://Chat/", "showChats");
    private final static QName _AddMessage_QNAME = new QName("http://Chat/", "addMessage");
    private final static QName _CheckTitleResponse_QNAME = new QName("http://Chat/", "checkTitleResponse");
    private final static QName _GetThreadDataResponse_QNAME = new QName("http://Chat/", "getThreadDataResponse");
    private final static QName _ShowChatsResponse_QNAME = new QName("http://Chat/", "showChatsResponse");
    private final static QName _CheckTitle_QNAME = new QName("http://Chat/", "checkTitle");
    private final static QName _CreateThraed_QNAME = new QName("http://Chat/", "createThraed");
    private final static QName _UpdateTable_QNAME = new QName("http://Chat/", "updateTable");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: chat
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetThreadData }
     * 
     */
    public GetThreadData createGetThreadData() {
        return new GetThreadData();
    }

    /**
     * Create an instance of {@link ShowChats }
     * 
     */
    public ShowChats createShowChats() {
        return new ShowChats();
    }

    /**
     * Create an instance of {@link CheckTitle }
     * 
     */
    public CheckTitle createCheckTitle() {
        return new CheckTitle();
    }

    /**
     * Create an instance of {@link CreateThraed }
     * 
     */
    public CreateThraed createCreateThraed() {
        return new CreateThraed();
    }

    /**
     * Create an instance of {@link UpdateTable }
     * 
     */
    public UpdateTable createUpdateTable() {
        return new UpdateTable();
    }

    /**
     * Create an instance of {@link AddMessage }
     * 
     */
    public AddMessage createAddMessage() {
        return new AddMessage();
    }

    /**
     * Create an instance of {@link CheckTitleResponse }
     * 
     */
    public CheckTitleResponse createCheckTitleResponse() {
        return new CheckTitleResponse();
    }

    /**
     * Create an instance of {@link GetThreadDataResponse }
     * 
     */
    public GetThreadDataResponse createGetThreadDataResponse() {
        return new GetThreadDataResponse();
    }

    /**
     * Create an instance of {@link ShowChatsResponse }
     * 
     */
    public ShowChatsResponse createShowChatsResponse() {
        return new ShowChatsResponse();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link ChatThread }
     * 
     */
    public ChatThread createChatThread() {
        return new ChatThread();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThreadData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chat/", name = "getThreadData")
    public JAXBElement<GetThreadData> createGetThreadData(GetThreadData value) {
        return new JAXBElement<GetThreadData>(_GetThreadData_QNAME, GetThreadData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowChats }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chat/", name = "showChats")
    public JAXBElement<ShowChats> createShowChats(ShowChats value) {
        return new JAXBElement<ShowChats>(_ShowChats_QNAME, ShowChats.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chat/", name = "addMessage")
    public JAXBElement<AddMessage> createAddMessage(AddMessage value) {
        return new JAXBElement<AddMessage>(_AddMessage_QNAME, AddMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chat/", name = "checkTitleResponse")
    public JAXBElement<CheckTitleResponse> createCheckTitleResponse(CheckTitleResponse value) {
        return new JAXBElement<CheckTitleResponse>(_CheckTitleResponse_QNAME, CheckTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThreadDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chat/", name = "getThreadDataResponse")
    public JAXBElement<GetThreadDataResponse> createGetThreadDataResponse(GetThreadDataResponse value) {
        return new JAXBElement<GetThreadDataResponse>(_GetThreadDataResponse_QNAME, GetThreadDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowChatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chat/", name = "showChatsResponse")
    public JAXBElement<ShowChatsResponse> createShowChatsResponse(ShowChatsResponse value) {
        return new JAXBElement<ShowChatsResponse>(_ShowChatsResponse_QNAME, ShowChatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chat/", name = "checkTitle")
    public JAXBElement<CheckTitle> createCheckTitle(CheckTitle value) {
        return new JAXBElement<CheckTitle>(_CheckTitle_QNAME, CheckTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateThraed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chat/", name = "createThraed")
    public JAXBElement<CreateThraed> createCreateThraed(CreateThraed value) {
        return new JAXBElement<CreateThraed>(_CreateThraed_QNAME, CreateThraed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chat/", name = "updateTable")
    public JAXBElement<UpdateTable> createUpdateTable(UpdateTable value) {
        return new JAXBElement<UpdateTable>(_UpdateTable_QNAME, UpdateTable.class, null, value);
    }

}
