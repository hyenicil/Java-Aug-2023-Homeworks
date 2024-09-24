package csd;

import java.util.Scanner;

class App {

    public static void main(String[] args) {
        NumberUtilTest.run();
    }
}

class NumberUtilTest {

    public static int numberOfControl() {

            System.out.print("Bir tamsayı giriniz: ");
            int a = getNumberFromUser();
            if(0 <= a &&  a <= 100)
                return a;
            else {
                System.out.println("Geçersiz değer  girdiniz!...");
                System.out.print("Yeni bir değer giriniz:");
                return getNumberFromUser();
            }
        }


    public static int getNumberFromUser() {
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }


    public static void printResult(int count, int max, int min, int average) {
        System.out.printf("Toplam %d değer girildi.\n", count);
        System.out.printf("Max = %d\n", max);
        System.out.printf("Min = %d\n", min);
        System.out.printf("Ortalama = %d\n", average);
    }


    public static boolean startMessage() {
        String message = "Yeni bir değer girmek istiyor musunuz? [Evet için 1(bir) Hayır için 0(sıfır) değerlerinden birini giriniz] ";
        System.out.print(message);
         return 1==getNumberFromUser();
    }

    public static void run() {

        int count = 0, total = 0, max = 0, min = 0, average = 0, number;

        if(startMessage()){
            while((number = numberOfControl()) > 0 ) {
                count++;
                total = NumberUtil.sum(number, total);
                max = NumberUtil.max(number, max);
                min = NumberUtil.min(number, min);
                average = NumberUtil.average(total,count);

            }
            printResult(count, max, min, average);
        }


    }
}

class NumberUtil {

    public static Integer sum (int number, int total) {
        return number + total;
    }

    public static Integer max(int number, int max) {
        return Math.max(number, max);
    }

    public static Integer min(int number, int min) {
        return  min > 0 ? Math.min(number, min) : number ;
    }

    public static Integer average(int number, int count) {
        return number / count;
    }
}

