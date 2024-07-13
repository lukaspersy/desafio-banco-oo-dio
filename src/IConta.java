public interface IConta {
    void sacar(double valorSaque);
    void depositar(double valorDeposito);
    boolean transferir(double valorTransferencia, int agenciaDestino, int numeroContaDestino);
}
