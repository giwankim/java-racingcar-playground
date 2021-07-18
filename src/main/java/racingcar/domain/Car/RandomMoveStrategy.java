package racingcar.domain.Car;

import racingcar.utils.RandomUtils;

public class RandomMoveStrategy implements MoveStrategy {

    public static final int BOUND = 10;
    public static final int MIN_INT = 4;

    @Override
    public boolean canMove() {
        return RandomUtils.nextInt(BOUND) >= MIN_INT;
    }
}
