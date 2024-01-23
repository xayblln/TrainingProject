import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindShortKata {
    public static int findShort(String s) {
        return Stream.of(s)
                .map(str -> str.split(" "))
                .flatMap(Arrays::stream)
                .sorted((str1, str2) -> str1.length() - str2.length())
                .limit(1)
                .collect(Collectors.toList())
                .get(0)
                .length();
    }
}
