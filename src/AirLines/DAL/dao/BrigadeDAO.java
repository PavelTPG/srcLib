package AirLines.DAL.dao;

import AbstractInterfaces.DAO.IBrigadeDAO;
import AirLines.DAL.dto.Brigade;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BrigadeDAO extends AbstractDAO implements IBrigadeDAO{

    @Override
    public List<Brigade> getBrigades() {
       
    String sql = "SELECT id_pilot, name_brigade, count_pilot "
            + " FROM brigade b inner "
            + "join pilot p on b.id_brigade = p.id_brigade;";
        List<Brigade> brigades= new ArrayList<>();
        
        try {
            Statement statement = getConnection().createStatement();
            ResultSet  resultSet =statement.executeQuery(sql);
            
            while(resultSet.next()){
            
                Brigade brigade =new Brigade();
                brigade.id_brigade = resultSet.getInt("id_brigade");
                brigade.name_brigade= resultSet.getString("name_brigade");
                brigade.count_pilot= resultSet.getInt("count_pilot");
                brigades.add(brigade);
            }
            
        } catch (SQLException sqle) {
        // logging...
        
        }
    
        return brigades;
    }

    @Override
    public List<AbstractDAO> getAll() {
        //
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return getAll();
    }

    
}
