public class Persist {
    public static int persistence(long n) {
        long factorWholePart;
        long multipleResult;
        long newN = n;
        int counter = 0;
        while (newN / 10 != 0) {
            factorWholePart = (long) Math.pow(10, (int) Math.log10(newN));
            multipleResult = newN / factorWholePart;
            factorWholePart /= 10;
            while (factorWholePart > 0) {
                multipleResult *= newN / factorWholePart % 10;
                factorWholePart /= 10;
            }
            newN = multipleResult;
            counter++;
        }
        return counter;
    }
}
