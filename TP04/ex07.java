import java.util.*;

/**
 * ex07
 */
public class ex07 {

    private int year;
    public ex07(int years) {
        year = years;
        if (lapYear()) {
            System.out.print(years + " is a lap year.");
        } else {
            System.out.print(years + " is not a lap year.");
        }
    }

    private boolean lapYear() {
        boolean status;
        if (year % 4 == 0 || year % 400 == 0) {
            status = (year % 100 != 0) ? true : false;
        } else {
            status = false;
        }
        return status;
    }
}

class checkLapYear {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Enter the year to see whether it is a lap year or not: ");
        new ex07(Integer.parseInt(sc.nextLine()));
    }
}