import java.time.LocalDate;
import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        zd1();
        zd2();
        zd3();
    }

    public static void zd1() {
        int year = 2000;
        leapYear(year);


    }

    public static void leapYear(int year) {

        if (year % 4 == 0 && year%100!=0) {
            System.out.println(year + " год — високосный год ");

        } else if (year % 400 == 0) {
            System.out.println(year + " год — високосный год ");
        } else {
            System.out.println(year + " год — невисокосный год ");
        }

    }

    public static void zd2() {
        int type = 1;
        int year = 1223;
        String dataPhone = version(year);
        System.out.println("Установите " + version(year) + " версию приложения для " + typeOC(type) + " по ссылке");

    }

    public static String typeOC(int type) {

        if (type == 0) {
            return "iOS";

        } else {
            return "Android";
        }

    }

    public static String version(int ver) {

        if (ver == LocalDate.now().getYear()) {
            return "обычную";

        } else {
            return "облегченную";
        }

    }

    public static void zd3() {
        int deliveryDistance = 335;
        System.out.println("Потребуется дней: " + days(deliveryDistance));
    }

    public static String days(int km) {
        if (km < 20) {
            return "1 ";
        }
        if (km >= 20 && km < 60) {
            return "2 ";
        }
        if (km >= 60 && km < 100) {
            return "3 ";
        } else {
            return "доставки нет";
        }
    }

}