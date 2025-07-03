public class Paciente {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Paciente() {
        endereco = new Endereco();
    }

    public Paciente(String nome, String cpf, String rua, Cidade cidade ) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = new Endereco(rua, cidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void atualizarEndereco(String rua, Cidade cidade) {
        this.endereco = new Endereco(rua, cidade);
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
