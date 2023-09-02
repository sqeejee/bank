import java.util.*;
import java.io.*;

public class bank {

    private HashMap<String, Double> ids;
    String id;
    double balance;

    public bank() {
        ids = new HashMap<String, Double>();
    }

    public void openAccount(String email, double initBal) throws Exception {
        if (!ids.containsKey(email)) {
            ids.put(email, initBal);
        } else {
            throw new Exception("You already registered an account!");
        }
    }

    public void closeAccount(String email) {

    }

    public int checkBalance(String email) {
        return 1;
    }

    public void depositMoney() {

    }

    public void transferMoney() {

    }

    public void audit() {

    }
}