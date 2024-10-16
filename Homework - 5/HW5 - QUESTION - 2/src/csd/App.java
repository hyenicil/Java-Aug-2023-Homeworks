//Burayi yaparken zorlandim ve daha sonra cozumlere bakilacak.
/*
 *
 * Parametresi ile aldığı pozitif bir tamsayının kendisi hariç tüm çarpanlarının toplamı ile geri dönen sumFactors
 * metodunu yazınız. Metot parametresi ile aldığı sayı hariç tüm çarpanlarının toplamına geri dönecektir: (1 her
 * sayının doğal çarpanıdır ve toplama dahil edilecektir.)
 *
 *  */

package csd;

class App {
    public static void main(String[] args) {
        NumberUtilTest.run();
    }
}


class NumberUtilTest {
    public static void run() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        for (;;) {
            System.out.print("Bir sayı giriniz:");
            long val = Long.parseLong(kb.nextLine());

            if (val == 0)
                break;

            System.out.printf("%d sayısının kendisi hariç çarpanları toplamı:%d%n", val, NumberUtil.sumFactors(val));
        }

        System.out.println("Tekrar yapıyor musunuz?");
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