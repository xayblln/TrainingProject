public class ProdFib {
    public static long[] productFib(long prod) {
        long fib1 = 0;
        long fib2 = 1;
        long help;
        while (fib1 * fib2 < prod) {
            help = fib2;
            fib2 = fib1 + fib2;
            fib1 = help;
        }
        if (fib1 * fib2 == prod) {
            return new long[] {fib1, fib2, 1};
        }
        return new long[] {fib1, fib2, 0};
    }
}
