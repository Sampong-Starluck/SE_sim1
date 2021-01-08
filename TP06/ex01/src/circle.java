package ex01.src;
import java.util.Scanner;
/**
 * circle
 */
public class circle {
    private point center, p;

    public circle(point center, point p) {
        this.center = center;
        this.p = p;
    }

    
    public double radius() {
        return center.distance(p);
    }

    public double length() {
        return 2 * Math.PI * radius();
    }

    public double area() {
        return Math.PI * (Math.pow(radius(), 2));
    }
}

class driver {
    private static Scanner sc;
    
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        point center = new point();
        point p = new point();
        circle cir = new circle(center, p);
        System.out.println("Enter the coordinate of the first point: ");
        System.out.print("x1: ");
        center.x = sc.nextInt();
        System.out.print("y1: ");
        center.y = sc.nextInt();

        System.out.println("\nEnter the coordinate of the second point: ");
        System.out.print("x2: ");
        p.x = sc.nextInt();
        System.out.print("y2: ");
        p.y = sc.nextInt();

        double radius = cir.radius();
        double length = cir.length();
        double area = cir.area();

        System.out.printf("\nThe circle have: \nRadius: %.2f\nlength: %.2f\nArea: %.2f", radius, length, area);
    }
}
