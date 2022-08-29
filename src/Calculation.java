import java.util.Scanner;

public class Calculation {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        String input = console.nextLine();

        try {
            switch (input) {
                case "+" -> Print.print(Addition.addition(input));
                case "-" -> Print.print(Substraction.substraction(input));
                case "*" -> Print.print(Multiplication.multiplication(input));
                case "/" -> Print.print(Division.division(input));
                default -> Incorrect.incorrect();
            }
        }
        catch (Exception e) {
            System.out.println("Введены данные, не соответствующие условиям./");
            throw new RuntimeException(e);
        }
    }
}
