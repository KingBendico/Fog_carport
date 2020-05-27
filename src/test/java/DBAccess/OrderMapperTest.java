package DBAccess;

import FunctionLayer.Carport;
import FunctionLayer.LoginSampleException;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class OrderMapperTest {
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
            stmt.execute("DROP TABLE IF EXISTS orders;");
            stmt.execute("CREATE TABLE orders LIKE fogcarport_db.orders;");
           // stmt.execute("INSERT INTO orders SELECT * FROM fogcarport_db.orders");
        }
        catch (SQLException ex){
            System.out.println("Could not open connection to database: " + ex.getMessage());
        }
    }

    @Test
    public void createOrderTest() throws LoginSampleException {
        OrderMapper.createOrder(1);

    }

    @Test
    public void createCarportTest() throws LoginSampleException {
        Carport.createCarport(1,1,750,600,300,300,20);

    }


}

