package stepik;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put(new String("key"), "value 1");
        map.put(new String("key"), "value 2");
        System.out.println(map);
    }
}

