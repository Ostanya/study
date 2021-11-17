package stepik;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Merge {

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] res = new int[a1.length + a2.length];
        System.arraycopy(a1, 0, res, 0, a1.length);
        System.arraycopy(a2, 0, res, a1.length, a2.length);
        for (int left = 0; left < res.length; left++) {
            int value = res[left];
            int i = left - 1;
            for(; i >= 0; i--) {
                if (value < res[i]) {
                    res[i + 1] = res[i];
                } else {
                    break;
                }
            }
            res[i+1 ] = value;
        }
        return res;
    }



    public static void main(String[] args) {
        int[] aa = {-3, 0, 5, 7};
        int[] la = {44, 0, 0, -33, 56, 104};
        int [] res = mergeArrays(aa, la);
        System.out.println("concated :" + Arrays.toString(res));
    }
}
