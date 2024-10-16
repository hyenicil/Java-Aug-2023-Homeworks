package csd;

class App {
    public static void main(String[] args) {
        NumberUtilTest.run();
    }
}


class NumberUtilTest {
    public static void run() {
        System.out.println(NumberUtil.sumFactors(28));
    }
}

class NumberUtil {

    public static long sumFactors(long val) {
        long result = 1;

            for (long i = 2; i * i <= val; ++i)
                if (val % i == 0)
                    result += (i == val/i) ? i : ( i + val/i);
        return result;
    }
}