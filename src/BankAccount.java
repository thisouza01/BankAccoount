public class BankAccount {

    private static int counter = 0;
    private final int id = ++counter;
    private String name;
    private double balance;
    private double overdraft;
    private double limitOverdaft;

    public BankAccount(String name, double balance, double overdraft){
        this.name = name;
        this.balance = balance;
        this.limitOverdaft = overdraft;
        this.overdraft = overdraft;
    }

    // verifica se está utilizando o cheuqe especial
    public boolean isUsingOverdraf(){
        return balance == 0 && overdraft < limitOverdaft;
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
        }

        if (balance + overdraft  >= amount) {
            double usedOverdraft = amount - balance;
            balance = 0;
            overdraft -= usedOverdraft;

            // cobraça da taxa de 20% sobre o valor usado no cheque especial
            double fee = usedOverdraft * 0.20;
            overdraft -= fee;

            return true;
        }

        return false;
    }

    // depositar dinheiro
    public boolean deposit(double amount){
        if (amount <= 0) {
            return false;
        }

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
}
