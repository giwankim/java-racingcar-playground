package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

  public static int splitAndSum(String text) {
    if (isBlank(text)) {
      return 0;
    }
    return sum(split(text));
  }

  private static String[] split(String text) {
    Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(text);
    if (matcher.find()) {
      String customDelimiter = matcher.group(1);
      return matcher.group(2).split(customDelimiter);
    }
    return text.split("[,:]");
  }

  private static int sum(String[] tokens) {
    int sum = 0;
    for (String token: tokens) {
      sum += parse(token);
    }
    return sum;
  }

  private static int parse(String token) {
    if (!token.matches("\\d+")) {
      throw new RuntimeException("숫자 이외의 값 또는 음수값은 허용되지 않습니다.");
    }
    return Integer.parseInt(token);
  }

  private static boolean isBlank(String text) {
    return text == null || text.isEmpty();
  }
}
