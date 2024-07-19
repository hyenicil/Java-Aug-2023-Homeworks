package csd;
/*Klavyeden alınan int türden üç sayı arasındaki büyüklük-küçüklük ilişkisini küçükten büyüğe doğru < ve =
	sembolleriyle gösteren programı yazınız:
	Açıklama:
	- Program içerisinde dizi kullanılmayacaktır. Zaten gerek de yoktur.
	- Bir sıralama algoritmasına ihtiyacınız yoktur.
	- Program üç tane int türden sayı isteyecektir ve aralarındaki ilişkiyi ekranda gösterecektir. İşte birkaç

	örnek

	Giriş: 10 20 30
	Yanıt: 10 < 20 < 30
	Giriş: 30 10 20
	Yanıt: 10 < 20 < 30
	Giriş: 10 10 15
	Yanıt: 10 = 10 < 15
	Giriş: 40 50 50
	Yanıt: 40 < 50 = 50

 * */

class App {

    public static void main(String[] args)
    {

        MinMaxTest.run();

    }
}

class MinMaxTest {

    public static void printTest(int min, int max, int med) {

        if(med == min)
            System.out.printf("%d = %d < %d",min, med, max);
        else if(med == max)
            System.out.printf("%d < %d = %d",min, med, max);
        else
            System.out.printf("%d < %d < %d",min, med, max);

    }

    public static void run()
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a = sc.nextInt();
        System.out.print("\nBir sayı giriniz: ");
        int b = sc.nextInt();
        System.out.print("\nBir sayı giriniz: ");
        int c = sc.nextInt();

        MinMaxCalculator.isMaxMinCalculator(a, b, c);

    }
}

class MinMaxCalculator {

    public static void isMaxMinCalculator  (int a, int b, int c)
    {
        int min = Math.min(a, Math.min(b,c));
        int max = Math.max(a, Math.max(b,c));
        int med = Math.min(Math.max(a, b), Math.max(b, c)) ;
        MinMaxTest.printTest(min, max, med);
    }

}

/* package csd;

class App {

	public static void main(String[] args)
	{
		NumberUtilTest.run();
	}
}

class NumberUtilTest {



	public static void  printResult(int max, int min, int med) {

		if (min == med )
			System.out.printf("%d = %d < %d%n", min, med, max);

		else if (med == max )
			System.out.printf("%d < %d = %d%n", min, med, max);
		else
			System.out.printf("%d < %d < %d%n", min, med, max);

	}
	public static void run () {

		java.util.Scanner sc =  new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		int a =  sc.nextInt();
		System.out.print("Bir sayı giriniz: ");
		int b =  sc.nextInt();
		System.out.print("Bir sayı giriniz: ");
		int c = sc.nextInt();

		NumberUtil.controlOperationsV1( a, b, c);
		NumberUtil.controlOperationsV2( a, b, c);

	}

}

class printUtil {

	public static void printMax()
	{

	}
}

class NumberUtil {

	public static void controlOperationsV1(int a, int b, int c)
	{
		int max = NumberBasicOperations.maxV1(a,NumberBasicOperations.maxV1(b, c));
		int min = NumberBasicOperations.minV1(a, NumberBasicOperations.minV1(b, c));
		/*Bir sayının ortanca karakterini bulmak için birden fazla yol var işte a + b +c -min -max gibi
		, yada en büyük en küçüğü topla sonrasında 2 bölüp en yakın değeri al gibiii
		b burada bug oluyor ondan dolayı yapıldı
int med = NumberBasicOperations.minV1(NumberBasicOperations.maxV1(a, b), NumberBasicOperations.maxV1(b, c));
		if (max == med )
med = NumberBasicOperations.maxV1(a,c);

		NumberUtilTest.printResult(max, min, med );
	}
public static void controlOperationsV2(int a, int b, int c)
{
    int max = NumberBasicOperations.maxV2(a,NumberBasicOperations.maxV2(b, c));
    int min = NumberBasicOperations.minV2(a, NumberBasicOperations.minV2(b, c));
		Bir sayının ortanca karakterini bulmak için birden fazla yol var işte a + b +c -min -max gibi
		, yada en büyük en küçüğü topla sonrasında 2 bölüp en yakın değeri al gibiii

    //b burada bug oluyor ondan dolayı yapıldı
    int med =  a + b + c - max - min ;

    NumberUtilTest.printResult(max, min, med );
}

}

class NumberBasicOperations {

    public static int maxV1(int a , int b)
    {
        if(a > b)
            return a;
        return b;
    }
    public static int maxV2(int a, int b)
    {
        return a > b ? a : b;
    }

    public static int minV1(int a, int b)
    {
        if(a < b)
            return a;
        return b;
    }
    public static int minV2(int a, int b)
    {
        return a < b ? a: b;
    }

}*/