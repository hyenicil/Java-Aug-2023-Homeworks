import java.util.Random;

/**
 * Çağrıldığında ekrana 01.01.1900 ve 31.12.2100 tarihleri arasında rasgele bir tarihi yazan printRandomDate
 * isimli metodu yazınız. Metodun ekrana yazdırdığı tarih geçerli bir tarih olmalıdır. Rasgele tarihin Şubat ayına
 * denk gelmesi durumunda, seçilen yılın artık yıl olup olmamasına göre, Şubat ayı 29 çekebilecektir. Tarih ekrana
 * aşağıdaki formatta yazdırılacaktır:
 *
 *  11th Jul 1983
 */
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Test.run();
    }
}

class Test {

    public static void run  () {
        for (int i =0 ; i<100; i++)
            DateUtil.printRandomDate(1900,2100);
    }
}

class DateUtil {
    private static String[] mounths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public static void printRandomDate(int minYear, int maxYear) {
        int year = getRandomValue(minYear, maxYear);
        String month = mounths[getRandomValue(0, mounths.length)];
        int dayValue  = getRandomValue(1, dayOfCount(month, year) + 1);
        String day;

        if(dayValue == 11)
            day = dayValue+"th";
        else if(dayValue == 12)
            day = dayValue+"th";
        else if(dayValue == 13)
            day = dayValue+"th";
        else if(dayValue%10== 1)
            day = dayValue+"st";
        else if(dayValue%10== 2)
            day = dayValue+"nd";
        else if(dayValue%10== 3)
            day = dayValue+"rd";
        else {
            day = dayValue+"th";
        }
        System.out.println(day + " " + month + " " + year);
    }

    private static int dayOfCount(String mounths, int year) {
        return switch (mounths) {
            case "Jan", "Mar", "May", "Jul", "Sep", "Nov" -> 31;
            case "Feb"-> isLeapYear(year) ? 29 : 28;
            default -> 30;
        };
    }

    private static boolean isLeapYear(int year) {
        return year % 4 ==0 && year % 100 != 0 || (year % 400 == 0);
    }

    private static int getRandomValue(int min, int max) {
        return new Random().nextInt(min, max);
    }
}