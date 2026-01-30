package desafios.desafio05;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca() {

    }

    public ContaPoupanca(double saldo) {
        super(saldo, TipoConta.POUPANCA);
    }

    @Override
    public void depositarValor(double valor) {
        this.setSaldo(valor - (valor * 0.01));
    }
}
