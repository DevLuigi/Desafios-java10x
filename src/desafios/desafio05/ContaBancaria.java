package desafios.desafio05;

public abstract class ContaBancaria implements Conta {
    private TipoConta tipoConta;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo, TipoConta tipoConta) {
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void transferenciaEntreContas(ContaCorrente conta, double valorDaTransferencia) {
        validarTransferencia(valorDaTransferencia);

        conta.setSaldo(conta.consultarSaldo() + valorDaTransferencia);
        this.setSaldo(this.consultarSaldo() - valorDaTransferencia);
    }

    public void transferenciaEntreContas(ContaPoupanca conta, double valorDaTransferencia) {
        validarTransferencia(valorDaTransferencia);

        conta.setSaldo(conta.consultarSaldo() + valorDaTransferencia);
        this.setSaldo(this.consultarSaldo() - valorDaTransferencia);
    }

    public void validarTransferencia(double valorDaTransferencia) {
        if (this.consultarSaldo() < valorDaTransferencia) {
            throw new RuntimeException("Saldo insuficiente! O saldo atual da conta é: " + this.consultarSaldo() + " e a tentativa de transferência foi de: " + valorDaTransferencia);
        }
    }

    @Override
    public double consultarSaldo() {
        return this.getSaldo();
    }

    @Override
    public abstract void depositarValor(double valor);
}
