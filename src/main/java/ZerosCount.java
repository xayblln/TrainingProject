import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class ZerosCount {
    private static BigInteger getFactorial(int n) {
        if (n <= 1) {
            return BigInteger.valueOf(1);
        } else {
            return IntStream.rangeClosed(1, n).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
        }
    }

    public static int zeros(int n) {
        String str = getFactorial(n).toString();
        StringBuilder sb = new StringBuilder();
        int result = 0;
        for (int counter = str.length() - 1; counter > 0; counter--) {
            if (str.charAt(counter) == '0') {
                result++;
            } else {
                return result;
            }
        }
        return 0;
    }
}
