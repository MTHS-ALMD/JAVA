package poo.BankAccount;

public class RunBank {
    public static void main(String[] args) {
        BankAccount c1= new BankAccount();
        c1.openAccount("cc");
        c1.setOwner("Jurandir");
        c1.setNumAccount(389);
        c1.payMonthlyFee();
        c1.deposit(30);
        c1.information();
        c1.withdraw(50);

        BankAccount c2= new BankAccount();
        c2.openAccount("cp");
        c2.setNumAccount(128);
        c2.setOwner("Gleisy");
        c2.payMonthlyFee();
        c2.deposit(20);
        c2.withdraw(30);
        c2.information();
        c2.withdraw(200);
    }
}
