/*
 *
 * e sayısını aşağıdaki seri toplamıyla bulabilirsiniz :
 * e= 1/0! + 1/1! + 1/2! + 1/3! + 1/4! ...
 * Bir Java programı yazarak e sayısını yukarıdaki seri toplamıyla hesaplayıp ekrana yazdırınız.
 *
 * */

package csd;

class App {
    public static void main(String[] args) {
        NumberUtilTest.run();
    }
}
class NumberUtilTest {
    public static void run() {
        System.out.println(NumberUtil.series(10));
    }
}

class NumberUtil {

    public static int factorial (int n) {
        int result = 1;
        for (int i = 2;i <=n; ++i) {
            result *= i;
        }
        return result;
    }

    public static double series(int n) {
        double total = 1;
        for(int i = 1; i <= n; i++) {
            total = total + ( 1. / factorial(i));
        }
        return total;

    }

}