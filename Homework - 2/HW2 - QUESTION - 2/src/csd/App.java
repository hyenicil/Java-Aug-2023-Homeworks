/*
 * 2. Parametresi ile aldığı long türden saniye cinsinden süreyi saat, dakika ve saniye olarak ayrıştırarak ekrana
yazdıran printDuration isimli metodu yazınız. Eğer saat, dakika ya da saniye değeri 0(sıfır) ise ekrana
yazdırılmayacaktır.
 * */

package csd;

class App {

    public static void main(String[] args) {

        DurationTest.run();

    }

}


class DurationTest {

    public static void printDuration(Long x )
    {
        Long val = x;
        if((val = DurationCalculator.clockCalculator(x)) > 0)
            System.out.printf("%d saat " , val);

        if((val = DurationCalculator.minuteCalculator(x - val * 3600)) > 0)
            System.out.printf("%d dakika " , val);

        if((val = DurationCalculator.secondCalculator(x)) > 0)
            System.out.printf("%d saniye " , val);


    }

    public static void run()
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Saniye giriniz: ");
        Long x = sc.nextLong();

        if(x>0)
            printDuration(x);
        else
            System.out.print("Tekrar giriniz:");

    }
}


class DurationCalculator {


    public static long secondCalculator(long val) {
        return val % 60;
    }

    public static long  clockCalculator(long val) {
        return val/3600;
    }

    public static long minuteCalculator(long val) {
        return val/60;
    }

}



