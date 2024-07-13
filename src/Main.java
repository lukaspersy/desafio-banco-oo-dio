public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Lopez");
        cliente1.setCpf("123.456.789-00");

        EnderecoCliente endereco1 = new EnderecoCliente("Rua das Flores", "Jardim das Plantas", 123, "Cidade Verde", "12345-678");
        cliente1.setEndereco(endereco1);

        // Criando Conta Corrente
        ContaCorrente contaCorrente = new ContaCorrente(1, 1, 1000.0, 500.0, cliente1, banco, 12.50);
        banco.adicionarConta(contaCorrente);

        // Criando Conta Poupança
        ContaPoupanca contaPoupanca = new ContaPoupanca(1, 2, 500.0, 0.0, cliente1, banco, 1.5);
        banco.adicionarConta(contaPoupanca);

        // Realizando uma transferência entre contas
        double valorTransferencia = 200.0;
        boolean sucesso = contaCorrente.transferir(valorTransferencia, 1, 2);

        if (sucesso) {
            System.out.println("Transferência de " + valorTransferencia + " realizada com sucesso!");
        } else {
            System.out.println("Transferência de " + valorTransferencia + " não pôde ser realizada.");
        }

        // Aplicar rendimentos na conta poupança
        contaPoupanca.aplicarRendimentos();
        System.out.println("Saldo da Conta Poupança após rendimentos: " + contaPoupanca.getSaldo());

        // Verificando os saldos após a transferência
        System.out.println("Saldo atual da Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo atual da Conta Poupança: " + contaPoupanca.getSaldo());
    }
}
