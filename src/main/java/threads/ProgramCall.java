package threads;

import java.util.List;
import java.util.concurrent.Callable;

public class ProgramCall implements Callable {
    private List<Integer> integerList;

    public ProgramCall(List<Integer>integerList) {
        this.integerList = integerList;
    }

        @Override
        public Integer call () {
            int sum = 0;
            for(int number : integerList) {
                sum += number;
            }
            return sum;
        }
}
