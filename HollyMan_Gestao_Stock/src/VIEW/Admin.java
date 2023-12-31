package VIEW;

import CONTROLLER.Controller_Categoria;
import CONTROLLER.Controller_Funcionario;
import CONTROLLER.Controller_Produto;
import CONTROLLER.MultilineCellRenderer;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import CSS.BotaoPersonalizado;
import CSS.JLabelComBordaRedonda;
import CSS.PainelPersonalizado;
import DAO.DAO_Categoria;
import DAO.DAO_Funcionario;
import DAO.DAO_Produtos;
import MODEL.DTO.Categorias;
import MODEL.DTO.Funcionario;
import MODEL.DTO.Produtos;

import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.text.DateFormat;

import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.JList;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;

import javax.swing.UIManager;
import javax.swing.border.Border;

/**
 *
 * @author HOLLY MAN
 */
public class Admin extends JFrame {

    // Craindo instancias das Imagens
    ImageIcon Icon_Logo = new ImageIcon(Admin.class.getResource("/Imagens/Logo.jpeg"));
    ImageIcon Icon_Admin = new ImageIcon(Admin.class.getResource("/Imagens/Gerente1.png"));
    ImageIcon Icon_Configurações = new ImageIcon(Admin.class.getResource("/Imagens/definicoes2.png"));
    ImageIcon Icon_Perfil = new ImageIcon(Admin.class.getResource("/Imagens/Perfil2.png"));
    ImageIcon Icon_Gestao_Funcionario = new ImageIcon(Admin.class.getResource("/Imagens/funcionarios.png"));
    ImageIcon Icon_Voltar = new ImageIcon(Admin.class.getResource("/Imagens/botao-voltar.png"));
    ImageIcon Icon_Foto = new ImageIcon(Admin.class.getResource("/Imagens/imagemGaleria.png"));
    ImageIcon Icon_Produtos_Categoria = new ImageIcon(Admin.class.getResource("/Imagens/categorias.png"));
    ImageIcon Icon_VisaoGeral = new ImageIcon(Admin.class.getResource("/Imagens/Visao_Geral.png"));
    ImageIcon Icon_Procurar = new ImageIcon(Admin.class.getResource("/Imagens/Busca1.png"));
    ImageIcon Icon_Gerir_Produtos = new ImageIcon(Admin.class.getResource("/Imagens/Gerir_Produtos.png"));
    ImageIcon Icon_Adicionar = new ImageIcon(Admin.class.getResource("/Imagens/adicionar.png"));
    ImageIcon Icon_Listar = new ImageIcon(Admin.class.getResource("/Imagens/Listar_1.png"));
    ImageIcon Icon_CarregarInf = new ImageIcon(Admin.class.getResource("/Imagens\\CarregarInf.png"));
    ImageIcon Icon_ActualizarC = new ImageIcon(Admin.class.getResource("/Imagens/editar.png"));
    ImageIcon Icon_Proximo = new ImageIcon(Admin.class.getResource("/Imagens/proximo.png"));
    ImageIcon Icon_Anterior = new ImageIcon(Admin.class.getResource("/Imagens/anterior.png"));
    ImageIcon Icon_ListarFun = new ImageIcon(Admin.class.getResource("/Imagens/listarFun.png"));

    ///
    ///
    ImageIcon Icon_EscreverMenssagem = new ImageIcon(Admin.class.getResource("/Imagens/escrever-mensagem.png"));
    ImageIcon Icon_CaixaMenssagem = new ImageIcon(Admin.class.getResource("/Imagens/caixaMenssagens.png"));
    ImageIcon Icon_RelatorioMenssagem = new ImageIcon(Admin.class.getResource("/Imagens/relatorio_1.png"));
    //Icons

    ImageIcon Icon_foto = new ImageIcon(Admin.class.getResource("/Imagens/imagemGaleria.png"));
    ImageIcon Icon_foto1 = new ImageIcon(Admin.class.getResource(""));
    ImageIcon Icon_CarregarFoto = new ImageIcon(Admin.class.getResource("/Imagens/CarregarImagemF.png"));
    ImageIcon Icon_Actualizar = new ImageIcon(Admin.class.getResource("/Imagens/editar.png"));
    ImageIcon Icon_Eliminar = new ImageIcon(Admin.class.getResource("/Imagens/excluir.png"));
    ImageIcon Icon_Menssagem = new ImageIcon(Admin.class.getResource("/Imagens/mensagem.png"));

    private ImageIcon icon;
    private byte[] imagemBytes;
    Long chave = null;
    String codigo = null;
    int linha = 0;
    DefaultListModel<Funcionario> modelo = new DefaultListModel<>();

    public static long id;

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Admin.id = id;
    }

    public Admin() {
        Login l = new Login();
        l.setVisible(false);
        dispose();

        this.setSize(1200, 700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setUndecorated(true);

        JLabel lblLogo = new JLabel();
        lblLogo.setIcon(Icon_Logo);

        JMenuBar barraMenu = new JMenuBar();
        JMenu menuAdicional = new JMenu("Produtos");
        JMenu menuGestao = new JMenu("Comunicação");
        JMenu menuRelatorios = new JMenu("Relatorios");
        JMenuItem btnStock = new JMenuItem("Abastecer Produtos ");
        JMenuItem btnFornecedores = new JMenuItem("Fornecedores ");
        JMenuItem btnPromocoes = new JMenuItem("Descontos & Promoções ");
        JMenuItem btnAlocar = new JMenuItem("Alocar Funcionario");
        JMenuItem btnRelatorio_Vendas_Geral = new JMenuItem("Vendas ");
        JMenuItem btnRelatorio_Fornecedores = new JMenuItem("Fornecedores");
        JMenuItem btnRelatorio_Fun = new JMenuItem("Funcionarios");
        JMenuItem btnRelatorio_Pedidos = new JMenuItem("Pedidos");
        JMenuItem btnMenssagem = new JMenuItem("  Menssagens");
        JMenuItem btnConfiguracoes = new JMenuItem("  Configurações");

        //Personalizando a fonte
        menuAdicional.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
        menuGestao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
        btnMenssagem.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 14));
        btnConfiguracoes.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 14));
        menuRelatorios.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
        btnAlocar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 14));
        btnStock.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 14));
        btnFornecedores.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 14));
        btnPromocoes.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 14));
        btnRelatorio_Fornecedores.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 14));
        btnRelatorio_Vendas_Geral.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 14));
        btnRelatorio_Fun.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 14));
        btnRelatorio_Pedidos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 14));

        //Adicionando opcoes na barra 
        barraMenu.add(menuAdicional);
        barraMenu.add(menuGestao);
        barraMenu.add(menuRelatorios);
        menuAdicional.add(btnStock);
        menuAdicional.add(btnPromocoes);
        menuAdicional.add(btnFornecedores);

        menuRelatorios.add(btnRelatorio_Vendas_Geral);
        menuRelatorios.add(btnRelatorio_Fornecedores);
        menuRelatorios.add(btnRelatorio_Fun);
        menuRelatorios.add(btnRelatorio_Pedidos);

        menuGestao.add(btnAlocar);
        menuGestao.add(btnMenssagem);
        menuGestao.add(btnConfiguracoes);

        //Colondo icons nos botoes da barra de Menu
        btnMenssagem.setIcon(Icon_Menssagem);
        btnConfiguracoes.setIcon(Icon_Configurações);

        //Background  dos Menu Bar
        menuAdicional.setBackground(new Color(102, 102, 255));
        menuGestao.setBackground(new Color(102, 102, 255));
        btnMenssagem.setBackground(new Color(102, 102, 255));
        btnConfiguracoes.setBackground(new Color(102, 102, 255));
        menuRelatorios.setBackground(new Color(102, 102, 255));
        btnAlocar.setBackground(new Color(102, 102, 255));
        btnStock.setBackground(new Color(102, 102, 255));
        btnFornecedores.setBackground(new Color(102, 102, 255));
        btnPromocoes.setBackground(new Color(102, 102, 255));
        btnRelatorio_Fornecedores.setBackground(new Color(102, 102, 255));
        btnRelatorio_Fun.setBackground(new Color(102, 102, 255));
        btnRelatorio_Vendas_Geral.setBackground(new Color(102, 102, 255));
        btnRelatorio_Pedidos.setBackground(new Color(102, 102, 255));

        menuAdicional.setForeground(Color.white);
        menuGestao.setForeground(Color.white);
        btnMenssagem.setForeground(Color.white);
        btnConfiguracoes.setForeground(Color.white);
        menuRelatorios.setForeground(Color.white);
        btnAlocar.setForeground(Color.white);
        btnStock.setForeground(Color.white);
        btnFornecedores.setForeground(Color.white);
        btnPromocoes.setForeground(Color.white);
        btnRelatorio_Fornecedores.setForeground(Color.white);
        btnRelatorio_Fun.setForeground(Color.white);
        btnRelatorio_Vendas_Geral.setForeground(Color.white);
        btnRelatorio_Pedidos.setForeground(Color.white);

        barraMenu.setBackground(new Color(102, 102, 255));

        JPanel pnlPrincipal = new JPanel();
        JPanel pnlauxPrincipal = new JPanel();

        pnlPrincipal.setLayout(null);
        pnlauxPrincipal.setLayout(null);

        pnlauxPrincipal.setBounds(0, 0, 1200, 680);
        pnlPrincipal.setBounds(280, 0, 920, 680);
        lblLogo.setBounds(0, 0, 920, 660);
        pnlauxPrincipal.setBackground(Color.white);

        //Criando estancias dos paineis
        JPanel pnlMenu_Botoes = new JPanel();

        //Dando Cordenadas aos paineis
        pnlMenu_Botoes.setBounds(0, 0, 280, 700);

        //Definido o Layout dos paineis
        pnlMenu_Botoes.setLayout(null);

        //Personalizando o Background dos paineis
        pnlMenu_Botoes.setBackground(new Color(102, 102, 255));

        //Criando instancias da Labels que irei colocar para definir o perfil
        JLabel lblFoto = new JLabel();
        JLabel lblNomefuncionario = new JLabel();
        JLabel lblFormacao = new JLabel();
        JTextField txtbarra = new JTextField();

        txtbarra.setBounds(5, 240, 255, 1);
        lblFoto.setBounds(5, 70, 150, 150);
        lblNomefuncionario.setBounds(155, 135, 280, 30);
        lblFormacao.setBounds(180, 125, 280, 100);
        lblNomefuncionario.setText("Holy Man");
        lblFormacao.setText("Gerente");
        lblFormacao.setForeground(Color.white);
        lblNomefuncionario.setForeground(Color.white);
        lblNomefuncionario.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
        lblFormacao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 12));

        //Criando instancias dos botoes da tela Admin
        JButton btnMeuPerfil = new JButton("   Meu Perfil");
        JButton btnGestao_Produtos = new JButton(" Categorias & Produtos");
        JButton btnGestao_Funcionarios = new JButton("  Funcionarios");
        JButton btnVisaoGeral = new JButton("  Visão Geral");
        JButton btnVoltar = new JButton("   Voltar");

        //Personalizando o Foreground dos botoes
        btnGestao_Produtos.setForeground(Color.white);
        btnGestao_Funcionarios.setForeground(Color.white);
        btnVisaoGeral.setForeground(Color.white);
        btnMeuPerfil.setForeground(Color.white);
        btnVoltar.setForeground(Color.white);

        //Personalizando o Background dos Botoes
        btnGestao_Produtos.setBackground(new Color(102, 102, 255));
        btnGestao_Funcionarios.setBackground(new Color(102, 102, 255));
        btnVisaoGeral.setBackground(new Color(102, 102, 255));
        btnMeuPerfil.setBackground(new Color(102, 102, 255));
        btnVoltar.setBackground(new Color(102, 102, 255));

        //Personalizando a Borda dos Botoes
        btnGestao_Produtos.setBorder(BorderFactory.createEmptyBorder());
        btnGestao_Produtos.setFocusPainted(false);
        btnGestao_Funcionarios.setBorder(BorderFactory.createEmptyBorder());
        btnGestao_Funcionarios.setFocusPainted(false);
        btnVisaoGeral.setBorder(BorderFactory.createEmptyBorder());
        btnVisaoGeral.setFocusPainted(false);
        btnMeuPerfil.setBorder(BorderFactory.createEmptyBorder());
        btnMeuPerfil.setFocusPainted(false);
        btnVoltar.setBorder(BorderFactory.createEmptyBorder());
        btnVoltar.setFocusPainted(false);

        //Personalizando a Fonte
        btnGestao_Produtos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
        btnGestao_Funcionarios.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
        btnVisaoGeral.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
        btnMeuPerfil.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
        btnVoltar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));

        //Colocando Icon
        lblFoto.setIcon(Icon_Admin);
        btnMeuPerfil.setIcon(Icon_Perfil);
        btnVoltar.setIcon(Icon_Voltar);
        btnGestao_Funcionarios.setIcon(Icon_Gestao_Funcionario);
        btnGestao_Produtos.setIcon(Icon_Produtos_Categoria);
        btnVisaoGeral.setIcon(Icon_VisaoGeral);

        //Dando Cordenadas aos Botoes
        btnGestao_Produtos.setBounds(3, 250, 260, 40);
        btnGestao_Funcionarios.setBounds(6, 310, 170, 40);
        btnVisaoGeral.setBounds(6, 380, 160, 40);
        btnMeuPerfil.setBounds(6, 450, 145, 40);
        btnVoltar.setBounds(6, 520, 110, 40);

        //Adicionando as  Compomentes ao painel 
        pnlMenu_Botoes.add(txtbarra);
        pnlMenu_Botoes.add(lblFoto);
        pnlMenu_Botoes.add(lblFormacao);
        pnlMenu_Botoes.add(lblNomefuncionario);
        pnlMenu_Botoes.add(btnGestao_Produtos);
        pnlMenu_Botoes.add(btnGestao_Funcionarios);
        pnlMenu_Botoes.add(btnVisaoGeral);
        pnlMenu_Botoes.add(btnMeuPerfil);
        pnlMenu_Botoes.add(btnVoltar);

        //Instancia do objecto da classe dAO QUE TRAZ O METODO necessario para trazer tudo sobre o funcionario
        DAO_Funcionario dao_fun = new DAO_Funcionario();
        Funcionario fun = new Funcionario();
        //Pegando o id
        fun.setId(l.getId());

        // Chamando o metodo e atribuindo os dados a uma lista_Fun
        ArrayList<Funcionario> lista = dao_fun.Find_Fun(fun);

        //Neste é onde colocamos a imagem e o nome do Funcionario
        for (Funcionario i : lista) {

            byte[] img = i.getFoto();
            BufferedImage imagem = null;
            try {
                imagem = ImageIO.read(new ByteArrayInputStream(img));
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            ImageIcon Icone = new ImageIcon(imagem.getScaledInstance(150, 150, Image.SCALE_SMOOTH));

            lblNomefuncionario.setText(i.getNome());
            lblFoto.setIcon(Icone);

        }

        // Criando Instancias de paineis a serem usados  nos botoes abaixos
        JPanel pnlGestao_Funcionarios = new JPanel();
        JPanel pnlVisaoGeral = new JPanel();
        JPanel pnlMenssagens = new JPanel();
        JPanel pnlConfiguracoes = new JPanel();
        JPanel pnlMeuPerfil = new JPanel();

        // Dando visibilidade inicial
        pnlGestao_Funcionarios.setVisible(false);
        pnlVisaoGeral.setVisible(false);
        pnlMenssagens.setVisible(false);
        pnlConfiguracoes.setVisible(false);
        pnlMeuPerfil.setVisible(false);

        //Background
        pnlGestao_Funcionarios.setBackground(Color.white);
        pnlVisaoGeral.setBackground(Color.white);
        pnlMenssagens.setBackground(Color.white);
        pnlConfiguracoes.setBackground(Color.white);

        btnMeuPerfil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlPrincipal.setVisible(true);
                pnlGestao_Funcionarios.setVisible(false);
                pnlVisaoGeral.setVisible(false);
                pnlConfiguracoes.setVisible(false);
                pnlMenssagens.setVisible(false);
                pnlMenu_Botoes.setVisible(false);

                pnlMeuPerfil.setBounds(0, 0, 280, 700);
                pnlMeuPerfil.setBackground(new Color(102, 102, 255));
                pnlMeuPerfil.setLayout(null);

                pnlPrincipal.setBounds(280, 0, 920, 700);

                //Declarando as componentes
                JLabel lblApelido = new JLabel();
                JLabel lblNomeFuncionario = new JLabel();
                JLabel lblGenero = new JLabel();
                JLabel lblData_Nascimento = new JLabel();
                JLabel lblNumeroBI = new JLabel();
                JLabel lblEmail = new JLabel();
                JLabel lblContacto = new JLabel();
                JLabel lblestado = new JLabel();
                JTextField txtbarra1 = new JTextField();
                JButton btnSair2 = new JButton("  Voltar");

                //Neste passo Continuo com a lista_Fun, mas somente vou colocar os dados referente ao funcionario
                JLabel lblFotografia = new JLabel();

                for (Funcionario i : lista) {
                    byte[] img = i.getFoto();
                    BufferedImage imagem = null;
                    try {
                        imagem = ImageIO.read(new ByteArrayInputStream(img));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                    ImageIcon Icone = new ImageIcon(imagem.getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                    lblFotografia.setIcon(Icone);

                    lblApelido.setText("Apelido :  " + i.getApelido());
                    lblNomeFuncionario.setText("Nome : " + i.getNome());
                    lblGenero.setText("Genero : " + i.getGenero());
                    lblData_Nascimento.setText("Data de Nascimento : " + i.getData_nascimento());
                    lblNumeroBI.setText("Numero de BI : " + i.getNumero_BI_Nuit());
                    lblEmail.setText("Email: " + i.getEmail());
                    lblContacto.setText("Contacto : " + i.getContacto());
                    lblestado.setText("Estado : " + i.getEstado());

                }

                //Comando para mudar o Foreground (cor das letras)
                lblApelido.setForeground(Color.white);
                lblNomeFuncionario.setForeground(Color.white);
                lblGenero.setForeground(Color.white);
                lblData_Nascimento.setForeground(Color.white);
                lblNumeroBI.setForeground(Color.white);
                lblEmail.setForeground(Color.white);
                lblContacto.setForeground(Color.white);
                lblestado.setForeground(Color.white);

                // Reajustando a posicao das componentes criadas
                lblFotografia.setBounds(45, 70, 180, 180);
                lblApelido.setBounds(30, 251, 280, 30);
                lblNomeFuncionario.setBounds(30, 291, 280, 30);
                lblGenero.setBounds(30, 331, 280, 30);
                lblData_Nascimento.setBounds(30, 371, 280, 30);
                lblNumeroBI.setBounds(30, 411, 280, 30);
                lblEmail.setBounds(30, 451, 280, 30);
                lblContacto.setBounds(30, 491, 280, 30);
                lblestado.setBounds(30, 531, 280, 30);
                txtbarra1.setBounds(30, 231, 205, 1);
                btnSair2.setBounds(10, 591, 140, 30);

                // Personalizando o botao voltar
                btnSair2.setBorder(BorderFactory.createEmptyBorder());
                btnSair2.setFocusPainted(false);

                btnSair2.setBackground(new Color(102, 102, 255));
                btnSair2.setForeground(Color.white);

                //Colocando Icon nos botoes
                btnSair2.setIcon(Icon_Voltar);

                //Personalizando a fonte da labels
                lblApelido.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                lblNomeFuncionario.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                lblGenero.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                lblData_Nascimento.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                lblNumeroBI.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                lblEmail.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                lblContacto.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                lblestado.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                btnSair2.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));

                //Adicionando todas componentes ao painel
                pnlMeuPerfil.add(lblFotografia);
                pnlMeuPerfil.add(lblApelido);
                pnlMeuPerfil.add(lblNomeFuncionario);
                pnlMeuPerfil.add(lblGenero);
                pnlMeuPerfil.add(lblData_Nascimento);
                pnlMeuPerfil.add(lblNumeroBI);
                pnlMeuPerfil.add(lblEmail);
                pnlMeuPerfil.add(lblContacto);
                pnlMeuPerfil.add(lblestado);
                pnlMeuPerfil.add(txtbarra1);
                pnlMeuPerfil.add(btnSair2);
                pnlauxPrincipal.add(pnlMeuPerfil);
                pnlauxPrincipal.add(pnlPrincipal);
                pnlMeuPerfil.setVisible(true);

                // dando acção ao botao para voltar
                btnSair2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pnlMeuPerfil.setVisible(false);
                        pnlMenu_Botoes.setVisible(true);
                    }
                });

            }
        });

        // dando acção ao botao Gestao de Produtos
        btnGestao_Produtos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlPrincipal.setVisible(true);
                pnlGestao_Funcionarios.setVisible(false);
                pnlVisaoGeral.setVisible(false);
                pnlMenssagens.setVisible(false);
                pnlConfiguracoes.setVisible(false);
                pnlMeuPerfil.setVisible(false);
                pnlMenu_Botoes.setVisible(false);

                JPanel pnlMenu_Gestaoprodutos = new JPanel();
                pnlMenu_Gestaoprodutos.setLayout(null);
                //
                pnlMenu_Gestaoprodutos.setBackground(new Color(102, 102, 255));
                pnlMenu_Gestaoprodutos.setBounds(0, 0, 280, 680);

                pnlPrincipal.setBounds(280, 40, 920, 680);

                JButton btnGerirCategorias = new JButton("Gerir Categorias");
                JButton btnGerirProdutos = new JButton("Gerir Produtos");
                JButton btnRelatorio = new JButton("Electrodomesticos");
                JButton btnVoltarPrincipal = new JButton("Voltar");

                JTextField txtbarra2 = new JTextField();
                JLabel lblFotografia = new JLabel();

                // Colocando a imagem de perfil
                for (Funcionario i : lista) {

                    byte[] img = i.getFoto();
                    BufferedImage imagem = null;
                    try {
                        imagem = ImageIO.read(new ByteArrayInputStream(img));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                    ImageIcon Icone = new ImageIcon(imagem.getScaledInstance(150, 150, Image.SCALE_SMOOTH));

                    lblNomefuncionario.setText(i.getNome());
                    lblFotografia.setIcon(Icone);

                }
                btnGerirProdutos.setIcon(Icon_Gerir_Produtos);

                lblFotografia.setBounds(45, 70, 180, 180);
                txtbarra2.setBounds(45, 251, 180, 1);
                btnGerirCategorias.setBounds(20, 281, 240, 40);
                btnGerirProdutos.setBounds(13, 351, 240, 40);
                btnRelatorio.setBounds(23, 421, 240, 40);
                btnVoltarPrincipal.setBounds(15, 491, 150, 40);

                btnGerirCategorias.setBackground(new Color(102, 102, 255));
                btnGerirProdutos.setBackground(new Color(102, 102, 255));
                btnRelatorio.setBackground(new Color(102, 102, 255));
                btnVoltarPrincipal.setBackground(new Color(102, 102, 255));

                btnGerirCategorias.setForeground(Color.white);
                btnGerirProdutos.setForeground(Color.white);
                btnRelatorio.setForeground(Color.white);
                btnVoltarPrincipal.setForeground(Color.white);

                btnGerirCategorias.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                btnGerirProdutos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                btnRelatorio.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                btnVoltarPrincipal.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));

                btnVoltarPrincipal.setBorder(BorderFactory.createEmptyBorder());
                btnVoltarPrincipal.setFocusPainted(false);
                btnGerirCategorias.setBorder(BorderFactory.createEmptyBorder());
                btnGerirCategorias.setFocusPainted(false);
                btnGerirProdutos.setBorder(BorderFactory.createEmptyBorder());
                btnGerirProdutos.setFocusPainted(false);
                btnRelatorio.setBorder(BorderFactory.createEmptyBorder());
                btnRelatorio.setFocusPainted(false);

                // Criando instancia dos paineis que vou usar
                JPanel pnlGeirCategorias = new JPanel();
                JPanel pnlGerirProdutos = new JPanel();
                JPanel pnlGeirRelatorio = new JPanel();

                btnGerirCategorias.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pnlPrincipal.setVisible(false);
                        pnlGerirProdutos.setVisible(false);
                        pnlGestao_Funcionarios.setVisible(false);
                        pnlVisaoGeral.setVisible(false);
                        pnlMenssagens.setVisible(false);
                        pnlGeirRelatorio.setVisible(false);

                        pnlGeirCategorias.setBackground(Color.white);
                        pnlGeirCategorias.setLayout(null);
                        pnlGeirCategorias.setBounds(280, 0, 920, 680);

                        //Neste passo, vou criar instancias dos objectos que vou usar.
                        JLabel lblTitulo = new JLabel("Gestão de Categorias");
                        JLabel lblFoto = new JLabel();
                        JLabel lblNome = new JLabel("Nome ");
                        JLabel lblData = new JLabel("Data");
                        JLabel lblSattusCategoria = new JLabel("Status");

                        JTextField txtNome = new JTextField();
                        JComboBox jcStatusCategoria = new JComboBox();
                        JDateChooser data = new JDateChooser();

                        jcStatusCategoria.setBackground(Color.white);

                        jcStatusCategoria.addItem("");
                        jcStatusCategoria.addItem("Activo");
                        jcStatusCategoria.addItem("Inactivo");

                        JButton btnCarregarImagem = new JButton("Carregar IMG");
                        JButton btnCadastrar = new JButton("Adicionar");
                        JButton btnActualizar = new JButton("Actualizar");
                        JButton btnEliminar = new JButton("Eliminar");
                        JButton btnActivar = new JButton("Activar");

                        String[] Colunas = {"Codigo", "Nome ", "Data", "Estado"};
                        DefaultTableModel model = new DefaultTableModel(Colunas, 0);

                        JTable Lista_Categorias = new JTable(model);
                        JTableHeader header_Lista = Lista_Categorias.getTableHeader();
                        Lista_Categorias.getColumnModel().getColumn(0).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());
                        Lista_Categorias.getColumnModel().getColumn(1).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());
                        Lista_Categorias.getColumnModel().getColumn(2).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());
                        Lista_Categorias.getColumnModel().getColumn(3).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());

                        //Personalizando a Linhas_Colunas
                        header_Lista.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        header_Lista.setForeground(new Color(102, 102, 255));
                        Lista_Categorias.setShowGrid(false);

                        Lista_Categorias.setRowHeight(30);

                        JScrollPane rol = new JScrollPane(Lista_Categorias);

                        // Adicionando Icon    
                        lblFoto.setIcon(Icon_Foto);
                        btnCarregarImagem.setIcon(Icon_CarregarFoto);
                        btnEliminar.setIcon(Icon_Eliminar);
                        btnCadastrar.setIcon(Icon_Adicionar);
                        btnActivar.setIcon(Icon_Adicionar);
                        btnActualizar.setIcon(Icon_ActualizarC);

                        //Aqui vou definir a cor das letras
                        lblTitulo.setForeground(new Color(0, 102, 255));
                        lblNome.setForeground(new Color(102, 102, 255));
                        lblData.setForeground(new Color(102, 102, 255));
                        lblSattusCategoria.setForeground(new Color(102, 102, 255));
                        btnCarregarImagem.setForeground(new Color(0, 102, 255));
                        btnCadastrar.setForeground(new Color(0, 102, 255));
                        btnActualizar.setForeground(new Color(0, 102, 255));
                        btnEliminar.setForeground(new Color(0, 102, 255));
                        btnActivar.setForeground(new Color(0, 102, 255));

                        //Aqui vou definir a fonte
                        lblTitulo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 22));
                        lblNome.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        lblData.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        lblSattusCategoria.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        btnCarregarImagem.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnCadastrar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnActualizar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnActivar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnEliminar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        txtNome.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        data.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        jcStatusCategoria.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));

                        btnCarregarImagem.setBorder(BorderFactory.createEmptyBorder());
                        btnCarregarImagem.setFocusPainted(false);
                        btnCadastrar.setBorder(BorderFactory.createEmptyBorder());
                        btnCadastrar.setFocusPainted(false);
                        btnActualizar.setBorder(BorderFactory.createEmptyBorder());
                        btnActualizar.setFocusPainted(false);
                        btnEliminar.setBorder(BorderFactory.createEmptyBorder());
                        btnEliminar.setFocusPainted(false);
                        btnActivar.setBorder(BorderFactory.createEmptyBorder());
                        btnActivar.setFocusPainted(false);

                        //Background
                        btnCarregarImagem.setBackground(Color.white);
                        btnCadastrar.setBackground(Color.white);
                        btnActualizar.setBackground(Color.white);
                        btnEliminar.setBackground(Color.white);
                        btnActivar.setBackground(Color.white);

                        //aqui vou configurar a localizacao
                        lblTitulo.setBounds(340, 30, 350, 30);
                        lblFoto.setBounds(350, 145, 225, 150);
                        lblNome.setBounds(110, 120, 200, 30);
                        txtNome.setBounds(110, 150, 200, 35);
                        lblData.setBounds(110, 190, 200, 30);
                        data.setBounds(110, 220, 200, 35);
                        lblSattusCategoria.setBounds(110, 260, 200, 35);
                        jcStatusCategoria.setBounds(110, 290, 200, 35);
                        btnCarregarImagem.setBounds(405, 300, 150, 30);
                        btnCadastrar.setBounds(650, 133, 120, 40);
                        btnActualizar.setBounds(654, 180, 120, 40);
                        btnEliminar.setBounds(648, 230, 120, 40);
                        btnActivar.setBounds(653, 280, 100, 40);
                        rol.setBounds(110, 390, 680, 200);

                        //Colocando a visibilidade inicial
                        data.setEnabled(false);
                        jcStatusCategoria.setEnabled(false);
                        btnCadastrar.setEnabled(false);
                        btnCarregarImagem.setEnabled(false);
                        btnActualizar.setEnabled(false);
                        btnEliminar.setEnabled(false);
                        btnActivar.setEnabled(false);

                        //Eventos em cada Campo a ser Introduzido Dados 
                        txtNome.addKeyListener(new KeyListener() {
                            @Override
                            public void keyTyped(KeyEvent e) {

                            }

                            @Override
                            public void keyPressed(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
                                    txtNome.setEditable(true);
                                } else {
                                    txtNome.setEditable(false);
                                }

                            }

                            @Override
                            public void keyReleased(KeyEvent e) {
                                //Pegando o tamanho do texto
                                int comprimentoTexto = txtNome.getText().length();

                                // Define a cor da borda com base no comprimento do texto
                                Color cor = (comprimentoTexto < 5) ? Color.RED : Color.GREEN;

                                // Cria uma borda com a cor desejada
                                Border bordaColorida = BorderFactory.createLineBorder(cor);

                                // Aplica a borda ao campo de texto
                                txtNome.setBorder(bordaColorida);

                                // Permitindo com que o campo seguinte seja aberto assim como nao
                                if (cor.equals(Color.GREEN)) {
                                    data.setEnabled(true);
                                    jcStatusCategoria.setEnabled(true);
                                } else {
                                    data.setEnabled(false);
                                    jcStatusCategoria.setEnabled(false);
                                    btnCadastrar.setEnabled(false);
                                    jcStatusCategoria.setSelectedIndex(0);
                                }

                                txtNome.addFocusListener(new FocusListener() {
                                    @Override
                                    public void focusGained(FocusEvent e) {

                                    }

                                    @Override
                                    public void focusLost(FocusEvent e) {

                                        // Restaura a borda padrão quando o campo perde o foco
                                        txtNome.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                    }
                                });

                            }
                        });

                        //Validadando a  caixa Status
                        jcStatusCategoria.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                if (jcStatusCategoria.getSelectedIndex() == 1) {
                                    btnCarregarImagem.setEnabled(true);
                                    btnCadastrar.setEnabled(true);
                                } else if (jcStatusCategoria.getSelectedIndex() == 2) {
                                    btnCadastrar.setEnabled(true);
                                    btnCarregarImagem.setEnabled(true);
                                } else {

                                    btnCadastrar.setEnabled(false);
                                    btnCarregarImagem.setEnabled(false);
                                }
                            }

                        });

                        //Farei o metodo que vai buscar os dados e colocar na  tabela 
                        Controller_Categoria c_Categoria = new Controller_Categoria();
                        DAO_Categoria dao_c = new DAO_Categoria();

                        ArrayList<Categorias> lista = dao_c.FindAll_Categoria();

                        int tamanho;

                        if (lista == null) {
                            tamanho = 0;
                            JOptionPane.showMessageDialog(null, "Nao existe categoria cadastrada ainda!");

                        } else {
                            tamanho = lista.size();

                            for (Categorias i : lista) {
                                Object[] row = new Object[4];

                                row[0] = i.getCodigoCategoria();
                                row[1] = i.getNome_categoria();
                                row[2] = i.getData_cadastro();
                                row[3] = i.getStatus();
                                model.addRow(row);

                            }//Fim do for loop

                        }
                        // Dando Evento a tabela de Categorias 
                        Lista_Categorias.addMouseListener(new MouseListener() {
                            @Override
                            public void mouseClicked(MouseEvent e) {

                                btnCadastrar.setEnabled(false);
                                btnActualizar.setEnabled(true);
                                btnEliminar.setEnabled(true);
                                btnActivar.setEnabled(true);
                                btnCarregarImagem.setEnabled(true);

                                txtNome.setEnabled(true);
                                jcStatusCategoria.setEnabled(false);

                                linha = Lista_Categorias.getSelectedRow();

                                codigo = (String) Lista_Categorias.getModel().getValueAt(Lista_Categorias.getSelectedRow(), 0);
                                txtNome.setText((String) Lista_Categorias.getModel().getValueAt(Lista_Categorias.getSelectedRow(), 1));
                                data.setDate((Date) Lista_Categorias.getModel().getValueAt(Lista_Categorias.getSelectedRow(), 2));
                                jcStatusCategoria.setSelectedItem((String) Lista_Categorias.getModel().getValueAt(Lista_Categorias.getSelectedRow(), 3));

                                for (int i = 0; i < lista.size(); i++) {

                                    if (lista.get(i).getCodigoCategoria().equalsIgnoreCase(codigo)) {

                                        byte[] img = lista.get(i).getImagem();
                                        BufferedImage imagem = null;
                                        try {
                                            imagem = ImageIO.read(new ByteArrayInputStream(img));
                                        } catch (IOException ex) {
                                            JOptionPane.showMessageDialog(null, "Erro ao Converter a Imagem " + ex.getMessage());
                                        }

                                        ImageIcon Icone = new ImageIcon(imagem.getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                                        lblFoto.setIcon(null);
                                        lblFoto.setIcon(Icone);
                                        lblFoto.setBounds(407, 145, 225, 150);

                                    }
                                }
                            }

                            @Override
                            public void mousePressed(MouseEvent e) {

                            }

                            @Override
                            public void mouseReleased(MouseEvent e) {

                            }

                            @Override
                            public void mouseEntered(MouseEvent e) {

                            }

                            @Override
                            public void mouseExited(MouseEvent e) {

                            }

                        });
                        //Acção para cada um dos botoes
                        btnCadastrar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                Controller_Categoria c = new Controller_Categoria();
                                String codigo = "CATSM" + 1000 + tamanho + "HM";
                                String nome = txtNome.getText();

                                java.util.Date data_cadastro = data.getDate();

                                java.sql.Date data2 = new java.sql.Date(data_cadastro.getTime());

                                String estado = (String) jcStatusCategoria.getSelectedItem();

                                byte[] img = imagemBytes;

                                c.Verificacao_Save(codigo, nome, data2, img, estado);
                            }
                        });

                        //carregar img
                        btnCarregarImagem.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                //Criando uma instancia da classe Controller 
                                Controller_Categoria c_categoria = new Controller_Categoria();

                                //Pegando o metodo que me Permiti pegar uma imagem
                                imagemBytes = c_categoria.CarregarImagem(lblFoto);
                                icon = new ImageIcon(imagemBytes);
                                lblFoto.setIcon(icon);
                                lblFoto.updateUI();
                                lblFoto.setBounds(407, 145, 225, 150);

                            }
                        });

                        //Actualizar
                        btnActualizar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                Controller_Categoria c = new Controller_Categoria();

                                String nome = txtNome.getText();

                                java.util.Date data_cadastro = data.getDate();

                                java.sql.Date data2 = new java.sql.Date(data_cadastro.getTime());

                                byte[] img = imagemBytes;

                                if (img == null) {
                                    for (Categorias i : lista) {
                                        if (i.getCodigoCategoria().equals(codigo)) {
                                            img = i.getImagem();
                                        }
                                    }

                                }

                                c.Verificacao_Update(codigo, nome, data2, img);
                            }

                        });
                        //Eliminar
                        btnEliminar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                DAO_Categoria dao_c = new DAO_Categoria();
                                Categorias c = new Categorias();
                                if (codigo == null) {
                                    JOptionPane.showMessageDialog(null, "Primeiro selecione um funcionario na tabela");
                                } else {
                                    c.setCodigoCategoria(codigo);

                                    c.setStatus("Inactivo");

                                    dao_c.Estado_Categoria(c);
                                }

                            }
                        });

                        btnActivar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                DAO_Categoria dao_c = new DAO_Categoria();
                                Categorias c = new Categorias();
                                if (codigo == null) {
                                    JOptionPane.showMessageDialog(null, "Primeiro selecione um funcionario na tabela");
                                } else {
                                    c.setCodigoCategoria(codigo);

                                    c.setStatus("Activo");

                                    dao_c.Estado_Categoria(c);
                                }

                            }
                        });

                        //Aqui vou adicionar as componentes
                        pnlGeirCategorias.add(lblTitulo);
                        pnlGeirCategorias.add(lblFoto);
                        pnlGeirCategorias.add(lblNome);
                        pnlGeirCategorias.add(txtNome);
                        pnlGeirCategorias.add(lblData);
                        pnlGeirCategorias.add(data);
                        pnlGeirCategorias.add(lblSattusCategoria);
                        pnlGeirCategorias.add(jcStatusCategoria);
                        pnlGeirCategorias.add(btnCarregarImagem);
                        pnlGeirCategorias.add(btnCadastrar);
                        pnlGeirCategorias.add(btnActualizar);
                        pnlGeirCategorias.add(btnEliminar);
                        pnlGeirCategorias.add(btnActivar);
                        pnlGeirCategorias.add(rol);

                        // Dando Acção aos Botoes
                        pnlGeirCategorias.setVisible(true);

                    }
                }); //Gerir Categorias

                //Produtos
                btnGerirProdutos.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pnlPrincipal.setVisible(false);
                        pnlGeirCategorias.setVisible(false);
                        pnlGestao_Funcionarios.setVisible(false);
                        pnlVisaoGeral.setVisible(false);
                        pnlMenssagens.setVisible(false);
                        pnlMeuPerfil.setVisible(false);

                        pnlGerirProdutos.setBackground(Color.white);
                        pnlGerirProdutos.setLayout(null);
                        pnlGerirProdutos.setBounds(280, 0, 920, 680);

                        //Craindo as Componentes
                        JLabel lblTitulo = new JLabel("Gerir Produtos");
                        JLabel lblFoto = new JLabel();
                        JLabel lblCategoria_Produto = new JLabel("Categoria do Produto");
                        JLabel lblNome = new JLabel("Nome do Produto");
                        JLabel lblCodigo_Barra = new JLabel("Codigo de Barra");
                        JLabel lblValidade = new JLabel("Validade");
                        JLabel lblNumero_Lote = new JLabel("Numero do Lote");
                        JLabel lblEmbalagem_Nao = new JLabel("Tipo de produto");
                        JLabel lnlQuantidade_Embalagens = new JLabel("Quantidade de Embalagens");
                        JLabel lblProdutos = new JLabel("Produtos por Embalagem");
                        JLabel lblQuantidade_Produtos = new JLabel("Quantidade a Adicionar");
                        JLabel lblStatus = new JLabel("Status do Produto");
                        JLabel lblMarca = new JLabel("Marca do Produto");
                        JLabel lblUnidade_Medida = new JLabel("Unidade Medida");
                        JLabel lblPeso_Volume = new JLabel("Peso ou Volume");
                        JLabel lblPreco_Compra = new JLabel("Preço de Compra");
                        JLabel lblPreco_Venda = new JLabel("Preço de Venda");
                        JLabel lblDescricao = new JLabel("Descrição do Produto");

                        JComboBox jcCategoria_Produto = new JComboBox();
                        JTextField txtNome = new JTextField();
                        JTextField txtCodigo_Barra = new JTextField();
                        JDateChooser txtValidade = new JDateChooser();
                        JTextField txtNumero_Lote = new JTextField();
                        JComboBox jcEmbalado = new JComboBox();
                        JTextField txtQntEmbalagem = new JTextField();
                        JTextField txtProdutos_Embalagem = new JTextField();
                        JComboBox txtStatus = new JComboBox();
                        JTextField txtProdutosQtd = new JTextField();
                        JTextField txtMarca = new JTextField();
                        JComboBox jcMedida = new JComboBox();
                        JTextField txtPeso_Volume = new JTextField();
                        JTextField txtPreco_Compra = new JTextField();
                        JTextField txtPreco_Venda = new JTextField();
                        JTextArea txtDescricao = new JTextArea();
                        
                        txtDescricao.setWrapStyleWord(true);
                        txtDescricao.setLineWrap(true);
                        JScrollPane scrtxtDescricao = new JScrollPane(txtDescricao);

                        JButton btnCarregarFoto = new JButton("Carregar IMG");
                        JButton btnActualizar = new JButton("Actualizar");
                        JButton btnActivar = new JButton("Activar");
                        JButton btnCadastrar = new JButton("Adicionar");
                        JButton btnProcurar = new JButton("procurar");
                        JButton btnEliminar = new JButton("Eliminar");

                        //Foreground
                        lblTitulo.setForeground(new Color(102, 102, 255));

                        //Cordenadas
                        lblTitulo.setBounds(350, 0, 350, 30);

                        lblCategoria_Produto.setBounds(10, 50, 200, 30);
                        jcCategoria_Produto.setBounds(10, 80, 200, 35);

                        lblNome.setBounds(10, 115, 200, 30);
                        txtNome.setBounds(10, 145, 200, 35);

                        lblNumero_Lote.setBounds(10, 185, 200, 30);
                        txtNumero_Lote.setBounds(10, 215, 200, 35);

                        lblCodigo_Barra.setBounds(10, 255, 200, 30);
                        txtCodigo_Barra.setBounds(10, 285, 200, 35);

                        lblValidade.setBounds(10, 325, 200, 30);
                        txtValidade.setBounds(10, 355, 200, 35);

                        lblEmbalagem_Nao.setBounds(240, 50, 200, 30);
                        jcEmbalado.setBounds(240, 80, 200, 35);

                        lnlQuantidade_Embalagens.setBounds(240, 115, 200, 30);
                        txtQntEmbalagem.setBounds(240, 145, 200, 35);

                        lblProdutos.setBounds(240, 185, 200, 30);
                        txtProdutos_Embalagem.setBounds(240, 215, 200, 35);

                        lblQuantidade_Produtos.setBounds(240, 255, 200, 30);
                        txtProdutosQtd.setBounds(240, 285, 200, 35);

                        lblStatus.setBounds(240, 325, 200, 30);
                        txtStatus.setBounds(240, 355, 200, 35);

                        lblMarca.setBounds(470, 50, 200, 30);
                        txtMarca.setBounds(470, 80, 200, 35);

                        lblUnidade_Medida.setBounds(470, 115, 200, 30);
                        jcMedida.setBounds(470, 145, 200, 35);

                        lblPeso_Volume.setBounds(470, 185, 200, 30);
                        txtPeso_Volume.setBounds(470, 215, 200, 35);

                        lblPreco_Compra.setBounds(470, 255, 200, 30);
                        txtPreco_Compra.setBounds(470, 285, 200, 35);

                        lblPreco_Venda.setBounds(470, 325, 200, 30);
                        txtPreco_Venda.setBounds(470, 355, 200, 35);

                        lblDescricao.setBounds(700, 50, 200, 30);
                        txtDescricao.setBounds(700, 80, 200, 100);

                        lblFoto.setBounds(670, 210, 225, 150);
                        btnCarregarFoto.setBounds(714, 365, 175, 30);
                        btnCadastrar.setBounds(5, 410, 120, 40);
                        btnActualizar.setBounds(150, 410, 120, 40);
                        btnEliminar.setBounds(295, 410, 100, 40);
                        btnActivar.setBounds(395, 410, 100, 40);

                        //cOLOCANDO AS INFORMACOES NAS CAIXAS
                        jcCategoria_Produto.addItem("");
                        jcCategoria_Produto.setBackground(Color.WHITE);

                        jcEmbalado.addItem("");
                        jcEmbalado.addItem("Embalado");
                        jcEmbalado.addItem("Não Embalado");
                        jcEmbalado.setBackground(Color.white);

                        jcMedida.setBackground(Color.white);
                        jcMedida.addItem("");
                        jcMedida.addItem("Quilogramas (Kg)");
                        jcMedida.addItem("Litros (L)");

                        txtStatus.setBackground(Color.white);
                        txtStatus.addItem("");
                        txtStatus.addItem("Activo");
                        txtStatus.addItem("Inactivo");

                        //Definindo a Visibilidade
                        txtQntEmbalagem.setEnabled(false);
                        txtProdutosQtd.setEnabled(false);
                        txtProdutos_Embalagem.setEnabled(false);

                        //Personalizando a fonte
                        lblTitulo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 24));
                        lblCategoria_Produto.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        lblNome.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        lblCodigo_Barra.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        lblValidade.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        lblNumero_Lote.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        lblEmbalagem_Nao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        lnlQuantidade_Embalagens.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        lblProdutos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        lblStatus.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        lblQuantidade_Produtos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        lblMarca.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        lblUnidade_Medida.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        lblPeso_Volume.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        lblPreco_Compra.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        lblPreco_Venda.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        lblDescricao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        btnCarregarFoto.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnActualizar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnActivar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnCadastrar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnEliminar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnProcurar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));

                        // Neste passo, vou definir o tamanho e a fonte do conteudo a ser digitado.
                        jcCategoria_Produto.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtNome.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtCodigo_Barra.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtValidade.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtNumero_Lote.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        jcEmbalado.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtQntEmbalagem.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtProdutos_Embalagem.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtProdutosQtd.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtStatus.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtMarca.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        jcMedida.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtPeso_Volume.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtPreco_Compra.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtPreco_Venda.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtDescricao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));

                        lblFoto.setIcon(Icon_foto);

                        btnActualizar.setIcon(Icon_ActualizarC);
                        btnCadastrar.setIcon(Icon_Adicionar);
                        btnCarregarFoto.setIcon(Icon_CarregarFoto);
                        btnEliminar.setIcon(Icon_Eliminar);

                        //Personalizando as Bordas das componentes
                        btnCarregarFoto.setBorder(BorderFactory.createEmptyBorder());
                        btnCarregarFoto.setFocusPainted(false);
                        btnActualizar.setBorder(BorderFactory.createEmptyBorder());
                        btnActualizar.setFocusPainted(false);
                        btnActivar.setBorder(BorderFactory.createEmptyBorder());
                        btnActivar.setFocusPainted(false);
                        btnCadastrar.setBorder(BorderFactory.createEmptyBorder());
                        btnCadastrar.setFocusPainted(false);
                        btnEliminar.setBorder(BorderFactory.createEmptyBorder());
                        btnEliminar.setFocusPainted(false);
                        btnProcurar.setBorder(BorderFactory.createEmptyBorder());
                        btnProcurar.setFocusPainted(false);
                        txtDescricao.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));

                        // Criando a tabela 
                        String[] Colunas_Compras = {"Codigo", "Produto", "Total_Investido", "Lucro_unt", "Total_Lucro", "Total_Retorno", "Qtd_Disp", "Status"};

                        DefaultTableModel tabela_produtos = new DefaultTableModel(Colunas_Compras, 0);

                        // Criando as Tabelas/Listas
                        JTable Lista_Produtos = new JTable(tabela_produtos);
                        JTableHeader header_Compras = Lista_Produtos.getTableHeader();
                        Lista_Produtos.setShowGrid(false);

                        Lista_Produtos.getColumnModel().getColumn(0).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());
                        Lista_Produtos.getColumnModel().getColumn(1).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());
                        Lista_Produtos.getColumnModel().getColumn(2).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());
                        Lista_Produtos.getColumnModel().getColumn(3).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());
                        Lista_Produtos.getColumnModel().getColumn(4).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());
                        Lista_Produtos.getColumnModel().getColumn(5).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());
                        Lista_Produtos.getColumnModel().getColumn(6).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());
                        Lista_Produtos.getColumnModel().getColumn(7).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());

                        header_Compras.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        header_Compras.setForeground(new Color(102, 102, 255));

                        Lista_Produtos.setRowHeight(30);

                        JScrollPane rol_Compras = new JScrollPane(Lista_Produtos);

                        rol_Compras.setBounds(10, 470, 900, 180);

                        //Fonte
                        lblTitulo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 22));
                        lblCategoria_Produto.setForeground(new Color(102, 102, 255));
                        lblNome.setForeground(new Color(102, 102, 255));
                        lblCodigo_Barra.setForeground(new Color(102, 102, 255));
                        lblValidade.setForeground(new Color(102, 102, 255));
                        lblNumero_Lote.setForeground(new Color(102, 102, 255));
                        lblEmbalagem_Nao.setForeground(new Color(102, 102, 255));
                        lnlQuantidade_Embalagens.setForeground(new Color(102, 102, 255));
                        lblProdutos.setForeground(new Color(102, 102, 255));
                        lblStatus.setForeground(new Color(102, 102, 255));
                        lblQuantidade_Produtos.setForeground(new Color(102, 102, 255));
                        lblMarca.setForeground(new Color(102, 102, 255));
                        lblUnidade_Medida.setForeground(new Color(102, 102, 255));
                        lblPreco_Compra.setForeground(new Color(102, 102, 255));
                        lblPreco_Venda.setForeground(new Color(102, 102, 255));
                        lblDescricao.setForeground(new Color(102, 102, 255));
                        lblPeso_Volume.setForeground(new Color(102, 102, 255));
                        btnCarregarFoto.setForeground(new Color(0, 102, 255));
                        btnActualizar.setForeground(new Color(0, 102, 255));
                        btnCadastrar.setForeground(new Color(0, 102, 255));
                        btnEliminar.setForeground(new Color(0, 102, 255));
                        btnProcurar.setForeground(new Color(0, 102, 255));
                        btnActivar.setForeground(new Color(0, 102, 255));

                        // Personalizando o BackGround
                        btnCarregarFoto.setBackground(Color.white);
                        btnActualizar.setBackground(Color.white);
                        btnActivar.setBackground(Color.white);
                        btnCadastrar.setBackground(Color.white);
                        btnProcurar.setBackground(Color.white);
                        btnEliminar.setBackground(Color.white);

                        //Visibilidade das componentes permitindo com que sejam desbloqueados de forma sequenciada
                        txtNome.setEnabled(false);
                        txtCodigo_Barra.setEnabled(false);
                        txtValidade.setEnabled(false);
                        txtNumero_Lote.setEnabled(false);
                        jcEmbalado.setEnabled(false);
                        txtMarca.setEnabled(false);
                        jcMedida.setEnabled(false);
                        txtStatus.setEnabled(false);
                        txtPeso_Volume.setEnabled(false);
                        txtPreco_Compra.setEnabled(false);
                        txtPreco_Venda.setEnabled(false);
                        txtDescricao.setEnabled(false);
                        btnCadastrar.setEnabled(false);
                        btnCarregarFoto.setEnabled(false);

                        //Seguem as validacoes dos campos, somente permitindo que cada campo seja preenchido so e somente se o seu antecessor tiver sido
                        jcCategoria_Produto.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                if (jcCategoria_Produto.getSelectedIndex() != 0) {

                                    jcCategoria_Produto.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.green));
                                    txtNome.setEnabled(true);
                                    txtNome.requestFocus();
                                    jcCategoria_Produto.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                } else {

                                    jcCategoria_Produto.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
                                    txtNome.setEnabled(false);

                                }

                            }

                        }); //Fim da primeira Validacao

                        //Campo nome do Produto, colocando eventos
                        txtNome.addKeyListener(new KeyListener() {
                            @Override
                            public void keyTyped(KeyEvent e) {

                            }

                            @Override
                            public void keyPressed(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c) || (e.getKeyCode() == KeyEvent.VK_DOWN) || (e.getKeyCode() == KeyEvent.VK_RIGHT) || (e.getKeyCode() == KeyEvent.VK_LEFT)) {
                                    txtNome.setEditable(true);
                                    if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN) {
                                        txtNumero_Lote.requestFocus();
                                    }

                                } else {
                                    txtNome.setEditable(false);
                                    JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                }

                            }

                            @Override
                            public void keyReleased(KeyEvent e) {
                                //Pegando o tamanho do texto
                                int comprimentoTexto = txtNome.getText().length();

                                // Define a cor da borda com base no comprimento do texto
                                Color cor = (comprimentoTexto < 5) ? Color.RED : Color.GREEN;

                                // Cria uma borda com a cor desejada
                                Border bordaColorida = BorderFactory.createLineBorder(cor);

                                // Aplica a borda ao campo de texto
                                txtNome.setBorder(bordaColorida);

                                // Permitindo com que o campo seguinte seja aberto assim como nao
                                if (cor.equals(Color.GREEN)) {
                                    txtNumero_Lote.setEnabled(true);

                                } else {
                                    txtNumero_Lote.setEnabled(false);

                                }

                                txtNome.addFocusListener(new FocusListener() {
                                    @Override
                                    public void focusGained(FocusEvent e) {

                                    }

                                    @Override
                                    public void focusLost(FocusEvent e) {

                                        // Restaura a borda padrão quando o campo perde o foco
                                        txtNome.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                    }
                                });

                            }
                        }); // campo nome

                        //Campo nome do Produto, colocando eventos
                        txtNumero_Lote.addKeyListener(new KeyListener() {
                            @Override
                            public void keyTyped(KeyEvent e) {

                            }

                            @Override
                            public void keyPressed(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (Character.isLetter(c)) {
                                    txtNumero_Lote.setEditable(false);
                                    JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                } else {
                                    txtNumero_Lote.setEditable(true);
                                    if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN) {
                                        txtCodigo_Barra.requestFocus();
                                    } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                                        txtNome.requestFocus();
                                    }
                                }
                            }

                            @Override
                            public void keyReleased(KeyEvent e) {
                                //Pegando o tamanho do texto
                                int comprimentoTexto = txtNumero_Lote.getText().length();

                                // Define a cor da borda com base no comprimento do texto
                                Color cor = (comprimentoTexto < 5) ? Color.RED : Color.GREEN;

                                // Cria uma borda com a cor desejada
                                Border bordaColorida = BorderFactory.createLineBorder(cor);

                                // Aplica a borda ao campo de texto
                                txtNumero_Lote.setBorder(bordaColorida);

                                // Permitindo com que o campo seguinte seja aberto assim como nao
                                if (cor.equals(Color.GREEN)) {
                                    txtCodigo_Barra.setEnabled(true);

                                } else {
                                    txtCodigo_Barra.setEnabled(false);

                                }

                                txtNumero_Lote.addFocusListener(new FocusListener() {
                                    @Override
                                    public void focusGained(FocusEvent e) {

                                    }

                                    @Override
                                    public void focusLost(FocusEvent e) {

                                        // Restaura a borda padrão quando o campo perde o foco
                                        txtNumero_Lote.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                    }
                                });

                            }
                        }); // Numero de Lote

                        //Codigo de Barra
                        txtCodigo_Barra.addKeyListener(new KeyListener() {
                            @Override
                            public void keyTyped(KeyEvent e) {

                            }

                            @Override
                            public void keyPressed(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (Character.isLetter(c)) {
                                    txtCodigo_Barra.setEditable(false);
                                    JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                } else {
                                    txtCodigo_Barra.setEditable(true);
                                    if (e.getKeyCode() == KeyEvent.VK_UP) {
                                        txtNumero_Lote.requestFocus();
                                    }

                                }
                            }

                            @Override
                            public void keyReleased(KeyEvent e) {
                                //Pegando o tamanho do texto
                                int comprimentoTexto = txtCodigo_Barra.getText().length();

                                // Define a cor da borda com base no comprimento do texto
                                Color cor = (comprimentoTexto <= 12) ? Color.RED : Color.GREEN;

                                // Cria uma borda com a cor desejada
                                Border bordaColorida = BorderFactory.createLineBorder(cor);

                                // Aplica a borda ao campo de texto
                                txtCodigo_Barra.setBorder(bordaColorida);

                                // Permitindo com que o campo seguinte seja aberto assim como nao
                                if (cor.equals(Color.GREEN)) {
                                    txtValidade.setEnabled(true);
                                    jcEmbalado.setEnabled(true);
                                } else {
                                    txtValidade.setEnabled(false);
                                    jcEmbalado.setEnabled(false);

                                }

                                txtCodigo_Barra.addFocusListener(new FocusListener() {
                                    @Override
                                    public void focusGained(FocusEvent e) {

                                    }

                                    @Override
                                    public void focusLost(FocusEvent e) {

                                        // Restaura a borda padrão quando o campo perde o foco
                                        txtCodigo_Barra.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                    }
                                });

                            }
                        }); //Barra

                        //Caixa de tipos
                        jcEmbalado.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                if (jcEmbalado.getSelectedIndex() == 1) {
                                    txtStatus.setEnabled(false);
                                    txtMarca.setEnabled(false);
                                    txtQntEmbalagem.setEnabled(true);
                                    txtProdutosQtd.setText("");
                                    txtProdutosQtd.setEnabled(false);
                                } else {
                                    if (jcEmbalado.getSelectedIndex() == 2) {
                                        txtStatus.setEnabled(false);
                                        txtMarca.setEnabled(false);
                                        txtQntEmbalagem.setEnabled(false);
                                        txtProdutos_Embalagem.setEnabled(false);
                                        txtProdutosQtd.setEnabled(true);
                                        txtProdutos_Embalagem.setText("");
                                        txtQntEmbalagem.setText("");
                                    } else {
                                        txtQntEmbalagem.setEnabled(false);
                                        txtProdutos_Embalagem.setEnabled(false);
                                        txtProdutosQtd.setEnabled(false);
                                        txtQntEmbalagem.setText("");
                                        txtProdutosQtd.setText("");
                                        txtProdutos_Embalagem.setText("");
                                        txtStatus.setEnabled(false);
                                        txtMarca.setEnabled(false);
                                    }

                                }

                            }
                        });

                        //CCaixa de quantoidade por Embalagem
                        txtQntEmbalagem.addKeyListener(new KeyListener() {
                            @Override
                            public void keyTyped(KeyEvent e) {

                            }

                            @Override
                            public void keyPressed(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (Character.isLetter(c)) {
                                    txtQntEmbalagem.setEditable(false);
                                    JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                } else {
                                    txtQntEmbalagem.setEditable(true);
                                    if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN) {
                                        txtProdutos_Embalagem.requestFocus();
                                    }
                                }
                            }

                            @Override
                            public void keyReleased(KeyEvent e) {
                                //Pegando o tamanho do texto
                                int comprimentoTexto = txtQntEmbalagem.getText().length();

                                // Define a cor da borda com base no comprimento do texto
                                Color cor = (comprimentoTexto < 1) ? Color.RED : Color.GREEN;

                                // Cria uma borda com a cor desejada
                                Border bordaColorida = BorderFactory.createLineBorder(cor);

                                // Aplica a borda ao campo de texto
                                txtQntEmbalagem.setBorder(bordaColorida);

                                // Permitindo com que o campo seguinte seja aberto assim como nao
                                if (cor.equals(Color.GREEN)) {
                                    txtProdutos_Embalagem.setEnabled(true);
                                } else {
                                    txtProdutos_Embalagem.setEnabled(false);
                                }

                                txtQntEmbalagem.addFocusListener(new FocusListener() {
                                    @Override
                                    public void focusGained(FocusEvent e) {

                                    }

                                    @Override
                                    public void focusLost(FocusEvent e) {

                                        // Restaura a borda padrão quando o campo perde o foco
                                        txtQntEmbalagem.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                    }
                                });

                            }
                        });
                        //CCaixa de quantoidade por Embalagens
                        txtProdutos_Embalagem.addKeyListener(new KeyListener() {
                            @Override
                            public void keyTyped(KeyEvent e) {

                            }

                            @Override
                            public void keyPressed(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (Character.isLetter(c)) {
                                    txtProdutos_Embalagem.setEditable(false);
                                    JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                } else {
                                    txtProdutos_Embalagem.setEditable(true);

                                    if (e.getKeyCode() == KeyEvent.VK_UP) {
                                        txtQntEmbalagem.requestFocus();
                                    }

                                }
                            }

                            @Override
                            public void keyReleased(KeyEvent e) {
                                //Pegando o tamanho do texto
                                int comprimentoTexto = txtProdutos_Embalagem.getText().length();

                                // Define a cor da borda com base no comprimento do texto
                                Color cor = (comprimentoTexto < 1) ? Color.RED : Color.GREEN;

                                // Cria uma borda com a cor desejada
                                Border bordaColorida = BorderFactory.createLineBorder(cor);

                                // Aplica a borda ao campo de texto
                                txtProdutos_Embalagem.setBorder(bordaColorida);

                                // Permitindo com que o campo seguinte seja aberto assim como nao
                                if (cor.equals(Color.GREEN)) {
                                    txtStatus.setEnabled(true);
                                } else {
                                    txtStatus.setEnabled(false);
                                }

                                txtProdutos_Embalagem.addFocusListener(new FocusListener() {
                                    @Override
                                    public void focusGained(FocusEvent e) {

                                    }

                                    @Override
                                    public void focusLost(FocusEvent e) {

                                        // Restaura a borda padrão quando o campo perde o foco
                                        txtProdutos_Embalagem.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                    }
                                });

                            }
                        });

                        //CCaixa de quantoidade avulso a adicionar
                        txtProdutosQtd.addKeyListener(new KeyListener() {
                            @Override
                            public void keyTyped(KeyEvent e) {

                            }

                            @Override
                            public void keyPressed(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (Character.isLetter(c)) {
                                    txtProdutosQtd.setEditable(false);
                                    JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                } else {
                                    txtProdutosQtd.setEditable(true);

                                }
                            }

                            @Override
                            public void keyReleased(KeyEvent e) {
                                //Pegando o tamanho do texto
                                int comprimentoTexto = txtProdutosQtd.getText().length();

                                // Define a cor da borda com base no comprimento do texto
                                Color cor = (comprimentoTexto < 1) ? Color.RED : Color.GREEN;

                                // Cria uma borda com a cor desejada
                                Border bordaColorida = BorderFactory.createLineBorder(cor);

                                // Aplica a borda ao campo de texto
                                txtProdutosQtd.setBorder(bordaColorida);

                                // Permitindo com que o campo seguinte seja aberto assim como nao
                                if (cor.equals(Color.GREEN)) {
                                    txtStatus.setEnabled(true);
                                } else {
                                    txtStatus.setEnabled(false);
                                }

                                txtProdutosQtd.addFocusListener(new FocusListener() {
                                    @Override
                                    public void focusGained(FocusEvent e) {

                                    }

                                    @Override
                                    public void focusLost(FocusEvent e) {

                                        // Restaura a borda padrão quando o campo perde o foco
                                        txtProdutosQtd.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                    }
                                });

                            }
                        });

                        // Dando instrucoes ao campo de estado 
                        txtStatus.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (txtStatus.getSelectedIndex() == 1) {
                                    txtMarca.setEnabled(true);
                                } else if (txtStatus.getSelectedIndex() == 2) {
                                    txtMarca.setEnabled(true);
                                } else {
                                    txtMarca.setEnabled(false);
                                }
                            }

                        });

                        //CCaixa de Marca
                        txtMarca.addKeyListener(new KeyListener() {
                            @Override
                            public void keyTyped(KeyEvent e) {

                            }

                            @Override
                            public void keyPressed(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c) || (e.getKeyCode() == KeyEvent.VK_DOWN) || (e.getKeyCode() == KeyEvent.VK_RIGHT) || (e.getKeyCode() == KeyEvent.VK_LEFT)) {
                                    txtMarca.setEditable(true);
                                } else {
                                    txtMarca.setEditable(false);
                                    JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                }

                            }

                            @Override
                            public void keyReleased(KeyEvent e) {
                                //Pegando o tamanho do texto
                                int comprimentoTexto = txtMarca.getText().length();

                                // Define a cor da borda com base no comprimento do texto
                                Color cor = (comprimentoTexto < 5) ? Color.RED : Color.GREEN;

                                // Cria uma borda com a cor desejada
                                Border bordaColorida = BorderFactory.createLineBorder(cor);

                                // Aplica a borda ao campo de texto
                                txtMarca.setBorder(bordaColorida);

                                // Permitindo com que o campo seguinte seja aberto assim como nao
                                if (cor.equals(Color.GREEN)) {
                                    jcMedida.setEnabled(true);
                                } else {
                                    jcMedida.setEnabled(false);
                                }

                                txtMarca.addFocusListener(new FocusListener() {
                                    @Override
                                    public void focusGained(FocusEvent e) {

                                    }

                                    @Override
                                    public void focusLost(FocusEvent e) {

                                        // Restaura a borda padrão quando o campo perde o foco
                                        txtMarca.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                    }
                                });

                            }
                        });

                        // Dando instrucoes ao campo de estado 
                        jcMedida.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (jcMedida.getSelectedIndex() == 1) {
                                    txtPeso_Volume.setEnabled(true);
                                } else if (jcMedida.getSelectedIndex() == 2) {
                                    txtPeso_Volume.setEnabled(true);
                                } else {
                                    txtPeso_Volume.setEnabled(false);
                                }
                            }

                        });

                        //CCaixa de Peso ou Volume
                        txtPeso_Volume.addKeyListener(new KeyListener() {
                            @Override
                            public void keyTyped(KeyEvent e) {

                            }

                            @Override
                            public void keyPressed(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (Character.isLetter(c)) {
                                    txtPeso_Volume.setEditable(false);
                                    JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                } else {
                                    txtPeso_Volume.setEditable(true);
                                    if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN) {
                                        txtPreco_Compra.requestFocus();
                                    } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                                        txtPeso_Volume.requestFocus();
                                    }

                                }
                            }

                            @Override
                            public void keyReleased(KeyEvent e) {
                                //Pegando o tamanho do texto
                                int comprimentoTexto = txtPeso_Volume.getText().length();

                                // Define a cor da borda com base no comprimento do texto
                                Color cor = (comprimentoTexto < 2) ? Color.RED : Color.GREEN;

                                // Cria uma borda com a cor desejada
                                Border bordaColorida = BorderFactory.createLineBorder(cor);

                                // Aplica a borda ao campo de texto
                                txtPeso_Volume.setBorder(bordaColorida);

                                // Permitindo com que o campo seguinte seja aberto assim como nao
                                if (cor.equals(Color.GREEN)) {
                                    txtPreco_Compra.setEnabled(true);
                                } else {
                                    txtPreco_Compra.setEnabled(false);
                                }

                                txtPeso_Volume.addFocusListener(new FocusListener() {
                                    @Override
                                    public void focusGained(FocusEvent e) {

                                    }

                                    @Override
                                    public void focusLost(FocusEvent e) {

                                        // Restaura a borda padrão quando o campo perde o foco
                                        txtPeso_Volume.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                    }
                                });

                            }
                        });

                        //CCaixa de preco de Compra
                        txtPreco_Compra.addKeyListener(new KeyListener() {
                            @Override
                            public void keyTyped(KeyEvent e) {

                            }

                            @Override
                            public void keyPressed(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (Character.isLetter(c)) {
                                    txtPreco_Compra.setEditable(false);
                                    JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                } else {
                                    txtPreco_Compra.setEditable(true);
                                    if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN) {
                                        txtPreco_Venda.requestFocus();
                                    } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                                        txtPeso_Volume.requestFocus();
                                    }

                                }
                            }

                            @Override
                            public void keyReleased(KeyEvent e) {
                                //Pegando o tamanho do texto
                                int comprimentoTexto = txtPreco_Compra.getText().length();

                                // Define a cor da borda com base no comprimento do texto
                                Color cor = (comprimentoTexto < 2) ? Color.RED : Color.GREEN;

                                // Cria uma borda com a cor desejada
                                Border bordaColorida = BorderFactory.createLineBorder(cor);

                                // Aplica a borda ao campo de texto
                                txtPreco_Compra.setBorder(bordaColorida);

                                // Permitindo com que o campo seguinte seja aberto assim como nao
                                if (cor.equals(Color.GREEN)) {
                                    txtPreco_Venda.setEnabled(true);
                                } else {
                                    txtPreco_Venda.setEnabled(false);
                                }

                                txtPreco_Compra.addFocusListener(new FocusListener() {
                                    @Override
                                    public void focusGained(FocusEvent e) {

                                    }

                                    @Override
                                    public void focusLost(FocusEvent e) {

                                        // Restaura a borda padrão quando o campo perde o foco
                                        txtPreco_Compra.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                    }
                                });

                            }
                        });
                        //CCaixa de preco de Venda
                        txtPreco_Venda.addKeyListener(new KeyListener() {
                            @Override
                            public void keyTyped(KeyEvent e) {

                            }

                            @Override
                            public void keyPressed(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (Character.isLetter(c)) {
                                    txtPreco_Venda.setEditable(false);
                                    JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                } else {
                                    txtPreco_Venda.setEditable(true);
                                    if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN) {
                                        txtDescricao.requestFocus();
                                    } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                                        txtPreco_Compra.requestFocus();
                                    }

                                }
                            }

                            @Override
                            public void keyReleased(KeyEvent e) {
                                //Pegando o tamanho do texto
                                int comprimentoTexto = txtPreco_Venda.getText().length();

                                // Define a cor da borda com base no comprimento do texto
                                Color cor = (comprimentoTexto < 2) ? Color.RED : Color.GREEN;

                                // Cria uma borda com a cor desejada
                                Border bordaColorida = BorderFactory.createLineBorder(cor);

                                // Aplica a borda ao campo de texto
                                txtPreco_Venda.setBorder(bordaColorida);

                                // Permitindo com que o campo seguinte seja aberto assim como nao
                                if (cor.equals(Color.GREEN)) {
                                    txtDescricao.setEnabled(true);

                                } else {
                                    txtDescricao.setEnabled(false);

                                }

                                txtPreco_Venda.addFocusListener(new FocusListener() {
                                    @Override
                                    public void focusGained(FocusEvent e) {

                                    }

                                    @Override
                                    public void focusLost(FocusEvent e) {

                                        // Restaura a borda padrão quando o campo perde o foco
                                        txtPreco_Venda.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                    }
                                });

                            }
                        });

                        //Campo nome do Produto, colocando eventos
                        txtDescricao.addKeyListener(new KeyListener() {
                            @Override
                            public void keyTyped(KeyEvent e) {

                            }

                            @Override
                            public void keyPressed(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c) || (e.getKeyCode() == KeyEvent.VK_DOWN) || (e.getKeyCode() == KeyEvent.VK_UP) || (e.getKeyCode() == KeyEvent.VK_RIGHT) || (e.getKeyCode() == KeyEvent.VK_LEFT)) {
                                    txtDescricao.setEditable(true);
                                    if (e.getKeyCode() == KeyEvent.VK_UP) {
                                        txtPreco_Venda.requestFocus();
                                    }
                                } else {
                                    txtDescricao.setEditable(false);
                                    JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                }
                            }

                            @Override
                            public void keyReleased(KeyEvent e) {
                                //Pegando o tamanho do texto
                                int comprimentoTexto = txtDescricao.getText().length();

                                // Define a cor da borda com base no comprimento do texto
                                Color cor = (comprimentoTexto < 10) ? Color.RED : Color.GREEN;

                                // Cria uma borda com a cor desejada
                                Border bordaColorida = BorderFactory.createLineBorder(cor);

                                // Aplica a borda ao campo de texto
                                txtDescricao.setBorder(bordaColorida);

                                // Permitindo com que o campo seguinte seja aberto assim como nao
                                if (cor.equals(Color.GREEN)) {
                                    btnCadastrar.setEnabled(true);
                                    btnCarregarFoto.setEnabled(true);

                                } else {
                                    btnCadastrar.setEnabled(false);
                                    btnCarregarFoto.setEnabled(false);
                                }

                                txtDescricao.addFocusListener(new FocusListener() {
                                    @Override
                                    public void focusGained(FocusEvent e) {

                                    }

                                    @Override
                                    public void focusLost(FocusEvent e) {

                                        // Restaura a borda padrão quando o campo perde o foco
                                        txtDescricao.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                    }
                                });

                            }
                        });

                        //Adicionando as Componentes 
                        pnlGerirProdutos.add(lblTitulo);
                        pnlGerirProdutos.add(lblTitulo);
                        pnlGerirProdutos.add(lblCategoria_Produto);
                        pnlGerirProdutos.add(lblNome);
                        pnlGerirProdutos.add(lblCodigo_Barra);
                        pnlGerirProdutos.add(lblValidade);
                        pnlGerirProdutos.add(lblNumero_Lote);
                        pnlGerirProdutos.add(lblEmbalagem_Nao);
                        pnlGerirProdutos.add(lnlQuantidade_Embalagens);
                        pnlGerirProdutos.add(lblProdutos);
                        pnlGerirProdutos.add(lblStatus);
                        pnlGerirProdutos.add(lblQuantidade_Produtos);
                        pnlGerirProdutos.add(lblMarca);
                        pnlGerirProdutos.add(lblUnidade_Medida);
                        pnlGerirProdutos.add(lblPeso_Volume);
                        pnlGerirProdutos.add(lblPreco_Compra);
                        pnlGerirProdutos.add(lblPreco_Venda);
                        pnlGerirProdutos.add(lblDescricao);

                        pnlGerirProdutos.add(lblFoto);

                        pnlGerirProdutos.add(jcCategoria_Produto);
                        pnlGerirProdutos.add(txtNome);
                        pnlGerirProdutos.add(txtCodigo_Barra);
                        pnlGerirProdutos.add(txtValidade);
                        pnlGerirProdutos.add(txtNumero_Lote);
                        pnlGerirProdutos.add(jcEmbalado);
                        pnlGerirProdutos.add(txtQntEmbalagem);
                        pnlGerirProdutos.add(txtProdutos_Embalagem);
                        pnlGerirProdutos.add(txtProdutosQtd);
                        pnlGerirProdutos.add(txtStatus);
                        pnlGerirProdutos.add(txtMarca);
                        pnlGerirProdutos.add(jcMedida);
                        pnlGerirProdutos.add(txtPeso_Volume);
                        pnlGerirProdutos.add(txtPreco_Compra);
                        pnlGerirProdutos.add(txtPreco_Venda);
                        pnlGerirProdutos.add(txtDescricao);

                        pnlGerirProdutos.add(rol_Compras);

                        pnlGerirProdutos.add(btnCarregarFoto);
                        pnlGerirProdutos.add(btnActivar);
                        pnlGerirProdutos.add(btnActualizar);
                        pnlGerirProdutos.add(btnCadastrar);

                        pnlGerirProdutos.add(btnProcurar);
                        pnlGerirProdutos.add(btnEliminar);

                        //   Colocando todas categorias na caixa apropriada
                        DAO_Categoria dao_c = new DAO_Categoria();
                        //Trazendo todas categorias 
                        ArrayList<Categorias> lista_categorias = dao_c.FindAll_Categoria();

                        for (Categorias i : lista_categorias) {
                            jcCategoria_Produto.addItem(i.getNome_categoria());
                        }

                        //Buscando e trazendo todos registos
                        DAO_Produtos dao_pro = new DAO_Produtos();
                        Controller_Produto cont_pro = new Controller_Produto();

                        ArrayList<Produtos> lista_produtos = dao_pro.FindAll_Produtos();

                        int tamanho;

                        if (lista == null) {

                            tamanho = 0;

                            JOptionPane.showMessageDialog(null, "Nao existe Produto cadastrada ainda!");

                        } else {
                            tamanho = lista_produtos.size();

                            double qtd = 0;
                            double retorno;

                            for (int i = 0; i < lista_produtos.size(); i++) {
                                Object[] row = new Object[8];

                                row[0] = lista_produtos.get(i).getCodigo_produto();
                                row[1] = lista_produtos.get(i).getNome_produto();
                                row[2] = lista_produtos.get(i).getTotal_custos();
                                row[3] = lista_produtos.get(i).getLucro_unidade();

                                if (lista_produtos.get(i).getTipo_Produto().equalsIgnoreCase("Embalado")) {
                                    qtd = lista_produtos.get(i).getQuantidade_embalada() * lista_produtos.get(i).getQuantidade_emEmbalagem();
                                    row[4] = lista_produtos.get(i).getLucro_unidade() * qtd;
                                    retorno = lista_produtos.get(i).getLucro_unidade() * qtd;

                                } else {

                                    row[4] = lista_produtos.get(i).getLucro_unidade() * lista_produtos.get(i).getQuantidade_Adicionar();
                                    qtd = lista_produtos.get(i).getQuantidade_Adicionar();
                                    retorno = lista_produtos.get(i).getLucro_unidade() * lista_produtos.get(i).getQuantidade_Adicionar();
                                }
                                row[5] = retorno + lista_produtos.get(i).getTotal_custos();

                                row[6] = qtd;

                                row[7] = lista_produtos.get(i).getStatus();

                                tabela_produtos.addRow(row);

                            }//Fim do for loop

                        }//Fim do metodo que lista na tabela

                        //metodo da tabela 
                        Lista_Produtos.addMouseListener(new MouseListener() {
                            @Override
                            public void mouseClicked(MouseEvent e) {

                                txtNome.setEnabled(true);
                                txtCodigo_Barra.setEnabled(true);
                                txtValidade.setEnabled(true);
                                txtNumero_Lote.setEnabled(true);
                                jcEmbalado.setEnabled(true);
                                jcMedida.setEnabled(true);
                                txtStatus.setEnabled(false);
                                txtPeso_Volume.setEnabled(true);
                                txtPreco_Compra.setEnabled(true);
                                txtPreco_Venda.setEnabled(true);
                                txtMarca.setEnabled(true);
                                txtDescricao.setEnabled(true);

                                btnCadastrar.setEnabled(false);
                                btnActualizar.setEnabled(true);
                                btnEliminar.setEnabled(true);
                                btnActivar.setEnabled(true);
                                btnCarregarFoto.setEnabled(true);

                                linha = Lista_Produtos.getSelectedRow();

                                codigo = (String) Lista_Produtos.getModel().getValueAt(Lista_Produtos.getSelectedRow(), 0);
                                txtNome.setText((String) Lista_Produtos.getModel().getValueAt(Lista_Produtos.getSelectedRow(), 1));
                                txtStatus.setSelectedItem((String) Lista_Produtos.getModel().getValueAt(Lista_Produtos.getSelectedRow(), 7));

                                for (int i = 0; i < lista_produtos.size(); i++) {
                                    if (lista_produtos.get(i).getCodigo_produto() == (codigo)) {

                                        //Neste passo estou comparando o a chave estrangeira com chave primaria da categoria e depois passo o nome da tal categoria
                                        for (Categorias c : lista_categorias) {
                                            if (lista_produtos.get(i).getCodigo_categoria() == c.getId()) {
                                                jcCategoria_Produto.setSelectedItem(c.getNome_categoria());
                                            }
                                        }

                                        txtCodigo_Barra.setText(String.valueOf(lista_produtos.get(i).getCodigo_barra()));
                                        txtValidade.setDate((Date) lista_produtos.get(i).getValidade());
                                        txtNumero_Lote.setText(String.valueOf(lista_produtos.get(i).getLote()));
                                        jcEmbalado.setSelectedItem(lista_produtos.get(i).getTipo_Produto());
                                        txtQntEmbalagem.setText(String.valueOf(lista_produtos.get(i).getQuantidade_embalada()));
                                        txtProdutos_Embalagem.setText(String.valueOf(lista_produtos.get(i).getQuantidade_emEmbalagem()));
                                        txtProdutosQtd.setText(String.valueOf(lista_produtos.get(i).getQuantidade_Adicionar()));
                                        txtMarca.setText((String) (lista_produtos.get(i).getMarca()));
                                        jcMedida.setSelectedItem(lista_produtos.get(i).getUnidadeMedida());
                                        txtPeso_Volume.setText(String.valueOf(lista_produtos.get(i).getPeso_volume()));
                                        txtPreco_Compra.setText(String.valueOf(lista_produtos.get(i).getPreco_compra()));
                                        txtPreco_Venda.setText(String.valueOf(lista_produtos.get(i).getPreco_venda()));
                                        txtDescricao.setText((String) (lista_produtos.get(i).getDescricao()));

                                        if (lista_produtos.get(i).getTipo_Produto().equalsIgnoreCase("Embalado")) {
                                            txtQntEmbalagem.setEnabled(true);
                                            txtProdutos_Embalagem.setEnabled(true);
                                            txtProdutosQtd.setEnabled(false);

                                        } else {
                                            txtQntEmbalagem.setEnabled(false);
                                            txtProdutos_Embalagem.setEnabled(false);
                                            txtProdutosQtd.setEnabled(true);
                                        }

                                        byte[] img = lista_produtos.get(i).getImagem();
                                        BufferedImage imagem = null;
                                        try {
                                            imagem = ImageIO.read(new ByteArrayInputStream(img));
                                        } catch (IOException ex) {
                                            JOptionPane.showMessageDialog(null, "Erro ao Converter a Imagem " + ex.getMessage());
                                        }

                                        ImageIcon Icone = new ImageIcon(imagem.getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                                        lblFoto.setIcon(null);
                                        lblFoto.setIcon(Icone);
                                        lblFoto.setBounds(725, 210, 225, 150);

                                    }
                                }
                            }

                            @Override

                            public void mousePressed(MouseEvent e) {

                            }

                            @Override
                            public void mouseReleased(MouseEvent e) {

                            }

                            @Override
                            public void mouseEntered(MouseEvent e) {

                            }

                            @Override
                            public void mouseExited(MouseEvent e) {

                            }

                        });
                        // Neste passo seguem os pocessos de cadastrar, listar e outros
                        btnCarregarFoto.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                //Criando uma instancia da classe Controller 
                                Controller_Produto c_produto = new Controller_Produto();

                                //Pegando o metodo que me Permiti pegar uma imagem
                                imagemBytes = c_produto.CarregarImagem(lblFoto);

                                lblFoto.setIcon(new ImageIcon(imagemBytes));
                                lblFoto.updateUI();
                                lblFoto.setBounds(725, 210, 225, 150);
                            }
                        });

                        ///Cadastrar
                        btnCadastrar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                String codigo = "PROSM" + 1000 + tamanho + "HM";

                                String nivel_dispo = "100%";

                                double total_custo = 0;
                                double pre_custo = 0;
                                double lucro = 0;

                                String categoria = (String) jcCategoria_Produto.getSelectedItem();

                                Long categoria_codigo = null;

                                for (Categorias i : lista_categorias) {

                                    if (i.getNome_categoria().equalsIgnoreCase(categoria)) {

                                        categoria_codigo = i.getId();

                                    }

                                }

                                String nome = txtNome.getText();

                                long codigo_barra = Long.parseLong(txtCodigo_Barra.getText());

                                java.util.Date validade = txtValidade.getDate();

                                java.sql.Date validade2 = new java.sql.Date(validade.getTime());

                                java.util.Date data = new java.util.Date();

                                int numero_lote = Integer.parseInt(txtNumero_Lote.getText());

                                String tipo_produto = (String) jcEmbalado.getSelectedItem();

                                int numero_embalagens;
                                int qtd_emEmbalagem;
                                int total_Produtos;

                                if (tipo_produto.equalsIgnoreCase("Embalado")) {
                                    numero_embalagens = Integer.parseInt(txtQntEmbalagem.getText());
                                    qtd_emEmbalagem = Integer.parseInt(txtProdutos_Embalagem.getText());
                                    total_Produtos = 0;
                                    pre_custo = numero_embalagens * qtd_emEmbalagem;

                                } else {
                                    numero_embalagens = 0;
                                    qtd_emEmbalagem = 0;
                                    total_Produtos = Integer.parseInt(txtProdutosQtd.getText());
                                    pre_custo = total_Produtos;
                                }
                                String estado = (String) txtStatus.getSelectedItem();

                                String marca = txtMarca.getText();

                                String medida = (String) jcMedida.getSelectedItem();

                                double peso_volume = Double.parseDouble(txtPeso_Volume.getText());

                                double preco_compra = Double.parseDouble(txtPreco_Compra.getText());

                                double preco_venda = Double.parseDouble(txtPreco_Venda.getText());

                                String descricao = txtDescricao.getText();

                                total_custo = pre_custo * preco_compra;

                                lucro = preco_venda - preco_compra;

                                cont_pro.Verificacao_Save(categoria_codigo, codigo, nome, codigo_barra, validade2, numero_lote, tipo_produto, numero_embalagens, qtd_emEmbalagem, total_Produtos, estado, marca, medida, peso_volume, preco_compra, preco_venda, nivel_dispo, total_custo, lucro, descricao, imagemBytes);
                            }
                        });

                        ///Actualizar
                        btnActualizar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                double total_custo = 0;
                                double pre_custo = 0;
                                double lucro = 0;

                                String categoria = (String) jcCategoria_Produto.getSelectedItem();

                                Long categoria_codigo = null;

                                for (Categorias i : lista_categorias) {

                                    if (i.getNome_categoria().equalsIgnoreCase(categoria)) {

                                        categoria_codigo = i.getId();

                                    }

                                }

                                String nome = txtNome.getText();

                                long codigo_barra = Long.parseLong(txtCodigo_Barra.getText());

                                java.util.Date validade = txtValidade.getDate();

                                java.sql.Date validade2 = new java.sql.Date(validade.getTime());

                                java.util.Date data = new java.util.Date();

                                int numero_lote = Integer.parseInt(txtNumero_Lote.getText());

                                String tipo_produto = (String) jcEmbalado.getSelectedItem();

                                double numero_embalagens;
                                double qtd_emEmbalagem;
                                double total_Produtos;

                                if (tipo_produto.equalsIgnoreCase("Embalado")) {
                                    numero_embalagens = Double.parseDouble(txtQntEmbalagem.getText());
                                    qtd_emEmbalagem = Double.parseDouble(txtProdutos_Embalagem.getText());
                                    total_Produtos = 0;
                                    pre_custo = numero_embalagens * qtd_emEmbalagem;

                                } else {
                                    numero_embalagens = 0;
                                    qtd_emEmbalagem = 0;
                                    total_Produtos = Double.parseDouble(txtProdutosQtd.getText());
                                    pre_custo = total_Produtos;
                                }
                                String estado = (String) txtStatus.getSelectedItem();

                                String marca = txtMarca.getText();

                                String medida = (String) jcMedida.getSelectedItem();

                                double peso_volume = Double.parseDouble(txtPeso_Volume.getText());

                                double preco_compra = Double.parseDouble(txtPreco_Compra.getText());

                                double preco_venda = Double.parseDouble(txtPreco_Venda.getText());

                                String descricao = txtDescricao.getText();

                                total_custo = pre_custo * preco_compra;

                                lucro = preco_venda - preco_compra;

                                byte[] img = imagemBytes;

                                if (img == null) {
                                    for (Produtos i : lista_produtos) {
                                        if (i.getCodigo_produto().equals(codigo)) {
                                            img = i.getImagem();
                                        }
                                    }

                                }
                                cont_pro.Verificacao_UPdate(categoria_codigo, codigo, nome, codigo_barra, validade2, numero_lote, tipo_produto, numero_embalagens, qtd_emEmbalagem, total_Produtos, marca, medida, peso_volume, preco_compra, preco_venda, total_custo, lucro, descricao, img);
                            }
                        });
                        ///Eliminar
                        btnEliminar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                DAO_Produtos dao_p = new DAO_Produtos();
                                Produtos p = new Produtos();
                                if (codigo == null) {
                                    JOptionPane.showMessageDialog(null, "Primeiro selecione um funcionario na tabela");
                                } else {
                                    p.setCodigo_produto(codigo);

                                    p.setStatus("Inactivo");

                                    dao_p.Estado_Produto(p);
                                }
                            }
                        });
                        ///Limpar Todos campos Campos
                        btnActivar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                DAO_Produtos dao_p = new DAO_Produtos();
                                Produtos p = new Produtos();
                                if (codigo == null) {
                                    JOptionPane.showMessageDialog(null, "Primeiro selecione um funcionario na tabela");
                                } else {
                                    p.setCodigo_produto(codigo);

                                    p.setStatus("Activo");

                                    dao_p.Estado_Produto(p);
                                }
                            }
                        });

                        pnlauxPrincipal.add(pnlGerirProdutos);
                        pnlGerirProdutos.setVisible(true);

                    }
                }); // Gerir Produtos

                // Neste passo, vou fechar o painel de categorias e recolocar o pai nel principal
                btnVoltarPrincipal.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pnlGeirCategorias.setVisible(false);
                        pnlGerirProdutos.setVisible(false);
                        pnlGeirRelatorio.setVisible(false);
                        pnlMenu_Gestaoprodutos.setVisible(false);
                        pnlMenu_Botoes.setVisible(true);
                        pnlPrincipal.setVisible(true);

                    }
                });

                pnlMenu_Gestaoprodutos.add(lblFotografia);
                pnlMenu_Gestaoprodutos.add(txtbarra2);
                pnlMenu_Gestaoprodutos.add(btnGerirCategorias);
                pnlMenu_Gestaoprodutos.add(btnGerirProdutos);
                pnlMenu_Gestaoprodutos.add(btnRelatorio);
                pnlMenu_Gestaoprodutos.add(btnVoltarPrincipal);

                pnlauxPrincipal.add(pnlMenu_Gestaoprodutos);
                pnlauxPrincipal.add(pnlGerirProdutos);
                pnlauxPrincipal.add(pnlGeirCategorias);
                pnlauxPrincipal.add(pnlGeirRelatorio);
                pnlauxPrincipal.add(pnlPrincipal);

                pnlMenu_Gestaoprodutos.setVisible(true);
            }
        }
        ); // Fim  Gerir Produtos

        // Gestao de Funcionarios
        btnGestao_Funcionarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                pnlPrincipal.setVisible(false);
                pnlVisaoGeral.setVisible(false);
                pnlMenssagens.setVisible(false);
                pnlConfiguracoes.setVisible(false);
                pnlMeuPerfil.setVisible(false);

                pnlGestao_Funcionarios.setBackground(Color.white);
                pnlGestao_Funcionarios.setLayout(null);
                pnlGestao_Funcionarios.setBounds(280, 0, 920, 680);

                //Craindo as Componentes
                JLabel lblTitulo = new JLabel("Gerir Funcionarios");
                JLabel lblFoto = new JLabel();

                JLabel lblApelido = new JLabel("Apelido");
                JLabel lblNome = new JLabel("Nome");
                JLabel lblGenero = new JLabel("Genero");
                JLabel lblNascimento = new JLabel("Data de Nascimento");
                JLabel lblBI_Nuit = new JLabel("Numero do BI/Nuit");
                JLabel lblEmail = new JLabel("Email");
                JLabel lblPassword = new JLabel("Palavra-passe");
                JLabel lblContacto = new JLabel("Contacto");
                JLabel lblAcesso = new JLabel("Perfil");
                JLabel lblContratacao = new JLabel("Data da contratação");
                JLabel lblEndereco = new JLabel("Endereço");
                JLabel lblFuncao = new JLabel("Função Desempenhada ");
                JLabel lblStatus = new JLabel("Status do Funcionario ");
                JLabel lblSalario = new JLabel("Salario ");

                JTextField txtApelido = new JTextField();
                JTextField txtNome = new JTextField();
                JComboBox jcGenero = new JComboBox();
                JDateChooser txtNascimento = new JDateChooser();
                JTextField txtBI_Nuit = new JTextField();
                JTextField txtEmail = new JTextField();
                JPasswordField txtPassword = new JPasswordField();
                JTextField txtContacto = new JTextField();
                JTextField txtAcesso = new JTextField();
                JDateChooser txtData_Contratacao = new JDateChooser();
                JTextField txtEndereco = new JTextField();
                JComboBox jcFuncao = new JComboBox<>();
                JComboBox jcStatus = new JComboBox<>();
                JTextField txtSalario = new JTextField();

                JTextField txtpesquisa = new JTextField();

                JScrollPane srp = new JScrollPane();

                JList lista_2 = new JList();

                srp.add(lista_2);

                JButton btnCarregarFoto = new JButton("Carregar IMG");
                JButton btnActualizar = new JButton("Actualizar");
                JButton btnReactivar = new JButton("Activar");
                JButton btnCadastrar = new JButton("Cadastrar");
                JButton btnProcurar = new JButton("procurar");
                JButton btnEliminar = new JButton("Desactivar");

                //Foreground
                lblTitulo.setForeground(new Color(102, 102, 255));

                //Cordenadas
                lblTitulo.setBounds(340, 0, 350, 30);

                lblApelido.setBounds(10, 50, 200, 30);
                txtApelido.setBounds(10, 80, 200, 40);

                lblNome.setBounds(10, 120, 200, 30);
                txtNome.setBounds(10, 150, 200, 40);

                lblBI_Nuit.setBounds(10, 190, 200, 30);
                txtBI_Nuit.setBounds(10, 220, 200, 40);

                lblGenero.setBounds(10, 260, 200, 30);
                jcGenero.setBounds(10, 290, 200, 40);

                lblNascimento.setBounds(10, 330, 200, 30);
                txtNascimento.setBounds(10, 360, 200, 40);

                lblEmail.setBounds(240, 50, 200, 30);
                txtEmail.setBounds(240, 80, 200, 40);

                lblPassword.setBounds(240, 120, 200, 30);
                txtPassword.setBounds(240, 150, 200, 40);

                lblContacto.setBounds(240, 190, 200, 30);
                txtContacto.setBounds(240, 220, 200, 40);

                lblContratacao.setBounds(240, 260, 200, 30);
                txtData_Contratacao.setBounds(240, 290, 200, 40);

                lblAcesso.setBounds(240, 330, 200, 30);
                txtAcesso.setBounds(240, 360, 200, 40);

                lblEndereco.setBounds(470, 50, 200, 30);
                txtEndereco.setBounds(470, 80, 200, 40);

                lblFuncao.setBounds(470, 120, 200, 30);
                jcFuncao.setBounds(470, 150, 200, 40);

                lblStatus.setBounds(470, 190, 200, 30);
                jcStatus.setBounds(470, 220, 200, 40);

                lblSalario.setBounds(700, 50, 200, 30);
                txtSalario.setBounds(700, 80, 200, 40);

                lblFoto.setBounds(673, 95, 225, 210);

                btnCarregarFoto.setBounds(730, 295, 165, 30);

                btnCadastrar.setBounds(470, 290, 120, 40);
                btnActualizar.setBounds(600, 290, 125, 40);
                btnEliminar.setBounds(470, 360, 130, 40);
                btnReactivar.setBounds(600, 360, 100, 40);
                txtpesquisa.setBounds(710, 360, 180, 35);
                srp.setBounds(710, 400, 180, 35);

                //cOLOCANDO AS INFORMACOES NAS CAIXAS
                jcGenero.addItem("");
                jcGenero.addItem(" Masculino ");
                jcGenero.addItem(" Feminino ");
                jcGenero.setBackground(Color.white);

                jcFuncao.addItem("");
                jcFuncao.addItem("Ajudante");
                jcFuncao.addItem(" Recepcionista ");
                jcFuncao.addItem("Caixa");
                jcFuncao.setBackground(Color.white);

                jcStatus.addItem("");
                jcStatus.addItem(" Activo ");
                jcStatus.addItem(" Inactivo ");
                jcStatus.setBackground(Color.white);

                txtPassword.setText("00000000");
                txtAcesso.setText("Funcionario");

                txtPassword.setEnabled(false);
                txtAcesso.setEnabled(false);

                //Personalizando a fonte
                lblTitulo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 24));
                lblApelido.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                lblNome.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                lblGenero.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                lblNascimento.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                lblBI_Nuit.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                lblEmail.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                lblPassword.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                lblContacto.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                lblContratacao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                lblAcesso.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                lblEndereco.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                lblFuncao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                lblStatus.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                lblSalario.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                btnCarregarFoto.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                btnActualizar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                btnReactivar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                btnCadastrar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                btnEliminar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                btnProcurar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));

                // Neste passo, vou definir o tamanho e a fonte do conteudo a ser digitado.
                txtApelido.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                txtNome.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                jcGenero.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                txtNascimento.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                txtBI_Nuit.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                txtEmail.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                txtPassword.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                txtContacto.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                txtData_Contratacao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                txtAcesso.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                txtEndereco.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                jcFuncao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                jcStatus.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                txtSalario.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                lista_2.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));

                lblFoto.setIcon(Icon_foto1);
                lblFoto.setIcon(Icon_foto);
                btnCarregarFoto.setIcon(Icon_CarregarFoto);
                btnActualizar.setIcon(Icon_ActualizarC);
                btnCadastrar.setIcon(Icon_Adicionar);
                btnEliminar.setIcon(Icon_Eliminar);

                //Personalizando as Bordas das componentes
                btnCarregarFoto.setBorder(BorderFactory.createEmptyBorder());
                btnCarregarFoto.setFocusPainted(false);
                btnActualizar.setBorder(BorderFactory.createEmptyBorder());
                btnActualizar.setFocusPainted(false);
                btnReactivar.setBorder(BorderFactory.createEmptyBorder());
                btnReactivar.setFocusPainted(false);
                btnCadastrar.setBorder(BorderFactory.createEmptyBorder());
                btnCadastrar.setFocusPainted(false);
                btnEliminar.setBorder(BorderFactory.createEmptyBorder());
                btnEliminar.setFocusPainted(false);
                btnProcurar.setBorder(BorderFactory.createEmptyBorder());
                btnProcurar.setFocusPainted(false);

                // Criando a tabela 
                String[] Colunas_Funcionarios = {"Codigo", "Apelido", "Nome", "Genero", "Email", "Status"};

                  DefaultTableModel model1 = new DefaultTableModel(Colunas_Funcionarios , 0);
                  
                // Criando as Tabelas/Listas
                JTable Tabela_Funcionarios = new JTable(model1);
                JTableHeader header_Funcionarios = Tabela_Funcionarios.getTableHeader();

                Tabela_Funcionarios.setShowGrid(false);

                Tabela_Funcionarios.getColumnModel().getColumn(0).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());
                Tabela_Funcionarios.getColumnModel().getColumn(1).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());
                Tabela_Funcionarios.getColumnModel().getColumn(2).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());
                Tabela_Funcionarios.getColumnModel().getColumn(3).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());
                Tabela_Funcionarios.getColumnModel().getColumn(4).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());
                Tabela_Funcionarios.getColumnModel().getColumn(5).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());

                header_Funcionarios .setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));

                header_Funcionarios .setForeground(new Color(102, 102, 255));

                Tabela_Funcionarios.setRowHeight(30);

                JScrollPane rol_Funcionarios = new JScrollPane(Tabela_Funcionarios);
                rol_Funcionarios .setBounds(10, 470, 900, 180);

                //Restrigindo as componentes e Coolocando acessibilidade Inicial
                txtNome.setEnabled(false);
                txtBI_Nuit.setEnabled(false);
                jcGenero.setEnabled(false);
                txtNascimento.setEnabled(false);
                txtEmail.setEnabled(false);
                txtPassword.setEnabled(false);
                txtContacto.setEnabled(false);
                txtData_Contratacao.setEnabled(false);
                txtEndereco.setEnabled(false);
                jcFuncao.setEnabled(false);
                jcStatus.setEnabled(false);
                txtSalario.setEnabled(false);
                btnCadastrar.setEnabled(false);
                btnCarregarFoto.setEnabled(false);
                btnActualizar.setEnabled(false);
                btnEliminar.setEnabled(false);
                btnReactivar.setEnabled(false);
                srp.setVisible(false);

                //Campo nome do Funxionario, colocando eventos
                txtApelido.addKeyListener(new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {

                    }

                    @Override
                    public void keyPressed(KeyEvent e) {
                        char c = e.getKeyChar();
                        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c) || (e.getKeyCode() == KeyEvent.VK_DOWN) || (e.getKeyCode() == KeyEvent.VK_RIGHT) || (e.getKeyCode() == KeyEvent.VK_LEFT)) {
                            txtApelido.setEditable(true);
                            if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN) {
                                txtNome.requestFocus();
                            }

                        } else {
                            txtApelido.setEditable(false);
                            JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                        }

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {
                        //Pegando o tamanho do texto
                        int comprimentoTexto = txtApelido.getText().length();

                        // Define a cor da borda com base no comprimento do texto
                        Color cor = (comprimentoTexto < 6) ? Color.RED : Color.GREEN;

                        // Cria uma borda com a cor desejada
                        Border bordaColorida = BorderFactory.createLineBorder(cor);

                        // Aplica a borda ao campo de texto
                        txtApelido.setBorder(bordaColorida);

                        // Permitindo com que o campo seguinte seja aberto assim como nao
                        if (cor.equals(Color.GREEN)) {
                            txtNome.setEnabled(true);

                        } else {
                            txtNome.setEnabled(false);

                        }

                        txtApelido.addFocusListener(new FocusListener() {
                            @Override
                            public void focusGained(FocusEvent e) {

                            }

                            @Override
                            public void focusLost(FocusEvent e) {

                                // Restaura a borda padrão quando o campo perde o foco
                                txtApelido.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                            }
                        });

                    }
                }); // campo Apelido
                //Campo nome do Funxionario, colocando eventos
                txtNome.addKeyListener(new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {

                    }

                    @Override
                    public void keyPressed(KeyEvent e) {
                        char c = e.getKeyChar();
                        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c) || (e.getKeyCode() == KeyEvent.VK_DOWN) || (e.getKeyCode() == KeyEvent.VK_UP) || (e.getKeyCode() == KeyEvent.VK_RIGHT) || (e.getKeyCode() == KeyEvent.VK_LEFT)) {
                            txtNome.setEditable(true);
                            if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN) {
                                txtBI_Nuit.requestFocus();
                            }
                            if (e.getKeyCode() == KeyEvent.VK_UP) {
                                txtApelido.requestFocus();
                            }

                        } else {
                            txtNome.setEditable(false);
                            JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                        }

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {
                        //Pegando o tamanho do texto
                        int comprimentoTexto = txtNome.getText().length();

                        // Define a cor da borda com base no comprimento do texto
                        Color cor = (comprimentoTexto < 6) ? Color.RED : Color.GREEN;

                        // Cria uma borda com a cor desejada
                        Border bordaColorida = BorderFactory.createLineBorder(cor);

                        // Aplica a borda ao campo de texto
                        txtNome.setBorder(bordaColorida);

                        // Permitindo com que o campo seguinte seja aberto assim como nao
                        if (cor.equals(Color.GREEN)) {
                            txtBI_Nuit.setEnabled(true);

                        } else {
                            txtBI_Nuit.setEnabled(false);

                        }

                        txtNome.addFocusListener(new FocusListener() {
                            @Override
                            public void focusGained(FocusEvent e) {

                            }

                            @Override
                            public void focusLost(FocusEvent e) {

                                // Restaura a borda padrão quando o campo perde o foco
                                txtNome.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                            }
                        });

                    }
                }); // campoNome

                //Campo Nuit do Funxionario, colocando eventos
                txtBI_Nuit.addKeyListener(new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {

                    }

                    @Override
                    public void keyPressed(KeyEvent e) {

                        if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN) {
                            jcGenero.requestFocus();
                        }
                        if (e.getKeyCode() == KeyEvent.VK_UP) {
                            txtNome.requestFocus();
                        }

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {
                        //Pegando o tamanho do texto
                        int comprimentoTexto = txtBI_Nuit.getText().length();

                        // Define a cor da borda com base no comprimento do texto
                        Color cor = (comprimentoTexto < 6) ? Color.RED : Color.GREEN;

                        // Cria uma borda com a cor desejada
                        Border bordaColorida = BorderFactory.createLineBorder(cor);

                        // Aplica a borda ao campo de texto
                        txtBI_Nuit.setBorder(bordaColorida);

                        // Permitindo com que o campo seguinte seja aberto assim como nao
                        if (cor.equals(Color.GREEN)) {
                            jcGenero.setEnabled(true);

                        } else {
                            jcGenero.setEnabled(false);

                        }

                        txtBI_Nuit.addFocusListener(new FocusListener() {
                            @Override
                            public void focusGained(FocusEvent e) {

                            }

                            @Override
                            public void focusLost(FocusEvent e) {

                                // Restaura a borda padrão quando o campo perde o foco
                                txtBI_Nuit.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                            }
                        });

                    }
                }); // campo BI

                //Dando Acção a caixa de Genero
                jcGenero.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        if (jcGenero.getSelectedIndex() != 0) {
                            txtNascimento.setEnabled(true);
                            txtEmail.setEnabled(true);
                        } else {
                            txtEmail.setEnabled(false);
                            txtNascimento.setEnabled(false);
                        }
                    }

                });
                //Email
                txtEmail.addKeyListener(new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {

                    }

                    @Override
                    public void keyPressed(KeyEvent e) {

                        if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN) {
                            txtContacto.requestFocus();
                        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                            txtEmail.requestFocus();
                        }

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {
                        //Pegando o tamanho do texto
                        int comprimentoTexto = txtEmail.getText().length();

                        Controller_Funcionario c = new Controller_Funcionario();

                        //Chamando op metodo que verifica o email
                        boolean result = c.validarEmail(txtEmail.getText());

                        // Define a cor da borda com base no comprimento do texto
                        Color cor = (result == false) ? Color.RED : Color.GREEN;

                        // Cria uma borda com a cor desejada
                        Border bordaColorida = BorderFactory.createLineBorder(cor);

                        // Aplica a borda ao campo de texto
                        txtEmail.setBorder(bordaColorida);

                        // Permitindo com que o campo seguinte seja aberto assim como nao
                        if (cor.equals(Color.GREEN)) {
                            txtContacto.setEnabled(true);

                        } else {
                            txtContacto.setEnabled(false);

                        }

                        txtEmail.addFocusListener(new FocusListener() {
                            @Override
                            public void focusGained(FocusEvent e) {

                            }

                            @Override
                            public void focusLost(FocusEvent e) {

                                // Restaura a borda padrão quando o campo perde o foco
                                txtEmail.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                            }
                        });

                    }
                }); // campo Email

                //Contacto
                txtContacto.addKeyListener(new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {

                    }

                    @Override
                    public void keyPressed(KeyEvent e) {
                        char c = e.getKeyChar();
                        if (Character.isLetter(c)) {
                            txtContacto.setEditable(false);
                            JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                        } else {
                            txtContacto.setEditable(true);
                            if (e.getKeyCode() == KeyEvent.VK_UP) {
                                txtPassword.requestFocus();
                            }

                        }

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {
                        //Pegando o tamanho do texto
                        int comprimentoTexto = txtContacto.getText().length();

                        // Define a cor da borda com base no comprimento do texto
                        Color cor = (comprimentoTexto != 9) ? Color.RED : Color.GREEN;

                        // Cria uma borda com a cor desejada
                        Border bordaColorida = BorderFactory.createLineBorder(cor);

                        // Aplica a borda ao campo de texto
                        txtContacto.setBorder(bordaColorida);

                        // Permitindo com que o campo seguinte seja aberto assim como nao
                        if (cor.equals(Color.GREEN)) {
                            txtData_Contratacao.setEnabled(true);
                            txtEndereco.setEnabled(true);

                        } else {
                            txtData_Contratacao.setEnabled(false);
                            txtEndereco.setEnabled(false);

                        }

                        txtContacto.addFocusListener(new FocusListener() {
                            @Override
                            public void focusGained(FocusEvent e) {

                            }

                            @Override
                            public void focusLost(FocusEvent e) {

                                // Restaura a borda padrão quando o campo perde o foco
                                txtContacto.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                            }
                        });

                    }
                }); // campo Contacto

                //Endereco
                txtEndereco.addKeyListener(new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {

                    }

                    @Override
                    public void keyPressed(KeyEvent e) {

                        if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN) {
                            jcFuncao.requestFocus();
                        }

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {
                        //Pegando o tamanho do texto
                        int comprimentoTexto = txtEndereco.getText().length();

                        // Define a cor da borda com base no comprimento do texto
                        Color cor = (comprimentoTexto < 5) ? Color.RED : Color.GREEN;

                        // Cria uma borda com a cor desejada
                        Border bordaColorida = BorderFactory.createLineBorder(cor);

                        // Aplica a borda ao campo de texto
                        txtEndereco.setBorder(bordaColorida);

                        // Permitindo com que o campo seguinte seja aberto assim como nao
                        if (cor.equals(Color.GREEN)) {
                            jcFuncao.setEnabled(true);

                        } else {
                            jcFuncao.setEnabled(false);

                        }

                        txtEndereco.addFocusListener(new FocusListener() {
                            @Override
                            public void focusGained(FocusEvent e) {

                            }

                            @Override
                            public void focusLost(FocusEvent e) {

                                // Restaura a borda padrão quando o campo perde o foco
                                txtEndereco.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                            }
                        });

                    }
                }); //Endereço

                //FUncao
                jcFuncao.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        if (jcFuncao.getSelectedIndex() != 0) {
                            jcStatus.setEnabled(true);
                            jcStatus.requestFocus();
                        } else {
                            jcStatus.setEnabled(false);
                        }
                    }

                });

                //Status
                jcStatus.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        if (jcStatus.getSelectedIndex() != 0) {
                            txtSalario.setEnabled(true);
                            txtSalario.requestFocus();
                        } else {
                            txtSalario.setEnabled(false);
                        }
                    }

                });

                //CCaixa de Peso ou Volume
                txtSalario.addKeyListener(new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {

                    }

                    @Override
                    public void keyPressed(KeyEvent e) {
                        char c = e.getKeyChar();
                        if (Character.isLetter(c)) {
                            txtSalario.setEditable(false);
                            JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                        } else {
                            txtSalario.setEditable(true);
                            if (e.getKeyCode() == KeyEvent.VK_UP) {
                                jcStatus.requestFocus();
                            }

                        }
                    }

                    @Override
                    public void keyReleased(KeyEvent e) {
                        //Pegando o tamanho do texto
                        int comprimentoTexto = txtSalario.getText().length();

                        // Define a cor da borda com base no comprimento do texto
                        Color cor = (comprimentoTexto < 4) ? Color.RED : Color.GREEN;

                        // Cria uma borda com a cor desejada
                        Border bordaColorida = BorderFactory.createLineBorder(cor);

                        // Aplica a borda ao campo de texto
                        txtSalario.setBorder(bordaColorida);

                        // Permitindo com que o campo seguinte seja aberto assim como nao
                        if (cor.equals(Color.GREEN)) {
                            btnCarregarFoto.setEnabled(true);
                            btnCadastrar.setEnabled(true);
                        } else {
                            btnCarregarFoto.setEnabled(false);
                            btnCadastrar.setEnabled(false);
                        }

                        txtSalario.addFocusListener(new FocusListener() {
                            @Override
                            public void focusGained(FocusEvent e) {

                            }

                            @Override
                            public void focusLost(FocusEvent e) {

                                // Restaura a borda padrão quando o campo perde o foco
                                txtSalario.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                            }
                        });

                    }
                });

                //Adicionando
                pnlGestao_Funcionarios.add(lblTitulo);
                pnlGestao_Funcionarios.add(lblTitulo);
                pnlGestao_Funcionarios.add(lblApelido);
                pnlGestao_Funcionarios.add(lblNome);
                pnlGestao_Funcionarios.add(lblGenero);
                pnlGestao_Funcionarios.add(lblNascimento);
                pnlGestao_Funcionarios.add(lblBI_Nuit);
                pnlGestao_Funcionarios.add(lblEmail);
                pnlGestao_Funcionarios.add(lblPassword);
                pnlGestao_Funcionarios.add(lblContacto);
                pnlGestao_Funcionarios.add(lblContratacao);
                pnlGestao_Funcionarios.add(lblAcesso);
                pnlGestao_Funcionarios.add(lblEndereco);
                pnlGestao_Funcionarios.add(lblFuncao);
                pnlGestao_Funcionarios.add(lblStatus);
                pnlGestao_Funcionarios.add(lblSalario);
                pnlGestao_Funcionarios.add(lblFoto);

                pnlGestao_Funcionarios.add(txtApelido);
                pnlGestao_Funcionarios.add(txtNome);
                pnlGestao_Funcionarios.add(jcGenero);
                pnlGestao_Funcionarios.add(txtNascimento);
                pnlGestao_Funcionarios.add(txtBI_Nuit);
                pnlGestao_Funcionarios.add(txtEmail);
                pnlGestao_Funcionarios.add(txtPassword);
                pnlGestao_Funcionarios.add(txtContacto);
                pnlGestao_Funcionarios.add(txtData_Contratacao);
                pnlGestao_Funcionarios.add(txtAcesso);
                pnlGestao_Funcionarios.add(txtEndereco);
                pnlGestao_Funcionarios.add(jcFuncao);
                pnlGestao_Funcionarios.add(jcStatus);
                pnlGestao_Funcionarios.add(txtSalario);
                pnlGestao_Funcionarios.add(txtpesquisa);
                pnlGestao_Funcionarios.add(srp);

                pnlGestao_Funcionarios.add(rol_Funcionarios );

                pnlGestao_Funcionarios.add(btnCarregarFoto);
                pnlGestao_Funcionarios.add(btnReactivar);
                pnlGestao_Funcionarios.add(btnActualizar);
                pnlGestao_Funcionarios.add(btnCadastrar);
                pnlGestao_Funcionarios.add(btnProcurar);
                pnlGestao_Funcionarios.add(btnEliminar);

                //Fonte
                lblTitulo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 22));
                lblApelido.setForeground(new Color(102, 102, 255));
                lblNome.setForeground(new Color(102, 102, 255));
                lblGenero.setForeground(new Color(102, 102, 255));
                lblNascimento.setForeground(new Color(102, 102, 255));
                lblBI_Nuit.setForeground(new Color(102, 102, 255));
                lblEmail.setForeground(new Color(102, 102, 255));
                lblPassword.setForeground(new Color(102, 102, 255));
                lblContacto.setForeground(new Color(102, 102, 255));
                lblContratacao.setForeground(new Color(102, 102, 255));
                lblAcesso.setForeground(new Color(102, 102, 255));
                lblEndereco.setForeground(new Color(102, 102, 255));
                lblFuncao.setForeground(new Color(102, 102, 255));
                lblStatus.setForeground(new Color(102, 102, 255));
                lblSalario.setForeground(new Color(102, 102, 255));
                btnCarregarFoto.setForeground(new Color(0, 102, 255));
                btnActualizar.setForeground(new Color(0, 102, 255));
                btnCadastrar.setForeground(new Color(0, 102, 255));
                btnEliminar.setForeground(new Color(0, 102, 255));
                btnProcurar.setForeground(new Color(0, 102, 255));
                btnReactivar.setForeground(new Color(0, 102, 255));

                // Personalizando o BackGround
                btnCarregarFoto.setBackground(Color.white);
                btnActualizar.setBackground(Color.white);
                btnReactivar.setBackground(Color.white);
                btnCadastrar.setBackground(Color.white);
                btnProcurar.setBackground(Color.white);
                btnEliminar.setBackground(Color.white);

                //Instancia do objecto qyue vai invocar os metodos
                DAO_Funcionario dao_fun = new DAO_Funcionario();

                //Invocando o metodo que traz todos os dados
                ArrayList<Funcionario> lista_Fun = dao_fun.FindAll();

                for (int i = 0; i < lista_Fun.size(); i++) {
                    Object[] row = new Object[8];
                    if (!lista_Fun.get(i).getNivel_acesso().equalsIgnoreCase("Gerente")) {
                        row[0] = lista_Fun.get(i).getId();
                        row[1] = lista_Fun.get(i).getApelido();
                        row[2] = lista_Fun.get(i).getNome();
                        row[3] = lista_Fun.get(i).getGenero();
                        row[4] = lista_Fun.get(i).getEmail();
                        row[5] = lista_Fun.get(i).getEstado();
                        model1.addRow(row);
                    }

                }
                //Dando ação aos Botoes
                btnCadastrar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //Formatando as caixas

                        Controller_Funcionario c_fun = new Controller_Funcionario();

                        int contacto = Integer.parseInt(txtContacto.getText());
                        double salario = Double.parseDouble(txtSalario.getText());

                        java.util.Date nascimento = txtNascimento.getDate();

                        java.util.Date contratacao = (txtData_Contratacao.getDate());

                        java.sql.Date nascimento2 = new java.sql.Date(nascimento.getTime());
                        java.sql.Date contratacao2 = new java.sql.Date(contratacao.getTime());

                        String genero = (String) jcGenero.getSelectedItem();
                        String funcao = (String) jcFuncao.getSelectedItem();
                        String status = (String) jcStatus.getSelectedItem();

                        String apelido = txtApelido.getText();
                        String nome = txtNome.getText();
                        String bi = txtBI_Nuit.getText();
                        String email = txtEmail.getText();
                        String password = txtPassword.getText();
                        String acesso = txtAcesso.getText();
                        String endereco = txtEndereco.getText();

                        long tamanho = lista_Fun.size() + 1;

                        String codigo_fun = "FUNSM" + 1000 + tamanho;

                        c_fun.Verificacao(codigo_fun, apelido, nome, bi, genero, nascimento2, email, password, contacto, contratacao2, acesso, endereco, funcao, status, salario, imagemBytes);

                        for (int i = 0; i < lista_Fun.size(); i++) {
                            Object[] row = new Object[8];
                            if ((i == lista_Fun.size() - 1) && (!lista_Fun.get(i).getNivel_acesso().equalsIgnoreCase("Gerente"))) {

                                row[0] = lista_Fun.get(i).getId();
                                row[1] = lista_Fun.get(i).getApelido();
                                row[2] = lista_Fun.get(i).getNome();
                                row[3] = lista_Fun.get(i).getGenero();
                                row[4] = lista_Fun.get(i).getEmail();
                                row[5] = lista_Fun.get(i).getEstado();
                                model1.addRow(row);
                            }

                        }
                    }
                });

                //Dando ação aos Botoes
                btnCarregarFoto.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Controller_Funcionario c = new Controller_Funcionario();

                        imagemBytes = c.CarregarImagem(lblFoto);
                        icon = new ImageIcon(imagemBytes);
                        lblFoto.setIcon(icon);
                        lblFoto.updateUI();
                        lblFoto.setBounds(730, 95, 225, 210);

                    }
                });

                Tabela_Funcionarios.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {

                        btnCadastrar.setEnabled(false);
                        btnActualizar.setEnabled(true);
                        btnEliminar.setEnabled(true);
                        btnReactivar.setEnabled(true);
                        btnCarregarFoto.setEnabled(true);

                        txtNome.setEnabled(true);
                        txtBI_Nuit.setEnabled(true);
                        jcGenero.setEnabled(true);
                        txtNascimento.setEnabled(true);
                        txtEmail.setEnabled(true);
                        txtPassword.setEnabled(true);
                        txtContacto.setEnabled(true);
                        txtData_Contratacao.setEnabled(true);
                        txtEndereco.setEnabled(true);
                        jcFuncao.setEnabled(true);
                        jcStatus.setEnabled(true);
                        txtSalario.setEnabled(true);

                        linha = Tabela_Funcionarios.getSelectedRow();

                        chave = (Long) Tabela_Funcionarios.getModel().getValueAt(Tabela_Funcionarios.getSelectedRow(), 0);
                        txtApelido.setText((String) Tabela_Funcionarios.getModel().getValueAt(Tabela_Funcionarios.getSelectedRow(), 1));
                        txtNome.setText((String) Tabela_Funcionarios.getModel().getValueAt(Tabela_Funcionarios.getSelectedRow(), 2));
                        jcGenero.setSelectedItem((String) Tabela_Funcionarios.getModel().getValueAt(Tabela_Funcionarios.getSelectedRow(), 3));
                        txtEmail.setText((String) Tabela_Funcionarios.getModel().getValueAt(Tabela_Funcionarios.getSelectedRow(), 4));
                        jcStatus.setSelectedItem((String) Tabela_Funcionarios.getModel().getValueAt(Tabela_Funcionarios.getSelectedRow(), 5));

                        for (int i = 0; i < lista_Fun.size(); i++) {
                            if (lista_Fun.get(i).getId() == (chave)) {
                                txtBI_Nuit.setText(lista_Fun.get(i).getNumero_BI_Nuit());
                                txtNascimento.setDate(lista_Fun.get(i).getData_nascimento());
                                txtContacto.setText(String.valueOf(lista_Fun.get(i).getContacto()));
                                txtData_Contratacao.setDate(lista_Fun.get(i).getData_contratacao());
                                txtEndereco.setText(lista_Fun.get(i).getEndereco());
                                jcFuncao.setSelectedItem(lista_Fun.get(i).getFuncao());
                                txtSalario.setText(String.valueOf(lista_Fun.get(i).getSalario()));

                                byte[] img = lista_Fun.get(i).getFoto();
                                BufferedImage imagem = null;
                                try {
                                    imagem = ImageIO.read(new ByteArrayInputStream(img));
                                } catch (IOException ex) {
                                    JOptionPane.showMessageDialog(null, "Erro ao Converter a Imagem " + ex.getMessage());
                                }

                                ImageIcon Icone = new ImageIcon(imagem.getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                                lblFoto.setIcon(null);
                                lblFoto.setIcon(Icone);
                                lblFoto.setBounds(730, 95, 225, 210);

                            }
                        }
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {

                    }

                    @Override
                    public void mouseExited(MouseEvent e) {

                    }

                });
                btnActualizar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        Controller_Funcionario c_fun = new Controller_Funcionario();

                        int contacto = Integer.parseInt(txtContacto.getText());
                        double salario = Double.parseDouble(txtSalario.getText());

                        java.util.Date nascimento = txtNascimento.getDate();

                        java.util.Date contratacao = (txtData_Contratacao.getDate());

                        java.sql.Date nascimento2 = new java.sql.Date(nascimento.getTime());
                        java.sql.Date contratacao2 = new java.sql.Date(contratacao.getTime());

                        String genero = (String) jcGenero.getSelectedItem();
                        String funcao = (String) jcFuncao.getSelectedItem();
                        String status = (String) jcStatus.getSelectedItem();

                        String apelido = txtApelido.getText();
                        String nome = txtNome.getText();
                        String bi = txtBI_Nuit.getText();
                        String email = txtEmail.getText();
                        String password = txtPassword.getText();
                        String acesso = txtAcesso.getText();
                        String endereco = txtEndereco.getText();

                        byte[] img = null;
                        long id = 0;

                        for (Funcionario i : lista_Fun) {

                            if (i.getId() == chave) {
                                id = chave;
                                if (imagemBytes == null) {
                                    img = i.getFoto();
                                } else {
                                    img = imagemBytes;
                                }
                            }

                        }

                        c_fun.Verificacao_Update_Manager(id, apelido, nome, bi, genero, nascimento2, email, password, contacto, contratacao2, acesso, endereco, funcao, status, salario, img);

                        //Invocando o metodo que traz todos os dados
                    }
                });

                btnEliminar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        DAO_Funcionario dao_fun = new DAO_Funcionario();
                        if (chave == null) {
                            JOptionPane.showMessageDialog(null, "Primeiro selecione um funcionario na tabela");
                        } else {
                            fun.setId(chave);

                            fun.setEstado(" Inactivo ");

                            dao_fun.Estado_Fun(fun);
                        }

                    }

                });
                btnReactivar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        DAO_Funcionario dao_fun = new DAO_Funcionario();
                        if (chave == null) {
                            JOptionPane.showMessageDialog(null, "Primeiro selecione um funcionario na tabela");
                        } else {
                            fun.setId(chave);

                            fun.setEstado(" Activo ");

                            dao_fun.Estado_Fun(fun);
                        }

                    }

                });

                lista_2.setModel(modelo);

                txtpesquisa.addKeyListener(new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {

                    }

                    @Override
                    public void keyPressed(KeyEvent e) {
                        char c = e.getKeyChar();
                        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c) || (e.getKeyCode() == KeyEvent.VK_DOWN) || (e.getKeyCode() == KeyEvent.VK_RIGHT) || (e.getKeyCode() == KeyEvent.VK_LEFT)) {
                            txtpesquisa.setEditable(true);
                            if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN) {

                            }

                        } else {
                            txtpesquisa.setEditable(false);
                            JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                        }

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {
                        //Pegando o tamanho do texto
                        int comprimentoTexto = txtpesquisa.getText().length();

                        // Define a cor da borda com base no comprimento do texto
                        Color cor = (comprimentoTexto < 1) ? Color.RED : Color.GREEN;

                        // Cria uma borda com a cor desejada
                        Border bordaColorida = BorderFactory.createLineBorder(cor);

                        // Aplica a borda ao campo de texto
                        txtpesquisa.setBorder(bordaColorida);

                        // Permitindo com que o campo seguinte seja aberto assim como nao
                        if (cor.equals(Color.GREEN)) {
                            srp.setVisible(true);
                            DAO_Funcionario dao_fun = new DAO_Funcionario();
                            ArrayList<Funcionario> lista = dao_fun.GoogleSearch(txtpesquisa);

                            DefaultListModel<Funcionario> modelo = new DefaultListModel<>();
                            for (Funcionario i : lista) {
                                modelo.addElement(i);
                                System.out.println(i);
                            }

                            lista_2.setModel(modelo);
                        }
                        txtpesquisa.addFocusListener(new FocusListener() {
                            @Override
                            public void focusGained(FocusEvent e) {

                            }

                            @Override
                            public void focusLost(FocusEvent e) {

                                // Restaura a borda padrão quando o campo perde o foco
                                txtpesquisa.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                            }
                        });

                    }
                }); // campopesquisa

                pnlauxPrincipal.add(pnlGestao_Funcionarios);
                pnlGestao_Funcionarios.setVisible(true);
            }
        });

        //Visao Gera l
        btnVisaoGeral.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlPrincipal.setVisible(false);
                pnlMenssagens.setVisible(false);
                pnlConfiguracoes.setVisible(false);
                pnlGestao_Funcionarios.setVisible(false);
                pnlMeuPerfil.setVisible(false);

                pnlVisaoGeral.setLayout(null);
                pnlVisaoGeral.setBounds(280, 0, 920, 680);
                pnlVisaoGeral.setBackground(Color.WHITE);

                PainelPersonalizado pnlQtds = new PainelPersonalizado();

                PainelPersonalizado pnlFuncionario_Vendas = new PainelPersonalizado();
                PainelPersonalizado pnlCategorias_produto = new PainelPersonalizado();
                PainelPersonalizado pnlProdutos_Vendas = new PainelPersonalizado();
                PainelPersonalizado pnlClientes_Pedidos = new PainelPersonalizado();

                pnlQtds.setLayout(null);
                pnlQtds.setBounds(10, 10, 900, 80);
                pnlQtds.setBackground(Color.WHITE);

                pnlFuncionario_Vendas.setLayout(null);
                pnlFuncionario_Vendas.setBounds(10, 120, 440, 250);
                pnlFuncionario_Vendas.setBackground(Color.WHITE);

                pnlCategorias_produto.setLayout(null);
                pnlCategorias_produto.setBounds(470, 120, 440, 250);
                pnlCategorias_produto.setBackground(Color.WHITE);

                pnlProdutos_Vendas.setLayout(null);
                pnlProdutos_Vendas.setBounds(10, 390, 440, 250);
                pnlProdutos_Vendas.setBackground(Color.WHITE);

                pnlClientes_Pedidos.setLayout(null);
                pnlClientes_Pedidos.setBounds(470, 390, 440, 250);
                pnlClientes_Pedidos.setBackground(Color.WHITE);

                JLabel lblFuncionario = new JLabel("Funcionarios");
                JLabel lblQtdFun = new JLabel();

                JLabel lblCategorias = new JLabel("Categorias");
                JLabel lblQtdCategorias = new JLabel();

                JLabel lblProdutos = new JLabel("Produtos");
                JLabel lblQtdProdutos = new JLabel();

                JLabel lblVendas = new JLabel("Vendas");
                JLabel lblQtdVendas = new JLabel("10");

                JLabel lblPedidos = new JLabel("Clientes");
                JLabel lblQtdPedidos = new JLabel("6");

                lblFuncionario.setIcon(Icon_Eliminar);
                lblCategorias.setIcon(Icon_Eliminar);
                lblProdutos.setIcon(Icon_Eliminar);
                lblVendas.setIcon(Icon_Eliminar);
                lblPedidos.setIcon(Icon_Eliminar);

                lblFuncionario.setBounds(20, 5, 140, 40);
                lblQtdFun.setBounds(95, 40, 30, 30);
                lblCategorias.setBounds(210, 5, 140, 40);
                lblQtdCategorias.setBounds(290, 40, 30, 30);
                lblProdutos.setBounds(430, 5, 140, 40);
                lblQtdProdutos.setBounds(490, 40, 30, 30);
                lblVendas.setBounds(600, 5, 140, 40);
                lblQtdVendas.setBounds(650, 40, 30, 30);
                lblPedidos.setBounds(750, 5, 140, 40);
                lblQtdPedidos.setBounds(815, 40, 30, 30);

                //Foreground personalizada
//                lblQtdFun.setForeground(new Color(0, 102, 255));
//                lblQtdCategorias.setForeground(new Color(0, 102, 255));
//                lblQtdProdutos.setForeground(new Color(0, 102, 255));
//                lblQtdVendas.setForeground(new Color(0, 102, 255));
//                lblQtdPedidos.setForeground(new Color(0, 102, 255));
                //Fonte 
                lblFuncionario.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                lblQtdFun.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                lblQtdCategorias.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                lblCategorias.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                lblProdutos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                lblQtdProdutos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                lblQtdVendas.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                lblVendas.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                lblPedidos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                lblQtdPedidos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));

                pnlQtds.add(lblFuncionario);
                pnlQtds.add(lblQtdFun);
                pnlQtds.add(lblQtdCategorias);
                pnlQtds.add(lblQtdProdutos);
                pnlQtds.add(lblCategorias);
                pnlQtds.add(lblProdutos);
                pnlQtds.add(lblVendas);
                pnlQtds.add(lblQtdVendas);
                pnlQtds.add(lblPedidos);
                pnlQtds.add(lblQtdPedidos);

                pnlVisaoGeral.add(pnlQtds);
                pnlVisaoGeral.add(pnlFuncionario_Vendas);
                pnlVisaoGeral.add(pnlCategorias_produto);
                pnlVisaoGeral.add(pnlClientes_Pedidos);
                pnlVisaoGeral.add(pnlProdutos_Vendas);

                //Fazendo a contagem total das coisas.
                DAO_Categoria dao_c = new DAO_Categoria();
                DAO_Produtos dao_p = new DAO_Produtos();
                DAO_Funcionario dao_f = new DAO_Funcionario();

                ArrayList<Categorias> lista_categorias = dao_c.FindAll_Categoria();
                ArrayList<Produtos> lista_produtos = dao_p.FindAll_Produtos();
                ArrayList<Funcionario> lista_funcionarios = dao_f.FindAll();

                lblQtdCategorias.setText(String.valueOf(lista_categorias.size()));
                lblQtdProdutos.setText(String.valueOf(lista_produtos.size()));
                lblQtdFun.setText(String.valueOf(lista_funcionarios.size()));

                pnlVisaoGeral.setVisible(true);

                pnlauxPrincipal.add(pnlVisaoGeral);
            }
        });

        //Menssagens
        btnMenssagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlPrincipal.setVisible(true);
                pnlMenu_Botoes.setVisible(false);
                pnlVisaoGeral.setVisible(false);
                pnlConfiguracoes.setVisible(false);
                pnlGestao_Funcionarios.setVisible(false);
                pnlMeuPerfil.setVisible(false);

                JPanel pnlMenssagens = new JPanel();
                pnlMenssagens.setLayout(null);
                //
                pnlMenssagens.setBackground(new Color(102, 102, 255));
                pnlMenssagens.setBounds(0, 0, 280, 680);

                JButton btnEnviar = new JButton("Escrever ");
                JButton btnCaixa = new JButton(" Recebidas");
                JButton btnGerir = new JButton(" Configurações");
                JButton btnVoltarPrincipal = new JButton(" Voltar");

                JTextField txtbarra2 = new JTextField();
                JLabel lblFotografia = new JLabel();

                // Colocando a imagem de perfil
                for (Funcionario i : lista) {

                    byte[] img = i.getFoto();
                    BufferedImage imagem = null;
                    try {
                        imagem = ImageIO.read(new ByteArrayInputStream(img));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                    ImageIcon Icone = new ImageIcon(imagem.getScaledInstance(150, 150, Image.SCALE_SMOOTH));

                    lblNomefuncionario.setText(i.getNome());
                    lblFotografia.setIcon(Icone);

                }
                btnEnviar.setIcon(Icon_EscreverMenssagem);
                btnCaixa.setIcon(Icon_CaixaMenssagem);
                btnGerir.setIcon(Icon_Configurações);
                btnVoltarPrincipal.setIcon(Icon_Voltar);

                lblFotografia.setBounds(45, 70, 180, 180);
                txtbarra2.setBounds(30, 251, 210, 1);
                btnEnviar.setBounds(30, 281, 130, 40);
                btnCaixa.setBounds(30, 351, 140, 40);
                btnGerir.setBounds(30, 421, 180, 40);
                btnVoltarPrincipal.setBounds(30, 491, 100, 40);

                btnEnviar.setBackground(new Color(102, 102, 255));
                btnCaixa.setBackground(new Color(102, 102, 255));
                btnGerir.setBackground(new Color(102, 102, 255));
                btnVoltarPrincipal.setBackground(new Color(102, 102, 255));

                btnEnviar.setForeground(Color.white);
                btnCaixa.setForeground(Color.white);
                btnGerir.setForeground(Color.white);
                btnVoltarPrincipal.setForeground(Color.white);

                btnEnviar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                btnCaixa.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                btnGerir.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                btnVoltarPrincipal.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));

                btnVoltarPrincipal.setBorder(BorderFactory.createEmptyBorder());
                btnVoltarPrincipal.setFocusPainted(false);
                btnEnviar.setBorder(BorderFactory.createEmptyBorder());
                btnEnviar.setFocusPainted(false);
                btnCaixa.setBorder(BorderFactory.createEmptyBorder());
                btnCaixa.setFocusPainted(false);
                btnGerir.setBorder(BorderFactory.createEmptyBorder());
                btnGerir.setFocusPainted(false);

                // Criando instancia dos paineis que vou usar
                JPanel pnlEnviar = new JPanel();
                JPanel pnlCaixa = new JPanel();
                JPanel pnlGerir = new JPanel();

                // ESTADO INICIAL
                pnlEnviar.setVisible(false);
                pnlCaixa.setVisible(false);
                pnlGerir.setVisible(false);

                // Enviar Mensssagem
                btnEnviar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pnlPrincipal.setVisible(false);
                        pnlCaixa.setVisible(false);
                        pnlGerir.setVisible(false);
                        pnlEnviar.setVisible(false);

                        pnlEnviar.setBackground(Color.white);
                        pnlEnviar.setLayout(null);
                        pnlEnviar.setBounds(280, 0, 920, 680);

                        JLabel lblTitulo = new JLabel("Menssagem");
                        JLabel lblDestinatario = new JLabel("Destinatario");
                        JLabel lblRemetente = new JLabel("Remetente");
                        JComboBox jcDestinatario = new JComboBox();
                        JTextArea txta = new JTextArea();
                        JTextField txtRemetente = new JTextField();

                        //Botoes 
                        BotaoPersonalizado btnEnviar = new BotaoPersonalizado("Enviar");
                        btnEnviar.setFocusPainted(false);
                        BotaoPersonalizado btnLimpar = new BotaoPersonalizado("Apagar");
                        btnLimpar.setFocusPainted(false);
                        //Foreground
                        lblTitulo.setForeground(new Color(102, 102, 255));
                        lblDestinatario.setForeground(new Color(102, 102, 255));
                        lblRemetente.setForeground(new Color(102, 102, 255));
                        btnLimpar.setForeground(new Color(0, 102, 255));
                        btnEnviar.setForeground(new Color(0, 102, 255));

                        //BackGround
                        btnEnviar.setBackground(Color.white
                        );
                        btnLimpar.setBackground(Color.white);
                        jcDestinatario.setBackground(Color.white);

                        //Cordenadas
                        lblTitulo.setBounds(95, 110, 250, 30);
                        lblRemetente.setBounds(565, 115, 100, 30);
                        txtRemetente.setBounds(565, 145, 200, 30);
                        lblDestinatario.setBounds(565, 200, 100, 30);
                        jcDestinatario.setBounds(565, 230, 200, 30);
                        txta.setBounds(95, 140, 450, 350);
                        btnLimpar.setBounds(690, 460, 80, 30);
                        btnEnviar.setBounds(565, 460, 80, 30);

                        //Borda  
                        txta.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
                        txtRemetente.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));

                        //Fonte 
                        lblTitulo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 20));
                        lblDestinatario.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        lblRemetente.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        txta.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        jcDestinatario.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        txtRemetente.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        btnLimpar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnEnviar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));

                        // Instrucao que nao permite alterar
                        jcDestinatario.addItem("");
                        txtRemetente.setEnabled(false);

                        //Adicionando as Componentes
                        pnlEnviar.add(lblTitulo);
                        pnlEnviar.add(lblDestinatario);
                        pnlEnviar.add(jcDestinatario);
                        pnlEnviar.add(lblRemetente);
                        pnlEnviar.add(txtRemetente);
                        pnlEnviar.add(txta);
                        pnlEnviar.add(btnEnviar);
                        pnlEnviar.add(btnLimpar);

                        pnlauxPrincipal.add(pnlEnviar);
                        pnlEnviar.setVisible(true);
                    }
                });

                //Caixa de Entrada
                btnCaixa.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pnlPrincipal.setVisible(false);
                        pnlGerir.setVisible(false);
                        pnlEnviar.setVisible(false);

                        pnlCaixa.setBackground(Color.white);
                        pnlCaixa.setLayout(null);
                        pnlCaixa.setBounds(280, 0, 920, 680);

                        //CRIANDO AS COMPONENTES
                        JLabelComBordaRedonda lblMenssagem = new JLabelComBordaRedonda();
                        lblMenssagem.setText("Ola mundo\n i miss you");
                        JLabel lblTitulo = new JLabel("Menssagens Recebidas");
                        JButton btnNext = new JButton();
                        JButton btnPreview = new JButton();
                        JButton btnProcurar = new JButton();
                        JComboBox jcRementente = new JComboBox();

                        btnNext.setIcon(Icon_Proximo);
                        btnPreview.setIcon(Icon_Anterior);

                        //ForeGround
                        lblTitulo.setForeground(new Color(0, 102, 255));

                        //Background
                        btnNext.setBackground(Color.white);
                        btnPreview.setBackground(Color.white);
                        jcRementente.setBackground(Color.white);
                        btnProcurar.setBackground(Color.white);

                        //Bordas
                        //blMenssagem.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
                        btnNext.setBorder(BorderFactory.createEmptyBorder());
                        btnNext.setFocusPainted(false);
                        btnProcurar.setBorder(BorderFactory.createEmptyBorder());
                        btnProcurar.setFocusPainted(false);
                        btnPreview.setBorder(BorderFactory.createEmptyBorder());
                        btnPreview.setFocusPainted(false);

                        //Localizacao
                        lblMenssagem.setBounds(155, 140, 600, 500);
                        jcRementente.setBounds(550, 90, 200, 30);
                        btnProcurar.setBounds(750, 85, 40, 40);
                        lblTitulo.setBounds(340, 0, 250, 30);
                        btnPreview.setBounds(70, 350, 40, 40);
                        btnNext.setBounds(800, 350, 40, 40);

                        // 
                        jcRementente.addItem("");
                        btnProcurar.setIcon(Icon_Procurar);

                        //Fonte
                        lblTitulo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 20));
                        lblMenssagem.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        jcRementente.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));

                        pnlCaixa.add(lblMenssagem);
                        pnlCaixa.add(lblTitulo);
                        pnlCaixa.add(btnPreview);
                        pnlCaixa.add(btnNext);
                        pnlCaixa.add(jcRementente);
                        pnlCaixa.add(btnProcurar);

                        pnlauxPrincipal.add(pnlCaixa);

                        pnlCaixa.setVisible(true);
                    }
                });

                //Gerir Menssagens
                btnGerir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pnlPrincipal.setVisible(true);
                        pnlMenssagens.setVisible(false);
                        pnlCaixa.setVisible(false);
                        pnlEnviar.setVisible(false);

                        pnlGerir.setBackground(new Color(102, 102, 255));
                        pnlGerir.setLayout(null);
                        pnlGerir.setBounds(0, 0, 280, 680);
                        JButton btnMenssagens_Envidas = new JButton("Menssagens Enviadas ");
                        JButton btnMenssagens_Recebidas = new JButton("Menssagens Recebidas");
                        JButton btnRelatorio_enviadas = new JButton("Relatorio de Envio");
                        JButton btnVoltarPrincipal = new JButton("Voltar");

                        JTextField txtbarra2 = new JTextField();
                        JLabel lblFotografia = new JLabel();

                        // Colocando a imagem de perfil
                        for (Funcionario i : lista) {

                            byte[] img = i.getFoto();
                            BufferedImage imagem = null;
                            try {
                                imagem = ImageIO.read(new ByteArrayInputStream(img));
                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }

                            ImageIcon Icone = new ImageIcon(imagem.getScaledInstance(150, 150, Image.SCALE_SMOOTH));

                            lblNomefuncionario.setText(i.getNome());
                            lblFotografia.setIcon(Icone);

                        }
                        btnRelatorio_enviadas.setIcon(Icon_RelatorioMenssagem);

                        lblFotografia.setBounds(45, 50, 150, 150);
                        txtbarra2.setBounds(30, 251, 210, 1);
                        btnMenssagens_Envidas.setBounds(20, 281, 240, 40);
                        btnMenssagens_Recebidas.setBounds(13, 351, 240, 40);
                        btnRelatorio_enviadas.setBounds(23, 421, 240, 40);
                        btnVoltarPrincipal.setBounds(15, 491, 150, 40);

                        btnMenssagens_Envidas.setBackground(new Color(102, 102, 255));
                        btnMenssagens_Recebidas.setBackground(new Color(102, 102, 255));
                        btnRelatorio_enviadas.setBackground(new Color(102, 102, 255));
                        btnVoltarPrincipal.setBackground(new Color(102, 102, 255));

                        btnMenssagens_Envidas.setForeground(Color.white);
                        btnMenssagens_Recebidas.setForeground(Color.white);
                        btnRelatorio_enviadas.setForeground(Color.white);
                        btnVoltarPrincipal.setForeground(Color.white);

                        btnMenssagens_Envidas.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                        btnMenssagens_Recebidas.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                        btnRelatorio_enviadas.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                        btnVoltarPrincipal.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));

                        btnVoltarPrincipal.setBorder(BorderFactory.createEmptyBorder());
                        btnVoltar.setFocusPainted(false);
                        btnMenssagens_Envidas.setBorder(BorderFactory.createEmptyBorder());
                        btnMenssagens_Envidas.setFocusPainted(false);
                        btnMenssagens_Recebidas.setBorder(BorderFactory.createEmptyBorder());
                        btnMenssagens_Recebidas.setFocusPainted(false);
                        btnRelatorio_enviadas.setBorder(BorderFactory.createEmptyBorder());
                        btnRelatorio_enviadas.setFocusPainted(false);

                        JPanel pnlMenssagens_Enviadas = new JPanel();
                        JPanel pnlMenssagens_Recebidas = new JPanel();
                        JPanel pnlMenssagens_Relatorio = new JPanel();

                        pnlMenssagens_Enviadas.setVisible(false);
                        pnlMenssagens_Recebidas.setVisible(false);
                        pnlMenssagens_Relatorio.setVisible(false);

                        //Menssagens Enviadas
                        btnMenssagens_Envidas.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                //Duas possibilidades!!!
                                ///Criar uma tabela com informacoe basicas da menssgem e uma label para visualizar

                            }
                        });

                        //Menssagens Recebidas
                        btnMenssagens_Recebidas.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                //Duas possibilidades!!!
                                ///Criar uma tabela com informacoe basicas da menssgem e uma label para visualizar

                            }
                        });
                        // Relatorio de Menssagens
                        btnRelatorio_enviadas.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                //Duas possibilidades!!!
                                ///Criar uma tabela com informacoe basicas da menssgem e uma label para visualizar

                            }
                        });

                        //aqui serve para Voltar a tela Principal de Menssagens
                        btnVoltarPrincipal.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                pnlGerir.setVisible(false);
                                pnlMenssagens_Enviadas.setVisible(false);
                                pnlMenssagens_Recebidas.setVisible(false);
                                pnlMenssagens_Relatorio.setVisible(false);
                                pnlMenssagens.setVisible(true);
                                pnlPrincipal.setVisible(true);

                            }
                        });

                        pnlGerir.add(lblFotografia);
                        pnlGerir.add(txtbarra2);
                        pnlGerir.add(btnMenssagens_Envidas);
                        pnlGerir.add(btnMenssagens_Recebidas);
                        pnlGerir.add(btnRelatorio_enviadas);
                        pnlGerir.add(btnVoltarPrincipal);

                        pnlauxPrincipal.add(pnlGerir);
                        pnlauxPrincipal.add(pnlPrincipal);

                        pnlGerir.setVisible(true);
                    }
                });

                // Neste passo, vou fechar o painel de categorias e recolocar o painel principal
                btnVoltarPrincipal.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pnlEnviar.setVisible(false);
                        pnlCaixa.setVisible(false);
                        pnlGerir.setVisible(false);
                        pnlMenssagens.setVisible(false);
                        pnlMenu_Botoes.setVisible(true);
                        pnlPrincipal.setVisible(true);

                    }
                });

                pnlMenssagens.add(lblFotografia);
                pnlMenssagens.add(txtbarra2);
                pnlMenssagens.add(btnEnviar);
                pnlMenssagens.add(btnCaixa);
                pnlMenssagens.add(btnGerir);
                pnlMenssagens.add(btnVoltarPrincipal);

                pnlauxPrincipal.add(pnlMenssagens);

                pnlMenssagens.setVisible(true);
            }
        });

        // Configurações
        btnConfiguracoes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlPrincipal.setVisible(true);
                pnlMenu_Botoes.setVisible(false);
                pnlVisaoGeral.setVisible(false);
                pnlMenssagens.setVisible(false);
                pnlGestao_Funcionarios.setVisible(false);
                pnlMeuPerfil.setVisible(false);

                pnlConfiguracoes.setBounds(0, 0, 280, 700);
                pnlConfiguracoes.setBackground(new Color(102, 102, 255));
                pnlConfiguracoes.setLayout(null);

                JButton btnActualizardados = new JButton("  Actualizar Dados");
                JButton btnAlterarSenha = new JButton(" Segurança e Privacidade");
                JButton btnVoltar = new JButton("  Voltar");

                JLabel lblFotografia = new JLabel();
                JTextField txtbarra = new JTextField();

                lblFotografia.setBounds(45, 70, 150, 150);
                txtbarra.setBounds(30, 251, 210, 1);

                btnActualizardados.setBounds(20, 280, 220, 40);
                btnVoltar.setBounds(20, 351, 120, 40);
                btnActualizardados.setBackground(new Color(102, 102, 255));
                btnVoltar.setBackground(new Color(102, 102, 255));

                btnActualizardados.setForeground(Color.white);
                btnVoltar.setForeground(Color.white);

                btnActualizardados.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                btnVoltar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));

                btnVoltar.setBorder(BorderFactory.createEmptyBorder());
                btnVoltar.setFocusPainted(false);
                btnActualizardados.setBorder(BorderFactory.createEmptyBorder());
                btnActualizardados.setFocusPainted(false);

                // Colocando a imagem de perfil
                for (Funcionario i : lista) {

                    byte[] img = i.getFoto();
                    BufferedImage imagem = null;
                    try {
                        imagem = ImageIO.read(new ByteArrayInputStream(img));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                    ImageIcon Icone = new ImageIcon(imagem.getScaledInstance(150, 150, Image.SCALE_SMOOTH));

                    lblNomefuncionario.setText(i.getNome());
                    lblFotografia.setIcon(Icone);

                }
                btnVoltar.setIcon(Icon_Voltar);
                btnActualizardados.setIcon(Icon_Gestao_Funcionario);

                pnlConfiguracoes.add(lblFotografia);
                pnlConfiguracoes.add(txtbarra);
                pnlConfiguracoes.add(btnVoltar);
                pnlConfiguracoes.add(btnActualizardados);

                for (Funcionario i : lista) {
                    byte[] img = i.getFoto();
                    BufferedImage imagem = null;
                    try {
                        imagem = ImageIO.read(new ByteArrayInputStream(img));
                        ImageIcon Icone = new ImageIcon(imagem.getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                        lblFotografia.setIcon(Icone);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }

                // Declarando os paineis que irei usar no botao defincao
                JPanel pnlActualizar_Dados = new JPanel();
                pnlActualizar_Dados.setVisible(false);

                //Neste passo , vou dar continuidade, colocando as componentes para actualizar dados
                btnActualizardados.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pnlPrincipal.setVisible(false);
                        pnlActualizar_Dados.setBounds(280, 0, 920, 700);
                        pnlActualizar_Dados.setBackground(Color.white);
                        pnlActualizar_Dados.setLayout(null);

                        //Craindo as ComponentesAt
                        JLabel lblTitulo = new JLabel("Actualizar Infomações");
                        JLabel lblFoto = new JLabel();
                        JLabel imgApelido = new JLabel();
                        JLabel imgNome = new JLabel();
                        JLabel imgGenero = new JLabel();
                        JLabel imgNascimento = new JLabel();
                        JLabel imgBI = new JLabel();
                        JLabel imgEmail = new JLabel();
                        JLabel imgPassword = new JLabel();
                        JLabel imgContacto = new JLabel();
                        JLabel imgContratacao = new JLabel();
                        JLabel imgAcesso = new JLabel();
                        JLabel imgEndereço = new JLabel();

                        JLabel lblApelido = new JLabel("Apelido");
                        JLabel lblNome = new JLabel("Nome");
                        JLabel lblGenero = new JLabel("Genero");
                        JLabel lblNascimento = new JLabel("Data de Nascimento");
                        JLabel lblBI_Nuit = new JLabel("Numero do BI/Nuit");
                        JLabel lblEmail = new JLabel("Email");
                        JLabel lblPassword = new JLabel("Palavra-passe");
                        JLabel lblContacto = new JLabel("Contacto");
                        JLabel lblAcesso = new JLabel("Perfil");
                        JLabel lblContratacao = new JLabel("Data da contratação");
                        JLabel lblEndereco = new JLabel("Endereço");
                        JLabel lblFuncao = new JLabel("Função Desempenhada ");
                        JLabel lblStatus = new JLabel("Status do Funcionario ");
                        JLabel lblSalario = new JLabel("Salario ");

                        JTextField txtApelido = new JTextField();
                        JTextField txtNome = new JTextField();
                        JComboBox jcGenero = new JComboBox();
                        JDateChooser txtNascimento = new JDateChooser();
                        JTextField txtBI_Nuit = new JTextField();
                        JTextField txtEmail = new JTextField();
                        JPasswordField txtPassword = new JPasswordField();
                        JTextField txtContacto = new JTextField();
                        JTextField txtAcesso = new JTextField();
                        JDateChooser txtData_Contratacao = new JDateChooser();
                        JTextField txtEndereco = new JTextField();
                        JComboBox jcFuncao = new JComboBox<>();
                        JComboBox jcStatus = new JComboBox<>();
                        JTextField txtSalario = new JTextField();

                        JButton btnCarregarFoto = new JButton("Carregar IMG");
                        JButton btnActualizar = new JButton("Actualizar");

                        // Criando a tabela 
                        String[] Colunas = {"Email", "Password", "Contacto", "Endereço", "Estado"};

                        DefaultTableModel tabela_Funcionarios = new DefaultTableModel(Colunas, 0);

                        // Criando as Tabelas/Listas
                        JTable Lista_Funcionarios = new JTable(tabela_Funcionarios);
                        JTableHeader header = Lista_Funcionarios.getTableHeader();

                        Lista_Funcionarios.getColumnModel().getColumn(0).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());
                        Lista_Funcionarios.getColumnModel().getColumn(1).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());
                        Lista_Funcionarios.getColumnModel().getColumn(2).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());
                        Lista_Funcionarios.getColumnModel().getColumn(3).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());
                        Lista_Funcionarios.getColumnModel().getColumn(4).setCellRenderer(new MultilineCellRenderer.MultilineCellRendererWrapper());

                        Lista_Funcionarios.setShowGrid(false);//
                        Lista_Funcionarios.setRowHeight(120);

                        header.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        header.setForeground(new Color(102, 102, 255));

                        JScrollPane rol = new JScrollPane(Lista_Funcionarios);

                        //Foreground
                        lblTitulo.setForeground(new Color(0, 102, 255));

                        //Cordenadas
                        lblTitulo.setBounds(340, 0, 350, 30);

                        lblApelido.setBounds(100, 70, 200, 30);
                        txtApelido.setBounds(100, 100, 200, 40);

                        lblNome.setBounds(100, 140, 200, 30);
                        txtNome.setBounds(100, 170, 200, 40);

                        lblBI_Nuit.setBounds(100, 210, 200, 30);
                        txtBI_Nuit.setBounds(100, 240, 200, 40);

                        lblGenero.setBounds(100, 280, 200, 30);
                        jcGenero.setBounds(100, 310, 200, 40);

                        lblNascimento.setBounds(100, 350, 200, 30);
                        txtNascimento.setBounds(100, 380, 200, 40);

                        lblEmail.setBounds(360, 70, 200, 30);
                        txtEmail.setBounds(360, 100, 200, 40);

                        lblPassword.setBounds(360, 140, 200, 30);
                        txtPassword.setBounds(360, 170, 200, 40);

                        lblContacto.setBounds(620, 70, 200, 30);
                        txtContacto.setBounds(620, 100, 200, 40);

                        lblContratacao.setBounds(620, 140, 200, 30);
                        txtData_Contratacao.setBounds(620, 170, 200, 40);

                        lblAcesso.setBounds(620, 210, 200, 30);
                        txtAcesso.setBounds(620, 240, 200, 40);

                        lblEndereco.setBounds(620, 280, 200, 30);
                        txtEndereco.setBounds(620, 310, 200, 40);

                        lblFuncao.setBounds(620, 350, 200, 30);
                        jcFuncao.setBounds(620, 380, 200, 40);

                        lblSalario.setBounds(620, 420, 200, 30);
                        txtSalario.setBounds(620, 450, 200, 40);

                        lblStatus.setBounds(100, 420, 200, 30);
                        jcStatus.setBounds(100, 450, 200, 40);

                        lblFoto.setBounds(330, 200, 225, 210);

                        btnCarregarFoto.setBounds(380, 390, 165, 30);

                        btnActualizar.setBounds(365, 450, 165, 30);
                        rol.setBounds(100, 520, 720, 130);

                        //cOLOCANDO AS INFORMACOES NAS CAIXAS
                        jcGenero.addItem("");
                        jcGenero.addItem(" Masculino ");
                        jcGenero.addItem(" Feminino ");
                        jcGenero.setBackground(Color.white);

                        jcFuncao.addItem("");
                        jcFuncao.addItem(" Helper Clients ");
                        jcFuncao.addItem(" Recepcionista ");
                        jcFuncao.addItem("Caixa");
                        jcFuncao.setBackground(Color.white);

                        jcStatus.addItem("");
                        jcStatus.addItem(" Activo ");
                        jcStatus.addItem(" Inactivo ");
                        jcStatus.setBackground(Color.white);

                        //Privando algumas Actualições
                        txtApelido.setEnabled(false);
                        txtNome.setEnabled(false);
                        jcGenero.setEnabled(false);
                        txtNascimento.setEnabled(false);
                        txtBI_Nuit.setEnabled(false);
                        txtData_Contratacao.setEnabled(false);
                        txtAcesso.setEnabled(false);
                        jcFuncao.setEnabled(false);
                        jcStatus.setEnabled(false);
                        txtSalario.setEnabled(false);

                        //Personalizando a fonte
                        lblTitulo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        lblApelido.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        lblNome.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        lblGenero.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        lblNascimento.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        lblBI_Nuit.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        lblEmail.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        lblPassword.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        lblContacto.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        lblContratacao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        lblAcesso.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        lblEndereco.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        lblFuncao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        lblStatus.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        lblSalario.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        btnCarregarFoto.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnActualizar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));

                        // Neste passo, vou definir o tamanho e a fonte do conteudo a ser digitado.
                        txtApelido.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtNome.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        jcGenero.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtNascimento.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtBI_Nuit.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtEmail.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtPassword.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtContacto.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtData_Contratacao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtAcesso.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtEndereco.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        jcFuncao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        jcStatus.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtSalario.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));

                        lblFoto.setIcon(Icon_foto);

                        btnCarregarFoto.setIcon(Icon_CarregarFoto);
                        btnActualizar.setIcon(Icon_Actualizar);
                        //Personalizando as Bordas das componentes
                        btnCarregarFoto.setBorder(BorderFactory.createEmptyBorder());
                        btnCarregarFoto.setFocusPainted(false);
                        btnActualizar.setBorder(BorderFactory.createEmptyBorder());
                        btnActualizar.setFocusPainted(false);

                        //Validando alguns Campos
                        //Email
                        txtEmail.addKeyListener(new KeyListener() {
                            @Override
                            public void keyTyped(KeyEvent e) {

                            }

                            @Override
                            public void keyPressed(KeyEvent e) {

                                if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN) {
                                    txtPassword.requestFocus();
                                } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                                    txtEmail.requestFocus();
                                }

                            }

                            @Override
                            public void keyReleased(KeyEvent e) {
                                //Pegando o tamanho do texto
                                int comprimentoTexto = txtEmail.getText().length();

                                // Define a cor da borda com base no comprimento do texto
                                Color cor = (comprimentoTexto < 10) ? Color.RED : Color.GREEN;

                                // Cria uma borda com a cor desejada
                                Border bordaColorida = BorderFactory.createLineBorder(cor);

                                // Aplica a borda ao campo de texto
                                txtEmail.setBorder(bordaColorida);
                                if (cor.equals(Color.GREEN)) {
                                    txtPassword.setEnabled(true);
                                } else {
                                    txtPassword.setEnabled(false);
                                }

                                txtEmail.addFocusListener(new FocusListener() {
                                    @Override
                                    public void focusGained(FocusEvent e) {

                                    }

                                    @Override
                                    public void focusLost(FocusEvent e) {

                                        // Restaura a borda padrão quando o campo perde o foco
                                        txtEmail.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                    }
                                });

                            }
                        }); // campo Email
                        //Passwrod
                        txtPassword.addKeyListener(new KeyListener() {
                            @Override
                            public void keyTyped(KeyEvent e) {

                            }

                            @Override
                            public void keyPressed(KeyEvent e) {

                                if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN) {
                                    txtContacto.requestFocus();
                                } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                                    txtEmail.requestFocus();
                                }

                            }

                            @Override
                            public void keyReleased(KeyEvent e) {
                                //Pegando o tamanho do texto
                                int comprimentoTexto = txtPassword.getText().length();

                                // Define a cor da borda com base no comprimento do texto
                                Color cor = (comprimentoTexto < 8) ? Color.RED : Color.GREEN;

                                // Cria uma borda com a cor desejada
                                Border bordaColorida = BorderFactory.createLineBorder(cor);

                                // Aplica a borda ao campo de texto
                                txtPassword.setBorder(bordaColorida);
                                if (cor.equals(Color.GREEN)) {
                                    txtContacto.setEnabled(true);
                                } else {
                                    txtContacto.setEnabled(false);
                                }

                                txtPassword.addFocusListener(new FocusListener() {
                                    @Override
                                    public void focusGained(FocusEvent e) {

                                    }

                                    @Override
                                    public void focusLost(FocusEvent e) {

                                        // Restaura a borda padrão quando o campo perde o foco
                                        txtPassword.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                    }
                                });

                            }
                        }); // campo Password

                        //Contacto
                        txtContacto.addKeyListener(new KeyListener() {
                            @Override
                            public void keyTyped(KeyEvent e) {

                            }

                            @Override
                            public void keyPressed(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (Character.isLetter(c)) {
                                    txtContacto.setEditable(false);
                                    JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                } else {
                                    txtContacto.setEditable(true);

                                    if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_ENTER) {
                                        txtEndereco.requestFocus();
                                    }

                                    if (e.getKeyCode() == KeyEvent.VK_UP) {
                                        txtPassword.requestFocus();
                                    }

                                }

                            }

                            @Override
                            public void keyReleased(KeyEvent e) {
                                //Pegando o tamanho do texto
                                int comprimentoTexto = txtContacto.getText().length();

                                // Define a cor da borda com base no comprimento do texto
                                Color cor = (comprimentoTexto != 9) ? Color.RED : Color.GREEN;

                                // Cria uma borda com a cor desejada
                                Border bordaColorida = BorderFactory.createLineBorder(cor);

                                // Aplica a borda ao campo de texto
                                txtContacto.setBorder(bordaColorida);

                                // Permitindo com que o campo seguinte seja aberto assim como nao
                                if (cor.equals(Color.GREEN)) {
                                    txtEndereco.setEnabled(true);

                                } else {
                                    txtEndereco.setEnabled(false);

                                }

                                txtContacto.addFocusListener(new FocusListener() {
                                    @Override
                                    public void focusGained(FocusEvent e) {

                                    }

                                    @Override
                                    public void focusLost(FocusEvent e) {

                                        // Restaura a borda padrão quando o campo perde o foco
                                        txtContacto.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                    }
                                });

                            }
                        }); // campo Contacto

                        //Endereco
                        txtEndereco.addKeyListener(new KeyListener() {
                            @Override
                            public void keyTyped(KeyEvent e) {

                            }

                            @Override
                            public void keyPressed(KeyEvent e) {

                                if (e.getKeyCode() == KeyEvent.VK_UP) {
                                    txtContacto.requestFocus();
                                }

                            }

                            @Override
                            public void keyReleased(KeyEvent e) {
                                //Pegando o tamanho do texto
                                int comprimentoTexto = txtEndereco.getText().length();

                                // Define a cor da borda com base no comprimento do texto
                                Color cor = (comprimentoTexto < 6) ? Color.RED : Color.GREEN;

                                // Cria uma borda com a cor desejada
                                Border bordaColorida = BorderFactory.createLineBorder(cor);

                                // Aplica a borda ao campo de texto
                                txtEndereco.setBorder(bordaColorida);

                                txtEndereco.addFocusListener(new FocusListener() {
                                    @Override
                                    public void focusGained(FocusEvent e) {

                                    }

                                    @Override
                                    public void focusLost(FocusEvent e) {

                                        // Restaura a borda padrão quando o campo perde o foco
                                        txtEndereco.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                    }
                                });

                            }
                        }); // campo Endereco

                        btnActualizar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                            }
                        });

                        pnlActualizar_Dados.add(lblTitulo);
                        pnlActualizar_Dados.add(lblTitulo);
                        pnlActualizar_Dados.add(lblApelido);
                        pnlActualizar_Dados.add(lblNome);
                        pnlActualizar_Dados.add(lblGenero);
                        pnlActualizar_Dados.add(lblNascimento);
                        pnlActualizar_Dados.add(lblBI_Nuit);
                        pnlActualizar_Dados.add(lblEmail);
                        pnlActualizar_Dados.add(lblPassword);
                        pnlActualizar_Dados.add(lblContacto);
                        pnlActualizar_Dados.add(lblContratacao);
                        pnlActualizar_Dados.add(lblAcesso);
                        pnlActualizar_Dados.add(lblEndereco);
                        pnlActualizar_Dados.add(lblFuncao);
                        pnlActualizar_Dados.add(lblStatus);
                        pnlActualizar_Dados.add(lblSalario);
                        pnlActualizar_Dados.add(lblFoto);

                        pnlActualizar_Dados.add(txtApelido);
                        pnlActualizar_Dados.add(txtNome);
                        pnlActualizar_Dados.add(jcGenero);
                        pnlActualizar_Dados.add(txtNascimento);
                        pnlActualizar_Dados.add(txtBI_Nuit);
                        pnlActualizar_Dados.add(txtEmail);
                        pnlActualizar_Dados.add(txtPassword);
                        pnlActualizar_Dados.add(txtContacto);
                        pnlActualizar_Dados.add(txtData_Contratacao);
                        pnlActualizar_Dados.add(txtAcesso);
                        pnlActualizar_Dados.add(txtEndereco);
                        pnlActualizar_Dados.add(jcFuncao);
                        pnlActualizar_Dados.add(jcStatus);
                        pnlActualizar_Dados.add(txtSalario);
                        pnlActualizar_Dados.add(rol);

                        pnlActualizar_Dados.add(btnCarregarFoto);
                        pnlActualizar_Dados.add(btnActualizar);

                        //Fonte
                        lblTitulo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        lblApelido.setForeground(new Color(102, 102, 255));
                        lblNome.setForeground(new Color(102, 102, 255));
                        lblGenero.setForeground(new Color(102, 102, 255));
                        lblNascimento.setForeground(new Color(102, 102, 255));
                        lblBI_Nuit.setForeground(new Color(102, 102, 255));
                        lblEmail.setForeground(new Color(102, 102, 255));
                        lblPassword.setForeground(new Color(102, 102, 255));
                        lblContacto.setForeground(new Color(102, 102, 255));
                        lblContratacao.setForeground(new Color(102, 102, 255));
                        lblAcesso.setForeground(new Color(102, 102, 255));
                        lblEndereco.setForeground(new Color(102, 102, 255));
                        lblFuncao.setForeground(new Color(102, 102, 255));
                        lblStatus.setForeground(new Color(102, 102, 255));
                        lblSalario.setForeground(new Color(102, 102, 255));
                        btnCarregarFoto.setForeground(new Color(0, 102, 255));
                        btnActualizar.setForeground(new Color(0, 102, 255));

                        // Personalizando o BackGround
                        btnCarregarFoto.setBackground(Color.white);
                        btnActualizar.setBackground(Color.white);

                        for (Funcionario i : lista) {
                            Object[] row = new Object[8];

                            row[0] = i.getEmail();
                            row[1] = i.getPassword();
                            row[2] = i.getContacto();
                            row[3] = i.getEndereco();
                            row[4] = i.getEstado();

                            tabela_Funcionarios.addRow(row);

                        }//Fim do for loop

                        for (Funcionario i : lista) {

                            txtApelido.setText(i.getApelido());
                            txtNome.setText(i.getNome());
                            jcGenero.setSelectedItem(i.getGenero());
                            txtBI_Nuit.setText(i.getNumero_BI_Nuit());
                            txtNascimento.setDate(i.getData_nascimento());
                            txtContacto.setText(String.valueOf(i.getContacto()));
                            txtEmail.setText(i.getEmail());
                            txtPassword.setText(i.getPassword());
                            txtData_Contratacao.setDate(i.getData_contratacao());
                            txtEndereco.setText(i.getEndereco());
                            jcFuncao.setSelectedItem(i.getFuncao());
                            txtSalario.setText(String.valueOf(i.getSalario()));
                            txtAcesso.setText(i.getNivel_acesso());
                            jcStatus.setSelectedItem(i.getEstado());

                            byte[] img = i.getFoto();
                            BufferedImage imagem = null;
                            try {
                                imagem = ImageIO.read(new ByteArrayInputStream(img));
                            } catch (IOException ex) {
                                JOptionPane.showMessageDialog(null, "Erro ao Converter a Imagem " + ex.getMessage());
                            }

                            ImageIcon Icone = new ImageIcon(imagem.getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                            lblFoto.setIcon(null);
                            lblFoto.setIcon(Icone);
                            lblFoto.setBounds(380, 205, 225, 210);

                        }

                        // aqui irei carregar uma nova imagem
                        btnCarregarFoto.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                Controller_Funcionario c = new Controller_Funcionario();

                                imagemBytes = c.CarregarImagem(lblFoto);
                                icon = new ImageIcon(imagemBytes);
                                lblFoto.setIcon(icon);
                                lblFoto.updateUI();
                                lblFoto.setBounds(380, 205, 225, 210);

                            }

                        });
                        // Este botao vai actualizar tudo relativamente ao funciomnario, mas apenas oque esta no seu dominio
                        btnActualizar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                Controller_Funcionario c = new Controller_Funcionario();
                                long id = 0;
                                byte[] img = null;
                                int cell = Integer.parseInt(txtContacto.getText());

                                String email = (txtEmail.getText());
                                String password = (txtPassword.getText());
                                int contacto = (cell);
                                String endereco = (txtEndereco.getText());
                                id = 0;
//Uma vez que que trago todos dados do banco, o campo  imagem nao pode ficar fazio senao dara erro!!!
                                for (Funcionario i : lista) {
                                    id = i.getId();
                                    if (imagemBytes == null) {
                                        img = (i.getFoto());
                                    } else {
                                        img = (imagemBytes);
                                    }

                                }
                                //Mando os dados para serem verificados, antes de actualizar
                                c.validacao_Update(id, email, password, endereco, contacto, img);
                                new Admin().setVisible(false);
                                dispose();
                                new Admin().setVisible(true);

                            }

                        });
                        pnlActualizar_Dados.setVisible(true);

                    }
                });

                //Neste passo, vou colocar no false todos paineis que eu tenha usando neste metodo, para assegurar
                //com que estes paineis nao se sobrepoam e deixar apenas um visivel aqui antescede a esta.
                btnVoltar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pnlActualizar_Dados.setVisible(false);
                        pnlConfiguracoes.setVisible(false);
                        pnlPrincipal.setVisible(true);
                        pnlMenu_Botoes.setVisible(true);

                    }
                });

                pnlauxPrincipal.add(pnlConfiguracoes);
                pnlauxPrincipal.add(pnlMenssagens);
                pnlauxPrincipal.add(pnlActualizar_Dados);
                pnlauxPrincipal.add(pnlPrincipal);
                pnlConfiguracoes.setVisible(true);

            }
        });
        // Perfil
        btnMeuPerfil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //Voltar
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        setJMenuBar(barraMenu);
        pnlauxPrincipal.add(pnlMenu_Botoes);
        pnlauxPrincipal.add(pnlPrincipal);
        pnlPrincipal.add(lblLogo);
        this.add(pnlauxPrincipal);

        this.setVisible(true);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Admin().setVisible(true);
    }
}
