/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;


import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "UserService")
public class UserService {

    private DBConnection db;

    // Check whether the two passwords that the user entered at the time of registration match each other
    @WebMethod(operationName = "register")
    public boolean register(@WebParam(name = "password") String password, @WebParam(name = "re_password") String re_password) {
        if (password.equals(re_password)) {
            return true;
        } else {
            return false;
        }

    }

    // Check whether a pirticular login ID exists

    @WebMethod(operationName = "checkLoginId")
    public boolean checkLoginId(@WebParam(name = "loginId") String loginId) {
        DBConnection.id = loginId;
        db = new DBConnection();
        boolean result = db.getData();
        return result;
    }

    // Insert a new user to the system
    @WebMethod(operationName = "insertUser")
    @Oneway
    public void insertUser(@WebParam(name = "nickname") String nickname, @WebParam(name = "loginId") String loginId, @WebParam(name = "password") String password) {
        db = new DBConnection();
        db.insertUser(nickname, loginId, password);
    }

    // Check whether the entered login Id and the password match each other when user is trying to
    //    log into the system
    @WebMethod(operationName = "checkUser")
    public boolean checkUser(@WebParam(name = "loginId") String loginId, @WebParam(name = "password") String password) {

        db = new DBConnection();
        boolean result = db.userAvailbility(loginId, password);
        return result;
    }

}
