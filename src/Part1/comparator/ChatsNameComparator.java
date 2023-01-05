package Part1.comparator;

import Part1.Chat1;

import java.util.Comparator;

public class ChatsNameComparator implements Comparator<Chat1> {
    @Override
    public int compare(Chat1 o1, Chat1 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
