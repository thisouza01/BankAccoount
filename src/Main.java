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
        System.out.printf("O id: %s. nome: %s, saldo: %s, cheque especial: %s)",bank1.getId(),bank1.getName(),bank1.getBalance(),bank1.getOverdraft());


        System.out.println("Qual o nome para criação da conta: ");
        String name2 = scanner.next();

        System.out.println("Valor do depósito inicial: ");
        double balance2 = scanner.nextDouble();

        double limitOverdraft2 = (balance2 > 500 ? balance * 0.50 : 50);

        var bank2 = new BankAccount(name2, balance2, limitOverdraft2);

        System.out.printf("O id: %s. nome: %s, saldo: %s, cheque especial: %s)",bank2.getId(),bank2.getName(),bank2.getBalance(),bank2.getOverdraft());
    }



}

/* criar classe
    - BankAccount
        = id (int), name (String), balance(double), totalBalance (double), overdraft(
        double limiteChequeEspecial = deposito > 500 ? deposito * 0.50 : 50;)
         - tem limite de cheque especial
         - o valor do cheque especial é somado ao saldo da conta
         - varia conforme a quantidade de dinheiro depsita na criação da conta
         - Se o valor depositado na hora for <= 500 -> cheque especial de 50.00
         - Se o valor depositado for > 500 -> cheque especial é 50% do valor depositado
         * -  Caso utilize o cheuqe especial -> cobrar uma taxa de 20% do valor usado no cheque

 */



// consultar o saldo
/* selecionado a opção para consultar saldo
    verificar se tem saldo
        caso sim
            retorna o saldo
        caso nao
            retorna 0

 */



// consultar cheque especial
/*
    Se nao tem overdraft ->  sai

    Mostra o valor do cheque especial
 */




// depositar dinheiro
/*
    Procura o id
    Se nao encontrou -> sai

    Adiciona depósito ao balance

 */


// sacar dinheiro
/*
    Procura id
    Se nao encontrou -> sai

    Subtrai valor de balance
*/


// pagar um boleto




// verificar se a conta esta utillizando cheque especial
/*
    Verifica se o balance
 */

