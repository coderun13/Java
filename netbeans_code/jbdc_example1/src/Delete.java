import java.io.*;
import java.sql.*;
public class Delete {
    public static void main(String args[]) throws IOException
    {
     DataInputStream ds = new DataInputStream(System.in);
     System.out.println("Enter empid which has to be deleted");
     String eno=ds.readLine();
     
     
     try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","javasql");
        Statement stmt = con.createStatement();
        String ql= "delete from t66 where e_id='"+eno+"'";
        int x=stmt.executeUpdate(ql);
        if(x>0)
        {
            System.out.println("Delete success");
        }else{
            System.out.println("Delete unsuccess");
        }
    con.close();
     }
     catch(Exception e)
     {
       System.out.println(e);
         
     }
    }
}