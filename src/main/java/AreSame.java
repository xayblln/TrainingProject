import java.util.Arrays;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) {
            return false;
        }
        if (a.length == 0 && b.length == 0) {
            return true;
        }
        if (a.length == 0) {
            return false;
        }
        if (b.length == 0) {
            return false;
        }
        int[] aCopy = a.clone();
        for (int counter = 0; counter < a.length; counter++) {
            aCopy[counter] = Math.abs(aCopy[counter]);
            if (aCopy[counter] == 0) {
                return false;
            }
        }
        Arrays.sort(aCopy);
        int[] bCopy = b.clone();
        Arrays.sort(bCopy);
        for (int counter = 0; counter < a.length; counter++) {
            if (aCopy[counter] * aCopy[counter] != bCopy[counter]) {
                return false;
            }
        }
        return true;
    }
    public static boolean compOtherWay(int[] a, int[] b) {
        if ((a == null) || (b == null)){
            return false;
        }
        int[] aa = Arrays.stream(a).map(n -> n * n).toArray();
        Arrays.sort(aa);
        Arrays.sort(b);
        return (Arrays.equals(aa, b));

    }
}
