public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount walter = new BankAccount();
        BankAccount paige = new BankAccount();
        BankAccount ana = new BankAccount();

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        System.out.println("\n========== Account Walter ==========");
        System.out.println("Account Number : "+ walter.getAccountNumber());
        walter.depositAccount("checking", 150);
        walter.depositAccount("savings", 50);
        walter.getBalance();
        System.out.println("Total money : $"+ walter.totalMoney());
        System.out.println("========== Account paige ===========");
        System.out.println("Account Number : "+ paige.getAccountNumber());
        paige.depositAccount("checking", 1000);
        paige.depositAccount("savings", 200);
        paige.getBalance();
        System.out.println("Total money : $"+ paige.totalMoney());
        System.out.println("========== Account ana ===========");
        System.out.println("Account Number : "+ ana.getAccountNumber());
        ana.depositAccount("checking", 900);
        ana.getBalance();
        System.out.println("Total money : $"+ ana.totalMoney());


        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        System.out.println("\n\n========== Account Walter ==========");
        System.out.println("Account Number : "+ walter.getAccountNumber());
        walter.withDrawAccount("checking", 50);
        walter.withDrawAccount("savings", 10);
        walter.getBalance();
        System.out.println("Total money : $"+ walter.totalMoney());
        System.out.println("========== Account paige ===========");
        System.out.println("Account Number : "+ paige.getAccountNumber());
        paige.withDrawAccount("checking", 500);
        paige.withDrawAccount("savings", 5);
        paige.getBalance();
        System.out.println("Total money : $"+ paige.totalMoney());
        System.out.println("========== Account ana ===========");
        System.out.println("Account Number : "+ ana.getAccountNumber());
        ana.withDrawAccount("checking", 100);
        ana.getBalance();
        System.out.println("Total money : $"+ ana.totalMoney());

        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("\n=============== ALL ACCOUNTS =================");
        System.out.println("All accounts : "+ BankAccount.getAccounts() + "\n"+ "Total Money bank : $"+ BankAccount.getTotalMoneyAllAccounts());
    }
}
