package racingcar.domain.car;

import java.util.Objects;
import utils.StringUtils;

public class Name {

    public static final int MIN_LENGTH = 5;
    public static final String LONG_NAME = "이름의 길이가 5보다 큽니다.";
    public static final String NULL_OR_EMPTY = "자동차 이름이 존재해야 합니다.";
    public static final String BLANK = "자동타 이름을 빈칸으로 입력하셨습니다.";
    private String name;

    public Name(final String name) {
        validateName(name);
        this.name = name.trim();
    }

    private void validateName(final String name) {
        if (StringUtils.isNullOrEmpty(name)) {
            throw new IllegalArgumentException(NULL_OR_EMPTY);
        }
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException(BLANK);
        }
        if (name.length() > MIN_LENGTH) {
            throw new IllegalArgumentException(LONG_NAME);
        }
    }

    public String getName() {
        return name;
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
        return Objects.equals(getName(), name1.getName());
    }

    @Override
    public String toString() {
        return name;
    }
}
