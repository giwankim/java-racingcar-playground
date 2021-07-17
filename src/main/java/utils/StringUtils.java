package utils;

public class StringUtils {

    public static boolean isNullOrEmpty(final String str) {
        return str == null || str.isEmpty();
    }

    public static boolean isBlank(final String str) {
        return str == null || str.trim().isEmpty();
    }
}
