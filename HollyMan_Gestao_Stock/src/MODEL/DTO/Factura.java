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

    @OneToOne(mappedBy = "fatura", cascade = CascadeType.ALL, orphanRemoval = true)
    private Vendas venda;

  private String produtos, cliente, status, metodo_pagamento, codigo_factura;
  private Date data_emissao;
  private long  numero_factura, qtd, preco, valor_total;
 @Lob
    private byte[] factura_pdf;
}
