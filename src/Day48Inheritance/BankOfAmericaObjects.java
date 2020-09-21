package Day48Inheritance;

public class BankOfAmericaObjects {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Sergi", "Kvits");

        account1.setAccountHolder(account1.firstName + " " + account1.lastName);
        account1.setAccountNumber(1234567890);
        account1.setBalance(1000000);

        System.out.println(account1.getAccountHolder());
        System.out.println(account1.getAccountNumber());
        System.out.println(account1.getBalance());
        System.out.println("================================");
        System.out.println(account1.availableBalance());
        System.out.println(account1);
        account1.deposit(10000);
        System.out.println(account1.availableBalance());
        account1.withdraw(2000000);
        System.out.println(account1.availableBalance());
        account1.withdraw(10000);
    }
}
