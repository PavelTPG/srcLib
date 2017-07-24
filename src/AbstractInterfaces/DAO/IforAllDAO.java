package AbstractInterfaces.DAO;

//import AirLines.DAL.dao.AbstractDAO;
import AirLines.DAL.dto.Entity;
//import AirLines.DAL.dto.Pilot;

import java.util.List;

public interface IforAllDAO {

    List<Entity> getAll();
    void add (Entity entity);
    void delete(int id);
    void update(int id,Entity entity); 
    Entity  getbyid(int id);
    
}

//interface  IPilotDAO extends IforAllDAO {
//
//    
//}
//

//class PilotDAO implements IPilotDAO{
//
//    @Override
//    public List<Entity> getAll() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Entity getbyid(int id) {
//        Pilot pilot = new Pilot();
//        
//        //...
//        
//        return pilot;
//    }
//
//    @Override
//    public void add(Entity entity) {
//        Pilot pilot = (Pilot)entity;
//        
//    }
//    
//}
//
//class BrDAO implements IforAllDAO{
//
//    @Override
//    public List<Entity> getAll() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Entity getbyid(int id) {
//        Bri br = new Br();
//        
//        //...
//        
//        return br;
//    }
    
//}