package racingcar.domain.Car;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void constructor() {
        Car car = new Car("pobi");
        assertThat(car).isEqualTo(new Car("pobi"));
    }

    @Test
    void move() {
        Car car = new Car("pobi");
        assertThat(car.move(() -> true)).isEqualTo(new Car("pobi", 1));
    }

    @Test
    void stop() {
        Car car = new Car("pobi");
        assertThat(car.move(() -> false)).isEqualTo(new Car("pobi"));
    }
}
