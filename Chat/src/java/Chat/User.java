/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;


/**
 *
 * @author Sithara
 * UOW id - w1654468
 * IIt - 2016372
 */
public class User { 
    
    private String name;//getters and setters to use in the login class
    private String loginId;
    private String pass;
    private String rePass;
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setLoginId(String loginId){
        this.loginId = loginId;
    }
    
    public void setPass(String pass){
        this.pass = pass;
    }
    
    public void setRePass(String repass){
        this.rePass = repass;
    }
    
    public String getName(){
        return name;
    }
    
    public String getLoginId(){
        return loginId;
}
 
    public String getPass(){
        return pass;
    }
    
    public String getRepass(){
        return rePass;
    }


}
