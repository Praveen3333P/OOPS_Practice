class BankAccount{
    private int account_number;
    private int balance=0;

    public BankAccount(int account_number){
        this.account_number = account_number;
    }

    public void deposit(int amount){
        balance = balance + amount;
        System.out.println(amount+ " has been deposited."+ "Updated Balance is"+ balance);;
    }

    public void withdraw(int amount){
        if (amount > balance){
            System.out.println("Insufficient Balance");
        }
        else if (amount <0){
            System.out.println("Cant withdraw negative amount");
        }
        else {
            balance -= amount;
            System.out.println(amount + " has been debited."+ "New updated balnce is "+ balance);
        }
    }

    public int set_balancce(int amount){
        balance = amount;
        return balance;
    }
    public int get_balance(){
        return balance;
    }
    public int get_accountnumber(){
        return account_number;
    }
}

public class Assignment6 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(12345);

        acc1.set_balancce(1000);
        System.out.println((acc1.get_balance()));
        acc1.deposit(500);
        System.out.println((acc1.get_balance()));
        acc1.withdraw(250);
        System.out.println((acc1.get_balance()));
    }
}
