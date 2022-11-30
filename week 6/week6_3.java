import java.util.Scanner;

public class week6_3 {
    public static void main(String args[]) {
        System.out.print("Введите целое число: ");
        Scanner inputInt = new Scanner(System.in);
        int num = inputInt.nextInt();
        int n = 1;
        for (int i = 1; i < num + 1; i++) {
            n *= i;
        }
        System.out.println(n);
    }
}
