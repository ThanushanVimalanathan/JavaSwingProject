/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;


public class DBinsert {
    static Statement stmt;
    
    
    public void insert(String name,String NIC,String Email,String Gender,String Password){
        
        try{
            
            stmt=DBConnection.createStatement();
            stmt.executeUpdate("Insert Into st_details values('"+name+"','"+NIC+"','"+Email+"','"+Gender+"','"+Password+"')");
                
                    
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
