package racingcar.view;

import java.util.Scanner;

public class InputView {

    private static final String PROMPT_CAR_NAMES = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String PROMPT_ROUNDS = "시도할 횟수는 몇회인가요?";
    private static final Scanner scanner = new Scanner(System.in);

    public static String getCarNames() {
        System.out.println(PROMPT_CAR_NAMES);
        return scanner.nextLine();
    }

    public static int getRounds() {
        System.out.println(PROMPT_ROUNDS);
        return scanner.nextInt();
    }
}
