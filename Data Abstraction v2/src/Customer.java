import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;
    private boolean check;

    Customer() {
        //create default constructor
        this("", 0, 0, 0);
    }

    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit) {
        //constructor code here
        this.name = name;
        this.accountNumber = accountNumber;
        deposits = new ArrayList<>();
        withdraws = new ArrayList<>();
        this.checkBalance = checkDeposit;
        this.savingBalance = savingDeposit;
    }

    public double deposit(double amt, Date date, String account) {
        //your code here
        if (account.equals(CHECKING)) {   //for checking account
            Deposit a = new Deposit(amt, date, account);
            deposits.add(a);
            checkBalance = checkBalance + amt;
            return amt;
        } else if (account.equals(SAVING)) {    //for saving account
            Deposit b = new Deposit(amt, date, account);
            deposits.add(b);
            savingBalance = savingBalance + amt;
            return amt;
        }
        return 0;
    }

    public double withdraw(double amt, Date date, String account) {
        //your code here
        if (checkOverdraft(amt, account)) {
            if (account.equals(CHECKING)) {
                Withdraw c = new Withdraw(amt, date, account);
                withdraws.add(c);
                checkBalance = checkBalance - amt;
                if(check = false){
                    System.out.println("overdraft + 100");
                }
                return amt;
            } else if (account.equals(SAVING)) {
                Withdraw d = new Withdraw(amt, date, account);
                withdraws.add(d);
                savingBalance = savingBalance - amt;
                return amt;
            }
        }
        return 0;
    }

    private boolean checkOverdraft(double amt, String account) {
        if (account.equals(CHECKING)) {
            return (checkBalance - amt) > 0;
        }
        if (account.equals(SAVING)) {
            return (savingBalance - amt) > 0;
        }
        return false;
    }

    //do not modify
    public void displayDeposits() {
        for (Deposit d : deposits) {
            System.out.println(d);
        }
    }

    //do not modify
    public void displayWithdraws() {
        for (Withdraw w : withdraws) {
            System.out.println(w);
        }
    }
}
