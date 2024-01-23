import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class KthPermutation {

    public static String findPerm(String str, BigInteger k) {
        List<String> partial = new ArrayList<>();
        partial.add(String.valueOf(str.charAt(0)));
        StringBuilder sbPartPerm = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            for (int j = partial.size() - 1; j >= 0; j--) {
                String s = partial.remove(j);
                for (int m = 0; m <= s.length(); m++) {
                    partial.add(sbPartPerm
                            .append(s.substring(0, m))
                            .append(str.charAt(i))
                            .append(s.substring(m))
                            .toString());
                    sbPartPerm.setLength(0);
                }
            }
        }
        partial.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        return partial.get(k.intValue() - 1);
    }
}
