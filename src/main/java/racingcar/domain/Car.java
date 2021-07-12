package racingcar.domain;

public class Car {

  private static final int MIN_MOVE_INT = 4;
  private final String name;
  private int position;

  public Car(String name) {
    this.name = name;
    position = 0;
  }

  public String getName() {
    return name;
  }

  public int getPosition() {
    return position;
  }


  public void move(int randomNumber) {
    if (randomNumber >= MIN_MOVE_INT) {
      position += 1;
    }
  }
}
