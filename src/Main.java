import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Qual o nome para criação da conta: ");
        String name = scanner.next();

        System.out.println("Valor do depósito inicial: ");
        double balance = scanner.nextDouble();

        double limitOverdraft = (balance > 500 ? balance * 0.50 : 50);

        var bank1 = new BankAccount(name, balance, limitOverdraft);

        int option = 0;

        while(option != 5) {
            System.out.println("================================================");
            System.out.println("1- Consultar \n2- Sacar \n3- Depositar\n4- Boleto\n5- Sair");
            System.out.println("----");
            option = scanner.nextInt();
            System.out.println("================================================");

            switch (option) {
                case 1:
                    System.out.println("Saldo atual + cheque especial: " + (bank1.getBalance()+bank1.getOverdraft()) + " | Cheque especial: " + bank1.getOverdraft());
                    break;

                case 2:
                    System.out.println("Qual o valor do saque: ");
                    double amountWithdraw = scanner.nextDouble();

                    if (bank1.withdraw(amountWithdraw)) {
                        System.out.println("Saque efetuado! Saldo atual: " + (bank1.getBalance()+bank1.getOverdraft()));
                    } else {
                        System.out.println("Saque não efetuado! Saldo atual: " + (bank1.getBalance()+bank1.getOverdraft()));
                    }

                    if (bank1.isUsingOverdraft()) {
                        System.out.println("Utilizou o cheque especial! Saldo atual dele: " + bank1.getOverdraft());
                    }

                    break;

                case 3:
                    System.out.println("Qual o valor do depósito: ");
                    double amountDeposit = scanner.nextDouble();
                    if (bank1.deposit(amountDeposit)) {
                        System.out.println("Deposito efetuado! Saldo atual: " + bank1.getBalance());
                    }
                    break;

                case 4:
                    System.out.println("Qual o valor do boleto:");
                    double amountBill = scanner.nextDouble();

                    if (bank1.withdraw(amountBill)){
                        System.out.println("Boleto pago! Saldo atual: " + (bank1.getBalance()+bank1.getOverdraft()));
                        } else {
                            System.out.println("Boleto não pago! Saldo atual: " + (bank1.getBalance()+bank1.getOverdraft()));
                    }

                    if (bank1.isUsingOverdraft()) {
                        System.out.println("Utilizou o cheque especial! Saldo atual dele: " + bank1.getOverdraft());
                    }

                    break;
            }
        }


    }
}





/* criar classe
    - BankAccount
         * -  Caso utilize o cheuqe especial -> cobrar uma taxa de 20% do valor usado no cheque

 */

// pagar um boleto




// verificar se a conta esta utillizando cheque especial

