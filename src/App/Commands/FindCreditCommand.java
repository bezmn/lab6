package App.Commands;
import App.Bank.Bank;
public class FindCreditCommand implements BaseCommand{
    @Override
    public void execute(Bank bank) {
        bank.findCredit();
    }
}
