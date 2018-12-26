package controller;

/**
 * Created by kmluns on 26/12/2018.
 */

import model.Account;
import view.AccountView;


// Controller
public class AccountController {

    // View and Model
    AccountView accountView;
    Account account;

    public AccountController(Account account){
        this.account = account;
        this.accountView = new AccountView(account);
    }


    public boolean changePassword(String newPassword){
        if(account != null){
            account.setPassword(newPassword);
            return true;
        }
        return false;
    }



    public void repaintView(){
        if(accountView != null){
            String view = accountView.showAccountInformation();
            System.out.println(view);
        }else{
            System.out.println("There is no view!");
        }

    }

}
