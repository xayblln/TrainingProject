import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        String[] resultArray = new String[array1.length];
        int counterRes = 0;
        for (String value : array1) {
            for (String s : array2) {
                if (s.contains(value)) {
                    resultArray[counterRes] = value;
                    counterRes++;
                    break;
                }
            }
        }
        return Arrays.stream(resultArray).limit(counterRes)
                .sorted()
                .toArray(String[]::new);
    }
}
