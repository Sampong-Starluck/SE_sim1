import java.util.Scanner;

public class rectangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height, width;
        System.out.print("Enter the height of rectangle: ");
        height = sc.nextInt();
        System.out.print("Enter the width of rectangle: ");
        width = sc.nextInt();
        rectangle rec = new rectangle(width, height);

        System.out.println("\nParameter: " + rec.calculatePerimeter());
        System.out.println("Surface: " + rec.calculateSurface());
    }
}
