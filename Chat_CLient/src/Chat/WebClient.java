/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

/**
 *
 * @author sithara
 * 2016372
 * w1654468
 */
public class WebClient {

     public static String ragister(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
        chat.Registration_Service service = new chat.Registration_Service();
        chat.Registration port = service.getRegistrationPort();
        return port.ragister(arg0, arg1, arg2, arg3);
    }
    
        public static String loginOperation(java.lang.String loginId, java.lang.String password) {
        chat.Login_Service service = new chat.Login_Service();
        chat.Login port = service.getLoginPort();
        return port.loginOperation(loginId, password);
    }

   
        
    public static java.util.List<chat.ChatThread> getThreadData() {
        chat.ChatService_Service service = new chat.ChatService_Service();
        chat.ChatService port = service.getChatServicePort();
        return port.getThreadData();
    }

    public static java.util.List<chat.Message> showChats(java.lang.String chatTitle) {
        chat.ChatService_Service service = new chat.ChatService_Service();
        chat.ChatService port = service.getChatServicePort();
        return port.showChats(chatTitle);
    }

    public static boolean checkLoginId(java.lang.String loginId) {
        chat.UserService_Service service = new chat.UserService_Service();
        chat.UserService port = service.getUserServicePort();
        return port.checkLoginId(loginId);
    }

    public static boolean checkUser(java.lang.String loginId, java.lang.String password) {
        chat.UserService_Service service = new chat.UserService_Service();
        chat.UserService port = service.getUserServicePort();
        return port.checkUser(loginId, password);
    }

    public static void createThraed(java.lang.String title, java.lang.String author, java.lang.String lastEdited) {
        chat.ChatService_Service service = new chat.ChatService_Service();
        chat.ChatService port = service.getChatServicePort();
        port.createThraed(title, author, lastEdited);
    }

    

    public static boolean checkTitle(java.lang.String title) {
        chat.ChatService_Service service = new chat.ChatService_Service();
        chat.ChatService port = service.getChatServicePort();
        return port.checkTitle(title);
    }

    public static void updateTable(java.lang.String title, java.lang.String lastEdited) {
        chat.ChatService_Service service = new chat.ChatService_Service();
        chat.ChatService port = service.getChatServicePort();
        port.updateTable(title, lastEdited);
    }

    public static void addMessage(java.lang.String messageContent, java.lang.String title, java.lang.String sender, java.lang.String lastEdited) {
        chat.ChatService_Service service = new chat.ChatService_Service();
        chat.ChatService port = service.getChatServicePort();
        port.addMessage(messageContent, title, sender, lastEdited);
    }
}
