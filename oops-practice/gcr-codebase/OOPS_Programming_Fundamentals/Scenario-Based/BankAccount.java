public class BankAccount {

    String accountNumber;
    String accountholder;
    int balance;

    BankAccount(String accountNumber, String accountholder, int balance){
        this.accountNumber = accountNumber;
        this.accountholder = accountholder;
        this.balance = balance;
    }

    public static void display(){
        System.out.println("Swiss Bank");
    }

    public void deposit(double amount) {
		if(amount > 0) {
			balance+=amount;
			System.out.println(" Amount Deposited : "+amount);
		}
		else {
			System.out.println("Amount deposited should be positive");
		}
	}
	
	

	public void withdraw(double amount) {
		if (amount <= balance && amount > 0) {
			balance -= amount;
			System.out.println("Withdraw amount is : "+amount);
		}
		else if (amount <= 0) {
			System.out.println("Withdrawal amount must be positive");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	
	
   public void displayBalance() {
       System.out.println("Current balance: " + balance);
   }

    public static void main(String[] args) {
        display();
        BankAccount myaccount = new BankAccount("1111111", "Adnan Khan", 2400);
        myaccount.displayBalance();

        myaccount.deposit(900);
        myaccount.displayBalance();

        myaccount.withdraw(1200);
       myaccount.displayBalance();
        
    }
}