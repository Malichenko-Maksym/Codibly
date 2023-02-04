import java.util.HashMap;

public class BalancedWordsCounter {

  private static boolean isBalanced(String word) {
    HashMap<Character, Integer> charCount = new HashMap<>();
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      charCount.put(c, charCount.getOrDefault(c, 0) + 1);
    }

    int count = charCount.values().iterator().next();
    for (int c : charCount.values()) {
      if (c != count) {
        return false;
      }
    }
    return true;
  }

  public static Integer count(String input) throws Exception {
    if (input == null) {
      throw new Exception("Input cannot be null");
    }

    for (int i = 0; i < input.length(); i++) {
      if (!Character.isLetter(input.charAt(i))) {
        throw new Exception("Input can contain only letters");
      }
    }

    int count = 0;
    for (int i = 0; i < input.length(); i++) {
      for (int j = i; j < input.length(); j++) {
        String sub = input.substring(i, j + 1);
        if (isBalanced(sub)) {
          count++;
        }
      }
    }

    return Integer.valueOf(count);
  }

  public static void main(String[] args) throws Exception {
    Integer k = count("abb");
    System.out.println(k);
  }
}