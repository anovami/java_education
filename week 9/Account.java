import java.util.HashMap;
import java.util.Scanner;

public class Account {
    String password;
    String login;
    HashMap<String, String> users = new HashMap<>();


    void checkLogin(String login) throws WrongLoginException{

        if (login == null || 5 > login.length() || login.length() > 20) {
            System.out.println("Логин не может быть пустым или равным нулю, а также состоять меньше, чем из 5 знаков, или больше, чем из 20");
            throw new WrongLoginException();
        }
        else {
            System.out.println("Ваш логин: " + login);
        }


    }

    void checkPassword(String password) throws WrongPasswordException {
        if (password == null || password.length() < 8 || password.length() > 20) {
            System.out.println("Пароль не может быть равен нулю или пустым, а также состоять меньше, чем из 8 знаков, или больше, чем из 20");
            throw new WrongPasswordException();
        }
        else {
            System.out.println("Ваш пароль: " + password);
        }
    }

    void checkLoginAndPassword(HashMap users, String login, String password) throws WrongLoginOrPasswordException {
        if (users.containsKey(login) & users.containsValue(password)) {
            System.out.println("Вы успешно зашли в аккаунт, " + login);
        }
        else {
            System.out.println("Такой пользователь не зарегистрирован на сайте. Допущена ошибка в логине или пароле.");
            throw new WrongLoginOrPasswordException();
        }
    }

    public static void main(String[] args) {
        String login;
        String password;
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Введите логин: ");
        Account user = new Account();
        HashMap<String, String> users = new HashMap<>();
        user.login = inputObj.nextLine();
        try {
            user.checkLogin(user.login);
        } catch (WrongLoginException e) {
            System.out.println("Исключение: " + e);
        }
        System.out.println("Введите пароль: ");
        user.password = inputObj.nextLine();
        try {
            user.checkPassword(user.password);
        } catch (WrongPasswordException e) {
            System.out.println("Исключение: " + e);
        }

        users.put(user.login, user.password);

        System.out.println("Для входа в систему введите логин: ");
        login = inputObj.nextLine();
        System.out.println("И пароль: ");
        password = inputObj.nextLine();

        try {
            user.checkLoginAndPassword(users, login, password);
        } catch (WrongLoginOrPasswordException e) {
            System.out.println("Исключение: " + e);
        }


    }
}
