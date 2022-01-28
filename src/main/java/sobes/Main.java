package sobes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }

    public static boolean isPresent() {
        List<Integer> arr = Arrays.asList(1, 2, 2, 3);
        List<Integer> arr1 = Arrays.asList(1, 2);


        for (int i = 0; i < arr1.size(); i++) {
            int result = arr.indexOf(arr1.get(i));
            if (result == -1) {
                return false;
            }
        }
        return true;
    }
}

