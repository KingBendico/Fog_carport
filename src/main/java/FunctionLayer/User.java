package FunctionLayer;

import java.util.List;

/**
 * The purpose of User is to create user objects.
 *
 * @author bcdp
 */
public class User {

    /**
     * Instantiates a new User.
     *
     * @param email    the email
     * @param password the password
     * @param role     the role
     */
    public User(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
        this.address = address;
        this.phone = phone;
        this.fullName = fullName;
    }

    /**
     * Instantiates a new User.
     *
     * @param email    the email
     * @param password the password
     * @param role     the role
     * @param fullName the full name
     * @param phone    the phone
     * @param address  the address
     */
// User creation constructor
    public User(String email, String password, String role, String fullName, String phone, String address) {
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

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets role.
     *
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets role.
     *
     * @param role the role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return userId;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.userId = id;
    }

    /**
     * Gets phone.
     *
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets phone.
     *
     * @param phone the phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets full name.
     *
     * @return the full name
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets full name.
     *
     * @param fullName the full name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String toString() {

        return "User{" + "username=" + ", password=" + password + ", email=" + email + '}';
    }
}