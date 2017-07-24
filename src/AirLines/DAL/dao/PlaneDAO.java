package AirLines.DAL.dao;

import AbstractInterfaces.DAO.IPlaneDAO;
import AirLines.DAL.dto.Plane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlaneDAO extends AbstractDAO implements IPlaneDAO {

    @Override
    public List<Plane> getPlanes() {

        String sql = "SELECT date_start, date_end, city_begin,"
                + " city_end, name_brigade FROM plane p inner join "
                + "brigade b on p.id_brigade= b.id_brigade;";
        List<Plane> planes = new ArrayList<>();

        try {
            Statement statement = GetConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                Plane plane = new Plane();
                plane.id_plane = resultSet.getInt("id_plane");
                plane.date_start = resultSet.getString("date_start");
                plane.date_end = resultSet.getString("date_end");
                plane.city_begin= resultSet.getString("city_begin");
                plane.city_end= resultSet.getString("city_end");
                
                planes.add(plane);

            }
        } catch (SQLException sqle) {
        }

        return planes;
    }

    @Override
    public List<AbstractDAO> getAll() {
        GetConnection();
    return getAll();
    }

}
