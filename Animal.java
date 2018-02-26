package Modelo;

public class Animal {
    private int cod_ani;
    private int idade_ani;
    private double peso_ani;
    private String nome_ani;
    private String tipo_ani;
    private String raca_ani;

    public Animal() {
        this.cod_ani = 0;
        this.idade_ani = 0;
        this.peso_ani = 0;
        this.nome_ani = "";
        this.tipo_ani = "";
        this.raca_ani = "";
    }

    public Animal(int cod_ani, int idade_ani, double peso_ani, String nome_ani, String tipo_ani, String raca_ani) {
        this.cod_ani = cod_ani;
        this.idade_ani = idade_ani;
        this.peso_ani = peso_ani;
        this.nome_ani = nome_ani;
        this.tipo_ani = tipo_ani;
        this.raca_ani = raca_ani;
    }

    public int getCod_ani() {
        return cod_ani;
    }

    public void setCod_ani(int cod_ani) {
        this.cod_ani = cod_ani;
    }

    public int getIdade_ani() {
        return idade_ani;
    }

    public void setIdade_ani(int idade_ani) {
        this.idade_ani = idade_ani;
    }

    public double getPeso_ani() {
        return peso_ani;
    }

    public void setPeso_ani(double peso_ani) {
        this.peso_ani = peso_ani;
    }

    public String getNome_ani() {
        return nome_ani;
    }

    public void setNome_ani(String nome_ani) {
        this.nome_ani = nome_ani;
    }

    public String getTipo_ani() {
        return tipo_ani;
    }

    public void setTipo_ani(String tipo_ani) {
        this.tipo_ani = tipo_ani;
    }

    public String getRaca_ani() {
        return raca_ani;
    }

    public void setRaca_ani(String raca_ani) {
        this.raca_ani = raca_ani;
    }
    
    
}
