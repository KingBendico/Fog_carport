package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class UserMapperTest {
    private static Connection testConnection;
    private static String USER = "adminfog";
    private static String USERPW = "3011fog/";
    private static String DBNAME = "fogcarport_db_test?serverTimezone=CET&useSSL=false";
    private static String HOST = "localhost";

    @BeforeClass
    public static void setup() {
        try {
            // avoid making a new connection for each test
            if (testConnection == null) {
                String url = String.format("jdbc:mysql://%s:3306/%s", HOST, DBNAME);
                Class.forName("com.mysql.cj.jdbc.Driver");

                testConnection = DriverManager.getConnection(url, USER, USERPW);
                // Make mappers use test
                Connector.setConnection(testConnection);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            testConnection = null;
            System.out.println("Could not open connection to database: " + ex.getMessage());
        }
    }

    @Before
    public void beforeEachTest() {
        // reset test database
        try (Statement stmt = testConnection.createStatement()) {
            stmt.execute("DROP TABLE IF EXISTS users;");
            stmt.execute("CREATE TABLE users LIKE fogcarport_db.users;");
            // stmt.execute("INSERT INTO users VALUES (1,'Alice@Cooper.com','pass1234',30,'Alice Cooper','60607070','Nørgaardsvej 30, DK-2800 Kgs. Lyngby')");
            stmt.execute("INSERT INTO users SELECT * FROM fogcarport_db.users");
        } catch (SQLException ex) {
            System.out.println("Could not open connection to database: " + ex.getMessage());
        }
    }

    @Test
    public void testSetUpOK() {
        // Just check that we have a connection.
        assertNotNull(testConnection);
    }

    @Test
    public void testLogin() throws LoginSampleException {
        // Can we log in
        User user = UserMapper.login("hans@mail.dk", "1234");
        assertTrue(user != null);
    }

    @Test(expected = LoginSampleException.class)
    public void testWrongPassword() throws LoginSampleException {
        // We should get an exception if we use the wrong password
        User user = UserMapper.login("hans@mail.dk", "hansen");
        assertNotEquals("larsen", user);
    }

    @Test
    public void testRole() throws LoginSampleException {
        // Alice is supposed to be a customer which is known by roleId "30".
        User user = UserMapper.login("Alice@Cooper.com", "pass1234");
        assertEquals("30", user.getRole());
    }

    @Test
    public void testCreateUser() throws LoginSampleException {
        // Can we create a new user
        User original = new User("adminfog@fog.com", "adminfog", "10");
        UserMapper.createUser(original);
        User retrieved = UserMapper.login("adminfog@fog.com", "adminfog");
        assertEquals("10", retrieved.getRole());
    }
}