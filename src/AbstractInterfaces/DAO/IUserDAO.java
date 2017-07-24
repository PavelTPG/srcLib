package AbstractInterfaces.DAO;

import AirLines.DAL.dto.User;
import java.util.List;

public interface IUserDAO {

    List<User> GetUsers();
    
}
