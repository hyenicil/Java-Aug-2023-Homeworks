import java.util.Scanner;

/*
* Parametresi ile aldığı iki yazının birincisi içerisinden ikincisindeki karakterlerin silinmiş olduğu yeni bir String
* döndüren squeeze isimli metodu StringUtil sınıfı içerisinde yazınız ve test ediniz.
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
            System.out.print("Birinci yazıyı giriniz:");
            String s1 = scanner.nextLine();
            System.out.print("Ikinci yazıyı giriniz:");
            String s2 = scanner.nextLine();

            System.out.println(StringUtil.squeeze(s1, s2));

            if ("elma".equals(s1))
                break;
        }

    }
}

class StringUtil {

    public static String squeeze (String text1, String text2) {

        String text3 = "";
        for(int i = 0 ; i < text1.length(); i++) {
            char c = text1.charAt(i);

            if (!text2.contains(c+ ""))
                text3 +=c;
        }

        return text3;
    }
}