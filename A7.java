import java.util.Scanner;
public class A7 {
    public static void main(String[] args) {
        System.out.println("please enter 3 numbers:");
        Scanner x=new Scanner(System.in);
        int num1= x.nextInt();
        int num2= x.nextInt();
        int num3= x.nextInt();
        if(num1<=num2&&num2<=num3||num1>=num2&&num2>=num3)
            System.out.println("IN ORDER");
        else if(num2>num3&&num1<num3||num2<num3&&num1>num3)
            System.out.println("NOT IN ORDER");

    }}
