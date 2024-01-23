import java.util.Arrays;
import java.util.stream.Stream;

public class Troll {
    public static String disemvowel(String str) {
        StringBuilder sbNoVowels = new StringBuilder();
        Stream.of(str)
                .map(el -> el.split("[aeuioAEUIO]"))
                .flatMap(Arrays::stream)
                .forEach(sbNoVowels::append);
        return sbNoVowels.toString();
    }
}
