/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.DTO;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author HOLLY MAN
 */
@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Vendas> vendas;

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pedidos> pedidos;
    
     @OneToMany(mappedBy = "remetente")
    private List<Mensagem> mensagensEnviadas;

    @OneToMany(mappedBy = "destinatario")
    private List<Mensagem> mensagensRecebidas;

    @OneToMany(mappedBy = "funcionario")
    private List<Relatorio_Menssagem> relatoriosEnviados;

    private String apelido, nome, genero, data_nascimento, email, password, nivel_acesso, funcao, estado, codigo_Fun;
    private int numero_BI_Nuit, contacto;
    private long codigo_funcionario;
    private double salario;
    private byte foto;
}
