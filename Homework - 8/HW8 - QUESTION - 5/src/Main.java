import java.util.Scanner;

/*
* Parametresi ile aldığı yazının içerisindeki küçük harfleri büyük harfe, büyük harfleri ise küçük harfe çevirip yeni
* bir String ile geri dönen changeCase isimli metodu StringUtil sınıfı içerisinde yazınız ve test ediniz.
* */
public class Main {
    public static void main(String[] args) {
        Test.run();
    }
}

class Test {
    public static void run () {
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.print("Yazıyı giriniz:");
            String s1 = scanner.nextLine();
            System.out.println(StringUtil.changeCase(s1));
            System.out.println(StringUtil.changeCase2(s1));

            if ("elma".equals(s1))
                break;
        }
    }
}

class StringUtil {

    private final static int UPPER_START_NUMBER = 65;
    private final static int LOW_START_NUMBER   = 97;
    private final static int UPPER_FINAL_NUMBER = 90;
    private final static int LOW_FINAL_NUMBER   = 122;

    public static String changeCase(String s1) {
        String str = "";
        int len = s1.length();
        for(int i = 0; i < len; i++) {
            char c = s1.charAt(i);
            int num = c;

            if( UPPER_START_NUMBER <=num && UPPER_FINAL_NUMBER >=num)
                str+= (c+"").toLowerCase();
            else if( LOW_START_NUMBER <=num && LOW_FINAL_NUMBER >=num)
                str+= (c+"").toUpperCase();
        }
        return str;
    }

    /*Derste islenen ben islenmedigini dusunerek yukaridakini yazdim.*/
    public static String changeCase2(String s)
    {
        String str = "";

        int len = s.length();

        for (int i = 0; i < len; ++i) {
            char c = s.charAt(i);

            str += Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
        }

        return str;
    }
}