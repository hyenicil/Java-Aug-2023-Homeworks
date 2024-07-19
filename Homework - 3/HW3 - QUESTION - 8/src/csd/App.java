package csd;

class App {
    public static void main(String[] args) {
        AppTest.run();
    }
}

class AppTest{

    public static void run()
    {
        Functions.controlFunciton(145086);
    }
}
class Functions{
    public static void printFunction(int val)
    {
        System.out.printf("%d \n", val);
    }
    public static void controlFunciton(int val)
    {
        while ((val = isCollatzNumber(val)) != 1) {
            printFunction(val);
        }
        printFunction(1);
    }

    public static int isCollatzNumber(int val)
    {
        if(isEven(val))
            return val/2;
        return val*3 + 1;
    }

    public static boolean isEven(int val)
    {
        return val%2==0;
    }

}
