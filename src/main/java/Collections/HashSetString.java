package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetString {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Australia");
        hs.add("India");
        hs.add("Ukraine");
        hs.add("Lapland");

        System.out.println(hs);
        System.out.println("List contains India or not: " + hs.contains("India"));

        hs.remove("Australia");
        System.out.println("List after removing Australia:"+ hs);

        System.out.println("Iterator over list: ");
        Iterator<String> i = hs.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
