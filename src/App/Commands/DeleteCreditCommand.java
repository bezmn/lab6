package App.Commands;

import App.Bank.Bank;
public class DeleteCreditCommand implements BaseCommand {
    @Override
    public void execute(Bank bank) {
        bank.deleteCredit();
    }
}
