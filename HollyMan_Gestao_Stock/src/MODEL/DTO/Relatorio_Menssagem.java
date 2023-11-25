/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL.DTO;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author HOLLY MAN
 */
   @Entity
public class Relatorio_Menssagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;
 @Lob
    private byte[] relatorio__pdf;
 
   private String codigo_relatorio, descricaoRelatorio;
   @Temporal(TemporalType.TIMESTAMP)
    private Date dataRelatorio;

    public Relatorio_Menssagem(Long id, Funcionario funcionario, byte[] relatorio__pdf, String codigo_relatorio, String descricaoRelatorio, Date dataRelatorio) {
        this.id = id;
        this.funcionario = funcionario;
        this.relatorio__pdf = relatorio__pdf;
        this.codigo_relatorio = codigo_relatorio;
        this.descricaoRelatorio = descricaoRelatorio;
        this.dataRelatorio = dataRelatorio;
    }
   
   private Relatorio_Menssagem(){
       
   }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public byte[] getRelatorio__pdf() {
        return relatorio__pdf;
    }

    public void setRelatorio__pdf(byte[] relatorio__pdf) {
        this.relatorio__pdf = relatorio__pdf;
    }

    public String getCodigo_relatorio() {
        return codigo_relatorio;
    }

    public void setCodigo_relatorio(String codigo_relatorio) {
        this.codigo_relatorio = codigo_relatorio;
    }

    public String getDescricaoRelatorio() {
        return descricaoRelatorio;
    }

    public void setDescricaoRelatorio(String descricaoRelatorio) {
        this.descricaoRelatorio = descricaoRelatorio;
    }

    public Date getDataRelatorio() {
        return dataRelatorio;
    }

    public void setDataRelatorio(Date dataRelatorio) {
        this.dataRelatorio = dataRelatorio;
    }

}
