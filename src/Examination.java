import static java.lang.Integer.parseInt;

public class Examination {
    public static int examination(String string){
        int number;
        try {
            number = parseInt(string);
            if (number<1 || number>10 ){
                Incorrect.incorrect();
            }

        } catch (NumberFormatException e) {
            System.out.println("Умножать и делить можно только на число!\n Проверьте введенные данные.");
            throw new RuntimeException(e);
        }
        return number;
    }
}
