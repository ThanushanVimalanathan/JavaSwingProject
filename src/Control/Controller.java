/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.DBsearch;
import View.Homepage;
import View.Login;
import java.sql.*;
import javax.swing.JOptionPane;




public class Controller {
    
    public static void Login(String username,String password){
        
  
        try{
            
        ResultSet rs=new DBsearch().search(username, password);
        
        if(rs.next()){
                Login LG=new Login();
                LG.dispose();
                Homepage HP =new Homepage();
                HP.show();
            
        }
       
        else{
            JOptionPane.showMessageDialog(null,"Username or password is incorroct");
        } 
        
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
        
        
    }
    
   
}
