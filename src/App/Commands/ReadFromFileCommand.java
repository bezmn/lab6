package App.Commands;
import App.Bank.Bank;
public class ReadFromFileCommand implements BaseCommand{
    @Override
    public void execute(Bank bank) {
        bank.readFromFile();
    }
}

