package racingcar.domain.Car;

import java.util.Objects;

public class Name {

    private final String name;

    public Name(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름이 비어 있습니다.");
        }
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
        }
        this.name = name.trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Name)) {
            return false;
        }
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
