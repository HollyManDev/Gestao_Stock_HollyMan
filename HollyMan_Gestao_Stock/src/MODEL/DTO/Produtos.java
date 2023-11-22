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

    //Falta relacionar produtos com pedidos
    private String nome_produto, lote, codigo_barra, validade, tipo_Produto, estado_produto, nivelMinimo_Disponibilidade, Marca, Descricao, unidadeMedida;

    private String codigo_produto;

    private Date data_cadastro;

    private double quantidade_embalada, quantidade_emEmbalagem, quantidade_Adicionar, peso_volume, preco_compra, preco_venda, lucro_unidade, total_custos, valor_esperado, totalDisponiveis;

}
