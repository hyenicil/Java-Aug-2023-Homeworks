package csd;
/*
 * 3. Parametresi ile aldığı int türden bir sayının negatif mi, 0(sıfır) mı, pozitif mi olduğunu test eden signum isimli
metodu yazınız ve test ediniz. Metot pozitif için 1(bir), negatif için -1(eksi bir) ve sıfır için 0(sıfır) döndürecektir.
Açıklama: Math sınıfının signum metodu kullanılmayacaktır.
 * */
class App {

    public static void main(String[] args)
    {
        NumberUtilTest.run();
    }
}

class NumberUtilTest {

    public static void printNumberUtil(int a)
    {
        System.out.printf("%d",a);
    }
    public static void run()
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a = sc.nextInt();

        printNumberUtil(NumberUtil.signum(a));
    }
}

class NumberUtil {

    public static int signum(int a)
    {
        if(a > 0)
            return 1;
        else if (a == 0)
            return 0;
        return -1;

    }

}


