import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    Withdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    //Requires: nothing
    //Modifies: this
    //Effects: will return Withdraw in the format: Withdrawal of: $400.0 Date: Sun Nov 04 00:00:00 PDT 2018 into account: Checking
    public String toString(){
        return "Withdrawal of: $" + amount + " Date: " + date + " into account: " + account;
    }
}
