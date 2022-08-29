public class Division {
    public static String division(String str1, String str2){
        int divisioner = Examination.examination(str2);
        String result;
        switch (str2){
            case "1":return result = str1;
            case "2": return result = str1.substring(0, (str1.length()/2));
            case "3": return result = str1.substring(0, (str1.length()/3));
            case "4": return result = str1.substring(0, (str1.length()/4));
            case "5": return result = str1.substring(0, (str1.length()/5));
            case "6": return result = str1.substring(0, (str1.length()/6));
            case "7": return result = str1.substring(0, (str1.length()/7));
            case "8": return result = str1.substring(0, (str1.length()/8));
            case "9": return result = str1.substring(0, (str1.length()/9));
            case "10": return result = str1.substring(0, (str1.length()/10));
            default:
                throw new IllegalStateException("Вторая строка выражения не соответствует условиям:" + str2);
        }
    }
}
