import java.util.concurrent.atomic.AtomicInteger;

public class App {
    static int sumN(int N) {
        int sum = 0;
        int i = 1;
        while (i <= N) {
            sum += i;
            System.out.println(sum);
            i++;
        }
        return sum;
    }

    static int powerN(int base, int power) {
        int product = 1;
        for (int index = 0; index < power; index++) {
            product *= base;
        }
        return product;
    }

    static Boolean PrimeNumber(int number) {
        Boolean result = false;
        // int number;

        int d = 0;
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                d++;
            }
            i++;
        }
        if (d == 0) {
            // System.out.println("Простое");
            result = true;
        } else {
            // System.out.println("Не простое");
            result = false;
        }
        return result;
    }

    static void dispPrimes(int N) {
        for (int index = 1; index <= N; index++) {
            if (PrimeNumber(index)) {
                System.out.println(index);
            }
        }
    }

    static int Fib(int end, AtomicInteger count) throws Exception {        
        if (end < 1)
            throw new Exception("Ввод должен быть > 0");
        if (end == 1)
            return 0;
        if (end == 2 || end == 3)
            return 1;

        int num0 = 0;
        int num1 = 1;
        int num2 = 0;

        for (int i = 3; i <= end; i++) {
            count.incrementAndGet();
            num2 = num0 + num1;
            num0 = num1;            
            num1 = num2;
        }
        return num2;
    }

    static int FibRec(int n, AtomicInteger count) throws Exception {
        count.incrementAndGet();
        if (n < 1)
            throw new Exception("Ввод должен быть > 0");
        if (n == 1 || n == 2) {
            return n - 1;
        }
        return FibRec(n - 1, count) + FibRec(n - 2, count);
    }

    public static void main(String[] args) throws Exception {
        // System.out.println(sumN(5));
        // System.out.println(PrimeNumber(7));
        // System.out.println(PrimeNumber(10));
        AtomicInteger count = new AtomicInteger(0);
        long start = System.currentTimeMillis();
        System.out.println(Fib(40, count));
        System.out.println("Count: "+ count.get());
        count.set(0);
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Time Elapsed for Fib: "+ timeElapsed);
       
        start = System.currentTimeMillis();        
        System.out.println(FibRec(40, count));
        System.out.println("Counter: "+ count.get());
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Time Elapsed for FibRec: "+ timeElapsed);
        // System.out.println(powerN(6, 4));
        //dispPrimes(15);
    }
}
