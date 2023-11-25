/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL.DTO;

import java.util.Date;
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
public class Recibo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "pedido_id")
    private Pedidos pedido;

    @OneToOne(mappedBy = "recibo")
    private Vendas venda;

    private String codigo_recibo, produto, cliente, metodo_pagamento;
    private Date data_pagamento;
    private long numero_recibo, qtd, preco, valor_pago;
    @Lob
    private byte[] recibo_pdf;
    private String Status;

    public Recibo(long id, Pedidos pedido, Vendas venda, String codigo_recibo, String produto, String cliente, String metodo_pagamento, Date data_pagamento, long numero_recibo, long qtd, long preco, long valor_pago, byte[] recibo_pdf, String Status) {
        this.id = id;
        this.pedido = pedido;
        this.venda = venda;
        this.codigo_recibo = codigo_recibo;
        this.produto = produto;
        this.cliente = cliente;
        this.metodo_pagamento = metodo_pagamento;
        this.data_pagamento = data_pagamento;
        this.numero_recibo = numero_recibo;
        this.qtd = qtd;
        this.preco = preco;
        this.valor_pago = valor_pago;
        this.recibo_pdf = recibo_pdf;
        this.Status = Status;
    }

    
    private Recibo() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Pedidos getPedido() {
        return pedido;
    }

    public void setPedido(Pedidos pedido) {
        this.pedido = pedido;
    }

    public Vendas getVenda() {
        return venda;
    }

    public void setVenda(Vendas venda) {
        this.venda = venda;
    }

    public String getCodigo_recibo() {
        return codigo_recibo;
    }

    public void setCodigo_recibo(String codigo_recibo) {
        this.codigo_recibo = codigo_recibo;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getMetodo_pagamento() {
        return metodo_pagamento;
    }

    public void setMetodo_pagamento(String metodo_pagamento) {
        this.metodo_pagamento = metodo_pagamento;
    }

    public Date getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(Date data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public long getNumero_recibo() {
        return numero_recibo;
    }

    public void setNumero_recibo(long numero_recibo) {
        this.numero_recibo = numero_recibo;
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

    public long getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(long valor_pago) {
        this.valor_pago = valor_pago;
    }

    public byte[] getRecibo_pdf() {
        return recibo_pdf;
    }

    public void setRecibo_pdf(byte[] recibo_pdf) {
        this.recibo_pdf = recibo_pdf;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

}
