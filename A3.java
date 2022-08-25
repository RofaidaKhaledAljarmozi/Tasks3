import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        System.out.println("please enter an integer number:  "  );
        Scanner x=new Scanner(System.in);
        int num=x.nextInt();
        if (num%2==0)
            System.out.println("1  That number is  a positive number. ");
        else System.out.println("0 That number is  a negative number.");
    }
}
