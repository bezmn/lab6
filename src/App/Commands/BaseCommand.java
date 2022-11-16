package App.Commands;
import App.Bank.Bank;
public interface BaseCommand {
    void execute(Bank bank) throws Exception;
}
