/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import java.util.ArrayList;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author DELL
 */
@WebService(serviceName = "ChatService")
public class ChatService {

    private DBConnection db;

    // Create a new Chat Thread
    @WebMethod(operationName = "createThraed")
    @Oneway
    public void createThraed(@WebParam(name = "title") String title, @WebParam(name = "author") String author, @WebParam(name = "lastEdited") String lastEdited) {
        db = new DBConnection();
        db.createChatThread(title, author, lastEdited);

    }

    /**
     * Add a new Message
     */
    @WebMethod(operationName = "addMessage")
    @Oneway
    public void addMessage(@WebParam(name = "messageContent") String messageContent, @WebParam(name = "title") String title, @WebParam(name = "sender") String sender, @WebParam(name = "lastEdited") String lastEdited) {

        db = new DBConnection();
        db.addChat(messageContent, title, sender, lastEdited);

    }

    /**
     * Check whether the given chat title is empty or not
     */
    @WebMethod(operationName = "checkTitle")
    public boolean checkTitle(@WebParam(name = "title") String title) {
        if (title.equals("")) {
            return true;
        }
        return false;
    }

    /**
     * Update the chat threads table
     */
    @WebMethod(operationName = "updateTable")
    @Oneway
    public void updateTable(@WebParam(name = "title") String title, @WebParam(name = "lastEdited") String lastEdited) {
        DBConnection db = new DBConnection();
        db.upadateChatTable(title, lastEdited);

    }

    /**
     * Send the chat thread data to the client
     */
    @WebMethod(operationName = "getThreadData")
    public ChatThread[] getChatThreadData() {
        String query = "select * from thread";
        List<Object> chatThreads = new ArrayList<Object>();
        db = new DBConnection();
        try {
            db.rs = db.st.executeQuery(query);
            while (db.rs.next()) {
                ChatThread newThread = new ChatThread();
                newThread.setTitle(db.rs.getString("title"));
                newThread.setAuthor(db.rs.getString("author"));
                newThread.setLastEdited(db.rs.getTimestamp("lastEdited").toString());

                chatThreads.add(newThread);

            }
        } catch (Exception e) {
            System.out.println(e);

        }

        return chatThreads.toArray(new ChatThread[chatThreads.size()]);
    }

    /**
     * Send Chat data to the client
     */
    @WebMethod(operationName = "showChats")
    public Message[] showChats(@WebParam(name = "chatTitle") String chatTitle) {

        String query = "select message,sender,lastEdited"
                + " from message where title='" + chatTitle + "'";
        List<Object> chatMessages = new ArrayList<Object>();
        db = new DBConnection();
        try {
            db.rs = db.st.executeQuery(query);
            while (db.rs.next()) {
                Message message = new Message();
                message.setMessageContent(db.rs.getString("message"));
                message.setSender(db.rs.getString("sender"));
                message.setLastEdited(db.rs.getTimestamp("lastEdited").toString());

                chatMessages.add(message);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return chatMessages.toArray(new Message[chatMessages.size()]);
    }

}
