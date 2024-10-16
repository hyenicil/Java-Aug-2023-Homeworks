/*
 *
 * Aşağıdaki açıklamalara göre bir tamsayının super asal (super prime) olup olmadığını test eden isSuperPrime isimli
 * metodu yazınız ve test ediniz.
 * Not: Super asal sayılara asal indeksli asal sayılar (prime indexed primes) da denir
 * Açıklamalar:
 *   Tüm asal sayıların 1 değerinden başlayarak indekslendiğini düşünelim:
 *           1 -> 2
 *           2 -> 3 *
 *           3 -> 5 *
 *           4 -> 7
 *           5 -> 11 *
 *           6 -> 13
 *           7 -> 17 *
 *           ...
 * Eğer asal sayının indeksi de yani kaçıncı asal sayı olduğu da asal ise bu sayı super asal sayıdır.
 *
 * */

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