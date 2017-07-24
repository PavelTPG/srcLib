package AirLines.DAL.dto;

public class Brigade extends Entity{

public Entity id_brigade;
public String name_brigade;
public int count_pilot;

    public Brigade() {
    }

    public Brigade(Entity id_brigade, String name_brigade, int count_pilot) {
        this.id_brigade = id_brigade;
        this.name_brigade = name_brigade;
        this.count_pilot = count_pilot;
    }

    public Entity getId_brigade() {
        return id_brigade;
    }

    public void setId_brigade(Entity id_brigade) {
        this.id_brigade = id_brigade;
    }

    public String getName_brigade() {
        return name_brigade;
    }

    public void setName_brigade(String name_brigade) {
        this.name_brigade = name_brigade;
    }

    public int getCount_pilot() {
        return count_pilot;
    }

    public void setCount_pilot(int count_pilot) {
        this.count_pilot = count_pilot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

      
}
