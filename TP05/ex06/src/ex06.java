package ex06.src;

import  java.util.*;

public class ex06 {
    private final String string;
    public ex06(String str){
        string = str;
        mirror();
    }
    private  void  mirror(){
        byte[] strAsArray = string.getBytes();
        byte[] result = new byte[strAsArray.length];
        for (int i = 0; i < strAsArray.length; i++) {
            result[i] = strAsArray[strAsArray.length - i - 1];
        }
        System.out.print(string + new String(result));
    }
}
class driver6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        new ex06(sc.nextLine());
    }
}
