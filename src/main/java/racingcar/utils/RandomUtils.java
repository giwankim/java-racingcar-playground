package racingcar.utils;

import java.util.Random;

public class RandomUtils {

    private static Random RANDOM = new Random();

    public static int nextInt(int bound) {
        if (bound <= 0) {
            throw new IllegalArgumentException("bound 는 양수이여만 합니다.");
        }
        return RANDOM.nextInt(bound);
    }
}
