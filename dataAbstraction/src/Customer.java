import javax.security.sasl.SaslClient;
import java.util.ArrayList;
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

        Customer() {
            //create default constructor
            this.accountNumber = 0;
            this.checkBalance = 0;
            this.savingBalance = 0;
            this.savingRate = 0;
            this.name = null;
        }

        Customer(String name, int accountNumber, double checkDeposit, double savingDeposit) {
            //constructor code here
            this.name = name;
            this.accountNumber = accountNumber;
            this.checkBalance = checkDeposit;
            this.savingBalance = savingDeposit;
        }
        
        public double deposit(double amt, Date date, String account) {
            //your code here
            if (account == SAVING) {
                deposits.add(new Deposit(amt, date, account));
                savingBalance = savingBalance + amt;
                return savingBalance;
            } else if (account == CHECKING) {
                deposits.add(new Deposit(amt, date, account));
                checkBalance = checkBalance + amt;
                return checkBalance;
            } else {
                return 0;
            }
        }

        public double withdraw(double amt, Date date, String account) {
            //your code here
            if (account == SAVING) {
                if (savingBalance >= amt) {
                    withdraws.add(new Withdraw(amt, date, account));
                    savingBalance = savingBalance - amt;
                    return savingBalance;
                } else if (savingBalance < amt) {
                    System.out.println("Invalid Transaction");
                }
            }

            if (account == CHECKING) {
                if (checkBalance >= amt) {
                    withdraws.add(new Withdraw(amt, date, account));
                    checkBalance = checkBalance - amt;
                    return checkBalance;
                } else if (checkBalance < amt) {
                    System.out.println("Invalid Transaction");
                }
            }
            return 0;
        }

        private boolean checkOverdraft(double amt, String account){
            //your code here
            double newOverdraft =0;
            double overdraft = OVERDRAFT;
            if (account == CHECKING){
                if (checkBalance + 100 < amt){
                    amt = amt - checkBalance;
                    newOverdraft = overdraft + amt;
                }
            }

            if (account == SAVING){
                if (savingBalance + 100 < amt){
                    amt = amt - savingBalance;
                    newOverdraft = overdraft + amt;
                }
            }
            return false;
        }
        //do not modify
        public void displayDeposits(){
            for(Deposit d : deposits){
                System.out.println(d);
            }
        }
        //do not modify
        public void displayWithdraws(){
            for(Withdraw w : withdraws){
                System.out.println(w);
            }
        }
    }
