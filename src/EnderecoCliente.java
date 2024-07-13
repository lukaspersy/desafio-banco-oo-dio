public class EnderecoCliente {
    private String rua;
    private String bairro;
    private int numero;
    private String cidade;
    private String cep;  // Alterado para String para suportar CEP com caracteres como hífen

    // Construtor padrão
    public EnderecoCliente() {
    }

    // Construtor com todos os parâmetros
    public EnderecoCliente(String rua, String bairro, int numero, String cidade, String cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
    }

    // Getters e Setters
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    // Método para consultar o endereço
    public void consultarEndereco() {
        System.out.println("Rua: " + getRua());
        System.out.println("Número: " + getNumero());
        System.out.println("Bairro: " + getBairro());
        System.out.println("Cidade: " + getCidade());
        System.out.println("CEP: " + getCep());
    }

    // Método para editar o endereço
    public void editarEndereco(String rua, String bairro, int numero, String cidade, String cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "EnderecoCliente{" +
                "rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}
