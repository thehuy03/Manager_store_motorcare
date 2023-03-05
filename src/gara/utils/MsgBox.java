
package gara.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

public class MsgBox {
    public static void  alert(Component parent, String message){
        JOptionPane.showMessageDialog(parent,message,"Hệ thống Gara",JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    public static boolean confrim(Component parent, String message){
        int result = JOptionPane.showConfirmDialog(parent, message,"Hệ thống gara",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }
    
    
    public static String prompt(Component parent, String message){
        return JOptionPane.showInputDialog(parent, message,"Hệ thống Gara",JOptionPane.INFORMATION_MESSAGE);
    }
}
