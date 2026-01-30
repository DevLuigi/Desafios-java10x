package desafios.desafio05;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        super(saldo, TipoConta.CORRENTE);
    }

    @Override
    public void depositarValor(double valor) {
        this.setSaldo(valor);
    }
}
