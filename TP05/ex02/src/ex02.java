package ex02.src;

public class ex02 {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 500; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d ", i);
                count++;
                if (count == 10){
                    System.out.println();
                    count = 0;
                }
            }
        }
    }
}