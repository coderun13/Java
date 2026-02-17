package Mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SignInbean {
    private String email;
    private String pass;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
public boolean InsertMethod()
    {
        try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","javasql");
         Statement stmt=con.createStatement();
         String q2 = "select * from signup_details where email ='" + email + "' and password='" + pass +"'";
         int x = stmt.executeUpdate(q2);
         if(x>0){
             return true;
         }else{
             return false;
         }
        }catch(Exception e)
        {}
        return false;
    }
}