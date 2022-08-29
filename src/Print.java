public class Print {
    public static void print(String string){
        if (string.length()<40){
            System.out.println(string);
        }else System.out.println(string.substring(0, 40) + "...");
    }
}
