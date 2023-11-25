/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.DTO;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author HOLLY MAN
 */
@Entity
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categorias categoria;

    @ManyToMany(mappedBy = "produtos", cascade = CascadeType.ALL)
    private List<Vendas> vendas;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedidos pedido;

    private String codigo_produto, nome_produto, lote, codigo_barra, validade, tipo_Produto, nivelMinimo_Disponibilidade, Marca, Descricao, unidadeMedida;

    private Date data_cadastro;
    @Lob
    private byte[] imagem;

    private double quantidade_embalada, quantidade_emEmbalagem, quantidade_Adicionar, peso_volume, preco_compra, preco_venda, lucro_unidade, total_custos, valor_esperado, totalDisponiveis;
    private String Status;

    public Produtos(long id, Categorias categoria, Pedidos pedido, String codigo_produto, String nome_produto, String lote, String codigo_barra, String validade, String tipo_Produto, String nivelMinimo_Disponibilidade, String Marca, String Descricao, String unidadeMedida, Date data_cadastro, byte[] imagem, double quantidade_embalada, double quantidade_emEmbalagem, double quantidade_Adicionar, double peso_volume, double preco_compra, double preco_venda, double lucro_unidade, double total_custos, double valor_esperado, double totalDisponiveis, String Status) {
        this.id = id;
        this.categoria = categoria;
        this.pedido = pedido;
        this.codigo_produto = codigo_produto;
        this.nome_produto = nome_produto;
        this.lote = lote;
        this.codigo_barra = codigo_barra;
        this.validade = validade;
        this.tipo_Produto = tipo_Produto;
        this.nivelMinimo_Disponibilidade = nivelMinimo_Disponibilidade;
        this.Marca = Marca;
        this.Descricao = Descricao;
        this.unidadeMedida = unidadeMedida;
        this.data_cadastro = data_cadastro;
        this.imagem = imagem;
        this.quantidade_embalada = quantidade_embalada;
        this.quantidade_emEmbalagem = quantidade_emEmbalagem;
        this.quantidade_Adicionar = quantidade_Adicionar;
        this.peso_volume = peso_volume;
        this.preco_compra = preco_compra;
        this.preco_venda = preco_venda;
        this.lucro_unidade = lucro_unidade;
        this.total_custos = total_custos;
        this.valor_esperado = valor_esperado;
        this.totalDisponiveis = totalDisponiveis;
        this.Status = Status;
    }

    private Produtos() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public List<Vendas> getVendas() {
        return vendas;
    }

    public void setVendas(List<Vendas> vendas) {
        this.vendas = vendas;
    }

    public Pedidos getPedido() {
        return pedido;
    }

    public void setPedido(Pedidos pedido) {
        this.pedido = pedido;
    }

    public String getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(String codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getCodigo_barra() {
        return codigo_barra;
    }

    public void setCodigo_barra(String codigo_barra) {
        this.codigo_barra = codigo_barra;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getTipo_Produto() {
        return tipo_Produto;
    }

    public void setTipo_Produto(String tipo_Produto) {
        this.tipo_Produto = tipo_Produto;
    }

    public String getNivelMinimo_Disponibilidade() {
        return nivelMinimo_Disponibilidade;
    }

    public void setNivelMinimo_Disponibilidade(String nivelMinimo_Disponibilidade) {
        this.nivelMinimo_Disponibilidade = nivelMinimo_Disponibilidade;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public double getQuantidade_embalada() {
        return quantidade_embalada;
    }

    public void setQuantidade_embalada(double quantidade_embalada) {
        this.quantidade_embalada = quantidade_embalada;
    }

    public double getQuantidade_emEmbalagem() {
        return quantidade_emEmbalagem;
    }

    public void setQuantidade_emEmbalagem(double quantidade_emEmbalagem) {
        this.quantidade_emEmbalagem = quantidade_emEmbalagem;
    }

    public double getQuantidade_Adicionar() {
        return quantidade_Adicionar;
    }

    public void setQuantidade_Adicionar(double quantidade_Adicionar) {
        this.quantidade_Adicionar = quantidade_Adicionar;
    }

    public double getPeso_volume() {
        return peso_volume;
    }

    public void setPeso_volume(double peso_volume) {
        this.peso_volume = peso_volume;
    }

    public double getPreco_compra() {
        return preco_compra;
    }

    public void setPreco_compra(double preco_compra) {
        this.preco_compra = preco_compra;
    }

    public double getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }

    public double getLucro_unidade() {
        return lucro_unidade;
    }

    public void setLucro_unidade(double lucro_unidade) {
        this.lucro_unidade = lucro_unidade;
    }

    public double getTotal_custos() {
        return total_custos;
    }

    public void setTotal_custos(double total_custos) {
        this.total_custos = total_custos;
    }

    public double getValor_esperado() {
        return valor_esperado;
    }

    public void setValor_esperado(double valor_esperado) {
        this.valor_esperado = valor_esperado;
    }

    public double getTotalDisponiveis() {
        return totalDisponiveis;
    }

    public void setTotalDisponiveis(double totalDisponiveis) {
        this.totalDisponiveis = totalDisponiveis;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

}
