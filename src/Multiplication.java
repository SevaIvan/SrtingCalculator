import static java.lang.Integer.parseInt;

public class Multiplication {
    public static String multiplication(String str1, String str2) {
        int multiplicator = Examination.examination(str2);
        String result = str1.repeat(multiplicator);
        return result;
    }
}

