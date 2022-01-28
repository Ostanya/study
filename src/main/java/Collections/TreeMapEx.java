package Collections;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Double, String> block = new TreeMap<>();
        block.put(3.2, "Victoria");
        block.put(4.1, "Lola");
        block.put(1.2, "Ihor");
        block.put(7.5, "Jordan");
        block.put(4.1, "Lolitta"); // delete previous String

        System.out.println("Result :" + block);
        System.out.println("Get  :" + block.get(1.2));
       // block.remove(7.5);
        System.out.println(block.descendingMap());
        System.out.println("Tail :" + block.tailMap(1.2));
        System.out.println("Head :" + block.headMap(1.2));
     }
}
