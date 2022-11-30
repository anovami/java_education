import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class week8_3 {
//    Преобразуйте созданный вами в задании 1 LinkedList в HashMap
//    и напечатайте ее на экран. Ключами карты должны быть
//    индексы элементов в LinkedList.

    public static void main(String[] args) {
        String[] stringArray = new String[] {"Python", "Ruby", "Java", "C++", "C#", "Golang"};
        LinkedList<String> progLanguageList = new LinkedList<>();
        HashMap<Integer, String> programmingLanguages = new HashMap<>();
        for (int i = 0; i < stringArray.length; i++) {
            progLanguageList.add(i, stringArray[i]);
        }
        for (int j = 0; j < stringArray.length; j++) {
            programmingLanguages.put(j, stringArray[j]);
        }
        for (Map.Entry<Integer, String> element: programmingLanguages.entrySet()){
            System.out.println(element);
        }
    }

    }


