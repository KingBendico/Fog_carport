package FunctionLayer;

import DBAccess.Connector;
import java.util.List;

public class Order {

    public static void newOrder (int userId, double cartPrice, List<OrderItem> userOrder){

        createOrder(userId, orderPrice);

        int orderId = queryOrderNumber(userId);

        createOrderContent(orderId, userOrder);


    }//newOrder

    private static void createOrder(int userId, double orderPrice){

        String query =  "INSERT INTO orders (UserId,OrderPrice)" +
                "VALUES ("+userId+", "+orderPrice+");";
        Connector.updateSQL(query);

    }//createOrder


    private static void createOrderContent(int orderId, List<OrderItem> userOrder){

        String query;

        for (OrderItem item : userOrder){


            Connector.updateSQL(query);
        }

    }//createOrderContent



}
