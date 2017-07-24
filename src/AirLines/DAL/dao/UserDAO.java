package AirLines.DAL.dao;

import AbstractInterfaces.DAO.IUserDAO;
import AirLines.DAL.dto.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO extends AbstractDAO implements IUserDAO{

    @Override
    public List<User> GetUsers() {
        
        String sql = "SELECT id_user, name , name_role FROM role r "
                + "inner join user u on r.id_role= u.id_role;";
        List<User> users = new ArrayList<>();
        
        try {
            
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){
            
                User user = new User();
                user.id_user= resultSet.getInt("id_user");
                user.login = resultSet.getString("login");
                user.password= resultSet.getString("password");
                users.add(user);
            }
            
            
        } catch (SQLException sqlexc) {
//            logging
        }
    
        return users;
    }
    
    
    
}
