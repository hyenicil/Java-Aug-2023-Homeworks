package csd;

class App {
    public static void main(String[] args)
    {
        AppTest.run();
    }
}

class AppTest {
    public static void run()
    {
        for(int i=-100;i<100; i++)
            Functions.printFunction(i);
    }
}

class Functions {

    public static void printFunction(int val)
    {
        System.out.printf("%d = %b\n",val,isZeroOrValue(val));
    }
    public static boolean isZeroOrValue(int val){
        return val > 0 && isDecimalHarshad(val);
    }

    public static boolean isDecimalHarshad(int val)
    {
        return val % digitSum(val) == 0;
    }
    public static int digitSum(int val)
    {
        int sum = 0;
        while(val!=0) {
            sum+=val%10;
            val/=10;
        }
        return sum;
    }
}

