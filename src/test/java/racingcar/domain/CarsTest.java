package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car.Car;
import racingcar.domain.Car.Cars;

public class CarsTest {

    @Test
    void winners() {
        Car pobi = new Car("pobi", 5);
        Car crong = new Car("crong", 4);
        Car honux = new Car("honux", 5);
        List<Car> carList = Arrays.asList(pobi, crong, honux);
        Cars cars = new Cars(carList);
        assertThat(cars.getWinners()).containsExactly(pobi, honux);
    }
}
