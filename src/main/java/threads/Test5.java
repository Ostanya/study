package threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {
    private static List<String> sort (List<String> list) {
        List<String> copy = new ArrayList<>(list);
        Collections.sort(copy, (a,b) -> b.compareTo(a));
        //return list.stream().sorted((a,b) ->b.compareTo(a).collect(Collectors.toList());
        return list.stream().sorted((a,b) -> b.compareTo(a)).collect(Collectors.toList());

    }
}
