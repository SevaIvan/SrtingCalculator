public class Subtraction {
    public static String  substraction(String string1, String string2) {
        String result;
        if (string1.contains(string2)){
            result = string1.replace(string2, "");
        }else result = string1;
        return result;
    }
}
