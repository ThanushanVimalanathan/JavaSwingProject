/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;


import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class InsertControler {
   
    public static void input(String Name,String NIC,String Email,String Gender,String Password){
        
        try{
            
            new Model.DBinsert().insert(Name, NIC, Email, Gender, Password);
            JOptionPane.showMessageDialog(null,"Insert successfully");
            
            
            
        }catch(Exception e){
            
            System.out.println(e.getMessage());
       
        }
        
        
    }
    
}
