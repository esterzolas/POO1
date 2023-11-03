/*Crie objetos da classe ContaEspecial.
Faça débitos nas contas e analise o funcionamento do sistema. */

public class UsaBanco {
    public static void main(String[] args) {
        ContaEspecial conta1 = new ContaEspecial(1000, 1, 1234, 1000);
        ContaEspecial conta2 = new ContaEspecial(300, 2, 1234, 2000);
        ContaEspecial conta3 = new ContaEspecial(0, 3, 1234, 3000);
        ContaEspecial conta4 = new ContaEspecial(400, 4, 1234, 300);
        ContaEspecial conta5 = new ContaEspecial(700, 5, 1234, 500);

        conta1.mostrarConta(1234);
        conta2.mostrarConta(1234);
        conta3.mostrarConta(1234);
        conta4.mostrarConta(1234);
        conta5.mostrarConta(1234);

        System.out.println("Debitando 1000 da conta 1...");
        conta1.debitaValor(1000, 1234);
        System.out.println("Debitando 200 da conta 2...");
        conta2.debitaValor(200, 1234);
        System.out.println("Debitando 300 da conta 3...");
        conta3.debitaValor(300, 1234);
        System.out.println("Debitando 700 da conta 4...");
        conta4.debitaValor(700, 1234);
        System.out.println("Debitando 1000 da conta 5...");
        conta5.debitaValor(1000, 1234);
        System.out.println();

        conta1.mostrarConta(1234);
        conta2.mostrarConta(1234);
        conta3.mostrarConta(1234);
        conta4.mostrarConta(1234);
        conta5.mostrarConta(1234);
    }
}
