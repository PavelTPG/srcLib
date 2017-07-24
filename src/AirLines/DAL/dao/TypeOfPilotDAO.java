package AirLines.DAL.dao;

import AbstractInterfaces.DAO.ITypeofPilotDAO;
import AirLines.DAL.dto.TypeOfPilot;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TypeOfPilotDAO extends AbstractDAO implements ITypeofPilotDAO {

    @Override
    public List<TypeOfPilot> typeOfPilots() {

        String sql = "SELECT id_role, name_role FROM role";
        List<TypeOfPilot> typeOfPilots = new ArrayList<>();

        try {
            Statement statement = GetConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                TypeOfPilot typeOfPilot = new TypeOfPilot();
                typeOfPilot.id_type_of_pilot = resultSet.getInt("id_type_of_pilot");
                typeOfPilot.position = resultSet.getString("position");
                typeOfPilots.add(typeOfPilot);
            }

        } catch (SQLException exception) {
            //logging..
        }
        return typeOfPilots;

    }

    @Override
    public List<AbstractDAO> getAll() {
           //
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return getAll();  }

}
