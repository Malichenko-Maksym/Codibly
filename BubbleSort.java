import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public List<Comparable> sort(List<Comparable> input) {
        if (input == null) {
            throw new RuntimeException();
        }
        List<Comparable> result = new ArrayList<>(input);
        for (int i = 0; i < result.size(); i++) {
            for (int j = 1; j < result.size() - i; j++) {
                if (result.get(j - 1) == null || result.get(j) == null) {
                    continue;
                }
                if (result.get(j - 1).compareTo(result.get(j)) > 0) {
                    Comparable temp = result.get(j - 1);
                    result.set(j - 1, result.get(j));
                    result.set(j, temp);
                }
            }
        }
        result.removeAll(List.of(null));
        return result;
    }
}