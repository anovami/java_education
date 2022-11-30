import java.util.HashMap;
import java.util.Map;

public class week8_2 {
//    Создайте HashMap, состоящую из языков программирования
//    и ответственных за них программистов в компании.
//    Ключ - название языка, значение - имя программиста.
//    Выведите на экран карту при помощи цикла foreach,
//    а затем список всех языков программирования,
//    использующихся в компании (ключи)
//    и всех ответственных за них программистов (значения).

    public static void main(String[] args) {
        HashMap<String, String> progLanguageAndProgrammists = new HashMap<>();
        String[] nameArray = new String[] {" Савина София Эриковна", " Бородина Евгения Матвеевна", " Смирнова Анна Степановна", " Фролова Валерия Александровна"};
        String[] progLanguageArray = new String[] {"Python ", "Java ", "Ruby ", "C# "};
        for (int i = 0; i < nameArray.length; i++) {
            progLanguageAndProgrammists.put(progLanguageArray[i], nameArray[i]);
        }
        for (Map.Entry<String, String> element : progLanguageAndProgrammists.entrySet()){
            System.out.println(element);
        }
        System.out.println("Список всех языков программирования: " + progLanguageAndProgrammists.keySet());
        System.out.println("Список всех программисток: " + progLanguageAndProgrammists.values());
    }
}
