public class BankAccount {

    private static int counter = 0;
    private int id = ++counter;
    private String name;
    private double balance;
    private double overdraft;

    public BankAccount(String name, double balance, double overdraft){
        this.name = name;
        this.balance = balance;
        this. overdraft = overdraft;
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
