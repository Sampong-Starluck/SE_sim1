import java.util.*;

/**
 * ex05.Find the maximum number in 8 input
 */
public class ex05 {

    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        findNum fn = new findNum();
        int[] num = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.printf("Enter the number in index %d: ", i);
            num[i] = sc.nextInt();
        }
        System.out.printf("The maximum number is: %d", fn.findMax(num));
    }
}

class findNum {
    int findMax(int[] num) {
        int max = num[0];
        for (int i : num) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}