package racingcar.domain.car;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.car.Car;

public class CarTest {

  private Car car;

  @BeforeEach
  void setUp() {
    car = new Car("gwen");
  }

  @Test
  @DisplayName("생성자")
  void constructor() {
    assertThat(car.getName()).isEqualTo(new Name("gwen"));
    assertThat(car.getPosition()).isEqualTo(0);
  }

  @Test
  @DisplayName("이동")
  void move() {
    car.move(4);
    assertThat(car.getPosition()).isEqualTo(1);
  }

  @Test
  @DisplayName("정지")
  void not_move() {
    car.move(3);
    assertThat(car.getPosition()).isEqualTo(0);
  }


}
