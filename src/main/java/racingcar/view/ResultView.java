package racingcar.view;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.car.Car;

public class ResultView {

    public static final String WINNERS = "가 촤종 우승했습니다.";

    public static void printState(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();
    }

    public static void printWinners(List<Car> winners) {
        List<String> winnerNames = winners.stream().map(winner -> winner.getName().toString())
                .collect(Collectors.toList());
        System.out.println(String.join(", ", winnerNames) + WINNERS);
    }
}
