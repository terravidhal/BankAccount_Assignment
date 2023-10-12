public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts; // numOfAccounts
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances
    private long accountNum;     

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount(){
         this.checkingBalance = 0;
         this.savingsBalance = 0;
         BankAccount.accounts++; 
        //Ninjas Bonus 2 :
        this.getAccountNumber();
    }
   
    // GETTERS 
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    public double getSavingsBalance() {
        return this.savingsBalance;
    }
    public static int getAccounts() {
        return BankAccount.accounts;
    }
    public static double getTotalMoneyAllAccounts() {
        return BankAccount.totalMoney;
    }
     // Ninjas Bonus 1 : //getters
    public long getAccountNumber(){
        accountNum = (long) (Math.random()* Math.pow(10,10));
        return this.accountNum;
    }
    
    

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void depositAccount(String accountType, double amount) {
        if (accountType.equals("checking")) {
          this.checkingBalance += amount; 
        } else if (accountType.equals("savings")) {
          this.savingsBalance += amount;
        }
        totalMoney += amount;
    }
    // withdraw 
    // - users should be able to deposit money into their checking or savings account
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public void withDrawAccount(String accountType, double amount) {
        if (accountType.equals("checking")) {
            if(this.checkingBalance >= amount){
                this.checkingBalance -= amount;
                totalMoney -= amount;
            }else{
                System.out.println("Insufficient funds: Charging a"+"$"+(-1 *(totalMoney - amount)) +"fee!");
            }
            
        } else if (accountType.equals("savings")) {
            if(this.savingsBalance >= amount){
                this.savingsBalance -=amount;
                totalMoney -= amount;
            }else{
                System.out.println("Insufficient funds: Charging a"+"$"+(-1 *(totalMoney - amount)) +"fee!");
            } 
        }
    }

    //total money specific account
    public double totalMoney() {
        return this.checkingBalance + this.savingsBalance;
    }

    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public void getBalance(){
        System.out.printf("CheckingBallance : $" + this.getCheckingBalance()+"\n"+"savingsBalance : $"+this.getSavingsBalance()+ "\n");
    }

   
}
