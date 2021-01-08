package ex05.src;

import java.util.*;

/**
 * ex05
 */
public class ex05 {

    private final String strings;

    public ex05(String str) {
        strings = str;
        if (isPalindrome()) {
            System.out.println(strings + " is a palindrome.");
        } else {
            System.out.println(strings + " is not a palindrome.");
        }
    }

    private boolean isPalindrome() {
        int i = 0, j = strings.length() - 1;
        while (i < j) {
            if (strings.charAt(i) != strings.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }
}

class driver5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check whether it is palindrome or not: ");
        new ex05(sc.nextLine());
    }
}