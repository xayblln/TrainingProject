import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpinWords {
    public static String spinWords(String sentence) {
        return Stream.of(sentence)
                .map(element -> element.split("[ ]"))
                .flatMap(Arrays::stream)
                .map(element -> element.length() >= 5 ? reverse(element) : element)
                .collect(Collectors.joining(" "))
        ;
    }
    public static String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
