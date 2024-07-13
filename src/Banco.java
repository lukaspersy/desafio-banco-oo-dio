import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, Conta> contas = new HashMap<>();

    // Método para adicionar conta ao banco
    public void adicionarConta(Conta conta) {
        String chave = conta.getAgencia() + "-" + conta.getNumeroConta();
        contas.put(chave, conta);
    }

    // Método para buscar conta pelo número da agência e da conta
    public Conta buscarConta(int agencia, int numeroConta) {
        String chave = agencia + "-" + numeroConta;
        return contas.get(chave);
    }
}
