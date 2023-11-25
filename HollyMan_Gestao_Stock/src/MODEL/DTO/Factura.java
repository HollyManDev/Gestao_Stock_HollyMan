/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL.DTO;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

/**
 *
 * @author HOLLY MAN
 */
@Entity
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(mappedBy = "fatura")
private Vendas fatura;

  private String codigo_factura,cliente, produtos ;
  private long qtd, preco, valor_total;
  private String metodo_pagamento;
  private Date data_emissao;
  private String  status;
  
 @Lob
    private byte[] factura_pdf;

    public Factura(long id, Vendas fatura, String codigo_factura, String cliente, String produtos, long qtd, long preco, long valor_total, String metodo_pagamento, Date data_emissao, String status, byte[] factura_pdf) {
        this.id = id;
        this.fatura = fatura;
        this.codigo_factura = codigo_factura;
        this.cliente = cliente;
        this.produtos = produtos;
        this.qtd = qtd;
        this.preco = preco;
        this.valor_total = valor_total;
        this.metodo_pagamento = metodo_pagamento;
        this.data_emissao = data_emissao;
        this.status = status;
        this.factura_pdf = factura_pdf;
    }

    public Factura(){
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Vendas getFatura() {
        return fatura;
    }

    public void setFatura(Vendas fatura) {
        this.fatura = fatura;
    }

    public String getCodigo_factura() {
        return codigo_factura;
    }

    public void setCodigo_factura(String codigo_factura) {
        this.codigo_factura = codigo_factura;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public long getQtd() {
        return qtd;
    }

    public void setQtd(long qtd) {
        this.qtd = qtd;
    }

    public long getPreco() {
        return preco;
    }

    public void setPreco(long preco) {
        this.preco = preco;
    }

    public long getValor_total() {
        return valor_total;
    }

    public void setValor_total(long valor_total) {
        this.valor_total = valor_total;
    }

    public String getMetodo_pagamento() {
        return metodo_pagamento;
    }

    public void setMetodo_pagamento(String metodo_pagamento) {
        this.metodo_pagamento = metodo_pagamento;
    }

    public Date getData_emissao() {
        return data_emissao;
    }

    public void setData_emissao(Date data_emissao) {
        this.data_emissao = data_emissao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public byte[] getFactura_pdf() {
        return factura_pdf;
    }

    public void setFactura_pdf(byte[] factura_pdf) {
        this.factura_pdf = factura_pdf;
    }
 
}
