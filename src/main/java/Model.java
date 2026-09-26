import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {
    private String uname;
    private String Email;
    private String Password;
    private String ucity;
    private PreparedStatement pstmnt = null;
    private Connection connect = null;
    int row;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUcity() {
        return ucity;
    }

    public void setUcity(String ucity) {
        this.ucity = ucity;
    }

    public int register() {
        try{
            connect = JDBC_utill.getDBConnection();
            String sql = "INSERT INTO UserInfo (uname,Email,UPassword,city) VALUES (?,?,?,?)";
            pstmnt = connect.prepareStatement(sql);
            pstmnt.setString(1,uname);
            pstmnt.setString(2,Email);
            pstmnt.setString(3,Password);
            pstmnt.setString(4,ucity);

            row =pstmnt.executeUpdate();

        }catch(SQLException s){
            s.printStackTrace();
        }finally {
            try{
                if (pstmnt != null) {
                    pstmnt.close();
                }

                if (connect != null) {
                    connect.close();
                }
            }catch (SQLException s){
                s.printStackTrace();
            }

        }
        return row;
    }
}

