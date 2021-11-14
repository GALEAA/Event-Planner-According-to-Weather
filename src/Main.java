import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            int degree;

            Scanner input = new Scanner(System.in);
            System.out.print("Please enter current degree:    ");
            degree = input.nextInt();


            if (degree < 5) {
                System.out.println("Ski");
            } else if (degree > 5 && degree <= 15) {
                System.out.println("Cinema");
            } else if (degree > 15 && degree <= 25) {
                System.out.println("Picnic");
            } else if (degree > 25) {
                System.out.println("Swimming");
            }

        }}





