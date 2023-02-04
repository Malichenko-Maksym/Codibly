import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BalancedWordsCounterTest {

  @Test
  public void testCount1() throws Exception {
    String input = "aabbabcccba";
    int expectedResult = 28;
    int result = BalancedWordsCounter.count(input);
    assertEquals(expectedResult, result);
  }

  @Test
  public void testCount2() throws Exception {
    String input = "";
    int expectedResult = 0;
    int result = BalancedWordsCounter.count(input);
    assertEquals(expectedResult, result);
  }

  @Test(expected = Exception.class)
  public void testCount3() throws Exception {
    String input = "abababa1";
    BalancedWordsCounter.count(input);
  }

  @Test(expected = Exception.class)
  public void testCount4() throws Exception {
    String input = null;
    BalancedWordsCounter.count(input);
  }
}
