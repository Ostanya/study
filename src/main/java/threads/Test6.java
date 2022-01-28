package threads;

import java.io.*;
import java.util.*;

public class Test6 {
    public static void main(String[] args) {
        String hello = "hello";
        String world = "world";
        StringBuffer hw = new StringBuffer(hello + world);
        List<String> list = Arrays.asList(hello, world, hw.toString());
        hw.append("!");
        System.out.println(list);

        List<String> a = new ArrayList<String>(Arrays.asList("1", "3", "4", "5", "-3", "-1", "-5"));
        System.out.println(isRetruder(a));
    }

    public static List<String> isRetruder(List<String> num) {
        List<String> newList = new ArrayList<>(num);
        Collections.sort(newList);
        newList.remove("-");
        System.out.println("Print List: " + newList);
        return newList;

    }
}
