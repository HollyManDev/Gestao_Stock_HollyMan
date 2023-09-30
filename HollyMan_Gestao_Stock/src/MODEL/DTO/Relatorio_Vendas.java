/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.DTO;

/**
 *
 * @author HOLLY MAN
 */
public class Relatorio_Vendas extends Categorias {

    public Relatorio_Vendas() {
       
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome_funcionario() {
        return nome_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipo_pagamento() {
        return tipo_pagamento;
    }

    public void setTipo_pagamento(String tipo_pagamento) {
        this.tipo_pagamento = tipo_pagamento;
    }

    public int getFk_categorias() {
        return fk_categorias;
    }

    public void setFk_categorias(int fk_categorias) {
        this.fk_categorias = fk_categorias;
    }

    public double getTotal_pago_compra() {
        return total_pago_compra;
    }

    public void setTotal_pago_compra(double total_pago_compra) {
        this.total_pago_compra = total_pago_compra;
    }

    public double getQuan_total_vendidaCate() {
        return quan_total_vendidaCate;
    }

    public void setQuan_total_vendidaCate(double quan_total_vendidaCate) {
        this.quan_total_vendidaCate = quan_total_vendidaCate;
    }

    public double getQuant_total_categorias() {
        return quant_total_categorias;
    }

    public void setQuant_total_categorias(double quant_total_categorias) {
        this.quant_total_categorias = quant_total_categorias;
    }

    public double getTotal_arrecadado() {
        return Total_arrecadado;
    }

    public void setTotal_arrecadado(double Total_arrecadado) {
        this.Total_arrecadado = Total_arrecadado;
    }

    private String apelido, nome_funcionario, genero,categoria, data_venda, hora, tipo_pagamento;

    public Relatorio_Vendas(String apelido, String nome_funcionario, String genero, String categoria, String data_venda, String hora, String tipo_pagamento, int fk_categorias, double total_pago_compra, double quan_total_vendidaCate, double quant_total_categorias, double Total_arrecadado) {
        this.apelido = apelido;
        this.nome_funcionario = nome_funcionario;
        this.genero = genero;
        this.categoria = categoria;
        this.data_venda = data_venda;
        this.hora = hora;
        this.tipo_pagamento = tipo_pagamento;
        this.fk_categorias = fk_categorias;
        this.total_pago_compra = total_pago_compra;
        this.quan_total_vendidaCate = quan_total_vendidaCate;
        this.quant_total_categorias = quant_total_categorias;
        this.Total_arrecadado = Total_arrecadado;
    }
    private int  fk_categorias;
    private double total_pago_compra, quan_total_vendidaCate, quant_total_categorias,  Total_arrecadado;
 
}
