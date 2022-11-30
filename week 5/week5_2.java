import java.util.Scanner;

public class week5_2 {
    public static void main(String args[]) {
        System.out.print("Введите целое число: ");
        Scanner inputInt = new Scanner(System.in);
        int num = inputInt.nextInt();

        String result = num % 2 == 1 ? "Число нечетное" : "Число четное";
        System.out.println(result);
    }
}
