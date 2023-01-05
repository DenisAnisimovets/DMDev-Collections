package Part1;

import java.util.List;

public class Chat2 {
    String name;
    List<User> users;

     private Chat2() {
     }

    public Chat2(String name, List<User> users) {
        this.users = users;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chat2{" +
                "name='" + name + '\'' +
                ", users=" + users +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
