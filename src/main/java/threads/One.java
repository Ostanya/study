package threads;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class One {
    public static void main(String[] args) {
        Predicate<? super String>predicate = s -> s.startsWith("g");
         Stream<String>stream1 = Stream.generate(() ->"growl!");
        Stream<String>stream2 = Stream.generate(() ->"growl!");
        boolean b1 = stream1.anyMatch(predicate);
        boolean b2 = stream2.anyMatch(predicate);
        System.out.println(b1+ " " + b2);

        System.out.println("_____________");

        List<Integer> l1 = Arrays.asList(1,2,3);
        List<Integer> l2 = Arrays.asList(4,5,6);
        List<Integer> l3 = Arrays.asList();
        //Stream.of(l1,l2,l3).map(x -> x+1).flatMap(x-> x.stream()).forEach(System.out::print);
    }
}
