package FunctionLayer;

import java.util.List;

/**
 * The purpose of User is to...
 * @author kasper
 */
public class User {



    public User( String email, String password, String role ) {
        this.email = email;
        this.password = password;
        this.role = role;
        this.address = address;
        this.phone = phone;
        this.fullName = fullName;
    }

    // User creation constructor
    public User(String email, String password, String role,String fullName, String phone, String address) {
        this.email = email;
        this.password = password;
        this.role = role;
        this.address = address;
        this.phone = phone;
        this.fullName = fullName;
    }

    private static List<User> users;

    private int userId;
    private String email;
    private String password; // Should be hashed and secured
    private String role;
    private String phone;
    private String address;
    private String fullName;

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword( String password ) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole( String role ) {
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return userId;
    }

    public void setId( int id ) {
        this.userId = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String toString() {

        return "User{" + "username=" + ", password=" + password + ", email=" + email + '}';
    }

}
