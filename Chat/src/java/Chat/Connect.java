/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Sithara
 * UOW id - w1654468
 * IIt - 2016372
 */
public class Connect {
    
    
 public static Connection con;


public static Connection getCon() { //return the connection to use it in any class
    try {
        Class.forName("com.mysql.jdbc.Driver");
        //TODO: Database details froma global file
        con=DriverManager.getConnection("jdbc:mysql://localhost/csachat", "root", "");
        System.out.println("Succesfully Connected to Database"); 
    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("Connection Failed, Chech the database name and username");
    }
    return con;
}
}

