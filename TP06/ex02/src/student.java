package src;

import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
public  class student {
    String name;
    int id;
    public student() {
    }
    ArrayList<student> list = new ArrayList<>();
    public student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void addStudent(String[] name, int[] id, int index){

        for (int i = 0; i < index; i++) {
            list.add(i, new student(name[i], id[i]));
        }
    }
    public void removeStudent(String name){
        list.removeIf(student -> student.name.equals(name));
    }
    public void updateInfo(int id){
        Scanner sc = new Scanner(System.in);
        int index = 0;
        for (student student:list) {

            if (student.id == id){
                System.out.println("Enter a updated info: ");
                System.out.print("Enter a new ID: ");
                int newId = sc.nextInt();
                System.out.print("Enter a new name: ");
                String newName = sc.next();

                list.set(index,new student(newName, newId));
            } else index++;
        }
    }
    public void printList(){
        for (student student: list) {
            System.out.printf("%d \t %s \n", student.id, student.name);
        }
    }
}
