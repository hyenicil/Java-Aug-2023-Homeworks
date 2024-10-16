/*
 *
 *. x ve y pozitif tamsayılar olmak üzere eğer x sayısının kendisi hariç bölenleri toplamı y sayısına ve aynı
 * zamanda y sayısının kendisi hariç bölenleri toplamı x sayısına eşit ise bu sayılar arkadaştır denir. Örneğin 220
 * ve 284 sayıları arkadaş sayılardır. Parametresi ile aldığı iki tamsayının arkadaş olup olmadıklarını test eden
 * areFriends metodunu yazınız. Metodunuzu dört basamaklı bir arkadaş sayı çifti bulan bir kodla test
 * edebilirsiniz.
 *
 * */

package csd;

class App {

    public static void main(String[] args) {
        NumberUtilTest.run();
    }
}

class NumberUtilTest {
    public static void run() {
        areFriendDigitThree();
        System.out.println("==========");
        areFriendDigitFour();
    }

    public static void areFriendDigitThree() {
        for(int i = 100; i< 1000; i++)
            for ( int k = i + 1; k < 1000;k++ ){
                if(NumberUtil.areFriends(i,k)){
                    System.out.printf("%d, %d\n", i, k);
                }
            }
    }

    public static void areFriendDigitFour() {
        for(int i = 1000; i< 10000; i++)
            for ( int k = i + 1; k < 10000;k++ ){
                if(NumberUtil.areFriends(i,k)){
                    System.out.printf("%d, %d\n", i, k);
                }
            }
    }

}

class NumberUtil {


    public static boolean areFriends(int x, int y) {
        return x == sumFactors(y) && y == sumFactors(x);
    }
     public static int sumFactors(int val) {
        int result = 1;
        for (int i = 2; i * i <= val; ++i)
            if(val%i==0)
                result += (i == val/i) ? i : (i + val / i);

        return result;
     }


}