public class Multiplication {
    public static String multiplication(String input) {
        try {int a = input.indexOf("\"");
            int b = input.indexOf("\"", (a+1));
            int c = input.indexOf("*", b+1);
            String value = input.substring(c+1).trim();
            Examination.examination(value);
            String str1 = input.substring((a+1), b); //�������� ������ ����� ���������

            if (str1.length() > 10 ) {
                Incorrect.incorrect();
            }
            int multiplicator = Examination.examination(value);
            return str1.repeat(multiplicator);
        } catch (Exception e) {
            System.out.println("������� ������, �� ��������������� ��������.////");
            throw new RuntimeException(e);
        }




    }
}

