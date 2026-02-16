import java.io.*;
import java.sql.*;

public class Fetch_all {
     public static void main(String args[])throws IOException{
//     DataInputStream ds = new DataInputStream(System.in);
//        System.out.println("Enter empid whose details are to be fetched:");
//        String eno=ds.readLine();
        
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
//            registering type4 driver
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","javasql");
         Statement stmt=con.createStatement();
         String ql = "select * from t66";
         ResultSet rs=stmt.executeQuery(ql);
         while(rs.next())
         {
             System.out.println("The empid is "+rs.getString(1));
             System.out.println("The name is "+rs.getString(2));
             System.out.println("The contact no is "+rs.getString(3));
         }
         con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
     }
}