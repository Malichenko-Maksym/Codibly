import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BubbleSortTest {

    private BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void testSort1() {
        List<Comparable> input = List.of(1, 4, 5, 6, 8, 3, 8);
        List<Comparable> expected = List.of(1, 3, 4, 5, 6, 8, 8);
        assertEquals(expected, bubbleSort.sort(input));
    }

    @Test
    public void testSort2() {
        List<Comparable> input = List.of(-9.3, 0.2, 4, 0.1, 5, 9);
        List<Comparable> expected = List.of(-9.3, 0.1, 0.2, 4, 5, 9);
        assertEquals(expected, bubbleSort.sort(input));
    }

    @Test
    public void testSort3() {
        List<Comparable> input = new ArrayList<>();
        List<Comparable> expected = new ArrayList<>();
        assertEquals(expected, bubbleSort.sort(input));
    }

    @Test
    public void testSort4() {
        List<Comparable> input = List.of(null, 5.0001);
        List<Comparable> expected = List.of(5.0001);
        assertEquals(expected, bubbleSort.sort(input));
    }

    @Test(expected = RuntimeException.class)
    public void testSort5() {
        bubbleSort.sort(null);
    }
}
