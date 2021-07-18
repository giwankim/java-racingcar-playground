package racingcar.utils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class RandomUtilsTest {

    @Test
    void nextInt() {
        for (int i = 0; i < 10; i++) {
            assertThat(RandomUtils.nextInt(10)).isBetween(0, 9);
        }
    }

    @Test
    void negative_bound() {
        assertThatThrownBy(() -> RandomUtils.nextInt(-1))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
