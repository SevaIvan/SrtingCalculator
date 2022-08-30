import java.util.Scanner;

public class Calculation {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        String input = console.nextLine();

        try {
            if (input.contains("+")){
                Print.print(Addition.addition(input));
            } else if (input.contains("-")) {
                Print.print(Substraction.substraction(input));
            } else if (input.contains("*")) {
                Print.print(Multiplication.multiplication(input));
            } else if (input.contains("/")) {
                Print.print(Division.division(input));
            }else Incorrect.incorrect();

        }
        catch (Exception e) {
            System.out.println("Введены данные, не соответствующие условиям./");
            throw new RuntimeException(e);
        }
    }
}
