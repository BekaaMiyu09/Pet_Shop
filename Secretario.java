package Modelo;

/**
 * @author eeep Rebeca, Vittor e Davi;
 */

public class Secretario {
    private int cod_sec;
    private String login_sec;
    private String senha_sec;
    private String nome_sec;
    private String cpf_sec;
    private String rg_sec;
    private String rua_sec;
    private String bairro_sec;
    private int numero_sec;
    private String cidade_sec;
    private String telefone_sec;
    private int tipo;
    private String cep_sec;

    public Secretario() {
        this.cod_sec = 0;
        this.login_sec = "";
        this.senha_sec = "";
        this.nome_sec = "";
        this.cpf_sec = "";
        this.rg_sec = "";
        this.rua_sec = "";
        this.bairro_sec = "";
        this.numero_sec = 0;
        this.cidade_sec = "";
        this.telefone_sec = "";
        this.tipo = 0;
        this.cep_sec = "";
    }

    public Secretario(int cod_sec, String login_sec, String senha_sec, String nome_sec, String cpf_sec, String rg_sec, String rua_sec, String bairro_sec, int numero_sec, String cidade_sec, String telefone_sec, int tipo, String cep_sec) {
        this.cod_sec = cod_sec;
        this.login_sec = login_sec;
        this.senha_sec = senha_sec;
        this.nome_sec = nome_sec;
        this.cpf_sec = cpf_sec;
        this.rg_sec = rg_sec;
        this.rua_sec = rua_sec;
        this.bairro_sec = bairro_sec;
        this.numero_sec = numero_sec;
        this.cidade_sec = cidade_sec;
        this.telefone_sec = telefone_sec;
        this.tipo = tipo;
        this.cep_sec = cep_sec;
    }

    public int getCod_sec() {
        return cod_sec;
    }

    public void setCod_sec(int cod_sec) {
        this.cod_sec = cod_sec;
    }

    public String getLogin_sec() {
        return login_sec;
    }

    public void setLogin_sec(String login_sec) {
        this.login_sec = login_sec;
    }

    public String getSenha_sec() {
        return senha_sec;
    }

    public void setSenha_sec(String senha_sec) {
        this.senha_sec = senha_sec;
    }

    public String getNome_sec() {
        return nome_sec;
    }

    public void setNome_sec(String nome_sec) {
        this.nome_sec = nome_sec;
    }

    public String getCpf_sec() {
        return cpf_sec;
    }

    public void setCpf_sec(String cpf_sec) {
        this.cpf_sec = cpf_sec;
    }

    public String getRg_sec() {
        return rg_sec;
    }

    public void setRg_sec(String rg_sec) {
        this.rg_sec = rg_sec;
    }

    public String getRua_sec() {
        return rua_sec;
    }

    public void setRua_sec(String rua_sec) {
        this.rua_sec = rua_sec;
    }

    public String getBairro_sec() {
        return bairro_sec;
    }

    public void setBairro_sec(String bairro_sec) {
        this.bairro_sec = bairro_sec;
    }

    public int getNumero_sec() {
        return numero_sec;
    }

    public void setNumero_sec(int numero_sec) {
        this.numero_sec = numero_sec;
    }

    public String getCidade_sec() {
        return cidade_sec;
    }

    public void setCidade_sec(String cidade_sec) {
        this.cidade_sec = cidade_sec;
    }

    public String getTelefone_sec() {
        return telefone_sec;
    }

    public void setTelefone_sec(String telefone_sec) {
        this.telefone_sec = telefone_sec;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getCep_sec() {
        return cep_sec;
    }

    public void setCep_sec(String cep_sec) {
        this.cep_sec = cep_sec;
    }
    
    
    
}
