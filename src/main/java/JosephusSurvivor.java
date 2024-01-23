import java.util.ArrayList;
import java.util.List;

public class JosephusSurvivor {
    public static int josephusSurvivor(final int n, final int k) {
        List<Integer> survivors = new ArrayList<>();
        for (int counter = 1; counter <= n; counter++) {
            survivors.add(counter);
        }
        int index = k - 1;

        while (survivors.size() != 1) {
            if (index > survivors.size() - 1) {
                while (index >= survivors.size()) {
                    index = index - survivors.size();
                }
            }
            survivors.remove(index);
            index = index + k - 1;
        }
        return survivors.get(0);
    }

    public static int josephusSurvivor2(final int n, final int k) {
        if (n == 1) {
            return 1;
        }
        return (josephusSurvivor2(n - 1, k) + k - 1) % n + 1;
    }
}
