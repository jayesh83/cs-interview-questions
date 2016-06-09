package projecteuler;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class Number002 {

    public static long getEvenFibonacciNumbers(long n) {
        long a = 1;
        long b = 1;
        long sum = 0;

        while (sum < n) {
            long next = a + b;
            b = a;
            a = next;
            sum += (next % 2) == 0 ? next : 0;
        }

        return sum;
    }
}