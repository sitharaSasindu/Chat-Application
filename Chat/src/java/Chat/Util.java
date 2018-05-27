/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import javax.swing.JOptionPane;
import java.awt.Component;


/**
 *
 * @author Sithara
 * UOW id - w1654468
 * IIt - 2016372
 */
public class Util {//popups 
    
    public static void showError(Component cm, String msg){
        JOptionPane.showMessageDialog(cm, msg, "ERROR-MESSAGE", JOptionPane.ERROR_MESSAGE);
    }
    
     public static void showWarning(Component cm, String msg){
        JOptionPane.showMessageDialog(cm, msg, "WARNING-MESSAGE", JOptionPane.WARNING_MESSAGE);
    }
     
      public static void showMessage(Component cm, String msg){
        JOptionPane.showMessageDialog(cm, msg);
    }
}
