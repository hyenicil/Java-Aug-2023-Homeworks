package csd;

public class App {

    public static void main(String[] args)
    {
        ToDrawTest.run();
    }
}


class ToDrawTest {

    public static void printToLine()
    {
        System.out.print("|");
    }

    public static void printToStar()
    {
        System.out.print("*");
    }

    public static void printToEmpty(int val)
    {
        if(val!=0)
            for(int i = 0; i < val; i++)
                System.out.print(" ");
    }

    public static void run()
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);

	/*
	 *
	 |*   |
	 | *  |
	 |  * |
	 |   *|
	 |  * |

	 * */

        while(true) {

            System.out.print("Bir Sayı Giriniz: ");
            int x = sc.nextInt();
            System.out.println();
            System.out.print("Bir Sayı Giriniz: ");
            int y = sc.nextInt();

            ToDraw.toDrawShapeV2(x, y);

        }
    }
}
/*
   |*    |
   | *   |
   |  *  |
   |   * |
   |    *|
   |   * |
   |  *  |
   | *   |
   |*    |
   | *   |
   |  *  |
   |   * |
   |    *|
   |   * |
   |  *  |
   | *   |
   |*    |
                  i

   |*   |  0 1 3  0     HEİGHT 5
   | *  |  1 1 2  1     WİDTH  4
   |  * |  2 1 1  2
   |   *|  3 1 0  3
   |  * |  2 1 1  4
   | *  |  1 1 2  5
   |*   |  0 1 3  6
 *
*
*
*/






class ToDraw {


    public static void toDrawShapeV2(int height, int width)
    {
        for(int i = 0,empty1=0, empty2=width-1; i < height;)
        {
            while(empty1<width)
            {
                doOption(empty1++,empty2--);

                i++;
            }
            empty1-=2; empty2+=2;
            while(empty2<width){

                doOption(empty1--,empty2++);
                i++;
            }
            empty1+=2;empty2-=2;

        }
    }

    public static void toDrawShape(int height, int width)
    {
        if(width<height) {

            for(int i = 0,k = 0; i < height; i++ ) {
                if((width-k-1)<=0) {
                    int b =0;
                    while(b < width) {
                        doOption(k,width);
                        k--;b++;i++;
                    }
                    k=1;
                }
                else
                    doOption(k,width);
                k++;

            }
        }
    }

    public static void doOption(int k, int w)
    {
        ToDrawTest.printToLine();
        ToDrawTest.printToEmpty(k);
        ToDrawTest.printToStar();
        ToDrawTest.printToEmpty(w);
        ToDrawTest.printToLine();
        System.out.println();
    }

    public static void doOptionV2(int k, int w)
    {
        ToDrawTest.printToLine();
        ToDrawTest.printToEmpty(k);
        ToDrawTest.printToStar();
        ToDrawTest.printToEmpty(w);
        ToDrawTest.printToLine();
        System.out.println();
    }
    public static void doOption1(int k, int w)
    {
        System.out.println(k+ ","+w);

    }

}

class NumberUtil {

}


/*
 *
 *
	public static void toDrawShapeV2(int height, int width)
	{
		for(int i = 0,empty1=0, empty2=width-1; i < height;)
		{
			while(empty1<width)
			{
				doOption(empty1++,empty2--);

				i++;
			}
			empty1-=2; empty2+=2;
			while(empty2<width){

				doOption(empty1--,empty2++);
				i++;
			}
			empty1+=2;empty2-=2;

		}
	}*/
