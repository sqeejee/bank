import java.util.*;
import java.io.*;

public class bank {

    private HashMap<String, Double> ids;
    String id;
    double balance;

    public bank() {
        ids = new HashMap<String, Double>();
    }

    public void openAccount(String userId, double initBal) throws Exception {
        if (!ids.containsKey(userId)) {
            ids.put(userId, initBal);
        } else {
            throw new Exception("You already registered an account!");
        }
    }

    public void closeAccount(String userId) throws Exception {
        if (!ids.containsKey(userId))
            throw new Exception("This account does not exist");

        if (ids.get(userId) != 0)
            throw new Exception("There is still an outstanidng balance on this account ");
        ids.remove(userId);

    }

    public double checkBalance(String userId) throws Exception {
        if (!ids.containsKey(userId))
            throw new Exception("this account does not exist");
        else
            return ids.get(userId);

    }

    public double depositMoney(String userId, double deposit) throws Exception {
        if (ids.containsKey(userId))
            throw new Exception(
                    "This account does not exist brokie. broke boy. get your money up. you're so silly lmaoo im laughing at your and im just code brokie mcbroke face. I can see you wiping your tears but with tissue paper instead of dollar bills. funny.");
        ids.put(userId, (ids.get(userId) + deposit));
        return deposit;
    }

    public void transferMoney() {

    }

    public void audit() {

    }
}