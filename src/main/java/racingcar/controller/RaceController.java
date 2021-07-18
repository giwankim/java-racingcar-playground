package racingcar.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.car.Car;
import racingcar.view.InputView;
import racingcar.view.ResultView;
import utils.RandomUtils;

public class RaceController {

    public static final String DELIMITER_REGEX = ",";
    public static final int BOUND = 10;

    private List<Car> cars;
    private int rounds;

    public RaceController() {
        setUpCars();
        setUpRounds();
    }

    private void setUpRounds() {
        rounds = InputView.getRounds();
    }

    private void setUpCars() {
        cars = new ArrayList<>();
        String inputText = InputView.getCarNames();
        List<String> names = splitGetNames(inputText);
        for (String name : names) {
            cars.add(new Car(name));
        }
    }

    public void start() {
        race();
        List<Car> winners = getWinners();
        ResultView.printWinners(winners);
    }

    private List<Car> getWinners() {
        int maxPosition = cars.stream().max(Comparator.comparing(Car::getPosition))
                .map(Car::getPosition).orElse(-1);
        return cars.stream().filter(car -> car.getPosition() == maxPosition)
                .collect(Collectors.toList());
    }

    private void race() {
        for (int i = 0; i < rounds; i++) {
            raceOneRound();
        }
    }

    private void raceOneRound() {
        for (Car car : cars) {
            car.move(getRandomNumber());
        }
        ResultView.printState(cars);
    }

    private int getRandomNumber() {
        return RandomUtils.nextInt(BOUND);
    }

    private List<String> splitGetNames(String carNames) {
        return Arrays.asList(carNames.split(DELIMITER_REGEX));
    }
}
