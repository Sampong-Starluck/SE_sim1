import java.util.*;

/**
 * ex03. display 4 digits number in reverse (i.e. 2356 -> 6532)
 */
public class ex03 {

    private int num;

    public ex03(int n) {
        num = n;
        if (countDigit()) {
            reverseNumber(n);
        } else {
            System.err.print("Invalid input, please input 4 digits number.");
        }
    }

    private void reverseNumber(int number) {
        int sum = 0, rev;
        while (number != 0) {
            rev = number % 10;
            sum = (sum * 10) + rev;
            number /= 10;
        }
        System.out.printf("After reverse: %d", sum);
    }

    boolean countDigit() {
        int count = 0;
        while (num > 0) {
            num /= 10;
            ++count;
        }
        boolean status = (count == 4) ? true : false;
        return status;
    }
}

class takenNumber {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Enter the number to see the reverse number of it: ");
        ex03 t = new ex03(Integer.parseInt(sc.nextLine()));
        t.countDigit();
    }
}