package ex01.src;

import java.util.*;

/**
 * ex01
 */
public class ex01 {

    private int num;

    public ex01(int n) {
        num = n;
        if (checkprime()) {
            System.out.printf("%d is a prime number.",num);
        } else {
            System.out.printf("%d is not a prime number.", num);
        }
    }

    private boolean checkprime() {
        int number = num;
        boolean status = true;
        if (number <= 2) {
            status = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    status = false;
                    break;
                }
            }
        }
        return status;
    }
}

class driver1 {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Enter the number to check whether the number is prime or not: ");
        new ex01(Integer.parseInt(sc.nextLine()));
    }
}