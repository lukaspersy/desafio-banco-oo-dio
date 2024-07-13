public class Conta implements IConta {
    private int agencia;
    private int numeroConta;
    private double saldo;
    private double limiteEspecial;
    private Cliente titular;
    private Banco banco;  // Adicionando uma referência ao Banco para realizar transferências

    public Conta(int agencia, int numeroConta, double saldo, double limiteEspecial, Cliente titular, Banco banco) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.limiteEspecial = limiteEspecial;
        this.titular = titular;
        this.banco = banco;  // Inicializa a referência ao Banco
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    // Método para sacar
    @Override
    public void sacar(double valorSaque) {
        if (valorSaque > 0 && valorSaque <= saldo + limiteEspecial) {
            saldo -= valorSaque;
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    // Método para depositar
    @Override
    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            saldo += valorDeposito;
        } else {
            System.out.println("Valor do depósito deve ser positivo.");
        }
    }

    // Método para transferir
    @Override
    public boolean transferir(double valorTransferencia, int agenciaDestino, int numeroContaDestino) {
        if (valorTransferencia > 0 && valorTransferencia <= saldo + limiteEspecial) {
            Conta contaDestino = banco.buscarConta(agenciaDestino, numeroContaDestino);
            if (contaDestino != null) {
                this.saldo -= valorTransferencia;
                contaDestino.depositar(valorTransferencia);
                return true;
            } else {
                System.out.println("Conta destino não encontrada.");
                return false; // Conta destino não encontrada
            }
        } else {
            System.out.println("Transferência inválida.");
            return false; // Transferência inválida
        }
    }
}
