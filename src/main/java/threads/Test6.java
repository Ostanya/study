package threads;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        String hello = "hello";
        String world = "world";
        StringBuffer hw = new StringBuffer(hello + world);
        List<String> list = Arrays.asList(hello, world, hw.toString());
        hw.append("!");
        System.out.println(list);
    }
}
