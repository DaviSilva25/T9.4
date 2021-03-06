package models;
/**
 * Classe modelo Cliente
 * @author Davi e Karla
 * @version 1.0 (Oct/21)
 */
public class Cliente {
    //ATRIBUTOS PROPIOS
    private String nome;
    private String cpf;
    private String dataNascimento;
    private Endereco endereco;
    private Telefone telefone;
    private Cartao cartao;
    
    /**
     * Construtor de cliente
     * 
     * @param nome String que representa o nome do cliente
     * @param cpf String que representa o cpf do cliente
     * @param dataNascimento String que representa a data de nascimento do cliente
     * @param endereco Endereco que representa o endereco do Cliente
     * @param telefone Telefone que representa o endereco do Cliente
     * @param cartao Cartao que representa o endereco do Cliente
     */
    //CONSTRUTORES CLIENTE
    public Cliente(String nome, String cpf, String dataNascimento, Endereco endereco,Telefone telefone, Cartao cartao) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cartao = cartao;
    }
    public Cliente(){
    }

    //GETS E SETS
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }
}
