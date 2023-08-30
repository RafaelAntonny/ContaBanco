import java.util.Scanner;

record ContaModel(int numeroDaConta, String agencia, String nomeCliente, double saldo) {

}

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor digite o numero da sua conta");

        int numeroDaConta = input.nextInt();
        input.nextLine();

        System.out.println("Por favor digite a sua agência");

        String agencia = input.nextLine();

        System.out.println("Por favor digite o seu nome");

        String nomeCliente = input.nextLine();

        System.out.println("Por favor digite o seu saldo");

        double saldo = input.nextDouble();
        input.nextLine();

        ContaModel conta = new ContaModel(numeroDaConta, agencia, nomeCliente, saldo);

        input.close();

        System.out.println("Olá " + conta.nomeCliente()
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia() +
                ", conta " + conta.numeroDaConta() + " e seu saldo " + conta.saldo()
                + " já está disponivel para o saque");

    }

}