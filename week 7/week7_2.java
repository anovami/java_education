import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class week7_2 {
//    Замените каждый элемент, являющийся нечетным числом, целочисленного массива
//    на число 0 и выведете его на экран.
//    Нечетные элементы добавьте в новый ArrayList
//    и также выведете его содержимое на экран.

    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        int randomNum;
        int min = 9;
        int max = 93;
        ArrayList<Integer> integerOddList  = new ArrayList<Integer>();
        for (int i = 0; i < 15; i++) {
            randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            integerList.add(randomNum);
        }
        for (int i = 0; i < integerList.size(); i++) {
            if (i % 2 == 1) {
                integerOddList.add(integerList.get(i));
                integerList.set(i, 0);
            }
        }
        System.out.println("Целочисленный массив с нулями на нечетных позициях: " + integerList);
        System.out.println("Массив из нечетных чисел: " + integerOddList);
    }
}
