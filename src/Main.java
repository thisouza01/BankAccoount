import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        var scanner = new Scanner(System.in);

        System.out.println("Qual o nome para criação da conta: ");
        String name = scanner.next();

        System.out.println("Valor do depósito inicial: ");
        double balance = scanner.nextDouble();

        System.out.println("1- Consultar \n2- Sacar \n3- Depositar");
        int option = scanner.nextInt();

        double limitOverdraft = (balance > 500 ? balance * 0.50 : 50);

        var bank1 = new BankAccount(name, balance, limitOverdraft);

        switch (option){
            case 1:
                System.out.println("Saldo atual: " + bank1.getBalance() + " | Cheque especial: " + bank1.getOverdraft());
                break;
            case 2:
                System.out.println("Qual o valor do saque: ");
                double amountWithdraw = scanner.nextDouble();

                if (bank1.withdraw(amountWithdraw)){
                    System.out.println("Saque efetuado! Saldo atual: " + bank1.getBalance());
                } else {
                    System.out.println("Saque não efetuado! Saldo atual: " + bank1.getBalance());
                }

                if (bank1.isUsingOverdraf()) { System.out.println("Utilizou o cheque especial! Saldo atual dele: " + bank1.getOverdraft()); }

                break;
            case 3:
                System.out.println("Qual o valor do depósito: ");
                double amountDeposit = scanner.nextDouble();
                if (bank1.deposit(amountDeposit)) {
                    System.out.println("Deposito efetuado! Saldo atual: " + bank1.getBalance());
                }
                break;
        }









}



}

/* criar classe
    - BankAccount
         * -  Caso utilize o cheuqe especial -> cobrar uma taxa de 20% do valor usado no cheque

 */

// pagar um boleto




// verificar se a conta esta utillizando cheque especial

