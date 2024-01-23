public class IntegralKata {
    public static String integrate(int coefficient, int exponent) {
        StringBuilder sbIntegral = new StringBuilder();
        return sbIntegral.append(coefficient / (exponent + 1)).append("x^").append(exponent + 1).toString();
    }
}
