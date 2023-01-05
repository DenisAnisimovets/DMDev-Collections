package Part1;

import Part1.comparator.ChatsNameComparator;
import Part1.comparator.ChatsQuantityComparator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Chat1> chats = List.of(
                new Chat1("chat1", 10),
                new Chat1("chat2", 1000),
                new Chat1("chat3", 1000),
                new Chat1("chat2", 100),
                new Chat1("chat4", 10000),
                new Chat1("chat5", 100000)
        );
        List<Chat1> chatsList = new ArrayList<>(chats);

        for (Iterator<Chat1> iterator = chatsList.iterator(); iterator.hasNext(); ) {
            Chat1 chat = iterator.next();
            if(chat.getQuantityUsers() < 1000) {
                iterator.remove();
            }
        }


        System.out.println(chatsList.toString());

        chatsList.sort(new ChatsQuantityComparator().reversed().thenComparing(new ChatsNameComparator()));
        System.out.println(chatsList);
    }


}
