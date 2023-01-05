package Part1;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<User> users1 = new ArrayList<>();
        users1.add(new User(1, "Ivan1", 10));
        users1.add(new User(2, "Ivan2", 35));
        List<User> users2 = new ArrayList<>();
        users2.add(new User(3, "Ivan3", 15));
        users2.add(new User(4, "Ivan4", 18));
        List<User> users3 = new ArrayList<>();
        users3.add(new User(5, "Ivan5", 75));
        users3.add(new User(6, "Ivan6", 35));
        users3.add(new User(7, "Ivan7", 35));

        List<Chat2> chats = List.of(
                new Chat2("chat1", users1),
                new Chat2("chat2", users2),
                new Chat2("chat3", users3)
        );

        List<User> userOver18 = chats.stream().
                flatMap(it->it.getUsers().stream())
                .filter(it -> it.age > 18)
                .collect(Collectors.toList());
        System.out.println(userOver18);

        int i = 0;
        double sum = 0, mediumAge = 0;

        for(Iterator<User> iterator = userOver18.iterator();iterator.hasNext();) {
            int age = iterator.next().age;
            sum+=age;
            i++;
        }

        if(i!=0) {
            mediumAge = sum/i;
            System.out.println(mediumAge);
        }

    }
}
