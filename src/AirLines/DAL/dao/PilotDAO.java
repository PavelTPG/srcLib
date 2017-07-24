package AirLines.DAL.dao;

import AbstractInterfaces.DAO.IPilotDAO;
import AirLines.DAL.dto.Pilot;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PilotDAO extends AbstractDAO implements IPilotDAO{

    @Override
    public List<Pilot> getPilots() {
    
        String sql = "SELECT name, experience, position FROM "
                + "pilot p inner join"
                + " type_of_pilot t on p.id_type_of_pilot"
                + " = t.id_type_of_pilot ;";
        List<Pilot> pilots =new ArrayList<>();
        Connection connection = getConnection();
        
        try {
            Statement statement =connection.createStatement();
            ResultSet resultSet= statement.executeQuery(sql);
            
            while(resultSet.next()){
                Pilot pilot = new Pilot();
                pilot.id_pilot = resultSet.getInt("id_pilot");
                pilot.name =resultSet.getString("name");
                pilot.experiance=resultSet.getInt("eperiance");
                pilots.add(pilot);
            
            }
        } catch (SQLException sqle) {
        // logging
        
        }
        finally {
            releseConinection(connection);
        }
        return pilots;
    }

    @Override
    public List<AbstractDAO> getAll() {
        //
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return getAll();}

    
    
}
