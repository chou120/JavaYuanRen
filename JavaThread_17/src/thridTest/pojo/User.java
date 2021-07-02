package thridTest.pojo;

import java.util.Date;

public class User {

    private Integer id;
    private String  username;
    private String password;
    private Date datetime;

    public User() {
    }

    public User(Integer id, String username, String password, Date datetime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.datetime = datetime;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", datetime=" + datetime +
                '}';
    }
}
