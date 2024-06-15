/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import java.sql.*;


public class DBConnection {
    
   static Connection con;
   static Statement stmt=null;
   
   public static Statement createStatement(){
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
           stmt=con.createStatement();
           
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
       
       return stmt; 
   }
  
}
