package App.Commands;

import App.Bank.Bank;
public class ExitCommand implements BaseCommand {
    @Override
    public void execute(Bank bank) {
        System.exit(0);
    }
}
