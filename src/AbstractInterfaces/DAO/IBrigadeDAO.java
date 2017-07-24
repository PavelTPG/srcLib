package AbstractInterfaces.DAO;

import AirLines.DAL.dto.Brigade;
import java.util.List;

public interface IBrigadeDAO extends IforAllDAO{

    List<Brigade> getBrigades();

    
}
