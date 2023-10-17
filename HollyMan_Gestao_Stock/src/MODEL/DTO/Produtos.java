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
public class Produtos extends Categorias{
     private String nome_produto, codigo_barra,validade,data, hora, estado_produto, data_cadastro, lote, tipo_Produto;  
     private int id, fk_categoria;
     private double quantidade_embalada, quantidade_emEmbalagem, peso_volume, preco_unidade,lucro_unidade, total_custos,valor_esperado;
     
}
