package csd;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        AppTest.run();
    }

}

class AppTest {
    public static void run(){
        Integer [] stamps = Functions.stamp(3,1,99);
        for (int i: stamps){
            System.out.println(i);
        }

        if(
                Functions.sum(stamps) < 150 ||
                Functions.isPrime(Functions.sum(stamps)) ||
                Functions.median(stamps) < Functions.differentMaxAndMin(Functions.max(stamps), Functions.min(stamps))
        ){
            System.out.println("KAZANDIN");
        }
        else{
            System.out.println("KAYBETTIN");
        }
    }
}

class Functions {

    public static Integer randomNumber(int start, int finish) {
        Random rand = new Random();
        return rand.nextInt(finish - start) + start;
    }

    public static Integer[] stamp(int count, int start, int finish) {
        Integer [] arr = new Integer[count];
        for(int i = 0; i < count; i++)
            arr[i] = randomNumber(start, finish);
        return arr;
    }

    public static int sum(Integer[] x) {
        int sum = 0;
        for(int i : x)
            sum += i;
        return sum;
    }

    public static  Boolean checkSum(int x , int checkValue) {
        return x == checkValue;
    }

    public static Integer max(Integer[] x) {
        int max = Integer.MIN_VALUE;
        for(int i : x)
            if(max < i)
                max = i;
        return max;
    }

    public static Integer min(Integer[] x) {
        int min = Integer.MAX_VALUE;
        for(int i : x)
            if(min > i)
                min = i;
        return min;
    }

    public static int median(Integer[] x) {
        int max = max(x);
        int min= min(x);
        return sum(x) - max - min;
    }

    public static Integer differentMaxAndMin(int x, int y) {
        return x - y;
    }

    public static Boolean isPrime(int x) {
        if(x <= 1)
            return false;
        if(x%2 == 0)
            return x==2;
        if(x%3 == 0)
            return x==3;
        if(x%5 == 0)
            return x==5;
        if(x%7 == 0)
            return x==7;
        for (int i = 11; i*i<x; i+=2)
            if (x % i == 0)
                return false;
        return true;
    }
}