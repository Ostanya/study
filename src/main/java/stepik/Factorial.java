package stepik;

import java.math.BigInteger;

//факториал числа n — это произведение всех натуральных чисел от 1 до n включительно

public class Factorial {
    public static BigInteger factorial(int value) {
        return value == 1 ? BigInteger.ONE : BigInteger.valueOf(value).multiply(factorial(value - 1));
    }

    public static void main(String[] args) {
        System.out.println(factorial(1));
    }
}
