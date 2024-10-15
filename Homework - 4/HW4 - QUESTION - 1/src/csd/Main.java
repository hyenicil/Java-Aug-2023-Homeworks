package csd;

public class Main {

    public static void main(String [] args)
    {
        System.out.println(Util.e());
    }
}
class Util {
    public static double e()
    {
        double result = 2;

        for (int i = 2; i < 10; ++i)
            result += 1. / NumberUtils.factorial(i);

        return result;
    }
}

class NumberUtils {
    public static int factorial(int n)
    {
        int result = 1;

        for (int i = 2; i <= n; ++i)
            result *= i;

        return result;
    }
}