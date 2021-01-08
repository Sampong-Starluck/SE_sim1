import java.util.Scanner;

/**
 * ex01. Check the input number whether it is prime number or not
 */
public class ex01 {

    private int num;
    private String reason = "";
    
    public ex01(int n) {
        num = n;
        isPrime();
    }

    private boolean isPrime() {
        boolean prime = true;
        if (num > 2) {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                    reason += " " + i;
                }
            }
            if (prime) {
                reason = num + " is a prime numbr";
                return true;
            } else {
                reason = num + " is not prime, because it is divisible by " + reason + ".";
            }
        } else 
            reason = num + " is not a prime number, because it is smaller or equal to 2";
        return false;
    }
    public String getReason() {
        return reason;}
}

class checkNumber {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Enter the number to check whether the number is prime or not: ");
        ex01 check = new ex01(Integer.parseInt(sc.nextLine()));

        System.out.println(check.getReason());
    }
}