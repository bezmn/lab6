package App.File;

import java.io.*;
import App.Bank.Bank;
public class FileWriting {
    public static void writeInFile(Bank bank) throws Exception {
       /* File newFile = new File("Banks_Data.txt");
        newFile.delete();

        writer(bank.getBankName(), newFile);
        writer(String.valueOf(bank.getCreditPercent()), newFile);
        writer(String.valueOf(bank.getMaxTimeForRepayment()), newFile);
        writer(bank.getUser().getLogin(), newFile);
        writer(bank.getUser().getPassword(), newFile);

*/

        File newFileTwo = new File("Credits_Data.txt");
        newFileTwo.delete();
        for (int i = 0; i < bank.getCredit().size(); i++){
            writer(bank.getCredit().get(i).getName(), newFileTwo);
            writer(String.valueOf(bank.getCredit().get(i).getMoneyAmount()), newFileTwo);
            writer(String.valueOf(bank.getCredit().get(i).getTimeForRepayment()), newFileTwo);
        }
    }

    public static void writer(String a, File file) throws Exception {
        try { PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, true))); out.print(a + "\n"); out.close();
        } catch (IOException ignored) {}
    }
}
