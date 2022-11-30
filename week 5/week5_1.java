import java.util.Scanner;

public class week5_1 {
    public static void main(String args[]) {
        System.out.print("Введите температуру целым числом: ");
        Scanner inputInt = new Scanner(System.in);
        int temp = inputInt.nextInt();

        if (temp < 0) {
            System.out.println("Сейчас очень холодно.");
        }
        else if (temp >= 0 && temp <= 16) {
            System.out.println("Сейчас прохладно.");
        }
        else {
            System.out.println("Отличный летний денек!");
        }
    }
}
