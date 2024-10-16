/*
 *
 * Aşağıda açıklanan isPrimeX isimli metodu yazınız:
 * isPrimeX metodu içerisinde, gönderilen argumanın asal olup olmadığı test edilecek, eğer sayı asal ise bu kez sayının
 * basamak değerleri toplanarak elde edilen sayının asal olup olmadığı test edilecektir. Bu işleme sonuçta tek basamaklı bir
 * sayı kalana kadar devam edilecektir. Eğer en son elde edilen tek basamaklı sayı dahil tüm sayılar asal ise isPrimeX metodu
 * true değerine geri dönecektir. Eğer herhangi bir kademede asal olmayan bir sayı elde edilirse metot false değerine geri
 * dönecektir.
 *
 * */

package csd;

class App {

    public static void main(String[] args)
    {
        UtilTest.run();
    }
}

class UtilTest {

    public static void printUtil(boolean val) {
        System.out.printf("Sonuc: %b\n",val);

    }
    public static void printUtil(int val) {
        System.out.printf("Sonuc: %d\n",val);

    }

    public static void run()
    {
        java.util.Scanner sc =  new java.util.Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int a = sc.nextInt();
        printUtil(Util.isPrimeX(a));
    }
}

class Util {

    public static int digitCount(int val)
    {
        int result = 0;
        while(val!=0) {
            result += val%10;
            val/=10;
        }
        return result;

    }


    public static boolean isPrimeXV2(int val)
    {
        boolean flag = true;
        for(; val > 9; val=digitCount(val)) {
            flag = isPrime(val) ? (flag=true) : (flag=false);
            System.out.print(val);

        }

        return flag;
    }
    public static boolean isPrimeX(int val)
    {
        boolean flag = true;
        for(; val > 9; val=digitCount(val)) {
            if(isPrime(val))
                flag=true;
            else
                flag=false;
        }
        return flag;
    }

    public static boolean isPrime(int val)
    {
        if(val <= 1)
            return false;
        if(val%2 == 0)
            return val==2;
        if(val%3 == 0)
            return val==3;
        if(val%5 == 0)
            return val==5;
        if(val%7 == 0)
            return val==7;

        for(int i = 11;i*i<val; i+=2)
            if(val%i==0)
                return false;
        return true;
    }
}
