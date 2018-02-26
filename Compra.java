package Modelo;

public class Compra {
    private int cod_compra;
    private double total;
    private String form_pagamento;
    private double valorpago;
    private double troco;
    private int cod_ani;
    private String cpf_cliente;

    public Compra() {
        this.cod_compra = 0;
        this.total = 0;
        this.form_pagamento = "";
        this.valorpago = 0;
        this.troco = 0;
        this.cod_ani = 0;
        this.cpf_cliente = "";
    }

    public Compra(int cod_compra, double total, String form_pagamento, double valorpago, double troco, int cod_ani, String cpf_cliente) {
        this.cod_compra = cod_compra;
        this.total = total;
        this.form_pagamento = form_pagamento;
        this.valorpago = valorpago;
        this.troco = troco;
        this.cod_ani = cod_ani;
        this.cpf_cliente = cpf_cliente;
    }

    public int getCod_compra() {
        return cod_compra;
    }

    public void setCod_compra(int cod_compra) {
        this.cod_compra = cod_compra;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getForm_pagamento() {
        return form_pagamento;
    }

    public void setForm_pagamento(String form_pagamento) {
        this.form_pagamento = form_pagamento;
    }

    public double getValorpago() {
        return valorpago;
    }

    public void setValorpago(double valorpago) {
        this.valorpago = valorpago;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public int getCod_ani() {
        return cod_ani;
    }

    public void setCod_ani(int cod_ani) {
        this.cod_ani = cod_ani;
    }

    public String getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }
    
    
    
}
