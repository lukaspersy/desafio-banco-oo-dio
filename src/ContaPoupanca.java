public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(int agencia, int numeroConta, double saldo, double limiteEspecial, Cliente titular, Banco banco, double taxaJuros) {
        super(agencia, numeroConta, saldo, limiteEspecial, titular, banco);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void aplicarRendimentos() {
        // Aplica a taxa de juros sobre o saldo
        double rendimento = getSaldo() * taxaJuros / 100;
        setSaldo(getSaldo() + rendimento);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "agencia=" + getAgencia() +
                ", numeroConta=" + getNumeroConta() +
                ", saldo=" + getSaldo() +
                ", limiteEspecial=" + getLimiteEspecial() +
                ", titular=" + getTitular() +
                ", taxaJuros=" + taxaJuros +
                '}';
    }
}
