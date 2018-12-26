import controller.AccountController;
import model.Account;

/**
 * Created by kmluns on 26/12/2018.
 */

public class Main {

    public static void main(String[] args){

        // Get Account   (Model)
        Account account = getAccount();

        //Create Controller with Model   (Controller)
        AccountController accountController = new AccountController(account);

        // Repaint view every one sec
        accountController.repaintView();

        // Write new password and click save button
        accountController.changePassword("new password!");

        // Repaint view every one sec
        accountController.repaintView();

    }

    // Simulate get Account from something like database
    private static Account getAccount() {

        Account accountFromDatabase = new Account("kmluns","12345");

        return accountFromDatabase;

    }


}
