package AirLines.DAL.dto;

public class Plane {

public int id_plane;

public String date_start;
public String date_end;
public String city_begin;
public String city_end;

    public Plane() {
    }

    public Plane(int id_plane, String date_start, String date_end, String city_begin, String city_end) {
        this.id_plane = id_plane;
     
        this.date_start = date_start;
        this.date_end = date_end;
        this.city_begin = city_begin;
        this.city_end = city_end;
    }

    public String getDate_start() {
        return date_start;
    }

    public void setDate_start(String date_start) {
        this.date_start = date_start;
    }

    public String getDate_end() {
        return date_end;
    }

    public void setDate_end(String date_end) {
        this.date_end = date_end;
    }

    public String getCity_begin() {
        return city_begin;
    }

    public void setCity_begin(String city_begin) {
        this.city_begin = city_begin;
    }

    public String getCity_end() {
        return city_end;
    }

    public void setCity_end(String city_end) {
        this.city_end = city_end;
    }


}
