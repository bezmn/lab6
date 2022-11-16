package App.Commands;

import App.Bank.Bank;
import static App.File.FileWriting.writeInFile;

public class WriteToFileCommand implements BaseCommand{
    @Override
    public void execute(Bank bank) throws Exception {
        writeInFile(bank);
    }
}
