import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;


public class week7_1 {
//    Создайте массив из целых чисел,
//    выведете его на экран и посчитайте для него среднее арифметическое.
    public static void main(String[] args) {
        int min = 154;
        int max = 6800;
        int randomNum;
        int lenList;
        int sumList = 0;
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        for (int i = 0; i < 11; i++) {
            randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            integerList.add(randomNum);
        }
        lenList = integerList.size();
        for (int i = 0; i < lenList; i++) {
            sumList += integerList.get(i);
        }
        System.out.println("Массив целых чисел: " + integerList);
        float meanArithmetical = (float) sumList / (float) lenList;
        System.out.println("Среднее арифметическое: " + meanArithmetical);
    }
}
