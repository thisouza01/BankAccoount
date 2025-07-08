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


        if (bank1.withdraw(200.00)){
            System.out.println("Deu certo! Saldo atual: " + bank1.getBalance());
        }

        if (bank1.deposit(1.00)) {
            System.out.println("Deu certo! Saldo atual: " + bank1.getBalance());
        }


        System.out.printf("O id: %s. nome: %s, saldo: %s, cheque especial: %s)",bank1.getId(),bank1.getName(),bank1.getBalance(),bank1.getOverdraft());
    }



}

/* criar classe
    - BankAccount
        = id (int), name (String), balance(double), totalBalance (double), overdraft(
        double limiteChequeEspecial = deposito > 500 ? deposito * 0.50 : 50;)
         - tem limite de cheque especial
         * -  Caso utilize o cheuqe especial -> cobrar uma taxa de 20% do valor usado no cheque

 */

// depositar dinheiro
/*
    Procura o id
    Se nao encontrou -> sai

    Adiciona depósito ao balance

 */

// pagar um boleto




// verificar se a conta esta utillizando cheque especial
/*
    Verifica se o balance
 */

