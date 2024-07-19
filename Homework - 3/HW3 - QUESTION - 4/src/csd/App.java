package csd;

class App {
    public static void main(String[] args) {
        AppTest.run();
    }
}

class AppTest {

    public static void run() {

        int i = 1;
        while(i<1000000) {
            Functions.digit(i);
            i++;
        }

    }
}

class Functions {

    public static boolean isFactorian(int val, int expectedValue) {
        return val == expectedValue;
    }

    public static void digit(int val) {

        int sum = 0;
        int firstVal = val;
        while (val!=0) {
            // isFactorian(val,factorial(val%10));

            sum+=factorial(val%10);
            val/=10;
        }
        if(isFactorian(firstVal,sum))
            System.out.printf("%d factorian bir sayidir.\n", firstVal);
    }



    public static int factorial(int val) {

        if(val<1)
            return 0;
        if(val == 1)
            return 1;
        int sum  = 2;
        for(int i = 3; i<=val; i++) {
            sum*=i;
        }
        return sum;
    }

}