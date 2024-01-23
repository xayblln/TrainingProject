import java.util.Arrays;

public class FindOutlier {
    static int find(int[] integers) {
        int counterChet = 0;
        int counterNechet = 0;
        int indexChet = 0;
        int indexNechet = 0;
        for (int index = 0; index < integers.length; index++) {
            if (integers[index] % 2 == 0) {
                counterChet++;
                indexChet = index;
            } else {
                counterNechet++;
                indexNechet = index;
            }
            if (counterNechet > 1 && counterChet == 1) {
                return integers[indexChet];
            }
            if (counterNechet == 1 && counterChet > 1) {
                return integers[indexNechet];
            }
        }
        return 0;
    }
}
