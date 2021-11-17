package stepik;

import java.util.Locale;
import java.util.Scanner;

public class isPalindrome {
    public static boolean isPalindrome(String text) {
        String reg = "[^a-zA-Z0-9]";
        String textWithoutReg = text.replaceAll(reg, "");
        StringBuilder sb = new StringBuilder(textWithoutReg);
        boolean res = textWithoutReg.equalsIgnoreCase(sb.reverse().toString());
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String res = sc.nextLine();
        System.out.println(isPalindrome(res));
    }
}
