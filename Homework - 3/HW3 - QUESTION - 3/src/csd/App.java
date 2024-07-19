package csd;

class App {
    public static void main(String[] args)
    {
        AppTest.run();
    }
}

class AppTest {
    public static void controller(int val){

        for(;Functions.count(val) > 1; val = Functions.sum(val));
        System.out.println(val);
    }
    public static void run() {
        int val = 36987;
        controller(val);
    }
}
class Functions {
    public static int sum(int val)
    {
        int sum = 0;
        while(val!=0)
        {
            sum += val%10;
            val /= 10;
        }
        return sum;
    }
    public static int count(int val)
    {
        int count = 0;
        while (val!=0)
        {
            val /=10;
            count++;
        }
        return count;
    }
}