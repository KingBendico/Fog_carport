package FunctionLayer;

import DBAccess.DataMapper;
import DBAccess.OrderMapper;
import DBAccess.UserMapper;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * The purpose of LogicFacade is to...
 *
 * @author kasper
 */
public class LogicFacade {

    /**
     * Login user.
     *
     * @param email    the email
     * @param password the password
     * @return the user
     * @throws LoginSampleException the login sample exception
     */
    public static User login(String email, String password) throws LoginSampleException {
        return UserMapper.login(email, password);
    }

    /**
     * Create user user.
     *
     * @param email    the email
     * @param password the password
     * @param fullName the full name
     * @param phone    the phone
     * @param address  the address
     * @return the user
     * @throws LoginSampleException the login sample exception
     */
    public static User createUser(String email, String password, String fullName, String phone, String address) throws LoginSampleException {
        User user = new User(email, password, "30", fullName, phone, address);
        UserMapper.createUser(user);
        return user;
    }

    /**
     * Gets materials.
     *
     * @return the materials
     * @throws LoginSampleException the login sample exception
     */
    public static HashMap<Integer, Materials> getMaterials() throws LoginSampleException {
        return DataMapper.getMaterials();
    }

    /**
     * Create order int.
     *
     * @param userId the user id
     * @return the int
     * @throws LoginSampleException the login sample exception
     */
    public static int createOrder(int userId) throws LoginSampleException {
        return OrderMapper.createOrder(userId);
    }

    /**
     * Save carport.
     *
     * @param carport the carport
     * @throws LoginSampleException the login sample exception
     */
    public static void saveCarport(Carport carport) throws LoginSampleException {
        OrderMapper.saveCarport(carport);
    }

    /**
     * Gets previous orders.
     *
     * @param userId the user id
     * @return the previous orders
     * @throws SQLException the sql exception
     */
    public static ArrayList<Order> getPreviousOrders(int userId) throws SQLException {
        return OrderMapper.getPreviousOrder(userId);
    }

    /**
     * Gets carport.
     *
     * @param orderId the order id
     * @return the carport
     * @throws SQLException the sql exception
     */
    public static Carport getCarport(int orderId) throws SQLException {
        return OrderMapper.getCarport(orderId);
    }

}