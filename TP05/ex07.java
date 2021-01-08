import java.util.*;

/**
 * ex07
 */
public class ex07 {

    private String string;

    public ex07(String str) {
        string = str;
        System.out.print(replace());
    }

    private String replace() {
        String[] tokens = string.split("\\s+");
        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = tokens[i].replace("\\n", "(new_line)");
            tokens[i] = tokens[i].replace("\\t", "(tab)");
            tokens[i] = tokens[i].replace("\\\\", "(slash)");
            tokens[i] = tokens[i].replace("//", "(comment_line)");
            tokens[i] = tokens[i].replace(":)", "(smile)");
        }
        String strings = String.join(" ", tokens);
        return strings;
    }
}

class driver {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        new ex07(sc.nextLine());
        
    }
}