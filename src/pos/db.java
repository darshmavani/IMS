///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package pos;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//import static java.lang.Class.forName;
//
///**
// *
// * @author JEEL
// */
//public class db {
//    public static Connection mycon() throws RuntimeException {
//        
//        Connection con;
//        
//        try {
////             Class<?> aClass = forName("com.mysql.jdbc.Driver");
//            Class<?> aClass = forName("com.mysql.cj.jdbc.Driver");
//
////            class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/pos","root","");
//            return con;
//            
//        } catch (SQLException e) {
//            System.out.println("e");
//           return null;
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}

package pos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Go
 */
public class db {
   
 public static Connection mycon(){
 
 
     Connection con = null ;
     
     try {
         
         //Class.forName("com.mysql.jdbc.Driver");
         Class.forName("com.mysql.cj.jdbc.Driver");

         con = DriverManager.getConnection("jdbc:mysql://localhost:3307/pos","root","");
         return con;
         
         
     } catch (ClassNotFoundException | SQLException e) {
         
         System.out.println(e);
         return null;
     }
 }
}
     