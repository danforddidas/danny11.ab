import java.util.Scanner;

public class TASK3 {
    public static void main(String [] args){

        System.out.println("1.check balance\n 2.deposity\n 3.with draw\n");
        System.out.print("enter you number ");
        Scanner x =new Scanner(System.in);
        int num = x.nextInt();
        int num2;
        num2 =x.nextInt();
        System.out.println("current amount in account is");
        int www =depositMoney(num2,num);
        System.out.println(www);


        
    }
    private static int depositMoney(int num2,int num  ){
        Scanner input = new Scanner(System.in);
        int result =0;
        switch (num){
            case 1:
                return 10000;
            case 2:
                return 10000+num2;
            case 3:
                return 10000-num2;
            case 4:
                return 0;

        }

        return result;

    }
}
