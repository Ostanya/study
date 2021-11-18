package threads;

public class YieldMain {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Start 1");
            Thread.yield(); //ожидание на квант времени для выполнения процесса иного потока
            Thread.yield();
            System.out.println("end1");
        }).start();
        new Thread(() -> {
            System.out.println("Start 2");
            System.out.println("end2");
        }).start();
    }
}
