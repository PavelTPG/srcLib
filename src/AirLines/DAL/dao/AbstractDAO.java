package AirLines.DAL.dao;
//class s osnovnumi obschimi metodami

import AirLines.DAL.dto.Entity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AbstractDAO extends  Entity{

    public Connection getConnection() {

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/airlines";
        String user = "root";
        String password = "";

        Connection connection = null;

        try {
            Class.forName(driver);

            connection = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException | SQLException notFoundException) {

            // Logging...
        }

        return connection;

    }

    public void releseConinection(Connection connection) {

        if (connection != null) {
            try {
                connection.close();
            }catch(SQLException sqle){
        
                //
            }
        }

    }
}
