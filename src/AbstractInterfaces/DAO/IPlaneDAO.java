package AbstractInterfaces.DAO;

import AirLines.DAL.dto.Plane;
import java.util.List;

public interface IPlaneDAO extends IforAllDAO{

    List<Plane> getPlanes();

    
}
