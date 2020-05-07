package FunctionLayer;

import DBAccess.DataMapper;
import DBAccess.UserMapper;

import java.sql.SQLException;
import java.util.HashMap;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }
    public static HashMap<Integer,Materials> getMaterials() throws LoginSampleException {
        return DataMapper.getMaterials();
    }

}
