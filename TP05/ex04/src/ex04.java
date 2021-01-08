package ex04.src;

import java.util.*;

/**
 * ex04
 */
public class ex04 {

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        double profit, total = 0;
        for (int i = 1; i <= 12; i++) {
            System.out.printf("Profit for month %d: ", i);
            profit = sc.nextDouble();
            total += profit;
        }
        System.out.printf("\n\nTotal profits for 12 month: %.2f", total);
    }
}