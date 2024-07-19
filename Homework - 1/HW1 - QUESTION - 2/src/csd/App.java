/*
	Parametresi ile aldığı int türden 3 sayıdan ortancasına geri dönen mid isimli metodu NumberUtil isimli sınıf
	içerisinde yazınız ve test ediniz.
	Açıklamalar:
	- Metot sayıların aynı olması durumunda da ortanca değere geri dönecektir. Örneğin sayılar 10, 10, 20 ise
	ortanca değer 10 olacaktır.
	- Üç tane sayının ortancası sayıların toplamından sayıların en küçüğünün ve en büyüğünün toplamını
	çıkartmakla bulunabilir. Metot bu şekilde yazılmayacaktır. Yani metot içerisinde sayıların en büyüğünün
	ve en küçüğünün bulunmasına gerek yoktur.
*/

package csd;

class App {

    public static void main (String[] args)
    {
        NumberUtilTest.run();

    }
}

class NumberUtilTest {

    public static void printMid(int mid)
    {
        System.out.printf("Mid: %d", mid);
    }

    public static void run ()
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a = sc.nextInt();
        System.out.print("\nBir sayı giriniz: ");
        int b = sc.nextInt();
        System.out.print("\nBir sayı giriniz: ");
        int c = sc.nextInt();
        NumberUtilTest.printMid(NumberUtil.mid(a, b, c));
    }
}

class NumberUtil {

    public static int mid(int a, int b, int c)
    //Hocam burada ben ilk soruya göre yaptım ancak aklıma hiç toplama çıkarma gelmedi. Hatta en büyük ve en küçük
    //toplayıp 2 ye bölüp en yakını bulmayı düşündüm.
    //Basit olmasın diye de if else yapmak istememiştim.

    {
        int med = Math.min(Math.max(a,b),Math.max(b,c)) ;
        int max = Math.max(a, Math.max(b,c));

        if(max == med)
            med = Math.max(a,c);
        return med;
    }
}

