//import java.security.PublicKey;

public class Cliente {
    public Banco banco;
    protected String nome;
    protected String endereco;
    protected String email;
    protected String telefone;

    //Construtor da lista de Clientes do Banco
    public Cliente(String nome, Banco banco) {
        this.nome = nome;
        this.banco = banco;
        this.banco.clientes.add(this);
    }

    //Construtor da Classe Cliente
    public Cliente(String nome, String endereco, String email, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }
    //Métodos Getters e Setters de dados pessoais do Cliente
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    //Método Setter da lista de clientes do Banco
    public void setBanco(Banco banco) {
        this.banco = banco;
        this.banco.clientes.add(this);
    }
    //Sobrescerve toString
    @Override
    public String toString() {
        return "Cliente {" + "banco=" + banco.nome + ", nome=" +this.getNome() + "}";
    }
}
