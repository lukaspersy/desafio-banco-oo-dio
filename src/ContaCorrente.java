public class ContaCorrente extends Conta {
    private double tarifaManutencao;

    public ContaCorrente(int agencia, int numeroConta, double saldo, double limiteEspecial, Cliente titular, Banco banco, double tarifaManutencao) {
        super(agencia, numeroConta, saldo, limiteEspecial, titular, banco);
        this.tarifaManutencao = tarifaManutencao;
    }

    public double getTarifaManutencao() {
        return tarifaManutencao;
    }

    public void setTarifaManutencao(double tarifaManutencao) {
        this.tarifaManutencao = tarifaManutencao;
    }

    @Override
    public void sacar(double valorSaque) {
        if (valorSaque > 0 && valorSaque <= getSaldo() + getLimiteEspecial()) {
            super.sacar(valorSaque);
            // Deduz a tarifa de manutenção após o saque
            setSaldo(getSaldo() - tarifaManutencao);
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "agencia=" + getAgencia() +
                ", numeroConta=" + getNumeroConta() +
                ", saldo=" + getSaldo() +
                ", limiteEspecial=" + getLimiteEspecial() +
                ", titular=" + getTitular() +
                ", tarifaManutencao=" + tarifaManutencao +
                '}';
    }
}
