package calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringAddCalculatorTest {

  @Test
  @DisplayName("splitAndSum_null_또는_빈문자")
  public void splitAndSum_null_or_empty() {
    int result = StringAddCalculator.splitAndSum(null);
    assertThat(result).isEqualTo(0);

    result = StringAddCalculator.splitAndSum("");
    assertThat(result).isEqualTo(0);
  }

  @Test
  @DisplayName("splitAndSum_숫자하나")
  void splitAndSum_single_number() {
    int result = StringAddCalculator.splitAndSum("1");
    assertThat(result).isEqualTo(1);
  }

  @Test
  @DisplayName("splitAndSum_쉼표구분자")
  void splitAndSum_comma_delimiter() {
    int result = StringAddCalculator.splitAndSum("1,2");
    assertThat(result).isEqualTo(3);
  }

  @Test
  @DisplayName("splitAndSum_쉼표_또는_콜론_구분자")
  void splitAndSum_comma_or_colon_delimiter() {
    int result = StringAddCalculator.splitAndSum("1,2:3");
    assertThat(result).isEqualTo(6);
  }

  @Test
  @DisplayName("splitAndSum_custom_구분자")
  void splitAndSum_custom_delimiter() {
    int result = StringAddCalculator.splitAndSum("//;\n1;2;3");
    assertThat(result).isEqualTo(6);
  }

  @Test
  void splitAndSum_negative() {
    assertThatExceptionOfType(RuntimeException.class)
        .isThrownBy(() -> StringAddCalculator.splitAndSum("-1,2,3"))
        .withMessage("숫자 이외의 값 또는 음수값은 허용되지 않습니다.");
  }
}
