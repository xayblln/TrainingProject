import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        String newText = text.toLowerCase();
        AtomicInteger sum = new AtomicInteger();
        Stream.of(newText)
                .map(element -> element.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values().stream()
                .filter(element -> element > 1)
                .forEach(el -> sum.getAndIncrement());
        return sum.get();
    }
}
