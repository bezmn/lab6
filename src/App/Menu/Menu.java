package App.Menu;

import App.Bank.Bank;
import App.Commands.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Menu {
    private static Bank bank;
    private static Map<String, BaseCommand> UserChoose;

    public static void start() throws Exception {
        bank = new Bank();
        while (true){
            getMenu();
        }
    }

    public static void getMenu() throws Exception {
        System.out.print("""
                Список всіх доступних команд:
                \t[1] Показати Банки - showbank
                \t[2] Створити Кредит - createcredit
                \t[3] Видалити Кредит - deletecredit
                \t[4] Змінити Кредит - changecredit
                \t[5] Показати Кредити - showcredits
                \t[6] Знайти Кредити - findcredit
                \t[7] Запис у файл - writeinfile
                \t[8] Зчитування з файлу - readfromfile
                \t[9] Вихід - exit
                Введіть ваш вибір:\s""");
        UserChoose();
    }

    private static void UserChoose() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String Input = scanner.nextLine();

        UserChoose = new HashMap<>();

        UserChoose.put("showbank", new ShowBanksCommand());
        UserChoose.put("createcredit", new CreateCreditCommand());
        UserChoose.put("deletecredit", new DeleteCreditCommand());
        UserChoose.put("changecredit", new ChangeCreditCommand());
        UserChoose.put("showcredit", new ShowCreditCommand());
        UserChoose.put("findcredit", new FindCreditCommand());
        UserChoose.put("writeinfile", new WriteToFileCommand());
        UserChoose.put("readfromfile", new WriteToFileCommand());
        UserChoose.put("exit", new ExitCommand());

        BaseCommand command = UserChoose.get(Input);
        if (command != null) {
            UserChoose.get(Input).execute(bank);
        } else {
            throw new IllegalArgumentException("Ви ввели невірну команду!");
        }
    }
}
