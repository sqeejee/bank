import javax.jws.soap.SOAPBinding.Use;

public class banktest {

    public static void main(String[] args) {
        bank bank = new bank();
        try {
            bank.openAccount("user", 269);
            System.out.println("Checking balance");
            System.out.println(bank.checkBalance("user"));
            System.out.println("Depositing");
            bank.depositMoney("user", 1);
            System.out.println(bank.checkBalance("user"));
            System.out.println("Withdraw");
            bank.withdrawMoney("user", 1);
            System.out.println(bank.checkBalance("user"));
            System.out.println("Close");
            bank.withdrawMoney("user", 269);
            bank.closeAccount("user");

            System.out.println("Transfer");
            bank.openAccount("user1", 269);
            System.out.println(bank.checkBalance("user1"));
            bank.openAccount("user2", 0);
            System.out.println(bank.checkBalance("user2"));
            bank.transferMoney("user1", "user2", 269);

            bank.audit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
