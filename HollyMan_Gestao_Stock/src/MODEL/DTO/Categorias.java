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
public class Categorias {

    
   private String categoria, estado;

    private int id;
    private byte imagem;

    public Categorias(String categoria, String estado, int id, byte imagem) {
        this.categoria = categoria;
        this.estado = estado;
        this.id = id;
        this.imagem = imagem;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte getImagem() {
        return imagem;
    }

    public void setImagem(byte imagem) {
        this.imagem = imagem;
    }
    public Categorias() {
      
    }
    
    
}
