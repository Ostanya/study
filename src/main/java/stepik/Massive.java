package stepik;

public class Massive {
    public static void main(String[] args) {
        String s1 = 'A' + "12";
        System.out.println(s1);
        String s2 = "A" +('\t' +'\u0003');
        System.out.println(s2);
        String s3 = 'A' + '1' + "2";
        System.out.println(s3);
        String s4 = "A" + 12;
        System.out.println(s4);
    }
}
