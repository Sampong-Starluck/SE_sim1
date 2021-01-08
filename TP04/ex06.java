import java.util.*;

/**
 * ex06
 */
public class ex06 {

    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int weight, litre, distant;
        System.out.print("Input the weight in kilogram: ");
        weight = sc.nextInt();
        System.out.print("Enter the distant in kilometer: ");
        distant = sc.nextInt();
        if (weight <= 5000) { // 5000 kg = 10L/km that's mean 1 km need 10 liter of fuel
            litre = distant * 10;
            System.out.print("The needed fuel is " + litre);
        } else if (weight <= 10000) { // 10000 kg = 20L/km
            litre = distant * 20;
            System.out.print("The needed fuel is " + litre);
        } else if (weight <= 20000) { // 20000 kg = 25L/km
            litre = distant * 25;
            System.out.print("The needed fuel is " + litre);
        }else if (weight <= 20000) { // 30000 kg = 35L/km
            litre = distant * 35;
            System.out.print("The needed fuel is " + litre);
        } else {
            System.out.print("Too much weight, can't be loaded.");
        }
    }
}