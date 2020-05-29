package DBAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * The purpose of Connector is to connect to a DB.
 *
 * @author bdcp
 */
public class Connector {

    private static String URL;
    private static String USERNAME;
    private static String PASSWORD;
    private static String nameDB;


    private static Connection singleton;

    /**
     * Sets connection.
     *
     * @param con the con
     */
    public static void setConnection(Connection con) {
        singleton = con;
    }

    /**
     * Connection connection.
     *
     * @return the connection
     * @throws ClassNotFoundException the class not found exception
     * @throws SQLException           the sql exception
     */
    public static Connection connection() throws ClassNotFoundException, SQLException {
        if ((singleton == null) || singleton.isClosed()) {
            setDBCredentials();
            Class.forName("com.mysql.cj.jdbc.Driver");
            singleton = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        return singleton;
    }


    /**
     * Sets db credentials.
     */
    public static void setDBCredentials() {
        String deployed = System.getenv("DEPLOYED");
        if (deployed != null) {
            // Prod: hent variabler fra setenv.sh i Tomcats bin folder
            URL = System.getenv("JDBC_CONNECTION_STRING");
            USERNAME = System.getenv("JDBC_USER");
            PASSWORD = System.getenv("JDBC_PASSWORD");
        } else {
            // Localhost
            nameDB = "fogcarport_db";
            URL = "jdbc:mysql://localhost:3306/" + nameDB + "?serverTimezone=CET&useSSL=false";
            USERNAME = "adminfog";
            PASSWORD = "Fogcarport3011/";
        }
    }
}