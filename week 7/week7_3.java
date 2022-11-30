import java.util.ArrayList;

public class week7_3 {
    public static void main(String[] args) {
//        Создайте ArrayList из строк.
//        Добавьте еще один целочисленный ArrayList,
//        в каждый элемент которого положите длину каждой строки
//        строкового ArrayList. Выведете оба списка на экран.
        ArrayList<Integer> lenNameOfBacteria = new ArrayList<Integer>();
        ArrayList<String> bacteriaFamilyList = new ArrayList<String>();
        bacteriaFamilyList.add("Acholeplasmataceae");
        bacteriaFamilyList.add("Achromatiaceae");
        bacteriaFamilyList.add("Lactobacillaceae");
        bacteriaFamilyList.add("Neisseriaceae");
        for (String element : bacteriaFamilyList) {
            lenNameOfBacteria.add(element.length());
        }
        System.out.println("ArrayList из строк: " + bacteriaFamilyList);
        System.out.println("ArrayList из длин каждой строки: " + lenNameOfBacteria);

    }
}
