package stepik;

import java.util.Arrays;

public class Merge2 {

        private static void swap(int[] array, int ind1, int ind2) {
            int tmp = array[ind1];
            array[ind1] = array[ind2];
            array[ind2] = tmp;
        }

        public static int[] mergeArrays(int[] a1, int[] a2) {
            int[] res = new int[a1.length + a2.length];
            System.arraycopy(a1, 0, res, 0, a1.length);
            System.arraycopy(a2, 0, res, a1.length, a2.length);
            int gap = res.length /2;
            while (gap >= 1) {
                for (int right = 0; right < res.length; right++) {
                    for (int c = right - gap; c >= 0 ; c-= gap) {
                        if(res[c] > res[c + gap]) {
                            swap(res, c, c + gap);
                        }
                    }
                }
                gap = gap /2;
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
