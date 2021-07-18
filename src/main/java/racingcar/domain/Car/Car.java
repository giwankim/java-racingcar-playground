package racingcar.domain.Car;

import java.util.Objects;

public class Car {

    private final Name name;
    private final Position position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public Car(Name name, Position position) {
        this.name = name;
        this.position = position;
    }

    protected Car move(MoveStrategy moveStrategy) {
        if (moveStrategy.canMove()) {
            return new Car(name, position.move());
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Car)) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(position, car.position) && Objects
                .equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, name);
    }
}
