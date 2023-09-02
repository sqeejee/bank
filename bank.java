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

    public void closeAccount(String email) throws Exception {
        if (!ids.containsKey(email))
            throw new Exception("This account does not exist");

        if (ids.get(email) != 0)
            throw new Exception("There is still an outstanidng balance on this account ");
        ids.remove(email);

    }

    public double checkBalance(String email) throws Exception {
        if (!ids.containsKey(email))
            throw new Exception("this account does not exist");
        else
            return ids.get(email);

    }

    public void depositMoney() {

    }

    public void transferMoney() {

    }

    public void audit() {

    }
}