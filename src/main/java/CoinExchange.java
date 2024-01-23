public class CoinExchange {
    public static long exchange(int type[], int n) {
        int temp;
        long result = 0;
        for (int counter = 0; counter < type.length; counter++) {
            temp = n / type[counter];
            if (n == type[counter] * temp) {
                result++;
            }
        }
        return result;
    }
}
