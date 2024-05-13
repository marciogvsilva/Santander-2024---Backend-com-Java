package contaBanco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        Float saldo = scanner.nextFloat();
    
        ContaBanco conta = new ContaBanco(numeroConta, agencia, nomeCliente, saldo);
        
        System.out.println("Olá " + conta.getNomeCliente() + " , obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + " conta " + conta.getNumeroConta() + " e seu saldo " + conta.getSaldo().toString() + " já está disponível para saque");
        
        scanner.close();
    }
}