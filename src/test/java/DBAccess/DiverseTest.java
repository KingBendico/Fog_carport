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

public class DiverseTest {
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
            stmt.execute("insert into users select * from fogcarport_db.users");
        }
        catch (SQLException ex){
            System.out.println("Could not open connection to database: " + ex.getMessage());
        }
    }

    @Test
    public void testSetUpOK() {
        // Just check that we have a connection.
        assertNotNull( testConnection );
    }


    @Test
    public void testLogin01() throws LoginSampleException {
        // Can we log in
        User user = UserMapper.login( "jens@somewhere.com", "jensen" );
        assertTrue( user != null );
    }

    @Test( expected = LoginSampleException.class )
    public void testLogin02() throws LoginSampleException {
        // We should get an exception if we use the wrong password
        User user = UserMapper.login( "jens@somewhere.com", "larsen" );
    }

    @Test
    public void testLogin03() throws LoginSampleException {
        // Alice is supposed to be a customer which is known by roleId "30".
        User user = UserMapper.login( "Alice@Cooper.com", "pass1234" );
        assertEquals( "30", user.getRole() );
    }

    @org.junit.Test
    public void testCreateUser01() throws LoginSampleException {
        // Can we create a new user - Notice, if login fails, this will fail
        // but so would login01, so this is OK
        User original = new User( "king@kong.com", "uhahvorhemmeligt", "konge" );
        UserMapper.createUser( original );
        User retrieved = UserMapper.login( "king@kong.com", "uhahvorhemmeligt" );
        assertEquals( "konge", retrieved.getRole() );
    }

}

/*

@Before
    public void beforeEachTest() {
        // reset test database
        try (Statement stmt = testConnection.createStatement()) {
            stmt.execute("DROP SCHEMA IF EXISTS fogcarport_db_test;");
            stmt.execute("CREATE SCHEMA  IF NOT EXISTS fogcarport_db_test;");
            stmt.execute("USE fogcarport_db_test;");
            stmt.execute("INSERT INTO users VALUES (1,'Alice@Cooper.com','pass1234',30,'Alice Cooper','60607070','Nørgaardsvej 30, DK-2800 Kgs. Lyngby')");
            //  stmt.execute("insert into users select * from UsersTest");
        }
        catch (SQLException ex){
            System.out.println("Could not open connection to database: " + ex.getMessage());
        }
    }




*/