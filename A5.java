import java.util.Scanner;
public class A5 {
    public static void main(String[] args) {
        System.out.println("please enter 3 numbers:");
        Scanner x=new Scanner(System.in);
        int num1= x.nextInt();
        int num2= x.nextInt();
        int num3= x.nextInt();
        if (num1==num2&num2==num3)
        System.out.println("All the same");
        else if (num1==num2||num1==num3||num2==num3)
        System.out.println("neither");
        else System.out.println("All different");

    }
}
