package csd;
/*
* Kendisi haricindeki tüm pozitif bölenlerinin toplamına eşit olan tamsayılara "mükemmel sayı (perfect number)” denir.
* Örneğin 6 ve 28 sayıları mükemmel sayılardır:
*       6 = 1 + 2 + 3
*       28 = 1 + 2 + 4 + 7 + 14
* a) Parametresi ile aldığı int türden bir değerin mükemmel sayı olup olmadığını test eden isPerfect metodunu yazınız.
* Metot, sayı mükemmel ise true mükemmel değilse false değerine geri dönecektir.
*
*
* b) 4 basamaklı tek bir mükemmel sayı vardır. Yazmış olduğunuz isPerfect metodunu kullanarak 4 basamaklı mükemmel
* sayıyı bulan programı yazınız.
*
*
* */

class App {

    public static void main(String[] args) {
        NumberUtilsTest.run();
    }
}

class NumberUtilsTest {
    public static void run() {

        NumberUtils.findFourDigitPerfectNumber();

    }
}

class NumberUtils {
    public static void findFourDigitPerfectNumber() {
        for (int i = 1000; i < 10000; i++)
            if (isBooleanPerfectNumber(i))
                System.out.println(i);
    }

    public static void findThreeDigitPerfectNumber() {
        for (int i = 100; i < 1000; i++)
            if (isBooleanPerfectNumber(i))
                System.out.println(i);

    }
    public static void findOneAndTwpDigitPerfectNumber() {
        for (int i = 1; i < 100; i++)
            if (isBooleanPerfectNumber(i))
                System.out.println(i);
    }


    public static boolean isBooleanPerfectNumber(int val) {
        return val == sumFactors(val);
    }

    public static int sumFactors(int val) {
        int result = 1;
        for (int i = 2; i * i<= val; i++) {
            if(val%i==0)
                result += (i == val/i) ? i : (i + val / i);
        }
        return result;
    }

}

/*
package csd;

class App {
	public static void main(String [] args)
	{
		IsPerfectTest.run();
	}
}
class IsPerfectTest {
	public static void run()
	{
		for (int val = 1000; val <= 9999; ++val)
			if (NumberUtil.isPerfect(val))
				System.out.printf("%d ", val);

		System.out.println();
	}
}

class NumberUtil {
	public static boolean isPerfect(int val)
	{
		return sumFactors(val) == val;
	}

	public static long sumFactors(long val)
	{
		long result = 1;

		for (long i = 2; i * i <= val; ++i)
			if (val % i == 0)
				result += (i == val / i) ? i : (i + val / i);

		return result;
	}
}
*/