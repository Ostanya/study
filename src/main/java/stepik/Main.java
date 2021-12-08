package stepik;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        double sum = 0.0;
        double n;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if(scanner.hasNextDouble()){
                   n = scanner.nextDouble();
                   sum += n;
            }else {
                scanner.next();
            }
        }
        System.out.printf(Locale.ENGLISH,
                "%.6f",
                sum);
    }
}
