/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import java.sql.*;

public class DBConnection {

    private Connection con; // Database connection
    public Statement st;    // Statement
    public ResultSet rs;  // Result Set
    private PreparedStatement prep;
    public static String id;

    // make the connection with the database
    public DBConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/csachat", "root", "");
            st = con.createStatement();

        } catch (Exception e) {
            System.out.println("Error : " + e);
        }

    }

    // Get login Id of the users from the database
    public boolean getData() {

        try {
            String query = "select loginId from users";
            rs = st.executeQuery(query);

            while (rs.next()) {

                if (id.equals(rs.getString("loginId"))) {

                    return true;
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    // Insert a new user
    public void insertUser(String nickname, String loginID, String password) {
        try {

            String query = "insert into users(nickName,loginId,userpassword)values('" + nickname + "','" + loginID + "','" + password + "')";
            prep = con.prepareStatement(query);
            prep.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    // Check the login id and  the password equals each other
    public boolean userAvailbility(String loginId, String password) {
        try {
            String query = "select loginId,userpassword from users";
            rs = st.executeQuery(query);

            while (rs.next()) {

                if (loginId.equals(rs.getString("loginId"))) {
                    if (password.equals(rs.getString("userpassword"))) {
                        return true;
                    }
                }

            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return false;

    }

    public void createChatThread(String title, String author, String lastEdited) {
        try {
            String query = "insert into thread values('" + title + "','" + author + "','" + lastEdited + "')";
            prep = con.prepareStatement(query);
            prep.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Add a new chat to the database
    public void addChat(String messageContent, String chatTitle, String sender, String lastEdited) {
        System.out.println("ssssssss");
        try {

            String query = "insert into message(message,title,sender,lastEdited) "
                    + "values('" + messageContent + "','" + chatTitle + "','" + sender + "','" + lastEdited + "')";
            prep = con.prepareStatement(query);
            prep.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);

        }
    }

    // update the chat threads table

    public void upadateChatTable(String title, String lastEdited) {
        DBConnection db = new DBConnection();
        String query = "update thread set lastEdited='" + lastEdited + "' where title='" + title + "'";
        try {
            prep = con.prepareStatement(query);
            prep.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
