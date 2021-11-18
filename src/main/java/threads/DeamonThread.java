package threads;

class SomeThread extends Thread {
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Number - " + i);
        }
    }
}

public class DeamonThread {
    public static void main(String[] args) {
        SomeThread example = new SomeThread();
        example.start();
        SomeThread ex1 = new SomeThread();
        ex1.start();
    }
}