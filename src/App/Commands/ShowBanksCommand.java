package App.Commands;
import App.Bank.Bank;
public class ShowBanksCommand implements BaseCommand{
    @Override
    public void execute(Bank bank) {
        bank.showBanks();
    }
}
