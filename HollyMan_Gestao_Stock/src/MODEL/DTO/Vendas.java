/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL.DTO;

import java.util.Date;

/**
 *
 * @author HOLLY MAN
 */
public class Vendas extends Cliente {
    //Tipo de venda é para saber se foi um pedido que estava pendente ou venda directa
    private String  cvv, validade_cartao, forma_pagamento, Tipo_Venda;
    private long codigo_venda;
    private int numero_cartao;
    private long valor_pago, trocos, Valor_a_Pagar;
  

}
