public class BankAccount {

    private static int counter = 0;
    private final int id = ++counter;
    private String name;
    private double balance;
    private double overdraft;
    private boolean hasOverdraft;

    public BankAccount(String name, double balance, double overdraft){
        this.name = name;
        this.balance = balance;
        this.overdraft = overdraft;
        this.hasOverdraft = false;
    }

    // consultar dinheiro
    public double checkBalance(){
        return hasOverdraft ? balance + overdraft : balance;
    }

    // sacar dinheiro
    public boolean withdraw(double amount){
        if (hasOverdraft) {
            if ( balance + overdraft >= amount) {
                balance -= amount;
                return true;
            }
        } else {
            if (balance >= amount) {
                balance -= amount;
                return true;
            }
        }
        return false;
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
    public void setHasOverdraft(boolean hasOverdraft){ this.hasOverdraft = hasOverdraft; }
}
