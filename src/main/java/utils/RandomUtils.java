package utils;

import java.util.Random;

public class RandomUtils {

  private static final Random RANDOM = new Random();

  public static int nextInt(final int startInclusive, final int endInclusive) {
    if (startInclusive > endInclusive) {
      throw new IllegalArgumentException();
    }
    if (startInclusive < 0) {
      throw new IllegalArgumentException();
    }
    return startInclusive + RANDOM.nextInt(endInclusive - startInclusive + 1);
  }

  public static int nextInt(final int bound) {
    if (bound <= 0) {
      throw new IllegalArgumentException("bound must be positive!");
    }
    return RANDOM.nextInt(bound);
  }
}
