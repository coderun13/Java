import java.io.*;
import java.sql.*;

class insert
{
    public static void main(String args[]) throws IOException
    {
     DataInputStream ds = new DataInputStream(System.in);
     System.out.println("Enter empid");
     String eno=ds.readLine();
     
     System.out.println("Enter emp name");
     String ename =ds.readLine();
     
     System.out.println("Enter eemp contact");
     String e_cno=ds.readLine();
     try
     {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","javasql");
        Statement stmt = con.createStatement();
        String ql= "insert into t66 values('"+eno+"','"+ename+"','"+e_cno+"')";
        int x=stmt.executeUpdate(ql);
        if(x>0)
        {
            System.out.println("Inserted success");
        }else{
            System.out.println("Inserted unsuccess");
        }
    con.close();
     }
     catch(Exception e)
     {
       System.out.println(e);
         
     }
    }
}