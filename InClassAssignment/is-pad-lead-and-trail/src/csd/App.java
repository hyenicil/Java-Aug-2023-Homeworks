/*
*
* Sınıf Çalışması: Aşağıda prototipleri verilen metotları StringUtil sınıfı içerisinde yazınız ve test ediniz
*		public static String padLeading(String s, int newLen, char ch);
*		public static String padLeading(String s, int newLen);
*		public static String padTrailing(String s, int newLen, char ch);
*		public static String padTrailing(String s, int newLen);
*	Açıklamalar:
*		- padLeading metodunun 3 parametreli overload'u aldığı yazının uzunluğu newLen ile aldığı değerden küçükse
*		yazıyı baştan, üçüncü parametresi ile aldığı karakter ile besleyecektir. Örneğin:
*		 	padLeading("ankara", 11, 'x');
*		çağrısı için
*		 	xxxxxankara
*		yazısına dönecektir.
*		newLen değeri yazının uzunluğundan büyük değilse aynı yazıya geri dönecektir
*
*		- padLeading metodunun 2 parametreli overload'u yazıyı space ile besleyecektir
*
*		- padTrailing metotları, padLeading metotlarının sondan besleyen versiyonları olarak yazılacaktır
*
*		Metotlar Java 11 öncesinde yazıldığı için aşağıdaki metot da StringUtil sınıfında bulunması iyi bir yaklaşımdır:
*		public static String repeat(char ch, int count)
*		{
*			StringBuilder sb = new StringBuilder(count);
*
*			while (count-- > 0)
*				sb.append(ch);
*
*			return sb.toString();
*		}
*
*		Java 11 ile birlikte repeat metodu eklendiğinden StringUtil sınıfına ayrıca bir repeat metodunu eklemeye
*		gerek yoktur
*
* */


package csd;

class App {

    public static void main(String[] args) {
        padUtilTest.run();
    }

}

class padUtilTest {

    public static void run() {
        System.out.println(padUtil.padLeading("ankara", 11,'d'));
        System.out.println(padUtil.padTrailing("ankara", 11,'d'));
        System.out.println(padUtil.padLeading("ankara", 11));
        System.out.println(padUtil.padTrailing("ankara", 11));
    }
}

class padUtil {

    public static String padLeading(String str, int newLen, char ch) {
    /*xxxxAnkara*/

        int index = str.length();
        StringBuilder builder = new StringBuilder(ch);
        for(int i = 0; i < newLen-index;i++) {
            builder.append(ch);
        }
        return builder.append(str).toString();
    }

    public static String padLeading(String str, int newLen) {

        return padLeading(str, newLen, 'x');
    }


    public static String padTrailing(String str, int newLen, char ch) {

        int index = str.length();

        StringBuilder builder = new StringBuilder(ch);
        builder.append(str);

        for(int i = newLen-index; i > 0; i--) {
            builder.append(ch);
        }

        return builder.toString();
    }


    public static String padTrailing(String str, int newLen) {

        return padTrailing(str, newLen, 'x');
    }

}