package csd;

class App {

    public static void main(String[] args) {
        AppTest.run();
    }
}

class AppTest {
    public static void run() {

        int i = 1, finalIsPrimeValue=1;
        while (i<1000) {
            finalIsPrimeValue = printApp(i, finalIsPrimeValue);
            i++;
        }
    }


    public static int printApp(int val, int value) {
        int number;
        if(Functions.isPrime(val)) {
            System.out.printf("%d -> %d *\n",val,number=Functions.nthAfterIsPrime(value));
            return number;
        }
        System.out.printf("%d -> %d\n",val,number=Functions.nthAfterIsPrime(value));
        return  number;
    }
}

class Functions {

    public static boolean isPrime(int val) {

        if (val <= 1)
            return false;

        if (val % 2 == 0)
            return val == 2;

        if (val % 3 == 0)
            return val == 3;

        if (val % 5 == 0)
            return val == 5;

        if (val % 7 == 0)
            return val == 7;

        for (int i = 11; i * i < val; i += 2)
            if (val % i == 0)
                return false;

        return true;
    }

    public static int nthAfterIsPrime(int val) {
        while (true)
            if(isPrime(++val))
                return val;

    }
}