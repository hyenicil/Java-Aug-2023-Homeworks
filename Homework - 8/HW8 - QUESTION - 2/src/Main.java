import java.util.Scanner;

/*
*  2. Klavyeden girilen bir yazıyı ilk karakteri 1.satıra, ilk 2 karakteri 2.satıra, ilk 3 karakteri 3. satıra... olacak şekilde ekrana yazdıran
*  programı yazınız.
*  Programın örnek çalışması:
*  Bir yazı giriniz: java
*  j
*  ja
*  jav
*  java
* */
public class Main {
    public static void main(String[] args) {
        Test.run();
    }
}

class Test {
    public static void run() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Lütfen Text giriniz & Çıkmak için exit(-1):");
            String str = scan.next();
            if (str.equals("-1")) {
                break;
            }
            StringUtil.parser(str);
        }
    }
}

class StringUtil {

    public static void parser(String str) {
        for (int i = str.length(); i >= 0 ; i--) {
            System.out.println(str.substring(0,str.length()-i));
        }
    }
}