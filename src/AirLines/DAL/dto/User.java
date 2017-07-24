package AirLines.DAL.dto;

public class User extends Entity {

    

//public int id_user;
    public String name;
    public String login;
    public String password;
    public String note;
    public Role role;
    public Entity id_user;

    public User() {
    }

    public User(String name, String login, String password, String note, Role role, Entity id_user) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.note = note;
        this.role = role;
        this.id_user = id_user;
    }

    public Role getRole() {
        return role;
    }

    public Entity getId_user() {
        return id_user;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setId_user(Entity id_user) {
        this.id_user = id_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
