/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author #Property_Of_Ss
 */
@WebService(serviceName = "Registration")
public class Registration {

    String name, loginId, pswrd, repswrd;
      Connection con = null;
    ResultSet rs = null;
    PreparedStatement stat = null;
    
    
    public boolean valid(){//validation of registration
        
    
        if(name.equals("")){
            Util.showMessage(null, "Please Enter Your Name");
          
            return false;
        }else if(loginId.equals("")){
            Util.showMessage(null, "Please Enter a Login Id");
          
            return false;
        }else if(pswrd.equals("")){
            Util.showMessage(null, "Please Enter a Password");
         
            return false;
         }else if(repswrd.equals("")){
            Util.showMessage(null, "Please Enter a Password");
          
            return false;
         }else if(!pswrd.equals(repswrd)){
            Util.showError(null, "Password Mismatch. Please Check Again!");
           
            return false;
        } else{
             return true;
         }
        
       
    }

    public void AddUser(){//if validation true adding the user
   
    if(valid()){
            User user= new User();
            user.setName((name));
            user.setLoginId(loginId);
            user.setPass(pswrd);
            
            InsertUser newInsert = new InsertUser();//this will send the details to Insert user calss
            int i = newInsert.insert(user);//then it will add them to db

        }
    }

    /**
     * Web service operation
     */
    public String ragister(String name, String loginid, String password, String repassword) {
 
        this.name = name;
        this.loginId = loginid;
        this.pswrd = password;
        this.repswrd = repassword;       
        
        AddUser();
        return null;
    }
    
}
