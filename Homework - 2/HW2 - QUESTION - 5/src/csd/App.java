package csd;
/*

	5. 2’den büyük tüm çift sayılar iki asal sayının toplamı biçiminde yazılabilir (Goldbach teoremi). Klavyeden bir
	çift sayı alan ve bunu iki asal sayının toplamı biçiminde yazdıran programı yazınız.
	Örneğin: Sayı: 16
	11 + 5

 * */
class App
{

    public static void main(String[] args) {

        NumberUtilTest.run();

    }
}

class NumberUtilTest
{
    public static void run() {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        while(true) {
            System.out.print("Bir sayı giriniz: ");
            int val = sc.nextInt();
            if(val%2==0)
                NumberUtil.isPrimeNumberCalcu(val);
            else
                System.out.print("Tekrar Deneyiniz.....");
        }
    }

    public static void isPrimeCalculatePrint(int isPrime, int prime) {

        System.out.printf("%d  %d%n", isPrime, prime);
    }

}

class NumberUtil
{

    public static void isPrimeNumberCalcu(int x)
    {
        int isPrime = 2;
        while(isPrime<x)
        {
            if(isPrime(isPrime) && isPrime(x - isPrime))
            {
                NumberUtilTest.isPrimeCalculatePrint(isPrime, x-isPrime);
                return;
            }
            isPrime++;
        }
    }

    public static boolean isPrime(int x)
    {
        if(x == 1)
            return false;
        if(x % 2 == 0)
            return x == 2;
        if(x % 3 == 0)
            return x == 3;
        if(x % 5 == 0)
            return x == 5;
        if(x % 7 == 0)
            return x == 7;

        for(int i =11; i * i < x; i+=2 )
            if(x%i == 0)
                return false;
        return true;
    }

}


