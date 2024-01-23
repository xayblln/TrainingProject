import org.apache.commons.lang3.Streams;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class KataStr {
    public static Map<Character, Long> count(String str) {
        return str.chars()
                .mapToObj(el -> (char) el)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
