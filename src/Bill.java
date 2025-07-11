public class Bill {

    private int code;
    private double balance;
    private boolean paid;

    public Bill (int code, double amount){
        this.code = code;
        this.balance = balance;
        this.paid = false;
    }

    // pagar boleto
    public boolean payBill(){
        if(!paid){
            BankAccount.withdraw()
        }
    }
}
