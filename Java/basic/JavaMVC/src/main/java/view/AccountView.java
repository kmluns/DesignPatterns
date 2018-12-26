package view;

/**
 * Created by kmluns on 26/12/2018.
 */

import model.Account;

// View
public class AccountView {

    // Model
    private Account account;

    public AccountView(Account account){
        this.account = account;
    }


    public String showAccountInformation(){
        if(account != null){
            return "Account : \n \t Username : " + account.getUsername() + "\n\t Password : "  + account.getPassword();
        }

        return "There is no account to view!";
    }

}
