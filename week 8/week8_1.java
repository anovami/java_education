import java.util.LinkedList;

public class week8_1 {
    public static void main(String[] args) {
//        Создайте LinkedList, состоящий из языков программирования.
//        Воспользуйтесь разными версиями метода add при добавлении элементов
//        (add, add с указанием позиции, addFirst, addLast).
//        Распечатайте на экран весь список,
//        затем первый и последний элемент без удаления и с удалением.
        String[] stringArray = new String[] {"Python", "Ruby", "Java", "C++", "C#", "Golang"};
        LinkedList<String> progLanguageList = new LinkedList<>();
        for (int i = 0; i < stringArray.length; i++) {
            progLanguageList.add(i, stringArray[i]);
        }
        progLanguageList.add("Julia");
        progLanguageList.addFirst("Assembly");
        progLanguageList.addLast("Fortran");
        System.out.println("Получившийся список: " + progLanguageList);
        System.out.println("Первый элемент: " + progLanguageList.peekFirst());
        System.out.println("Последний элемент: " + progLanguageList.peekLast());
        System.out.println("Первый элемент с удалением: " + progLanguageList.pollFirst());
        System.out.println("Последний элемент с удалением: " + progLanguageList.pollLast());
        System.out.println("Весь список: " + progLanguageList);
    }
}
