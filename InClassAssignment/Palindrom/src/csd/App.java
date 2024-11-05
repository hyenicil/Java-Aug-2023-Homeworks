/*
*
* Sınıf Çalışması: Parametresi ile aldığı bir yazının palindrom olup olmadığını test eden isPalindrome
* isimli metodu StringUtil sınıfı içerisinde yazınız test ediniz.
*
*
* Açıklamalar:
*     - Yalnızca alfabetik karakterleri tersten okunduğunda aynısı olan palindrom denir. Örneğin
*           Anastas mum satsana
*           Ey Edip Adana'da pide ye
*           Ali papila
* */

package csd;

class App {
    public static void main(String[] args) {
        PalindromUtilTest.run();
    }
}

class PalindromUtilTest {

    public static void run() {
        String str = "Anastas mum satsana";
        String str1 = "Ey Edip Adana'da pide ye";
        String str2 = "Ali papila";
        System.out.println(PalindromUtil.isPalindrom(str.toLowerCase()));
        System.out.println(PalindromUtil.isPalindrom(str1.toLowerCase()));
        System.out.println(PalindromUtil.isPalindrom(str2.toLowerCase()));
    }
}

class PalindromUtil {

    public static boolean isPalindrom(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if(!isCharacter(str, left)) {
                ++left;
                continue;
            }

            if(!isCharacter(str, right)) {
                --right;
                continue;
            }

            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            ++left;
            --right;
        }

        return true;
    }

    public static boolean isCharacter(String str, int index) {
        return Character.isLetter(str.charAt(index));
    }

}