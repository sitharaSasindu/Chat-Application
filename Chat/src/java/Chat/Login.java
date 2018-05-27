/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;


import Chat.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.swing.*;
import java.sql.*;
import javax.jws.WebParam;
import javax.swing.JOptionPane;


/**
 *
 * @author Sithara
 * UOW id - w1654468
 * IIt - 2016372
 */

@WebService(serviceName = "Login")
public class Login {

  Connection con = null;
    ResultSet rs = null;
    PreparedStatement stat = null;

    /**
     * Web service operation
     */
    @WebMethod(operationName = "LoginOperation")//getting details through the web service
    public String LoginOperation(@WebParam(name = "loginId") String loginId, @WebParam(name = "password") String password) {
     
        try{//query to check datbase details
            String sql = "select * from users where LoginId=? and Password=?";
            stat =  Connect.getCon().prepareStatement(sql);
            stat.setString(1, loginId);
            stat.setString(2, password);
            rs = stat.executeQuery();
         
             if(rs.next()){//if resultset is available return true
                return "True";    
                
            } else{ //else return flase
           return "False";
            }
        
        }catch(Exception e){
            return "False";
    }
    }
}
