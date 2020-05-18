package FunctionLayer;

import DBAccess.DataMapper;
import DBAccess.OrderMapper;
import DBAccess.UserMapper;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password, String fullName, String phone, String address) throws LoginSampleException {
        User user = new User(email, password, "30", fullName,  phone, address);
        UserMapper.createUser( user );
        return user;
    }
    public static HashMap<Integer,Materials> getMaterials() throws LoginSampleException {
        return DataMapper.getMaterials();
    }
    public static int createOrder(int userId) throws LoginSampleException{
        return OrderMapper.createOrder(userId);
    }
    public static void saveCarport(Carport carport) throws LoginSampleException{
        OrderMapper.saveCarport(carport);
    }
    public static ArrayList<Order> getPreviousOrders(int userId) throws SQLException{
        return OrderMapper.getPreviousOrder(userId);
    }
    public static Carport getCarport(int orderId) throws SQLException{
        return OrderMapper.getCarport(orderId);
    }

}
