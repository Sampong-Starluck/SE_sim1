import java.util.*;

public class computer {
    private static Scanner sc;

    public static void main(String[] args) {
        list list = new list();
        int damage = 0;// Let's assume that we have 10 computers
        for (int i = 0; i < 10; i++) {
            list.addList(i, "good");
            damage++;
            if (damage == 3) {
                list.addList(i, "damage");
                damage = 0;
            }
        }
    }
}
