package racingcar.domain.car;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NameTest {

    @ParameterizedTest
    @ValueSource(strings= {"pobi", "crong", "honux"})
    void valid_names(String input) {
        Name name = new Name(input);
        assertThat(name.getName()).isEqualTo(input);
    }

    @ParameterizedTest
    @ValueSource(strings= {"abcdef", "ghijklmnop"})
    void long_names(String input) {
        assertThatIllegalArgumentException().isThrownBy(() -> new Name(input))
                .withMessage(Name.LONG_NAME);
    }

    @ParameterizedTest
    @ValueSource(strings= {"        ", "\n\n\n\n\n\t"})
    void blanks(String input) {
        assertThatIllegalArgumentException().isThrownBy(() -> new Name(input))
                .withMessage(Name.BLANK);
    }

    @Test
    void test_null_or_empty() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Name(null))
                .withMessage(Name.NULL_OR_EMPTY);
        assertThatIllegalArgumentException().isThrownBy(() -> new Name(""))
                .withMessage(Name.NULL_OR_EMPTY);
    }
}