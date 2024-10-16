/*
 *
 *
 * 1. abc üç basamaklı bir tamsayıdır ve aşağıdaki koşulları sağlamaktadır:
 * koşul 1 cba > abc olacak
 * koşul 2 abc asal sayı olacak
 * koşul 3 cba asal sayı olacak
 * koşul 4 ab asal sayı olacak
 * koşul 5 bc asal sayı olacak
 * koşul 6 cb asal sayı olacak
 * koşul 7 ba asal sayı olacak
 *
 * 113 sayısı bu koşulları sağlamaktadır!
 *
 * koşul 1 cba > abc olacak 311 > 113
 * koşul 2 abc asal sayı olacak 113 asal
 * koşul 3 cba asal sayı olacak 311 asal
 * koşul 4 ab asal sayı olacak 11 asal
 * koşul 5 bc asal sayı olacak 13 asal
 * koşul 6 cb asal sayı olacak 31 asal
 * koşul 7 ba asal sayı olacak 11 asal
 *
 * Yukarıdaki koşulların hepsini sağlayan tüm abc sayılarını bulan programı yazınız.
 *
 * */

package csd;

class App {

    public static void main(String[] args) {
        NumberUtilTest.run();
    }
}

class NumberUtilTest {


    public static void printNumber(String message, int val)
    {
        System.out.printf("%s: %d\n", message,val);
    }
    public static void run()
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int i = 0;
        while(i<100000)
        {
            NumberUtil.numberUtilControl(i);
            NumberUtil.numberUtilControlV2(i);
            i++;
        }

    }
}

class NumberUtil {

    public static void numberUtilControlV2(int val) {

        boolean flag = true;
        if((reverse(val)>val) && isPrime(val) && isPrime(reverse(val)) && isPrime(val/10)
                && isPrime(val-100) && isPrime(reverse(val-100)) && isPrime(reverse(val/10)))

            NumberUtilTest.printNumber("V2",val);


    }
    public static void numberUtilControl(int val) {

        boolean flag = true;

        if(!(reverse(val)>val))
            flag = false;
        if(!isPrime(val))
            flag=false;
        if(!isPrime(reverse(val)))
            flag=false;
        if(!isPrime(val/10))
            flag=false;
        if(!isPrime(val-100))
            flag=false;
        if(!(isPrime(reverse(val-100))))
            flag=false;
        if(!isPrime(reverse(val/10)))
            flag=false;
        if(flag==true)
            NumberUtilTest.printNumber("V1",val);

    }

    public static boolean isPrime(int val)
    {
        //Bir sayisinin asal sayilmasi kendine ve 1 disinda bolunemeyen sayilara denir.
        //Bir sayı kare kökünden küçük olan asal sayıların hiç birisine bölünmüyorsa asaldır.

        if(val <=1)
            return false;
        if(val%2==0)
            return val==2;
        if(val%3==0)
            return val==3;
        if(val%5==0)
            return val==5;
        if(val%7==0)
            return val==7;

        for(int i=11; i*i<val; i+=2)
            if(val%i==0)
                return false;
        return true;

    }

    public static int reverse(int val)
    {
        int number = 0;
        while(val!=0)
        {
            number = (val % 10) + number * 10;
            val/=10;

        }

        return number;
    }



}