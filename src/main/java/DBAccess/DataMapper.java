package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Materials;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class DataMapper {

    public static HashMap getMaterials() throws LoginSampleException {

        HashMap<Integer,Materials> materials = new HashMap<>();

        try{
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM materials";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                int materialId = rs.getInt("materialId");
                String name = rs.getString("name");
                int length = rs.getInt("length");
                int count = rs.getInt("count");
                String unit = rs.getString("unit");
                String description = rs.getString("description");
                int price = rs.getInt("price");
                Materials material = new Materials(materialId, name, length, count, unit, description, price);
                materials.put(materialId,material);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return materials;
    }
}