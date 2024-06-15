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
public class Delete {
    
    public static void DeleteOperation(String NIC){
        try{
        
        new Model.DBDelete().DeleteData(NIC);
        
        JOptionPane.showConfirmDialog(null,"Would you like to delete Record");
        
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
