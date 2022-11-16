package App.Commands;

import App.Bank.Bank;
public class CreateCreditCommand implements BaseCommand {
    @Override
    public void execute(Bank bank) {
        bank.createCredit();
    }
}
