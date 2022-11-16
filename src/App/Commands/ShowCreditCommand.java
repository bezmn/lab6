package App.Commands;
import App.Bank.Bank;
public class ShowCreditCommand implements BaseCommand{
    @Override
    public void execute(Bank bank) {
        bank.printCredits();
    }
}

