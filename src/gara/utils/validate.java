/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gara.utils;

import java.awt.Color;
import java.time.LocalDate;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author PC
 */
public class validate {
    public static final String EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public static final String number = "\\d{10}";
    public static boolean validateEmail(JTextField txt){
        if(txt.getText().trim().matches(EMAIL)){
            txt.setBackground(Color.white);
            return true;
        }
        txt.setBackground(Color.red);
        txt.requestFocus();
        return false;
    }
    
    public static boolean validateEmpty(JTextField txt){
        if(!txt.getText().trim().equalsIgnoreCase("")){
            txt.setBackground(Color.white);
            return true;
        }else{
            txt.setBackground(Color.red); 
            txt.requestFocus();
            return false;
        }
    }
    
    public static boolean validatePhoneNumber(JTextField txt){
        if(txt.getText().trim().matches(number)){
            txt.setBackground(Color.white);
            return true;
        }
            txt.setBackground(Color.red);  
            txt.requestFocus();
        return false;
    }

    public static boolean validateNumber(JTextField txt){
        if(txt.getText().trim().matches("\\d{0,}") && validateEmpty(txt)==true ){
            txt.setBackground(Color.white);
            return true;
        }
        txt.setBackground(Color.red);    
        txt.requestFocus();
        return false;
    }
/*
   Dùng để  chuyển đổi chữ thường thành in hoa, mục đích để
    sử dụng cho các mục mã kí tự thống nhất cần ghi hoa.
*/
    public static String UpperCase(JTextField txt){
        return txt.getText().toUpperCase();
    }
    
/*
    tham khảo from AnLa
    */
    public static String toUpperFirstChar(JTextField txt){
        String ss = txt.getText().trim();
        String str="";
        txt.setText("");
        String[] words = ss.split(" ");
        int indexW = words.length;
        for (int i = 0; i < indexW; i++){
            for (int j = 0; j < words[i].length(); j++) {
                String text="";
                if(j==0){
                    text = words[i].substring(j, j+1);}
                if(words[i].substring(j, j+1).equals(" ") == true){
                    text = words[i].substring(j+1, j+2);}
                String newText = text.toUpperCase();
                words[i] = words[i].replaceFirst(text, newText);}
            str += words[i]+" ";
            txt.setText(str);
        }
        return txt.getText();
    }

    public static boolean validateEmpty(JSpinner txt) {
        if(!txt.getValue().equals(0)){
            txt.setBackground(Color.white);
            return true;
        }
        txt.setBackground(Color.red);    
        return false;
    }
}
