package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

  private Car car;
  private String name;

  @BeforeEach
  void setUp() {
    name = "gwen";
    car = new Car(name);
  }

  @Test
  @DisplayName("생성자가 작동한다")
  void name() {
    assertThat(car.getName()).isEqualTo(name);
    assertThat(car.getPosition()).isEqualTo(0);
  }

  @Test
  @DisplayName("자동차가 움직인다")
  void move() {
    car.move(4);
    assertThat(car.getPosition()).isEqualTo(1);
  }

  @Test
  @DisplayName("자동차가 움직이지 않는다")
  void not_move() {
    car.move(3);
    assertThat(car.getPosition()).isEqualTo(0);
  }


}
