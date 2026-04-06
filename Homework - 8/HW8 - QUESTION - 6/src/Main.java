import java.util.Scanner;
import java.util.concurrent.RecursiveTask;

/*
* Parametresiyle aldığı değişken isminin Java’da geçerli bir değişken ismi olup olmadığını test eden isIdentifier isimli
* metodu StringUtil sınıfı içerisinde yazınız ve test ediniz.
* Açıklamalar:
* Anahtar sözcük kontrolü yapılmayacaktır.
* Java’da bir karakterin değişken ismi içerisinde kullanılıp kullanılamayacağını test eden standart metotlar vardır.
* Bu metotlar kullanılmayacaktır.
* */
public class Main {
    public static void main(String[] args) {
        Test.run();
    }
}

class Test {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.print("Parametre ismini giriniz:");
            String s1 = scanner.nextLine();

            System.out.println(StringUtil.isIdentifier(s1));
            System.out.println(StringUtil.isIdentifier2(s1));

            if ("elma".equals(s1))
                break;
        }
    }
}

class StringUtil {

    public static Boolean isIdentifier(String s1) {
        if(s1.isBlank() || s1.equals("_"))
            return false;
        char c = s1.charAt(0);
        System.out.println(c);
        if(!Character.isLetter(c) && c != '_' && c != '$')
            return false;

         for(int i = 1 ; i < s1.length(); i++ ) {
             c = s1.charAt(i);
             if(!Character.isLetter(c) && c != '_' && c != '$')
                 return false;
         }
         return true;
    }



    public static boolean isIdentifier2 (String s)
    {
        if (s.isBlank() || s.equals("_"))
            return false;

        char ch = s.charAt(0);
        System.out.println(ch);

        if (!Character.isLetter(ch) && ch != '_' && ch != '$')
            return false;

        int len = s.length();

        for (int i = 1; i < len; ++i) {
            ch = s.charAt(i);

            if (!Character.isLetter(ch) && !Character.isDigit(ch) && ch != '_' && ch != '$')
                return false;
        }

        return true;
    }
}