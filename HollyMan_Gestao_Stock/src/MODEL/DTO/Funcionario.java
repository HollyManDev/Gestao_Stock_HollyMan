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
public class Funcionario {
    
    public Funcionario(String apelido, String nome, String genero, String data_nascimento, String nivel_acesso, String estado, int numero_BI_Nuit, int id, int contacto, byte foto) {
        this.apelido = apelido;
        this.nome = nome;
        this.genero = genero;
        this.data_nascimento = data_nascimento;
        this.nivel_acesso = nivel_acesso;
        this.estado = estado;
        this.numero_BI_Nuit = numero_BI_Nuit;
        this.id = id;
        this.contacto = contacto;
        this.foto = foto;
    }
    public Funcionario() {
        
    }
    private String apelido, nome, genero,data_nascimento,nivel_acesso, estado;

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getNivel_acesso() {
        return nivel_acesso;
    }

    public void setNivel_acesso(String nivel_acesso) {
        this.nivel_acesso = nivel_acesso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero_BI_Nuit() {
        return numero_BI_Nuit;
    }

    public void setNumero_BI_Nuit(int numero_BI_Nuit) {
        this.numero_BI_Nuit = numero_BI_Nuit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public byte getFoto() {
        return foto;
    }

    public void setFoto(byte foto) {
        this.foto = foto;
    }
    private int numero_BI_Nuit, id, contacto;
    private byte  foto;
}
