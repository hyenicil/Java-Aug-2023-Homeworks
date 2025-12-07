/*
* Klavyeden bir yazı giriniz. Yazı içerisinde iç içe küme parantezleri bulunuyor olsun. En içteki küme parantezinin içerisindeki yazıyı yazdırınız.
* Örneğin:
* Yazı: Bu örnek {aslında {hiç zor}} değil
* Sonuç: hiç zor
* Yazı: Bu örnekten {daha {zor {örnekler de yapacağız} değil}} mi?
* Sonuç: örnekler de yapacağız
* Yazı: Yanlış {bir giriş için hata mesajı yazdırılacak
* Sonuç: yanlış bir giriş
* */
public class Main {
    public static void main(String[] args) {
        Test.run();
    }
}

class Test {
    public static void run() {
        ParserBracketsUtil.indexBrackets("Yanlış {bir giriş için hata mesajı yazdırılacak.");
    }
}

class ParserBracketsUtil {
    public static final String OPEN = "{";
    public static final String CLOSE = "}";

    public static void errorMessage (String text) {
        System.out.printf("%s\n",text);
    }

    public static void indexBrackets(String input) {
        int firstClosedBracket = input.indexOf(CLOSE);
        if (firstClosedBracket == -1) {
           errorMessage("Sonuç: yanlış bir giriş");
        }
        else {
            System.out.println(input.substring(input.lastIndexOf(OPEN, firstClosedBracket)+1, firstClosedBracket));
        }
    }
}