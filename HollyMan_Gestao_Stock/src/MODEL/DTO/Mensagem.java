/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL.DTO;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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

   @ManyToOne(fetch = FetchType.LAZY)
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

    public Mensagem(Long id, Funcionario remetente, Funcionario destinatario, Relatorio_Menssagem relatorioEnvio, String texto, byte[] menssagem_pdf) {
        this.id = id;
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.relatorioEnvio = relatorioEnvio;
        this.texto = texto;
        this.menssagem_pdf = menssagem_pdf;
    }

    private Mensagem() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Funcionario getRemetente() {
        return remetente;
    }

    public void setRemetente(Funcionario remetente) {
        this.remetente = remetente;
    }

    public Funcionario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Funcionario destinatario) {
        this.destinatario = destinatario;
    }

    public Relatorio_Menssagem getRelatorioEnvio() {
        return relatorioEnvio;
    }

    public void setRelatorioEnvio(Relatorio_Menssagem relatorioEnvio) {
        this.relatorioEnvio = relatorioEnvio;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public byte[] getMenssagem_pdf() {
        return menssagem_pdf;
    }

    public void setMenssagem_pdf(byte[] menssagem_pdf) {
        this.menssagem_pdf = menssagem_pdf;
    }

}
