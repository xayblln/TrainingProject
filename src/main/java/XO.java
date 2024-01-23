import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class XO {
    public static boolean getXO (String str) {
        List<Long> longList = new ArrayList<>(str.toLowerCase().chars()
                .mapToObj(element -> (char) element)
                .filter(el -> el == 'x' || el == 'o')
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values());
        if (longList.size() == 2) {
            return Objects.equals(longList.get(0), longList.get(1));
        }
        if (longList.size() == 0) {
            return true;
        }
        return false;
    }
}
