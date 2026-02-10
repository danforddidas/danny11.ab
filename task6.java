import java.util.Scanner;

public class task6 {
    public static void main (String[] args){

        task6 task = new task6("anna",56);
        receivesAbox(task);
        System.out.println("After the update   "+task.name+task.age);
    }
    String name;
    int age;
    task6(String name,int age){
        this.name =name;
        this.age = age;
    }
    public  static void receivesAbox(task6 x){
        x.name ="  modifies it is value  ";
        x.age = 30;
    }
}
