package calculate;

import java.util.Scanner;
public class Calculator_Main {
    public static void main(String[] args) {
        char result;

        Scanner input = new Scanner(System.in);
        Calculator cal = new Calculator();

        do {
            System.out.println("Enter first number");
            int a = input.nextInt();
            System.out.println("Enter second number");
            int b = input.nextInt();
            System.out.println("Please enter one of symbol +,-,*,/ ");
            char symbol = input.next().charAt(0);

            cal.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation Please enter Y or N ");
            result = input.next().charAt(0);
        } while (result == 'y' || result == 'y');

    }
}





