/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.*;
import javax.swing.JOptionPane;
import Model.DBsearch;
import View.ADI;
import View.AdminForm;


/**
 *
 * @author DELL
 */
public class AdminLoginController {
    
    public static void ADLogin(String name,String pass){
        
         try{
            
        ResultSet RS=new DBsearch().search(name, pass);
        
        if(RS.next()){
                ADI A=new ADI();
                A.show();
                AdminForm B=new AdminForm();
                B.dispose();
            
        }
       
        else{
            JOptionPane.showMessageDialog(null,"Username or password is incorroct");
        } 
        
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
        
    }
    
    
}
