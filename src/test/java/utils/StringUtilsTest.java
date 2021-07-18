package utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void isNullOrEmpty() {
        assertThat(StringUtils.isNullOrEmpty(null)).isTrue();
        assertThat(StringUtils.isNullOrEmpty("")).isTrue();
    }

    @Test
    void isBlank() {
        assertThat(StringUtils.isBlank("         ")).isTrue();
        assertThat(StringUtils.isBlank("\n")).isTrue();
    }
}