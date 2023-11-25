package MODEL.DTO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import org.hibernate.annotations.BatchSize;

/**
 *
 * @author HOLLY MAN
 */
@Entity
public class Funcionario implements Serializable {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @BatchSize(size = 10)
    private List<Vendas> vendas;

    @OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY)
    @BatchSize(size = 10)
    private List<Pedidos> pedidos;

    @OneToMany(mappedBy = "remetente", fetch = FetchType.LAZY)
    @BatchSize(size = 10)
    private List<Mensagem> mensagensEnviadas;

    @OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY)
    @BatchSize(size = 10)
    private List<Relatorio_Menssagem> relatoriosEnviados;




    private String codigo_Fun, apelido, nome, genero, numero_BI_Nuit, endereco, email, password;
    private int contacto;
    private Date data_nascimento, data_contratacao;
    private String nivel_acesso, funcao;
    private double salario;
    private String estado;
    @Lob
    private byte[] foto;

    public Funcionario(long id, String codigo_Fun, String apelido, String nome, String genero, Date data_nascimento, String numero_BI_Nuit, String endereco, String email, String password, int contacto, String nivel_acesso, Date data_contratacao, String funcao, double salario, String estado, byte[] foto) {
        this.id = id;
        this.codigo_Fun = codigo_Fun;
        this.apelido = apelido;
        this.nome = nome;
        this.genero = genero;
        this.data_nascimento = data_nascimento;
        this.numero_BI_Nuit = numero_BI_Nuit;
        this.endereco = endereco;
        this.email = email;
        this.password = password;
        this.contacto = contacto;
        this.nivel_acesso = nivel_acesso;
        this.data_contratacao = data_contratacao;
        this.funcao = funcao;
        this.salario = salario;
        this.estado = estado;
        this.foto = foto;
    }
    
    public Funcionario(){
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Vendas> getVendas() {
        return vendas;
    }

    public void setVendas(List<Vendas> vendas) {
        this.vendas = vendas;
    }

    public List<Pedidos> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }

    public List<Mensagem> getMensagensEnviadas() {
        return mensagensEnviadas;
    }

    public void setMensagensEnviadas(List<Mensagem> mensagensEnviadas) {
        this.mensagensEnviadas = mensagensEnviadas;
    }

    public List<Relatorio_Menssagem> getRelatoriosEnviados() {
        return relatoriosEnviados;
    }

    public void setRelatoriosEnviados(List<Relatorio_Menssagem> relatoriosEnviados) {
        this.relatoriosEnviados = relatoriosEnviados;
    }

    public String getCodigo_Fun() {
        return codigo_Fun;
    }

    public void setCodigo_Fun(String codigo_Fun) {
        this.codigo_Fun = codigo_Fun;
    }

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

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getNumero_BI_Nuit() {
        return numero_BI_Nuit;
    }

    public void setNumero_BI_Nuit(String numero_BI_Nuit) {
        this.numero_BI_Nuit = numero_BI_Nuit;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public String getNivel_acesso() {
        return nivel_acesso;
    }

    public void setNivel_acesso(String nivel_acesso) {
        this.nivel_acesso = nivel_acesso;
    }

    public Date getData_contratacao() {
        return data_contratacao;
    }

    public void setData_contratacao(Date data_contratacao) {
        this.data_contratacao = data_contratacao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

}    