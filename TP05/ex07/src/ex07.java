package ex07.src;

import  java.util.*;

public class ex07 {
    private String strings;
    public ex07(String str){
        strings = str;
        System.out.print(replacement());
    }
    private String replacement(){
        String[] token = strings.split("\\s+");
        for (int i = 0; i < token.length; i++) {
            token[i] = token[i].replace("\\n","(new_line)");
            token[i] = token[i].replace("\\t","(tab)");
            token[i] = token[i].replace("\\\\","(slash)");
            token[i] = token[i].replace("//","(comment_line)");
            token[i] = token[i].replace(":)","(smile)");
        }
        String string = String.join(" ",token);
        return string;
    }
}

class driver7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        new ex07(sc.nextLine());

    }
}
