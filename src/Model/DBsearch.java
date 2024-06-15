/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


 

import java.sql.*;

public class DBsearch {
    
    static Statement stm;
    static ResultSet rs;
    
    public ResultSet search(String USname,String Upassword){
        
        try{
            
            stm=DBConnection.createStatement();
            rs=stm.executeQuery("SElect * From st_details Where Username='"+USname+"'and Password='"+Upassword+"'");
            
            
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
        
        return rs;
        
    }
    
    
}
