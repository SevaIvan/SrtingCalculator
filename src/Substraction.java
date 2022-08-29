public class Substraction {
    public static String substraction(String input) {
        String result;
        try {int a = input.indexOf("\"");
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
            if (str1.contains(str2)){
            result = str1.replace(str2, "");
        }else result = str1;
        return result;
    } catch (Exception e) {
        System.out.println("Введены данные, не соответствующие условиям./");
        throw new RuntimeException(e);
        }
    }
}
