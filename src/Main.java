import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Qual o nome para criação da conta: ");
        String name = scanner.next();

        System.out.println("Valor do depósito inicial: ");
        double balance = scanner.nextDouble();

        double limitOverdraft = (balance > 500 ? balance * 0.50 : 50);

        var bank1 = new BankAccount(name, balance, limitOverdraft);

        System.out.println("Qual o valor do saque: ");
        double amount = scanner.nextDouble();

        if (bank1.withdraw(amount)){
            System.out.println("Saque efetuado! Saldo atual: " + bank1.getBalance() + " Cheque especial: " + bank1.getOverdraft());
        } else {
            System.out.println("Saque não efetuado! Saldo atual: " + bank1.getBalance() + " Cheque especial: " + bank1.getOverdraft());
        }

        if (bank1.deposit(1.00)) {
            System.out.println("Deposito efetuado! Saldo atual: " + bank1.getBalance());
        }
}



}

/* criar classe
    - BankAccount
        = id (int), name (String), balance(double), totalBalance (double), overdraft(
        double limiteChequeEspecial = deposito > 500 ? deposito * 0.50 : 50;)
         - tem limite de cheque especial
         * -  Caso utilize o cheuqe especial -> cobrar uma taxa de 20% do valor usado no cheque

 */

// pagar um boleto




// verificar se a conta esta utillizando cheque especial

