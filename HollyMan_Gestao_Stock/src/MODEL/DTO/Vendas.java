package MODEL.DTO;

import java.io.Serializable;
import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.annotations.BatchSize;

/**
 *
 * @author HOLLY MAN
 */
@Entity
public class Vendas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "vendas_produtos",
            joinColumns = @JoinColumn(name = "venda_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    private List<Produtos> produtos;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_factura")
    private Factura fatura;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_recibo")
    private Recibo recibo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;

    @Lob
    private byte[] imagem;

    private String codigo_Venda, cvv, validade_cartao, forma_pagamento, Tipo_Venda;
    private int numero_cartao;
    private long valor_pago, trocos;
    private LocalDateTime dataVenda;

    // Construtor, getters e setters omitidos para brevidade
    public Vendas(long id, Factura fatura, Recibo recibo, Cliente cliente, Funcionario funcionario, byte[] imagem, String codigo_Venda, String cvv, String validade_cartao, String forma_pagamento, String Tipo_Venda, int numero_cartao, long valor_pago, long trocos, LocalDateTime dataVenda) {
        this.id = id;
        this.fatura = fatura;
        this.recibo = recibo;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.imagem = imagem;
        this.codigo_Venda = codigo_Venda;
        this.cvv = cvv;
        this.validade_cartao = validade_cartao;
        this.forma_pagamento = forma_pagamento;
        this.Tipo_Venda = Tipo_Venda;
        this.numero_cartao = numero_cartao;
        this.valor_pago = valor_pago;
        this.trocos = trocos;
        this.dataVenda = dataVenda;
    }

    public Vendas() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }

    public Factura getFatura() {
        return fatura;
    }

    public void setFatura(Factura fatura) {
        this.fatura = fatura;
    }

    public Recibo getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibo recibo) {
        this.recibo = recibo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public String getCodigo_Venda() {
        return codigo_Venda;
    }

    public void setCodigo_Venda(String codigo_Venda) {
        this.codigo_Venda = codigo_Venda;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getValidade_cartao() {
        return validade_cartao;
    }

    public void setValidade_cartao(String validade_cartao) {
        this.validade_cartao = validade_cartao;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    public String getTipo_Venda() {
        return Tipo_Venda;
    }

    public void setTipo_Venda(String Tipo_Venda) {
        this.Tipo_Venda = Tipo_Venda;
    }

    public int getNumero_cartao() {
        return numero_cartao;
    }

    public void setNumero_cartao(int numero_cartao) {
        this.numero_cartao = numero_cartao;
    }

    public long getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(long valor_pago) {
        this.valor_pago = valor_pago;
    }

    public long getTrocos() {
        return trocos;
    }

    public void setTrocos(long trocos) {
        this.trocos = trocos;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

}
