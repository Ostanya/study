package threads;

import threads.TalkThread;
import threads.WalkThread;

public class BaseThreadMain {
    public static void main(String[] args) {
        WalkThread walk = new WalkThread();
        Thread talk = new Thread(new TalkThread());
        walk.start();
        talk.start();
    }
}
