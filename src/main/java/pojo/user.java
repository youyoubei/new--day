package pojo;

public class user {
    private  int id;
    private  String user;
    private  String pass;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("user{");
        sb.append("id=").append(id);
        sb.append(", user='").append(user).append('\'');
        sb.append(", pass='").append(pass).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public user() {
    }

    public user(int id, String user, String pass) {
        this.id = id;
        this.user = user;
        this.pass = pass;
    }
}
