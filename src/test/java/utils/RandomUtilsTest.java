package utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RandomUtilsTest {

    @Test
    void nextInt() {
        assertThat(RandomUtils.nextInt(0, 9)).isBetween(0, 9);
    }

    @Test
    void testNextInt() {
        assertThat(RandomUtils.nextInt(10)).isBetween(0, 9);
    }
}