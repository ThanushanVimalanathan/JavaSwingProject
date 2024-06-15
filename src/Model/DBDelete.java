/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;

/**
 *
 * @author DELL
 */
public class DBDelete {
    static Statement STM;
    
    public void DeleteData(String NIC_NO){
        try{
            STM=DBConnection.createStatement();
            STM.executeUpdate("DELETE FROM st_details WHERE NIC='"+NIC_NO+"'");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
