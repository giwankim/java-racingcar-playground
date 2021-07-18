package racingcar.domain.Car;

@FunctionalInterface
public interface MoveStrategy {
    boolean canMove();
}
