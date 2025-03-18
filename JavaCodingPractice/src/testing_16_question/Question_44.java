package testing_16_question;

public class Question_44 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        while (a <= 30) {
            System.out.println(a);
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
