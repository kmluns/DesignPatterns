package domain;

/**
 * Created by kmluns on 30.12.2018
 */
public class BankAccount {


    private String id;
    private String name;
    private String surname;
    private String password;
    private String motherName;
    private String fatherName;
    private String motherMaidenSurname;
    private String age;
    private String balance;

    private BankAccount(){}



    public static class BankAccountBuilder{

        String id;
        String name;
        String surname;
        String password;
        String motherName;
        String fatherName;
        String motherMaidenSurname;
        String age;
        String balance;

        public BankAccountBuilder(String id){
            this.id = id;
        }

        public BankAccountBuilder setAge(String age) {
            this.age = age;
            return this;
        }

        public BankAccountBuilder setBalance(String balance) {
            this.balance = balance;
            return this;
        }

        public BankAccountBuilder setFatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }

        public BankAccountBuilder setMotherMaidenSurname(String motherMaidenSurname) {
            this.motherMaidenSurname = motherMaidenSurname;
            return this;
        }

        public BankAccountBuilder setMotherName(String motherName) {
            this.motherName = motherName;
            return this;
        }

        public BankAccountBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public BankAccountBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public BankAccountBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public BankAccount build(){
            BankAccount bankAccount = new BankAccount();
            bankAccount.id = this.id;
            bankAccount.age = this.age;
            bankAccount.balance = this.balance;
            bankAccount.fatherName = this.fatherName;
            bankAccount.motherMaidenSurname = this.motherMaidenSurname;
            bankAccount.motherName = this.motherName;
            bankAccount.name = this.name;
            bankAccount.password = this.password;
            bankAccount.surname = this.surname;

            return bankAccount;
        }
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", motherName='" + motherName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherMaidenSurname='" + motherMaidenSurname + '\'' +
                ", age='" + age + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
