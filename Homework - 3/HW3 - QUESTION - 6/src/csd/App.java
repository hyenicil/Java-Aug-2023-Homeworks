/*
 *
 * n pozitif bir tamsayı üzere ve a, b, c, d birbirinden farklı pozitif tamsayılar olmak üzere eğer
 *               n = a3 + b3 = c3 + d3
 * eşitliğini sağlayacak şekilde a, b, c ve d tamsayıları var ise n bir Hardy-Ramanujan sayısıdır:
 *               1729 = 9 3 + 103 = 13 + 123
 * Buna göre 100000'den küçük olan tüm Hardy-Ramanujan sayılarını ekrana bastıran programı yazınız.
 *
 * */

package csd;

class App {
    public static void main(String[] args) {
        AppTest.run();
    }
}

class AppTest {
    public static void run()
    {
        for(int i = 1; i<=100000; i++)
            Functions.twoCubeOperations(i);
        //Functions.oneCubeOperations(i);
    }
}
class Functions {

    public static void printFunctions(int val, int val1, int val2, int val3, int val4) {

        System.out.printf(" %d = %d + %d = %d + %d\n",val,val1,val2, val3,val4);

    }

    public static void printFunctions(int val, int val1, int val2) {

        System.out.printf(" %d = %d + %d\n",val,val1,val2);

    }

    //TODO: İki methodu birleştirebilirdim ancak ihtiyaç duymadım.
    public static void oneCubeOperations(int val) {

        int firstVal;
        int secondVal;

        for(int i = 1;(firstVal = cubeValue(i)) < val;i++) {
            secondVal = controlCube(val-firstVal);
            if(secondVal > i && val == (cubeValue(secondVal) + firstVal)){
                printFunctions(val, i, secondVal);
            }
        }
    }

    public static void twoCubeOperations(int val) {

        int firstVal;
        int secondVal ;
        int thirdVal = 0;
        int forthVal = 0;
        int count = 0;

        for(int i = 1;(firstVal = cubeValue(i)) < val;i++) {
            secondVal = controlCube(val-firstVal);
            if(secondVal > i && val == (cubeValue(secondVal) + firstVal)){
                count++;
                if (count==2)
                    printFunctions(val, i, secondVal, thirdVal,forthVal);
                thirdVal=i;
                forthVal=secondVal;
            }
        }
    }
    public static int controlCube(int a) {

        int i = 1;
        if (a == 1)
            return 1;
        while (cubeValue(i++) < a);
        return i-1;
    }
    public static int cubeValue(int a)
    {
        if(a > 0)
            return a*a*a;
        return 0;
    }



}
