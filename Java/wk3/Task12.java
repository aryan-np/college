package wk3;

class Customer {
    private int customerId;
    private String name;
    private int bankAccount;

    public Customer(){
        System.out.println("User Created Successfully");
    }


    public Customer(int customerId, String name, int bankAccount) {
        this.customerId = customerId;
        this.name = name;
        this.bankAccount = bankAccount;
    }

    public Customer(int customerId,  int bankAccount) {
        this.customerId = customerId;
        this.bankAccount = bankAccount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }
}


public class Task12 {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "John Doe", 999999999);
        Customer customer2 = new Customer(2, "Jane Smith", 66666666);
        customer1.setName("Suril");
        customer1.getName();

        System.out.println("Customer 1 Details:");
        System.out.println("ID: " + customer1.getCustomerId());
        System.out.println("Name: " + customer1.getName());
        System.out.println("Account Number: " + customer1.getBankAccount());
        System.out.println("Balance: $" + customer1.getBankAccount());
        System.out.println();

        System.out.println("Customer 2 Details:");
        System.out.println("ID: " + customer2.getCustomerId());
        System.out.println("Name: " + customer2.getName());
        System.out.println("Account Number: " + customer2.getBankAccount());
        System.out.println("Balance: $" + customer2.getBankAccount());
    }
}
