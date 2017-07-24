package AirLines.DAL.dto;

public class Pilot extends Entity{


public Entity id_pilot;
public String name;
public int experiance;


    public Pilot() {
    }

    public Pilot(Entity id_pilot, String name, int experiance) {
        this.id_pilot = id_pilot;
        this.name = name;
        this.experiance = experiance;
    }

    public Entity getId_pilot() {
        return id_pilot;
    }

    public void setId_pilot(Entity id_pilot) {
        this.id_pilot = id_pilot;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperiance() {
        return experiance;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }


    
}
