package racingcar.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    void isNullOrEmpty() {
        assertThat(StringUtils.isNullOrEmpty("")).isTrue();
        assertThat(StringUtils.isNullOrEmpty(null)).isTrue();
    }

    @Test
    void isBlank() {
        assertThat(StringUtils.isBlank("     ")).isTrue();
        assertThat(StringUtils.isBlank("\n\n\n")).isTrue();
    }
}
