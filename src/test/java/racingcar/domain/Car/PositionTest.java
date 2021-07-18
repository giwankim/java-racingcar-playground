package racingcar.domain.Car;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class PositionTest {

    @Test
    void constructor() {
        Position position = new Position(4);
        assertThat(position).isEqualTo(new Position(4));
    }

    @Test
    void negative() {
        assertThatThrownBy(() -> new Position(-1)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void move() {
        Position position = new Position(4);
        assertThat(position.move()).isEqualTo(new Position(5));
    }
}
