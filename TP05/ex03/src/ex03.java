package ex03.src;

import java.util.*;

/**
 * ex03
 */
public class ex03 {

    private int num;

    public ex03(int n) {
        num = n;
        onlyEven();
    }

    private void onlyEven() {
        int start = num, count = 0;
        for (int i = start; i <= 500; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                count ++;
                if (count == 11){
                    System.out.println();
                    count = 0;
                }
            }
        }
    }
}

class driver3 {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Enter the starting point: ");
        new ex03(Integer.parseInt(sc.nextLine()));
    }
}