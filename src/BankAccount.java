public class BankAccount {

    private static int counter = 0;
    private final int id = ++counter;
    private String name;
    private double balance;
    private double overdraft;
    private boolean isUsingOverdraft;

    public BankAccount(String name, double balance, double overdraft){
        this.name = name;
        this.balance = balance;
        this.overdraft = overdraft;
    }

    // verifica se utilizou o cheque especial
    public boolean isUsingOverdraft(){
        return true;
    }

    // consultar dinheiro
    public double checkBalance(){
        return  balance + overdraft;
    }

    // sacar dinheiro
    public boolean withdraw(double amount){
        if ( balance >= amount) {
            balance -= amount;
            return true;
        } else {
            if (balance + overdraft  >= amount) {
                double result = amount - balance;
                balance = 0;
                overdraft -= result;
                return true;
            }
        }
        return false;
    }

    // depositar dinheiro
    public boolean deposit(double amount){
        if (amount <= 0) { return false; }

        balance += amount;
        return true;
    }



    // Getters
    public int getId(){ return id; }
    public String getName(){ return name; }
    public double getBalance(){ return balance; }
    public double getOverdraft(){ return overdraft; }

    // Setters
    public void setName(String name){ this.name = name; }
    public void setBalance(double balance){ this.balance = balance; }
    public void setOverdraft(double overdraft){ this.overdraft = overdraft; }
}
