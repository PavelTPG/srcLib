package AirLines.DAL.dao;

import AbstractInterfaces.DAO.IRoleDAO;
import AirLines.DAL.dto.Role;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RoleDAO extends AbstractDAO implements IRoleDAO{

    @Override
    public List<Role> getRoles() {
        
        String sql = "SELECT id_role, name_role FROM role";
        List<Role> roles= new ArrayList<>();
        
        try{
        Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){
            
                Role role = new Role();
                role.id_role= resultSet.getInt("id_role");
                role.name_role= resultSet.getString("name_role");
                roles.add(role);
            }
        
        }catch(SQLException exception){
            //logging..
        }
        return  roles;
    }

    @Override
    public List<AbstractDAO> getAll() {
     
        
        
        return getAll();  }

    
}
