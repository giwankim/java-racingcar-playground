package racingcar.domain.car;

public class Car {

    static final int MIN_MOVE = 4;
    private final Name name;
    private int position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = 0;
    }

    public Name getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move(int input) {
        if (input >= MIN_MOVE) {
            position += 1;
        }
    }

    @Override
    public String toString() {
        return name + " : " + "-".repeat(position);
    }
}
