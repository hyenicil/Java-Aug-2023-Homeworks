/*
 *
 ***
 *****
 *******
 *********
 ***********
 *********
 *******
 *****
 ***
 *
 */
package csd;

class App {

    public static void main(String[] args)
    {
        QuadrilateralTest.run();

    }
}

class QuadrilateralTest
{


    public static void toDrawEmpty(int x ) {
        for(int i = 0; i<x;i++) {
            System.out.print(" ");
        }
    }
    public static void toDrawStar(int x) {
        for(int i = 0; i<x;i++) {
            System.out.print("*");
        }
    }
    public static void run() {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int x = sc.nextInt();
        System.out.println();
        Quadrilateral.toDrawQuadrilateral(x);
    }

}


class Quadrilateral {


    public static void toDrawQuadrilateral(int x) {

        int a=0;
        for(int i = x-1,k = 1 ; i>=0;i--, k+=2) {
            QuadrilateralTest.toDrawEmpty(i);
            QuadrilateralTest.toDrawStar(k);
            System.out.println();
            a=k;
        }

        for(int i = 1,k = a-2; i <= x-1; i++, k-=2) {
            QuadrilateralTest.toDrawEmpty(i);
            QuadrilateralTest.toDrawStar(k);
            System.out.println();
        }
    }
}