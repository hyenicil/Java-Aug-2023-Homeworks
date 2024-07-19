/*
 * 
 * Bir sayının asal çarpanlarını yazdıran programı yazınız. Örneğin:
Sayı: 12
2 2 3

 * */

package csd;

class App {

    public static void main(String[] args)
    {
        PrimeFactorTest.run();
    }

}


class PrimeFactorTest {
    public static void printPrimeFactor(int val)
    {
        System.out.printf("%d ",val);
    }
    public static void run()
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        while(true) {
            System.out.print("Bir sayı giriniz: ");
            int val = sc.nextInt();
            if(val<1)
                return;
            PrimeFactor.isPrimeFactor(val);
            System.out.println();

            //method yazılacak...
            //Asal sayımı meethodu yazılacak.
            //true dönerse o sayıya bölümü %0 yapılır
            //ve daha sonra döngü tekrar başlar.
        }

    }
}

class PrimeFactor{

    public static int isPrimeFactor(int val)
    {
        int isPrime = 2;

        while(val!=1)
        {
            if(NumberUtil.isPrime(isPrime) && val % isPrime == 0)
            {
                PrimeFactorTest.printPrimeFactor(isPrime);
                val /= isPrime;
            }

            else
                isPrime++;
        }

        return 1;
    }


}

class NumberUtil {

    public static boolean isPrime(int val)
    {
        //Kural: Bir sayı kare kökünden küçük olan asal sayıların hiç birisine bölünmüyorsa asaldır.

        if(val == 1)
            return false;

        if(val%2 == 0)
            return val == 2;

        if(val%3 == 0)
            return val == 3;

        if(val%5 == 0)
            return val == 5;

        if(val%7 == 0)
            return val == 7;

        for(int i = 11; i * i < val; i+=2)
            if (val % i == 0)
                return false;
        return true;

    }

}