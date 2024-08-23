package dailyAssessments;

public class BankAccount {
	
    private String accountNo;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize the attributes
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNo = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }
    
 // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    
    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    

    // display the balance
    public void displayBalance() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }

	public static void main(String[] args) {
		
        BankAccount myAccount = new BankAccount("987654321", "Ganesh N", 5000.00);

        // Display the initial balance
        myAccount.displayBalance();

       
        myAccount.deposit(1000.00);
        myAccount.withdraw(500.00);

        
        myAccount.displayBalance();

	}

}
