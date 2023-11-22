/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL.DTO;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

/**
 *
 * @author HOLLY MAN
 */

    @Entity
public class Mensagem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "remetente_id")
    private Funcionario remetente;

    @ManyToOne
    @JoinColumn(name = "destinatario_id")
    private Funcionario destinatario;

    @ManyToOne
    @JoinColumn(name = "relatorio_id")
    private Relatorio_Menssagem relatorioEnvio;

    @Column(columnDefinition = "TEXT")
    private String texto;
    @Lob
    private byte[] menssagem_pdf;

 
}
