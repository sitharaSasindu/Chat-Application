/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author Sithara
 * UOW id - w1654468
 * IIt - 2016372
 */
public class InsertUser {
    Connection con = null;
    ResultSet rscheck = null;
    PreparedStatement statcheck = null;
    
     public int insert(User user){//sending collected registraion data to database
        int i = 0;
             
        
        try{
           PreparedStatement stat =  Connect.getCon().prepareStatement("insert into users values(?,?,?)");
           stat.setString(1, user.getName());//sending collected registration details
           stat.setString(2, user.getLoginId());
           stat.setString(3, user.getPass());
           i = stat.executeUpdate();
           
        }catch (Exception e){
            System.out.println("ERROR" + e);
        }
       return i;
    }
     
   
    
}
