import java.io.*;
import java.sql.*;
public class Update {
    public static void main(String args[]) throws IOException
    {
     DataInputStream ds = new DataInputStream(System.in);
     System.out.println("Enter empid");
     String eno=ds.readLine();
     
     System.out.println("Enter new emp contact");
     String ncon=ds.readLine();
     
     try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","javasql");
        Statement stmt = con.createStatement();
        String ql= "update t66 set e_cno ='"+ncon+"' where e_id='"+eno+"'";
        int x=stmt.executeUpdate(ql);
        if(x>0)
        {
            System.out.println("Update success");
        }else{
            System.out.println("Update unsuccess");
        }
    con.close();
     }
     catch(Exception e)
     {
       System.out.println(e);
         
     }
    }
}