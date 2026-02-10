import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System .in );
        int number = input.nextInt();
        int x = factorial(number);
        input.nextLine();
        System.out.println(x);

    }
    public static int factorial(int n){
        if (n==0){
            return 1;// base case :factorial of 0 is 1
        } else {
            return  n*factorial(n-1);//recursive case:n*factorial of (n-1)
        }



    }
}
