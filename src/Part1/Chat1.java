package Part1;

public class Chat1 implements Comparable<Chat1> {
    private String name;
    int quantityUsers;

    private Chat1() {
    }

    public Chat1(String name, int quantityUsers) {
        this.name = name;
        this.quantityUsers = quantityUsers;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", quantityUsers=" + quantityUsers +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityUsers() {
        return quantityUsers;
    }

    public void setQuantityUsers(int quantityUsers) {
        this.quantityUsers = quantityUsers;
    }

    @Override
    public int compareTo(Chat1 o) {
        return name.compareTo(o.getName());
    }

}
