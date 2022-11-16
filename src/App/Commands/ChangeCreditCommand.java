package App.Commands;

import App.Bank.Bank;
public class ChangeCreditCommand implements BaseCommand {
    @Override
    public void execute(Bank bank) {
        bank.changeCredit();
    }
}
