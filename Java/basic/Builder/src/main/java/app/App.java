package app;

import domain.BankAccount;

/**
 * Created by kmluns on 30.12.2018
 */
public class App {





    public void run(){

        BankAccount bankAccount = new BankAccount
                .BankAccountBuilder("5")
                .setAge("25")
                .setBalance("250000")
                .setFatherName("Father")
                .setMotherMaidenSurname("MaidenSurname")
                .setMotherName("Mother")
                .setName("kmluns")
                .setPassword("123456")
                .setSurname("UNSAL")
                .build();


        System.out.println(bankAccount);


    }


}
