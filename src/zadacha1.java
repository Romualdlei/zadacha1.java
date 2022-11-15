import java.util.Scanner;

public class zadacha1 {
    public static void main (String[] args) {
        Scanner cs = new Scanner(System.in);

        System.out.println("Ведите 3 числа: ");

        int a = cs.nextInt();
        int b = cs.nextInt();
        int c = cs.nextInt();

        if(a>c) {
            if (c > b) {
                System.out.println("наименьшее число из: " +a+ ", "+b+", "+c);
                System.out.println("Ответ: " + b);
            } else {
                System.out.println("наименьшее число из: " +a+ ", "+b+", "+c);
                System.out.println("Ответ: " + c);
            }
        }else {
            if(a>b) {
                System.out.println("наименьшее число из: " + a + ", " + b + ", " + c);
                System.out.println("Ответ: " + b);
            } else {
                System.out.println("наименьшее число из: " + a + ", " + b + ", " + c);
                System.out.println("Ответ: " + a);
            }
        }
    }
}
