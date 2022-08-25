import javafx.scene.transform.Scale;

import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {
        System.out.println("This program for helping you to calculate your weekly pay.");
        System.out.println("please register your name :");
        Scanner x=new Scanner(System.in);
        String name= x.next();
        System.out.println("please enter your salary:");
        double salary=x.nextDouble();
        System.out.println("please register how much of hours you have worked: ");
        int hour=x.nextInt();
        if (hour<=40)
            System.out.println("paycheck will be:    "+(salary*hour));
        else if (hour>40)
        {
            System.out.print( "paycheck ="+((salary*40)+((hour-40)*(salary*(150.0/100.0)))) );

    }


}}
