package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class SumRecursTask extends RecursiveTask<Long> {

    public static void main(String[] args) {
        int end = 1_000_000;
        List<Long> num = LongStream.range(0,end)
                .boxed()
                .collect(Collectors.toList());
        ForkJoinTask<Long> task = new SumRecursTask(num);
        long res = new ForkJoinPool().invoke(task);
        System.out.println(res);
    }

    private List<Long> longs;
    private int begin;
    private int end;
    public static final long THRESHOLD = 0;

    public SumRecursTask(List<Long> longs) {
        this(longs,0,longs.size());
    }

    public SumRecursTask(List<Long> longs, int begin, int end) {
        this.begin = begin;
        this.longs = longs;
        this.end = end;
    }

    @Override
    protected Long compute() {
        int lenght = end- begin;
        long result = 0;
        if(lenght <= THRESHOLD) {
            for (int i = begin; i < end; i++) {
                result += longs.get(i);
            }
        }else {
            int middle = begin + lenght/2;
            List<SumRecursTask> tasks = new ArrayList<>();
            tasks.add(new SumRecursTask(longs, begin,middle));
            tasks.add(new SumRecursTask(longs, middle, end));
            tasks.stream().forEach(RecursiveTask::fork);
            result = tasks.stream()
                    .map(RecursiveTask::join)
                    .reduce((r1, r2) -> r1 +r2)
                    .orElse(0L);
        }
        return result;
    }
}
