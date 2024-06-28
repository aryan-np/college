package wk3;

class BankAccount{

    public BankAccount(){
        System.out.println("Account Created");
    }

    public BankAccount(long accountNumber,
    float balance,
    String accountHolderName,
    String accountHolderAddress){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.accountHolderName=accountHolderName;
        this.accountHolderAddress=accountHolderAddress;
    }

    long accountNumber;
    private  float balance;
    String accountHolderName;
    String accountHolderAddress;

    void depositMoney(float balance){
        this.balance+=balance;
        System.out.println("Current Balance:"+this.balance);
    }
    void withdrawMoney(float balance){
        this.balance-=balance;
        System.out.println("Current Balance:"+this.balance);
    }
    void setBalance(float balance){
        this.balance=balance;
    }
    float getBalance(){
        return this.balance;
    }

}

public class Task3 {
    public static void main(String[] args) {
        BankAccount acc= new BankAccount();
        acc.accountNumber= 1005512001;
        acc.accountHolderName="sansar Dangol";
        acc.accountHolderAddress="Swayambhu";
        acc.setBalance(2000);
        acc.depositMoney(200.98f);
        acc.withdrawMoney(400.77f);

        BankAccount acc1=new BankAccount(1221254545,5500,"Rojan Shrestha","Payutar");
    }
}
