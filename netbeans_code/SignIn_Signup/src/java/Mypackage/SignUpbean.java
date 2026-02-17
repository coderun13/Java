package Mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SignUpbean {
        private String email;
        private String nm;
        private String con1;
        private String pass;
        private String sq;
        private String ans;
        private String add;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getCon1() {
        return con1;
    }

    public void setCon1(String con1) {
        this.con1 = con1;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getSq() {
        return sq;
    }

    public void setSq(String sq) {
        this.sq = sq;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public boolean InsertMethod()
    {
        try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","javasql");
         Statement stmt=con.createStatement();
         String q2 = "INSERT INTO signup_details (email, password, name, security_question, answer, contact, address) " +
            "VALUES ('" + email + "','" + pass + "','" + nm + "','" + sq + "','" + ans + "','" + con1 + "','" + add + "')";
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
