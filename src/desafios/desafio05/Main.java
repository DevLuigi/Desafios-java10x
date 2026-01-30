package desafios.desafio05;

public class Main {
    public static void main(String[] args) {
        var contaCorrente = new ContaCorrente(100.00d);
        var contaPoupanca = new ContaPoupanca(100.00d);

        System.out.println("CONSULTANDO SALDO DA CONTA CORRENTE...");
        System.out.println(contaCorrente.consultarSaldo());
        System.out.println("CONSULTANDO SALDO DA CONTA POUPANÇA...");
        System.out.println(contaPoupanca.consultarSaldo());

        System.out.println("==============================");
        System.out.println("REALIZANDO TRANSFERÊNCIA DE 50 DA CONTA CORRENTE PARA POUPANÇA");
        contaCorrente.transferenciaEntreContas(contaPoupanca, 50);
        System.out.println("==============================");

        System.out.println("CONSULTANDO SALDO DA CONTA CORRENTE...");
        System.out.println(contaCorrente.consultarSaldo());
        System.out.println("CONSULTANDO SALDO DA CONTA POUPANÇA...");
        System.out.println(contaPoupanca.consultarSaldo());
    }
}
