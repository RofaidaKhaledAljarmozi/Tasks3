import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String color = "";

        while (true) {

            // Inputs chess square letter and number:
            System.out.println("Input square letter");
            String letter = keyboard.next();

            System.out.println("Input square number");
            int number = keyboard.nextInt();

            // Based on letter and number, find color:
            // If the letter is an a, c, e, or g
            if (letter.equals("a") || letter.equals("c") || letter.equals("e") || letter.equals("g")) {
                if (number % 2 != 0) // odd number
                    color = "dark";
                else
                    color = "light";
            } else // if ( letter.equals("b") || letter.equals("d") || letter.equals("f") || letter.equals("h") )
            {
                if (number % 2 == 0) // even number
                    color = "dark";
                else
                    color = "light";
            }

            System.out.println("The color of the square is " + color);

        }
    }
}
