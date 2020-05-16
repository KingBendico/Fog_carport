package DBAccess;

import FunctionLayer.Carport;
import FunctionLayer.CarportRaisedRoof;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class OrderMapper {

    public static int createOrder(int userId) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO orders (users_id) VALUES (?);";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, userId);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            int orderId = rs.getInt(1);
            return orderId;
        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
    }
    public static void createCarport(Carport carport) throws LoginSampleException{
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO carport (orderId,length,width,shed_length,shed_width,slope) VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,carport.getOrderId());
            ps.setInt(2, carport.getLength());
            ps.setInt(3,carport.getWidth());
            ps.setInt(4,carport.getShed_length());
            ps.setInt(5,carport.getShed_width());
            ps.setInt(6,((CarportRaisedRoof) carport).getRoofSlope()); //Ved ikke helt om det virker
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
    }


    public static ArrayList<Order> getPreviousOrder(int userId) throws SQLException {
        ArrayList<Order> previousOrders = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM orders WHERE users_id = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int oId = rs.getInt("orderId");
                int uId = rs.getInt("userId");
                String orderDate = rs.getString("date");
                String status = rs.getString("status");

                DateFormat iFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                DateFormat oFormatter = new SimpleDateFormat("dd-MM-yyyy");
                String strDateTime = oFormatter.format(iFormatter.parse(orderDate));
                Order order = new Order(oId, uId, strDateTime, status);
                previousOrders.add(order);
            }
        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            throw new SQLException(ex.getMessage());
        }
        return previousOrders;
    }
}

