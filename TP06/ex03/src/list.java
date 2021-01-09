import java.util.ArrayList;

public class list {
    int id;
    String condition;
    ArrayList<list> list = new ArrayList<>();

    public list() {
    }

    public list(int id, String condition) {
        this.id = id;
        this.condition = condition;
    }

    public void addList(int id, String condition) {
        list.add(new list(id, condition));
    }

    public void displayList() {
        for (list list2 : list) {
            System.out.printf("Computer %d\t: Condition: %s\n", list2.id, list2.condition);
        }
    }

    public void listGood() {
        for (list list2 : list) {
            if (list2.condition.equals("good")) {
                System.out.printf("Computer %d\t: Condition: %s\n", list2.id, list2.condition);
            }
        }
    }
    
    public void listDamage() {
        for (list list2 : list) {
            if (list2.condition.equals("damage")) {
                System.out.printf("Computer %d\t: Condition: %s\n", list2.id, list2.condition);
            }
        }
    }

    public void markGood(int id) {
        int index = 0;
        for (list list2 : list) {
            if (list2.id == id) {
                list.set(index, new list(id, "good"));
            } else {
                index++;
            }
        }
    }
    
    public void markDamage(int id) {
        int index = 0;
        for (list list2 : list) {
            if (list2.id == id) {
                list.set(index, new list(id, "damage"));
            } else {
                index++;
            }
        }
    }
}
