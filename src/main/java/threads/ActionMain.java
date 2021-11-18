package threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ActionMain {
    public static void main(String[] args) {
        List<Integer> integers = IntStream.range(0, 1_000)
                .boxed()
                .collect(Collectors.toList());
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new ProgramCall(integers));
        executor.shutdown(); //обезательно при екзекьюторСервайз
        try{
            System.out.println(future.get());
        }catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
