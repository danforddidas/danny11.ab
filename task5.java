public class task5 {
    public static void main(String[] args) {
        int y = 45;
        System.out.println("before the method"+y);
        studentMarks(y);

        System.out.println("after method call"+y);

    }
    public static int studentMarks(int x){
         x =20;
        System.out.println("inside the methods "+x);//out put is 20
        return x;
    }
}
