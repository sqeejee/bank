public class bank {

    String id;
    double balance;

    public bank(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void openAccount(String email, double initBal) {
        if (true) {
            bank newBank = new bank(email, initBal);
        } else {
            throw new Error("You already registered an account!");
        }
    }

    public void closeAccount(String email) {

    }

    public int checkBalance(String email) {
        return 1;
    }

}