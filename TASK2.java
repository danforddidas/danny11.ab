import java.util.Scanner;

public class TASK2 {
    public static void main(String[] args) {
        TASK2 name = new TASK2();
        Scanner input = new Scanner(System.in );
        System.out.println("Enter your number");
        double marks =input.nextDouble();
        String z =name.student(marks);
        input.nextLine();
        System.out.println(z);


    }
    public String student(double marks){
        if (marks>=70 && marks <=100){
            return "Grade A";
        } else if (marks >=60 && marks <=70) {
            return "Grade B";


        } else if (marks>=50 && marks<=59) {
            return "Grade C";


        } else if (marks >=40 && marks <=49) {
            return "Grade D";

        } else if (marks >=0) {
            return "grade F";

        }
        else
            return "invalid marks";
    }
}
