import java.util.*;

public class product {
    String name;
    int productNumber, amount;
    double price;
    ArrayList<product> list = new ArrayList<>();

    public product() {

    }

    public product(String name, int productNumber, int amount, double price) {
        this.name = name;
        this.productNumber = productNumber;
        this.amount = amount;
        this.price = price;
    }

    public void addProduct(int index, String[] name, int[] number, double[] price, int[] amount) {
        for (int i = 0; i < index; i++) {
            list.add(i, new product(name[i], number[i], amount[i], price[i]));
        }
    }

    public void removeIndex(int index) {
        for (int i = 0; i < list.size(); i++) {
            if (i == index - 1) {
                list.remove(i);
            }
        }
    }

    public void updateProduct(int number) {
        int index = 0;
        Scanner sc = new Scanner(System.in);
        for (product product : list) {
            if (product.productNumber == number) {
                System.out.print("Enter the new product's name: ");
                String name = sc.next();
                System.out.print("Enter the new product's number: ");
                int proNumber = sc.nextInt();
                System.out.print("Enter product's new amount: ");
                int newAmount = sc.nextInt();
                System.out.print("Enter product's new price: ");
                double newPrice = sc.nextDouble();
                list.set(index, new product(name, proNumber, newAmount, newPrice));
            }else index++;
        }
    }

    public void displayList() {
        System.out.println("Number\t\tName\t\t\t\tPrice\t\tAmount in stock");
        for (product product : list) {
            System.out.printf("%d\t\t\t%s\t\t\t%.2f\t\t\t1%d\n", product.productNumber, product.name, product.price, product.amount);
        }
    }
}
