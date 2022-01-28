package Sets;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet();
        hashSet.add(6);
        hashSet.add(1);
        hashSet.add(7);
        hashSet.add(8);
        hashSet.add(-6);
        hashSet.add(-7);
        hashSet.add(-3);
        hashSet.add(-8);
        hashSet.add(-1);
        System.out.println("First" + hashSet);

        //sum of set
        int sum = 0;
        for(int i : hashSet) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
