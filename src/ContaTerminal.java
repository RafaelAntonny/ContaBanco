import java.util.Scanner;

record ContaModel(int numeroDaConta, String agencia, String nomeCliente, double saldo) {

}

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor digite o numero da sua conta");

        int numeroDaConta = input.nextInt();

        if(numeroDaConta == 0) {
            System.out.println("O numero da conta não pode ser nulo");
            input.close();
        }

        input.nextLine();

        System.out.println("Por favor digite a sua agência");

        String agencia = input.nextLine();

        if (agencia.isBlank()) {
            System.out.println("Agência não pode ser nula");
            input.close();
        }

        System.out.println("Por favor digite o seu nome");

        String nomeCliente = input.nextLine();

        if (nomeCliente == null) {
            System.out.println("O nome do cliente não pode ser nulo");
            input.close();
        }

        System.out.println("Por favor digite o seu saldo");

        double saldo = input.nextDouble();

        input.nextLine();

        ContaModel conta = new ContaModel(numeroDaConta, agencia, nomeCliente, saldo);

        System.out.println("Olá " + conta.nomeCliente()
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia() +
                ", conta " + conta.numeroDaConta() + " e seu saldo " + conta.saldo()
                + " já está disponivel para o saque");

        input.close();
    }

}