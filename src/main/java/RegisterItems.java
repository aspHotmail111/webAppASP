import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: b3053632
 * Date: 04/12/13
 * Time: 16:24
 * To change this template use File | Settings | File Templates.
 */
public class RegisterItems {

    private String username;
    private String password;
    private String email;
    private String dob;

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
