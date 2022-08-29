import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Calculation {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        String input = console.nextLine();

        try {
            int a = input.indexOf("\"");
            int b = input.indexOf("\"", (a+1));
            int c = input.indexOf("\"", (b+1));
            int d = input.indexOf("\"", (c+1));
            if (input.length() > (d+1)) {
                Incorrect.incorrect();
            }
            String str1 = input.substring((a+1), b); //получаем первую часть выражения
            String action = input.substring((b+1), c).trim(); // удаляем пробелы, и выделяем математический знак действия
            String str2 = input.substring((c+1), d); // получаем вторую часть выражения
            System.out.println(str1);
            System.out.println(action);
            System.out.println(str2);
            if (str1.length() > 10 || str2.length() > 10) {
                Incorrect.incorrect();
            }

            if (action.equals("+")) {
                Print.print(Addition.addition(str1, str2));
            } else if (action.equals("-")) {
                Print.print(Subtraction.substraction(str1, str2));
            } else if (action.equals("*")) {
                Print.print(Multiplication.multiplication(str1, str2));
            } else if (action.equals("/")) {
                Print.print(Division.division(str1, str2));
            }
            else Incorrect.incorrect();

        } catch (Exception e) {
            System.out.println("Введены данные, не соответствующие условиям./");
            throw new RuntimeException(e);
        }
    }
}
