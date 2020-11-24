package StringAddCalculator;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Token {

    private final static String DEFAULT_DELIMITER = ",|:";
    private final static int CUSTOM_DELIMITER_INDEX = 1;
    private final static int CUSTOM_DELIMITER_TOKEN_INDEX = 2;

    public static List<String> findTokens(String values) {
        validateBlank(values);

        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(values);
        if (matcher.find()) {
            String customDelimiter = matcher.group(CUSTOM_DELIMITER_INDEX);
            return Arrays.asList(matcher.group(CUSTOM_DELIMITER_TOKEN_INDEX).split(customDelimiter));
        }

        return Arrays.asList(values.split(DEFAULT_DELIMITER));
    }

    private static void validateBlank(String values) {
        if (values == null || values.isEmpty()) {
            throw new IllegalArgumentException("null 또는 빈문자열은 사용할 수 없습니다.");
        }
    }
}