import java.util.Date;

public class Deposit {
    private double amount;
    private Date date;
    private String account;

    Deposit(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    //Requires: nothing
    //Modifies: this
    //Effects: will return Deposit in the format: Deposit of: $400.0 Date: Sun Nov 04 00:00:00 PDT 2018 into account: Checking
    public String toString(){
        return "Deposit of: $" + amount + " Date: " + date + " into account: " + account;
    }
}
