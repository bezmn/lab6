package App.Credit;

public class Credit {
    protected String name;
    protected int moneyAmount;
    protected int timeForRepayment;

    public Credit(String name, int moneyAmount, int timeForRepayment) {
        this.name = name;
        this.moneyAmount = moneyAmount;
        this.timeForRepayment = timeForRepayment;

    }

    public String getName() {
        return name;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public int getTimeForRepayment(){
        return timeForRepayment;
    }

    @Override
    public String toString() {
        System.out.println("Назва Кредиту: " + getName() +
                "\nКількість отриманих коштів : " + getMoneyAmount() +
                "\nЧас на повернення: " + getTimeForRepayment());
        return "";
    }
}
