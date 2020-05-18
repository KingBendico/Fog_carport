package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 The purpose of UserMapper is to...

 @author kasper
 */
public class UserMapper {

    public static void createUser( User user ) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO Users (Email, UserPassword, RoleId, FullName, Phone, Address) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setString( 1, user.getEmail() );
            ps.setString( 2, user.getPassword() );
            ps.setString( 3, user.getRole() );
            ps.setString(4, user.getFullName());
            ps.setString(5, user.getPhone());
            ps.setString(6, user.getAddress());


            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt( 1 );
            user.setId( id );
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }

    public static User login( String email, String password ) throws LoginSampleException {
        try {

            Connection con = Connector.connection();
            String SQL = "SELECT UserId, RoleId, FullName, Phone, Address FROM Users "
                    + "WHERE Email=? AND UserPassword=?";

            PreparedStatement ps = con.prepareStatement( SQL );
            System.out.println(ps.toString());

            ps.setString( 1, email );
            ps.setString( 2, password );
             ResultSet rs = ps.executeQuery();
            if ( rs.next() ) {
                String role = rs.getString("RoleId");
                int userId = rs.getInt("UserId");
                String fullName = rs.getString("Fullname");
                String phone = rs.getString("Phone");
                String address = rs.getString("Address");
                User user = new User(email, password, role);
                user.setUserId(userId);
                user.setPhone(phone);
                user.setAddress(address);
                user.setFullName(fullName);
                return user;
            } else {
                throw new LoginSampleException( "Could not validate user" );
            }
        } catch ( ClassNotFoundException | SQLException ex ) {
            throw new LoginSampleException(ex.getMessage());
        }
    }

}
