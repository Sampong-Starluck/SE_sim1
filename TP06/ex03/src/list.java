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
        for (int i = 0; i < 10; i++) {
            list.add(i, new list(id, condition));
        }
    }

    public void listGood() {
        for (list list2 : list) {
            if (condition == "good") {
                System.out.printf("Computer %d\t: Condition: %s\n", list2.id, list2.condition);
            }
        }
    }
    
    public void listDamage() {
        for (list list2 : list) {
            if (condition == "damage") {
                System.out.printf("Computer %d\t: Condition: %s\n", list2.id, list2.condition);
            }
        }
    }
    
}
