/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CSS.BotaoPersonalizado;
import CSS.JLabelComBordaRedonda;
import CSS.PainelPersonalizado;
import Validacoes.Metodos_Vendas;
import com.sun.tools.javac.tree.JCTree;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author HOLLY MAN
 */
public class Funcionario_Caixa extends JFrame {

    ImageIcon fotografiaPerfil = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/Aten.jpeg"));
    ImageIcon Imagem_Cumpany = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/Aten.jpeg"));
    ImageIcon Imagem_Fundo = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/Aten.jpeg"));
    ImageIcon Icon_Perfil = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/Perfil2.png"));
    ImageIcon Icon_Tarefas = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/Tarefas2.png"));
    ImageIcon Icon_Listar = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/Listar.png"));
    ImageIcon Icon_Definições = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/definicoes2.png"));
    ImageIcon Icon_Voltar = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/botao-voltar.png"));
    ImageIcon Icon_Vender = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/produtos.png"));
    ImageIcon Icon_Historico = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/Historico.png"));
    ImageIcon Icon_Procurar = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/pesquisa.png"));
    ImageIcon Icon_Busca = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/Busca1.png"));
    ImageIcon Icon_Adicionar_Carinha = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/adicionar-ao-carrinho (1).png"));
    ImageIcon Icon_Eliminar_Carinha = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/remover-do-carrinho (1).png"));
    ImageIcon Icon_foto = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/imagemGaleria.png"));
    ImageIcon Icon_CarregarFoto = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/CarregarImagemF.png"));
    ImageIcon Icon_Actualizar = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/editar.png"));
    ImageIcon Icon_btnActualizarFu = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/funcionarios.png"));
    ImageIcon Logotipo = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/Logo.jpeg"));
    ImageIcon Icon_Menssagem = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/mensagem.png"));

    // Icons para campos de texto
    ImageIcon Icon_RelatorioMenssagem = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/relatorio_1.png"));
    ImageIcon Icon_EscreverMenssagem = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/escrever-mensagem.png"));
    ImageIcon Icon_CaixaMenssagem = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/caixaMenssagens.png"));
    ImageIcon Icon_Proximo = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/proximo.png"));
    ImageIcon Icon_Anterior = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/anterior.png"));
    ImageIcon Icon_catao = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/cartao_credito.png"));
    ImageIcon Icon_cartao1 = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/cartao_credito1.png"));
    ImageIcon Icon_mkesh = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/mkesh.png"));
    ImageIcon Icon_mpesa = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/mpesa.png"));
    ImageIcon Icon_emola = new ImageIcon(Funcionario_Caixa.class.getResource("/Imagens/emola.png"));

    JButton btnMeuPerfil = new JButton("  Meu Perfil");
    JButton btnServicos = new JButton(" Tarefas");
    JButton btnHistorico_Vendas = new JButton("  Minhas Vendas");
    JButton btnMenssagem = new JButton("  Menssagem");
    JButton btnDefinicoes = new JButton("  Configurações");
    JLabel lblImagem = new JLabel();
    JButton btnSair = new JButton("  Voltar");

    JTextField txtbarra = new JTextField();
    JPanel pnlPrincipal = new JPanel();
    JPanel pnlauxPrincipal = new JPanel();

    // Este é o construtor da classe respondavel pela criacaoda frame e tudo que nele existir
    public Funcionario_Caixa() {

        this.setSize(1200, 700);
        this.setLocationRelativeTo(null);
        this.setUndecorated(true);
        this.setLayout(null);

        //Esses dois paineis vao me facilitar a mover a tela apartir do mouse
        JPanel pnlbarra1 = new JPanel();
        JPanel pnlbarra2 = new JPanel();

        //Definindo o Layout
        pnlPrincipal.setLayout(null);
        pnlauxPrincipal.setLayout(null);
        pnlbarra1.setLayout(null);
        pnlbarra2.setLayout(null);

        //Atribuindo Foreground aos Paineis
        pnlbarra1.setBackground(new Color(102, 102, 255));
        pnlbarra2.setBackground(Color.white);

        // Dando acao ao painel para se movimentar
        pnlbarra1.setBounds(0, 0, 280, 40);
        pnlbarra2.setBounds(280, 0, 920, 40);
        pnlauxPrincipal.setBounds(0, 40, 1200, 660);
        pnlPrincipal.setBounds(280, 0, 920, 660);
        pnlauxPrincipal.setBackground(Color.white);
        pnlPrincipal.setBackground(Color.white);

        lblImagem.setBounds(0, 0, 920, 660);
        lblImagem.setIcon(Logotipo);
        pnlPrincipal.add(lblImagem);

        // O codigo abaixo é referente a criacao de um perfil para o funcionario
        // e tambem alguns paineis.
        JPanel pnlDe_Menu_Principal = new JPanel();
        pnlDe_Menu_Principal.setBounds(0, 0, 280, 700);
        pnlDe_Menu_Principal.setLayout(null);
        pnlDe_Menu_Principal.setBackground(new Color(102, 102, 255));

        pnlauxPrincipal.add(pnlDe_Menu_Principal);

        JLabel lblFoto = new JLabel();
        JLabel lblNomefuncionario = new JLabel();
        JLabel lblFormacao = new JLabel();

        lblFoto.setBounds(10, 40, 100, 120);
        lblNomefuncionario.setBounds(120, 75, 280, 30);
        lblFormacao.setBounds(120, 65, 280, 100);
        lblNomefuncionario.setText("Holy Man");
        lblFormacao.setText("Funcionario");
        lblFormacao.setForeground(Color.white);
        lblNomefuncionario.setForeground(Color.white);
        lblNomefuncionario.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
        lblFormacao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 12));

        lblFoto.setIcon(fotografiaPerfil);

        txtbarra.setBounds(10, 180, 255, 1);

        // O codigo abaixo é referente aos butoes de menu (personalizacao)
        btnServicos.setBounds(21, 200, 110, 40);
        btnHistorico_Vendas.setBounds(18, 260, 180, 40);
        btnMenssagem.setBounds(20, 330, 152, 40);
        btnDefinicoes.setBounds(20, 400, 175, 40);
        btnMeuPerfil.setBounds(20, 470, 135, 40);
        btnSair.setBounds(20, 540, 105, 40);

        // Agoora, neste passo vou trabalhar a fonte.
        btnMeuPerfil.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
        btnServicos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
        btnHistorico_Vendas.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
        btnMenssagem.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
        btnDefinicoes.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
        btnSair.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));

        // Neste passo, vou trabalhar o background
        btnMeuPerfil.setBackground(new Color(102, 102, 255));
        btnServicos.setBackground(new Color(102, 102, 255));
        btnHistorico_Vendas.setBackground(new Color(102, 102, 255));
        btnMenssagem.setBackground(new Color(102, 102, 255));
        btnDefinicoes.setBackground(new Color(102, 102, 255));
        btnSair.setBackground(new Color(102, 102, 255));

        //Neste passo, vou trabalhar o Foreground
        btnMeuPerfil.setForeground(Color.white);
        btnServicos.setForeground(Color.white);
        btnHistorico_Vendas.setForeground(Color.white);
        btnMenssagem.setForeground(Color.white);
        btnDefinicoes.setForeground(Color.white);
        btnSair.setForeground(Color.white);

        // Neste passo, vou trabalhar as bordas dos botoes
        btnMeuPerfil.setBorder(BorderFactory.createEmptyBorder());
        btnMeuPerfil.setFocusPainted(false);
        btnServicos.setBorder(BorderFactory.createEmptyBorder());
        btnServicos.setFocusPainted(false);
        btnHistorico_Vendas.setBorder(BorderFactory.createEmptyBorder());
        btnHistorico_Vendas.setFocusPainted(false);
        btnMenssagem.setBorder(BorderFactory.createEmptyBorder());
        btnMenssagem.setFocusPainted(false);
        btnDefinicoes.setBorder(BorderFactory.createEmptyBorder());
        btnDefinicoes.setFocusPainted(false);
        btnSair.setBorder(BorderFactory.createEmptyBorder());
        btnSair.setFocusPainted(false);

        // Adiciobando Icon 
        btnMeuPerfil.setIcon(Icon_Perfil);
        btnDefinicoes.setIcon(Icon_Definições);
        btnHistorico_Vendas.setIcon(Icon_Historico);
        btnMenssagem.setIcon(Icon_Menssagem);
        btnServicos.setIcon(Icon_Tarefas);
        btnSair.setIcon(Icon_Voltar);

        // Neste passo, adicionei as componenetes criadas acima criados.
        pnlDe_Menu_Principal.add(lblFoto);
        pnlDe_Menu_Principal.add(lblNomefuncionario);
        pnlDe_Menu_Principal.add(lblFormacao);
        pnlDe_Menu_Principal.add(txtbarra);
        pnlDe_Menu_Principal.add(btnMeuPerfil);
        pnlDe_Menu_Principal.add(btnServicos);
        pnlDe_Menu_Principal.add(btnHistorico_Vendas);
        pnlDe_Menu_Principal.add(btnMenssagem);
        pnlDe_Menu_Principal.add(btnDefinicoes);
        pnlDe_Menu_Principal.add(btnSair);

        // Neste passo vou criar paineis e dar accção para cada um desses botes.
        JPanel pnlMeuPerfil = new JPanel();
        JPanel pnlServicos = new JPanel();
        JPanel pnlHistorico = new JPanel();
        JPanel pnlDefinicoes = new JPanel();
        JPanel pnlMenssagens = new JPanel();

        //Todos paineis comecam como false porque nao pretendo usa-los durante o programa todo somente em lugares especificos
        pnlMeuPerfil.setVisible(false);
        pnlServicos.setVisible(false);
        pnlHistorico.setVisible(false);
        pnlDefinicoes.setVisible(false);

        //primeiro sera o botao  meu perfil
        btnMeuPerfil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlPrincipal.setVisible(true);
                pnlServicos.setVisible(false);
                pnlHistorico.setVisible(false);
                pnlDefinicoes.setVisible(false);
                pnlMenssagens.setVisible(false);
                pnlDe_Menu_Principal.setVisible(false);

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

                JLabel lblFotografia = new JLabel();
                lblApelido.setText("Apelido :  Langa");
                lblNomeFuncionario.setText("Nome :  Belton");
                lblGenero.setText("Genero :  Masculino");
                lblData_Nascimento.setText("Data de Nascimento :  03/04/2003");
                lblNumeroBI.setText("Numero de BI : 100105802273N");
                lblEmail.setText("Email:  beltonlanga@gmail.com");
                lblContacto.setText("Contacto :  843454984");
                lblestado.setText("Estado : Activo");

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
                lblFotografia.setBounds(45, 30, 180, 180);
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
                lblFotografia.setIcon(fotografiaPerfil);
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
                        pnlDe_Menu_Principal.setVisible(true);
                    }
                });

            }
        });

        // Neste passo, vou dar acção ao botao tarefas e craiar tudo que deve existir nele
        btnServicos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlPrincipal.setVisible(true);
                pnlHistorico.setVisible(false);
                pnlDefinicoes.setVisible(false);
                pnlMeuPerfil.setVisible(false);
                pnlDe_Menu_Principal.setVisible(false);
                pnlMenssagens.setVisible(false);

                JPanel pnlListar = new JPanel();
                JPanel pnlVenderProdutos = new JPanel();
                JPanel pnlProcurarProdutos = new JPanel();
                JPanel pnlVendas = new JPanel();
                JPanel pnlPagamento = new JPanel();

                pnlServicos.setBounds(0, 0, 1200, 700);
                pnlServicos.setBackground(Color.white);
                pnlServicos.setLayout(null);

                JTextField txtbarra2 = new JTextField();
                JLabel lblFotografia = new JLabel();
                JPanel MenuServicos = new JPanel();
                JButton btnVender = new JButton("   Venda & Pedidos");
                JButton btnListarProdutos = new JButton("   Listar Produtos");
                JButton btnPedidos = new JButton("   Pedidos");
                JButton btnVoltarPrincipal = new JButton("   Voltar");

                lblFotografia.setBounds(45, 50, 180, 180);
                txtbarra2.setBounds(30, 251, 210, 1);
                MenuServicos.setBounds(0, 0, 280, 700);
                btnVender.setBounds(20, 281, 240, 40);
                btnListarProdutos.setBounds(13, 351, 240, 40);
                btnPedidos.setBounds(35, 421, 130, 40);
                btnVoltarPrincipal.setBounds(15, 491, 150, 40);

                MenuServicos.setLayout(null);
                btnVender.setBackground(new Color(102, 102, 255));
                btnListarProdutos.setBackground(new Color(102, 102, 255));
                btnPedidos.setBackground(new Color(102, 102, 255));
                btnVoltarPrincipal.setBackground(new Color(102, 102, 255));
                MenuServicos.setBackground(new Color(102, 102, 255));

                btnVender.setForeground(Color.white);
                btnListarProdutos.setForeground(Color.white);
                btnPedidos.setForeground(Color.white);
                btnVoltarPrincipal.setForeground(Color.white);

                btnVender.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                btnListarProdutos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                btnPedidos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                btnVoltarPrincipal.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));

                btnVoltarPrincipal.setBorder(BorderFactory.createEmptyBorder());
                btnVoltarPrincipal.setFocusPainted(false);
                btnVender.setBorder(BorderFactory.createEmptyBorder());
                btnVender.setFocusPainted(false);
                btnVoltarPrincipal.setFocusPainted(false);
                btnListarProdutos.setBorder(BorderFactory.createEmptyBorder());
                btnListarProdutos.setFocusPainted(false);
                btnPedidos.setBorder(BorderFactory.createEmptyBorder());
                btnPedidos.setFocusPainted(false);

                //Colocando Icones
                btnVoltarPrincipal.setIcon(Icon_Voltar);
                btnListarProdutos.setIcon(Icon_Listar);
                btnVender.setIcon(Icon_Vender);
                btnPedidos.setIcon(Icon_Definições);

                // neste, passo vou aqui permitir com que ao clicar no botao vender ele abra uma outra janela com os produtos
                btnVender.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pnlListar.setVisible(false);
                        pnlVendas.setVisible(false);

                        pnlVenderProdutos.setLayout(null);
                        pnlVenderProdutos.setBounds(280, 0, 920, 700);
                        pnlVenderProdutos.setBackground(Color.white);

                        JLabel lblListar = new JLabel();
                        JLabel lblLista_compras = new JLabel();
                        JTextField txtPesquisa = new JTextField();
                        JLabel lblTotal = new JLabel("Total a Pagar");
                        JLabel lblViewMoney = new JLabel("0");

                        JButton btnAdicionar_carinho = new JButton();
                        JButton btnEliminar_Carinho = new JButton();
                        BotaoPersonalizado btnProximo = new BotaoPersonalizado("Proximo");

                        //BackGround
                        btnProximo.setBackground(Color.white);

                        lblListar.setBounds(270, 0, 300, 30);
                        lblListar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        lblTotal.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        lblViewMoney.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));

                        lblLista_compras.setBounds(270, 310, 350, 30);
                        lblLista_compras.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnProximo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));

                        btnAdicionar_carinho.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
                        btnEliminar_Carinho.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
                        btnProximo.setFocusPainted(false);

                        lblListar.setText("Selecione o produto na Tabela");
                        lblLista_compras.setText("Lista de Produtos Selecionados");

                        lblListar.setForeground(new Color(0, 102, 255));
                        lblLista_compras.setForeground(new Color(0, 102, 255));
                        btnProximo.setForeground(new Color(0, 102, 255));
                        lblTotal.setForeground(new Color(102, 102, 255));

                        btnAdicionar_carinho.setBackground(Color.white);
                        btnEliminar_Carinho.setBackground(Color.white);

                        String[] Colunas_Produtos = {"Produto", "Marca", "Codigo_Barra", "Descrição", "Preço", "Medida", "Qtd Disponivel", "Imagem"};
                        String[][] inf = {{}};
                        DefaultTableModel tabela = new DefaultTableModel(inf, Colunas_Produtos);

                        String[] Colunas_Compras = {"Produto", "Marca", "Descrição", "Preço", "Quantidade", "Imagem", "Sub Total"};
                        String[][] inf_Compras = {{}};
                        DefaultTableModel tabela_Compras = new DefaultTableModel(inf_Compras, Colunas_Compras);

                        // Criando as Tabelas/Listas
                        JTable Lista_Produtos = new JTable(tabela);
                        JTable Lista_Compras = new JTable(tabela_Compras);
                        JTableHeader header_Compras = Lista_Compras.getTableHeader();
                        JTableHeader header_Produtos = Lista_Produtos.getTableHeader();

                        Lista_Produtos.setModel(tabela);
                        Lista_Produtos.setRowHeight(120);
                        Lista_Produtos.getColumnModel().getColumn(7).setPreferredWidth(180);
                        Lista_Produtos.getColumnModel().getColumn(0).setPreferredWidth(100);
                        Lista_Produtos.getColumnModel().getColumn(2).setPreferredWidth(100);
                        Lista_Produtos.getColumnModel().getColumn(3).setPreferredWidth(100);

                        Lista_Compras.setModel(tabela_Compras);
                        Lista_Compras.setRowHeight(120);
                        Lista_Compras.getColumnModel().getColumn(5).setPreferredWidth(200);
                        Lista_Compras.getColumnModel().getColumn(0).setPreferredWidth(100);

                        //Personalizando a Lista de Produtos
                        Lista_Produtos.setShowGrid(false);
                        header_Produtos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        header_Produtos.setForeground(new Color(102, 102, 255));

                        //Personalizando a Linhas_Colunas/lista de Compras
                        Lista_Compras.setShowGrid(false);
                        header_Compras.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        header_Compras.setForeground(new Color(102, 102, 255));

                        tabela.setRowCount(10);
                        tabela_Compras.setRowCount(10);

                        JScrollPane rol = new JScrollPane(Lista_Produtos);
                        JScrollPane rol_Compras = new JScrollPane(Lista_Compras);

                        rol.setBounds(10, 40, 890, 250);
                        txtPesquisa.setBounds(690, 0, 200, 30);
                        rol_Compras.setBounds(10, 350, 890, 250);

                        btnAdicionar_carinho.setBounds(800, 290, 60, 60);
                        btnProximo.setBounds(370, 615, 80, 30);
                        btnEliminar_Carinho.setBounds(800, 600, 60, 60);
                        lblTotal.setBounds(10, 600, 100, 30);
                        lblViewMoney.setBounds(20, 625, 60, 30);

                        btnAdicionar_carinho.setIcon(Icon_Adicionar_Carinha);
                        btnEliminar_Carinho.setIcon(Icon_Eliminar_Carinha);

                        //Dando ação
                        btnProximo.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                pnlVenderProdutos.setVisible(false);

                                JLabel lblTransacao = new JLabel("Tipo de Serviço");
                                JLabel lblNome = new JLabel("Nome do Cliente");
                                JLabel lblGenero = new JLabel("Genero");
                                JLabel lblContacto = new JLabel("Contacto/Email");
                                JLabel lblnumero_cartao = new JLabel("Numero do cartao");
                                JLabel lblValidade_Cartao = new JLabel("Validade do cartao");
                                JLabel lblPagamento = new JLabel("Tipo de Pagamento");
                                JLabel lblValor = new JLabel("Valor Pago");
                                JLabel lblValor_a_Pagar = new JLabel("Total a Pagar");
                                JLabel lblValor_a_PagarView = new JLabel("0");
                                JLabel lblTrocos = new JLabel("Trocos");
                                JLabel lblCVV = new JLabel("CVV");
                                JLabel lblIcon = new JLabel();

                                JTextField txtPesquisa = new JTextField();
                                JComboBox jcTransacao = new JComboBox();
                                JTextField txtNome = new JTextField();
                                JComboBox jcGenero = new JComboBox();
                                JTextField txtnumero_cartao = new JTextField();
                                JComboBox jcTipo = new JComboBox();
                                JTextField txtMontante = new JTextField();
                                JTextField txtContacto_Email = new JTextField();
                                JTextField txtTrocos = new JTextField();
                                JTextField txtCVV = new JTextField();
                                JDateChooser txtValidade_cartao = new JDateChooser();

                                //adicionando items nas JComboBox
                                /////////////////////////////////////////////////
                                jcGenero.setBackground(Color.white);
                                jcGenero.addItem("");
                                jcGenero.addItem("Masculino");
                                jcGenero.addItem("Feminino");

                                jcTransacao.setBackground(Color.white);
                                jcTransacao.addItem("");
                                jcTransacao.addItem("Registar Venda");
                                jcTransacao.addItem("Pedido de novo Cliente");
                                jcTransacao.addItem("Pedido de Cliente Registado");

                                jcTransacao.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.green));

                                jcTipo.setBackground(Color.white);
                                jcTipo.addItem("");
                                jcTipo.addItem("Pagamento em Dinheiro");
                                jcTipo.addItem("Pagamento por m-Pesa");
                                jcTipo.addItem("Pagamento por emola");
                                jcTipo.addItem("Pagamento por mKesh");
                                jcTipo.addItem("Cartão de Credito");
                                jcTipo.addItem("Cartão de Debito");

                                ////////////////////////////////////////////////////////////
                                BotaoPersonalizado btnPagar = new BotaoPersonalizado("Registar ");
                                BotaoPersonalizado btnAlterar = new BotaoPersonalizado("Editar Lista");
                                BotaoPersonalizado btnRecibo = new BotaoPersonalizado("Recibo");
                                BotaoPersonalizado btnCancelar = new BotaoPersonalizado("Cancelar");
                                BotaoPersonalizado btnVoltar = new BotaoPersonalizado("Voltar");

                                pnlVendas.setLayout(null);
                                pnlVendas.setBounds(280, 0, 920, 700);
                                pnlVendas.setBackground(Color.white);

                                String[] Colunas_Vendas = {"Produto", "Marca", "Descrição", "Preço", "Quantidade", "Imagem", "Sub Total"};
                                String[][] inf_Vendas = {{}};
                                DefaultTableModel tabela_Vendas = new DefaultTableModel(inf_Vendas, Colunas_Vendas);

                                // Criando as Tabelas/Listas
                                JTable Lista_Vendas = new JTable(tabela_Vendas);
                                JTableHeader header_Vendas = Lista_Vendas.getTableHeader();

                                Lista_Vendas.setModel(tabela_Vendas);
                                Lista_Vendas.setRowHeight(120);
                                Lista_Vendas.getColumnModel().getColumn(5).setPreferredWidth(180);
                                Lista_Vendas.getColumnModel().getColumn(2).setPreferredWidth(100);
                                Lista_Vendas.getColumnModel().getColumn(0).setPreferredWidth(100);

                                //Personalizando a Linhas_Colunas/lista de Compras
                                Lista_Vendas.setShowGrid(false);
                                header_Vendas.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                header_Vendas.setForeground(new Color(102, 102, 255));

                                tabela_Vendas.setRowCount(10);

                                JScrollPane rol_Vendas = new JScrollPane(Lista_Vendas);

                                //Tabela de Clientes que ja fizeram pedidos
                                String[] Colunas_Cli = {"Nome do Cliente", "Genero", "Contacto"};
                                String[][] inf_Cli = {{}};
                                DefaultTableModel tabela_Cli = new DefaultTableModel(inf_Cli, Colunas_Cli);

                                // Criando as Tabelas/Listas
                                JTable Lista_Cli = new JTable(tabela_Cli);
                                JTableHeader header_Cli = Lista_Cli.getTableHeader();

                                Lista_Cli.setModel(tabela_Cli);
                                Lista_Cli.setRowHeight(30);
//                          
                                //Personalizando a Linhas_Colunas/lista de Compras
                                Lista_Cli.setShowGrid(false);
                                header_Cli.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                header_Cli.setForeground(new Color(102, 102, 255));

                                tabela_Cli.setRowCount(10);

                                JScrollPane rol_Cli = new JScrollPane(Lista_Cli);

                                Lista_Cli.setEnabled(false);

                                //Fonte
                                txtPesquisa.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                lblTransacao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                lblNome.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                lblGenero.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                lblContacto.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                lblPagamento.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                lblnumero_cartao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                lblValor.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                lblTrocos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                lblValor_a_Pagar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                lblValor_a_PagarView.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                lblValidade_Cartao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                lblCVV.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));

                                jcTransacao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                txtNome.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                jcGenero.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                txtContacto_Email.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                txtMontante.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                txtnumero_cartao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                txtValidade_cartao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                jcTipo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                txtTrocos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                txtCVV.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));

                                btnPagar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                                btnCancelar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                                btnAlterar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                                btnRecibo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                                btnVoltar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));

                                btnPagar.setFocusPainted(false);
                                btnAlterar.setFocusPainted(false);
                                btnCancelar.setFocusPainted(false);
                                btnRecibo.setFocusPainted(false);
                                btnVoltar.setFocusPainted(false);

                                //Foreground
                                lblTransacao.setForeground(new Color(102, 102, 255));
                                lblNome.setForeground(new Color(102, 102, 255));
                                lblGenero.setForeground(new Color(102, 102, 255));
                                lblContacto.setForeground(new Color(102, 102, 255));
                                lblPagamento.setForeground(new Color(102, 102, 255));
                                lblValor.setForeground(new Color(102, 102, 255));
                                lblnumero_cartao.setForeground(new Color(102, 102, 255));
                                lblValidade_Cartao.setForeground(new Color(102, 102, 255));
                                lblValor_a_Pagar.setForeground(new Color(102, 102, 255));
                                lblTrocos.setForeground(new Color(102, 102, 255));
                                lblCVV.setForeground(new Color(102, 102, 255));
                                btnPagar.setForeground(new Color(0, 102, 255));
                                btnCancelar.setForeground(new Color(0, 102, 255));
                                btnRecibo.setForeground(new Color(0, 102, 255));
                                btnAlterar.setForeground(new Color(0, 102, 255));
                                btnVoltar.setForeground(new Color(0, 102, 255));

                                //Visibilidade inicial das  Componentes
                                txtNome.setEnabled(false);
                                jcGenero.setEnabled(false);
                                jcTipo.setEnabled(false);
                                txtContacto_Email.setEnabled(false);
                                txtMontante.setEnabled(false);
                                txtnumero_cartao.setEnabled(false);
                                txtValidade_cartao.setEnabled(false);
                                txtTrocos.setEnabled(false);
                                txtCVV.setEnabled(false);
                                btnPagar.setEnabled(false);
                                btnRecibo.setEnabled(false);

                                txtPesquisa.setVisible(false);
                                jcTransacao.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        if (jcTransacao.getSelectedIndex() == 1) {

                                            jcTransacao.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                            jcTransacao.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.green));
                                            jcTipo.setEnabled(true);

                                            lblIcon.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));

                                            txtPesquisa.setVisible(false);
                                            rol_Cli.setVisible(false);
                                            lblNome.setVisible(true);
                                            txtNome.setVisible(true);
                                            lblGenero.setVisible(true);
                                            jcGenero.setVisible(true);
                                            lblContacto.setVisible(true);
                                            txtContacto_Email.setVisible(true);
                                            lblValor.setVisible(true);
                                            txtMontante.setVisible(true);
                                            lblnumero_cartao.setVisible(true);
                                            txtnumero_cartao.setVisible(true);
                                            lblPagamento.setVisible(true);
                                            jcTipo.setVisible(true);
                                            lblTrocos.setVisible(true);
                                            txtTrocos.setVisible(true);
                                            lblValidade_Cartao.setVisible(true);
                                            txtValidade_cartao.setVisible(true);
                                            lblCVV.setVisible(true);
                                            txtCVV.setVisible(true);
                                            lblIcon.setVisible(true);

                                            lblNome.setText("");
                                            lblNome.setText("Nome do Titular da Conta");
                                            lblPagamento.setBounds(10, 355, 200, 30);
                                            jcTipo.setBounds(10, 385, 200, 35);
                                            lblNome.setBounds(10, 420, 200, 30);
                                            txtNome.setBounds(10, 450, 200, 35);
                                            lblGenero.setBounds(10, 485, 200, 30);
                                            jcGenero.setBounds(10, 515, 200, 35);

                                            lblContacto.setBounds(250, 355, 200, 30);
                                            txtContacto_Email.setBounds(250, 385, 200, 35);
                                            lblnumero_cartao.setBounds(250, 420, 200, 30);
                                            txtnumero_cartao.setBounds(250, 450, 200, 35);
                                            lblValidade_Cartao.setBounds(250, 485, 200, 30);
                                            txtValidade_cartao.setBounds(250, 515, 200, 35);

                                            lblCVV.setBounds(490, 355, 200, 30);
                                            txtCVV.setBounds(490, 385, 200, 35);
                                            lblValor.setBounds(490, 420, 200, 30);
                                            txtMontante.setBounds(490, 450, 200, 35);
                                            lblTrocos.setBounds(490, 485, 200, 30);
                                            txtTrocos.setBounds(490, 515, 200, 35);
                                            lblIcon.setBounds(750, 385, 140, 165);

                                            txtNome.setEnabled(false);
                                            jcGenero.setEnabled(false);
                                            txtContacto_Email.setEnabled(false);
                                            txtMontante.setEnabled(false);
                                            txtnumero_cartao.setEnabled(false);
                                            txtValidade_cartao.setEnabled(false);
                                            txtTrocos.setEnabled(false);
                                            //   jcTipo.setSelectedIndex(0);
                                            jcGenero.setSelectedIndex(0);

                                            jcTipo.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    if (jcTipo.getSelectedIndex() == 1) {

                                                        jcTipo.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                                        txtNome.setEnabled(false);
                                                        jcGenero.setEnabled(false);
                                                        txtContacto_Email.setEnabled(false);
                                                        txtnumero_cartao.setEnabled(false);
                                                        txtValidade_cartao.setEnabled(false);
                                                        txtCVV.setEnabled(false);
                                                        btnRecibo.setEnabled(false);

                                                        lblIcon.setBorder(BorderFactory.createEmptyBorder());

                                                        txtMontante.setEnabled(true);

                                                        txtMontante.addKeyListener(new KeyListener() {
                                                            @Override
                                                            public void keyTyped(KeyEvent e) {

                                                            }

                                                            @Override
                                                            public void keyPressed(KeyEvent e) {
                                                                char c = e.getKeyChar();
                                                                if (Character.isLetter(c)) {
                                                                    txtMontante.setEditable(false);
                                                                    JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                                                } else {
                                                                    txtMontante.setEditable(true);

                                                                }

                                                            }

                                                            @Override
                                                            public void keyReleased(KeyEvent e) {
                                                                //Pegando o tamanho do texto
                                                                int comprimentoTexto = txtMontante.getText().length();

                                                                // Define a cor da borda com base no comprimento do texto
                                                                Color cor = (comprimentoTexto <= 1) ? Color.RED : Color.GREEN;

                                                                // Cria uma borda com a cor desejada
                                                                Border bordaColorida = BorderFactory.createLineBorder(cor);

                                                                // Aplica a borda ao campo de texto
                                                                txtMontante.setBorder(bordaColorida);

                                                                // Permitindo com que o campo seguinte seja aberto assim como nao
                                                                if (cor.equals(Color.GREEN)) {
                                                                    btnPagar.setEnabled(true);

                                                                } else {
                                                                    btnPagar.setEnabled(false);

                                                                }

                                                                txtMontante.addFocusListener(new FocusListener() {
                                                                    @Override
                                                                    public void focusGained(FocusEvent e) {

                                                                    }

                                                                    @Override
                                                                    public void focusLost(FocusEvent e) {

                                                                        // Restaura a borda padrão quando o campo perde o foco
                                                                        txtMontante.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                                                    }
                                                                });

                                                            }
                                                        }); // campo Montantr

                                                        //Salvar Venda por meio do pagamento em Dinheiro
                                                        btnPagar.setEnabled(true);
                                                        btnPagar.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {

                                                            }

                                                        });

                                                    } else {
                                                        if (jcTipo.getSelectedIndex() == 5) {

                                                            lblIcon.setBorder(BorderFactory.createEmptyBorder());

                                                            lblIcon.setIcon(Icon_catao);
                                                            lblNome.setText("");
                                                            lblNome.setText("Nome do Titular da Conta");
                                                            txtMontante.setEnabled(false);
                                                            txtNome.setEnabled(true);
                                                            jcGenero.setEnabled(false);
                                                            txtContacto_Email.setEnabled(false);
                                                            txtnumero_cartao.setEnabled(false);
                                                            txtValidade_cartao.setEnabled(false);
                                                            txtCVV.setEnabled(false);

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
                                                                            jcGenero.requestFocus();
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
                                                                        jcGenero.setEnabled(true);

                                                                    } else {
                                                                        jcGenero.setEnabled(false);

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

                                                            jcGenero.addActionListener(new ActionListener() {
                                                                @Override
                                                                public void actionPerformed(ActionEvent e) {

                                                                    if (jcGenero.getSelectedIndex() != 0) {
                                                                        txtContacto_Email.setEnabled(true);

                                                                    } else {
                                                                        txtContacto_Email.setEnabled(false);

                                                                    }
                                                                }

                                                            });

                                                            //Numero ou Email
                                                            txtContacto_Email.addKeyListener(new KeyListener() {
                                                                @Override
                                                                public void keyTyped(KeyEvent e) {

                                                                }

                                                                @Override
                                                                public void keyPressed(KeyEvent e) {
                                                                    txtContacto_Email.setEditable(true);
                                                                    if (e.getKeyCode() == KeyEvent.VK_UP) {
                                                                        jcGenero.requestFocus();
                                                                    } else if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_ENTER) {
                                                                        txtnumero_cartao.setEnabled(true);
                                                                    }
                                                                }

                                                                @Override
                                                                public void keyReleased(KeyEvent e) {
                                                                    //Pegando o tamanho do texto
                                                                    int comprimentoTexto = txtContacto_Email.getText().length();

                                                                    // Define a cor da borda com base no comprimento do texto
                                                                    Color cor = ((comprimentoTexto != 9)) ? Color.RED : Color.GREEN;

                                                                    // Cria uma borda com a cor desejada
                                                                    Border bordaColorida = BorderFactory.createLineBorder(cor);

                                                                    // Aplica a borda ao campo de texto
                                                                    txtContacto_Email.setBorder(bordaColorida);

                                                                    // Permitindo com que o campo seguinte seja aberto assim como nao
                                                                    if (cor.equals(Color.GREEN)) {
                                                                        txtnumero_cartao.setEnabled(true);

                                                                    } else {
                                                                        txtnumero_cartao.setEnabled(false);

                                                                    }

                                                                    txtContacto_Email.addFocusListener(new FocusListener() {
                                                                        @Override
                                                                        public void focusGained(FocusEvent e) {

                                                                        }

                                                                        @Override
                                                                        public void focusLost(FocusEvent e) {

                                                                            // Restaura a borda padrão quando o campo perde o foco
                                                                            txtContacto_Email.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                                                        }
                                                                    });

                                                                }
                                                            }); // campo Numero Celular

                                                            //Numero de Cartao
                                                            txtnumero_cartao.addKeyListener(new KeyListener() {
                                                                @Override
                                                                public void keyTyped(KeyEvent e) {

                                                                }

                                                                @Override
                                                                public void keyPressed(KeyEvent e) {
                                                                    char c = e.getKeyChar();
                                                                    if (Character.isLetter(c)) {
                                                                        txtnumero_cartao.setEditable(false);
                                                                        JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                                                    } else {
                                                                        txtnumero_cartao.setEditable(true);
                                                                        if (e.getKeyCode() == KeyEvent.VK_UP) {
                                                                            txtContacto_Email.requestFocus();
                                                                        }

                                                                    }

                                                                }

                                                                @Override
                                                                public void keyReleased(KeyEvent e) {
                                                                    //Pegando o tamanho do texto
                                                                    int comprimentoTexto = txtnumero_cartao.getText().length();

                                                                    // Define a cor da borda com base no comprimento do texto
                                                                    Color cor = (comprimentoTexto != 12) ? Color.RED : Color.GREEN;

                                                                    // Cria uma borda com a cor desejada
                                                                    Border bordaColorida = BorderFactory.createLineBorder(cor);

                                                                    // Aplica a borda ao campo de texto
                                                                    txtnumero_cartao.setBorder(bordaColorida);

                                                                    // Permitindo com que o campo seguinte seja aberto assim como nao
                                                                    if (cor.equals(Color.GREEN)) {
                                                                        txtValidade_cartao.setEnabled(true);
                                                                        txtCVV.setEnabled(true);

                                                                    } else {
                                                                        txtValidade_cartao.setEnabled(false);
                                                                        txtCVV.setEnabled(false);

                                                                    }

                                                                    txtnumero_cartao.addFocusListener(new FocusListener() {
                                                                        @Override
                                                                        public void focusGained(FocusEvent e) {

                                                                        }

                                                                        @Override
                                                                        public void focusLost(FocusEvent e) {

                                                                            // Restaura a borda padrão quando o campo perde o foco
                                                                            txtnumero_cartao.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                                                        }
                                                                    });

                                                                }
                                                            }); // campo Numero do Cartão

                                                            //CVV
                                                            txtCVV.addKeyListener(new KeyListener() {
                                                                @Override
                                                                public void keyTyped(KeyEvent e) {

                                                                }

                                                                @Override
                                                                public void keyPressed(KeyEvent e) {
                                                                    char c = e.getKeyChar();
                                                                    if (Character.isLetter(c)) {
                                                                        txtCVV.setEditable(false);
                                                                        JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                                                    } else {
                                                                        txtCVV.setEditable(true);
                                                                        if (e.getKeyCode() == KeyEvent.VK_UP) {
                                                                            txtnumero_cartao.requestFocus();
                                                                        }

                                                                    }

                                                                }

                                                                @Override
                                                                public void keyReleased(KeyEvent e) {
                                                                    //Pegando o tamanho do texto
                                                                    int comprimentoTexto = txtCVV.getText().length();

                                                                    // Define a cor da borda com base no comprimento do texto
                                                                    Color cor = (comprimentoTexto != 3) ? Color.RED : Color.GREEN;

                                                                    // Cria uma borda com a cor desejada
                                                                    Border bordaColorida = BorderFactory.createLineBorder(cor);

                                                                    // Aplica a borda ao campo de texto
                                                                    txtCVV.setBorder(bordaColorida);

                                                                    // Permitindo com que o campo seguinte seja aberto assim como nao
                                                                    if (cor.equals(Color.GREEN)) {
                                                                        btnPagar.setEnabled(true);

                                                                    } else {
                                                                        btnPagar.setEnabled(false);

                                                                    }

                                                                    txtCVV.addFocusListener(new FocusListener() {
                                                                        @Override
                                                                        public void focusGained(FocusEvent e) {

                                                                        }

                                                                        @Override
                                                                        public void focusLost(FocusEvent e) {

                                                                            // Restaura a borda padrão quando o campo perde o foco
                                                                            txtCVV.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                                                        }
                                                                    });

                                                                }
                                                            }); // campo CVV

                                                            btnRecibo.setEnabled(false);

                                                        } else {
                                                            if (jcTipo.getSelectedIndex() == 2) {

                                                                jcTipo.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                                                txtContacto_Email.setEnabled(true);
                                                                lblIcon.setBorder(BorderFactory.createEmptyBorder());

                                                                lblIcon.setIcon(Icon_mpesa);
                                                                lblContacto.setText("");
                                                                lblContacto.setText("Contacto");
                                                                txtMontante.setEnabled(false);
                                                                txtNome.setEnabled(false);
                                                                jcGenero.setEnabled(false);
                                                                txtnumero_cartao.setEnabled(false);
                                                                txtValidade_cartao.setEnabled(false);
                                                                txtCVV.setEnabled(false);

                                                                txtContacto_Email.addKeyListener(new KeyListener() {
                                                                    @Override
                                                                    public void keyTyped(KeyEvent e) {

                                                                    }

                                                                    @Override
                                                                    public void keyPressed(KeyEvent e) {

                                                                        char c = e.getKeyChar();

                                                                        if (Character.isLetter(c)) {

                                                                            txtContacto_Email.setEditable(false);
                                                                            JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                                                        } else {
                                                                            txtContacto_Email.setEditable(true);

                                                                        }

                                                                    }

                                                                    @Override
                                                                    public void keyReleased(KeyEvent e) {
                                                                        //Pegando o tamanho do texto
                                                                        int comprimentoTexto = txtContacto_Email.getText().length();

                                                                        // Define a cor da borda com base no comprimento do texto
                                                                        Color cor = (comprimentoTexto != 9) ? Color.RED : Color.GREEN;

                                                                        // Cria uma borda com a cor desejada
                                                                        Border bordaColorida = BorderFactory.createLineBorder(cor);

                                                                        // Aplica a borda ao campo de texto
                                                                        txtContacto_Email.setBorder(bordaColorida);

                                                                        // Permitindo com que o campo seguinte seja aberto assim como nao
                                                                        if (cor.equals(Color.GREEN)) {
                                                                            btnPagar.setEnabled(true);

                                                                        } else {
                                                                            btnPagar.setEnabled(false);
                                                                        }

                                                                        txtContacto_Email.addFocusListener(new FocusListener() {
                                                                            @Override
                                                                            public void focusGained(FocusEvent e) {

                                                                            }

                                                                            @Override
                                                                            public void focusLost(FocusEvent e) {

                                                                                // Restaura a borda padrão quando o campo perde o foco
                                                                                txtContacto_Email.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                                                            }
                                                                        });

                                                                    }
                                                                }); // campo Contacto

                                                                btnRecibo.setEnabled(false);

                                                                //Salvar Venda por meio do M-pesa
                                                                btnPagar.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {

                                                                        //Opção de imprimir factura desabilitada
                                                                        btnRecibo.setEnabled(true);
                                                                    }

                                                                });
                                                            } else {
                                                                if (jcTipo.getSelectedIndex() == 3) {

                                                                    jcTipo.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                                                    lblIcon.setBorder(BorderFactory.createEmptyBorder());

                                                                    lblIcon.setIcon(Icon_emola);
                                                                    lblContacto.setText("");
                                                                    lblContacto.setText("Contacto");
                                                                    txtMontante.setEnabled(false);
                                                                    txtNome.setEnabled(false);
                                                                    jcGenero.setEnabled(false);
                                                                    txtContacto_Email.setEnabled(true);
                                                                    txtnumero_cartao.setEnabled(false);
                                                                    txtValidade_cartao.setEnabled(false);
                                                                    txtCVV.setEnabled(false);

                                                                    txtContacto_Email.addKeyListener(new KeyListener() {
                                                                        @Override
                                                                        public void keyTyped(KeyEvent e) {

                                                                        }

                                                                        @Override
                                                                        public void keyPressed(KeyEvent e) {

                                                                            char c = e.getKeyChar();

                                                                            if (Character.isLetter(c)) {

                                                                                txtContacto_Email.setEditable(false);
                                                                                JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                                                            } else {
                                                                                txtContacto_Email.setEditable(true);

                                                                            }

                                                                        }

                                                                        @Override
                                                                        public void keyReleased(KeyEvent e) {
                                                                            //Pegando o tamanho do texto
                                                                            int comprimentoTexto = txtContacto_Email.getText().length();

                                                                            // Define a cor da borda com base no comprimento do texto
                                                                            Color cor = (comprimentoTexto != 9) ? Color.RED : Color.GREEN;

                                                                            // Cria uma borda com a cor desejada
                                                                            Border bordaColorida = BorderFactory.createLineBorder(cor);

                                                                            // Aplica a borda ao campo de texto
                                                                            txtContacto_Email.setBorder(bordaColorida);

                                                                            // Permitindo com que o campo seguinte seja aberto assim como nao
                                                                            if (cor.equals(Color.GREEN)) {
                                                                                btnPagar.setEnabled(true);

                                                                            } else {
                                                                                btnPagar.setEnabled(false);
                                                                            }

                                                                            txtContacto_Email.addFocusListener(new FocusListener() {
                                                                                @Override
                                                                                public void focusGained(FocusEvent e) {

                                                                                }

                                                                                @Override
                                                                                public void focusLost(FocusEvent e) {

                                                                                    // Restaura a borda padrão quando o campo perde o foco
                                                                                    txtContacto_Email.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                                                                }
                                                                            });

                                                                        }
                                                                    }); // campo Contacto

                                                                    btnRecibo.setEnabled(false);

                                                                    //Salvar Venda por meio do emola
                                                                    btnPagar.addActionListener(new ActionListener() {
                                                                        @Override
                                                                        public void actionPerformed(ActionEvent e) {

                                                                            //Opção de imprimir factura desabilitada
                                                                            btnRecibo.setEnabled(true);
                                                                        }

                                                                    });
                                                                } else {
                                                                    if (jcTipo.getSelectedIndex() == 4) {

                                                                        jcTipo.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                                                        lblIcon.setBorder(BorderFactory.createEmptyBorder());

                                                                        lblIcon.setIcon(Icon_mkesh);
                                                                        lblContacto.setText("");
                                                                        lblContacto.setText("Contacto");
                                                                        txtMontante.setEnabled(false);
                                                                        txtNome.setEnabled(false);
                                                                        jcGenero.setEnabled(false);
                                                                        txtContacto_Email.setEnabled(true);
                                                                        txtnumero_cartao.setEnabled(false);
                                                                        txtValidade_cartao.setEnabled(false);
                                                                        txtCVV.setEnabled(false);

                                                                        txtContacto_Email.addKeyListener(new KeyListener() {
                                                                            @Override
                                                                            public void keyTyped(KeyEvent e) {

                                                                            }

                                                                            @Override
                                                                            public void keyPressed(KeyEvent e) {

                                                                                char c = e.getKeyChar();

                                                                                if (Character.isLetter(c)) {

                                                                                    txtContacto_Email.setEditable(false);
                                                                                    JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                                                                } else {
                                                                                    txtContacto_Email.setEditable(true);

                                                                                }

                                                                            }

                                                                            @Override
                                                                            public void keyReleased(KeyEvent e) {
                                                                                //Pegando o tamanho do texto
                                                                                int comprimentoTexto = txtContacto_Email.getText().length();

                                                                                // Define a cor da borda com base no comprimento do texto
                                                                                Color cor = (comprimentoTexto != 9) ? Color.RED : Color.GREEN;

                                                                                // Cria uma borda com a cor desejada
                                                                                Border bordaColorida = BorderFactory.createLineBorder(cor);

                                                                                // Aplica a borda ao campo de texto
                                                                                txtContacto_Email.setBorder(bordaColorida);

                                                                                // Permitindo com que o campo seguinte seja aberto assim como nao
                                                                                if (cor.equals(Color.GREEN)) {
                                                                                    btnPagar.setEnabled(true);

                                                                                } else {
                                                                                    btnPagar.setEnabled(false);
                                                                                }

                                                                                txtContacto_Email.addFocusListener(new FocusListener() {
                                                                                    @Override
                                                                                    public void focusGained(FocusEvent e) {

                                                                                    }

                                                                                    @Override
                                                                                    public void focusLost(FocusEvent e) {

                                                                                        // Restaura a borda padrão quando o campo perde o foco
                                                                                        txtContacto_Email.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                                                                    }
                                                                                });

                                                                            }
                                                                        }); // campo Contacto

                                                                        btnRecibo.setEnabled(false);

                                                                        //Salvar Venda por meio do m-kesh
                                                                        btnPagar.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {

                                                                                //Opção de imprimir factura desabilitada
                                                                                btnRecibo.setEnabled(true);
                                                                            }

                                                                        });

                                                                    } else {
                                                                        if (jcTipo.getSelectedIndex() == 0) {
                                                                            JOptionPane.showMessageDialog(null, "Escolha uma opção valida!!!");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }

                                            });// Fim da sequencia de pagamentos
                                        } else if (jcTransacao.getSelectedIndex() == 2) {
                                            //Limpando as caixas de Texto antes de receber nova informação
                                            txtNome.setText("");
                                            jcGenero.setSelectedIndex(0);
                                            txtContacto_Email.setText("");

                                            jcTransacao.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                            rol_Cli.setVisible(true);
                                            btnPagar.setEnabled(false);
                                            Lista_Cli.setEnabled(false);

                                            lblNome.setText("");
                                            lblNome.setText("Nome do Cliente");
                                            lblIcon.setVisible(false);
                                            txtNome.setEnabled(true);
                                            jcGenero.setEnabled(false);
                                            jcTipo.setEnabled(false);
                                            txtContacto_Email.setEnabled(false);

                                            txtPesquisa.setVisible(false);

                                            lblNome.setBounds(10, 355, 200, 30);
                                            txtNome.setBounds(10, 385, 200, 35);
                                            lblGenero.setBounds(10, 420, 200, 30);
                                            jcGenero.setBounds(10, 450, 200, 35);
                                            lblContacto.setBounds(10, 485, 200, 30);
                                            txtContacto_Email.setBounds(10, 515, 200, 35);

                                            jcTipo.setVisible(false);
                                            lblValor.setVisible(false);
                                            txtMontante.setVisible(false);
                                            lblnumero_cartao.setVisible(false);
                                            txtnumero_cartao.setVisible(false);
                                            lblPagamento.setVisible(false);
                                            jcTipo.setVisible(false);
                                            lblTrocos.setVisible(false);
                                            txtTrocos.setVisible(false);
                                            lblValidade_Cartao.setVisible(false);
                                            txtValidade_cartao.setVisible(false);
                                            lblCVV.setVisible(false);
                                            txtCVV.setVisible(false);

                                            lblIcon.setVisible(false);

                                            //  jcTipo.setSelectedIndex(0);
                                            jcGenero.setSelectedIndex(0);

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
                                                            jcGenero.requestFocus();
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
                                                        jcGenero.setEnabled(true);

                                                    } else {
                                                        jcGenero.setEnabled(false);

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

                                            jcGenero.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (jcGenero.getSelectedIndex() != 0) {
                                                        txtContacto_Email.setEnabled(true);

                                                    } else {
                                                        txtContacto_Email.setEnabled(false);

                                                    }
                                                }

                                            });

                                            //Numero ou Email
                                            txtContacto_Email.addKeyListener(new KeyListener() {
                                                @Override
                                                public void keyTyped(KeyEvent e) {

                                                }

                                                @Override
                                                public void keyPressed(KeyEvent e) {
                                                    txtContacto_Email.setEditable(true);
                                                    if (e.getKeyCode() == KeyEvent.VK_UP) {
                                                        jcGenero.requestFocus();
                                                    } else if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_ENTER) {
                                                        txtnumero_cartao.setEnabled(true);
                                                    }
                                                }

                                                @Override
                                                public void keyReleased(KeyEvent e) {
                                                    //Pegando o tamanho do texto
                                                    int comprimentoTexto = txtContacto_Email.getText().length();

                                                    // Define a cor da borda com base no comprimento do texto
                                                    Color cor = ((comprimentoTexto != 9)) ? Color.RED : Color.GREEN;

                                                    // Cria uma borda com a cor desejada
                                                    Border bordaColorida = BorderFactory.createLineBorder(cor);

                                                    // Aplica a borda ao campo de texto
                                                    txtContacto_Email.setBorder(bordaColorida);

                                                    // Permitindo com que o campo seguinte seja aberto assim como nao
                                                    if (cor.equals(Color.GREEN)) {
                                                        btnPagar.setEnabled(true);

                                                    } else {
                                                        btnPagar.setEnabled(false);

                                                    }

                                                    txtContacto_Email.addFocusListener(new FocusListener() {
                                                        @Override
                                                        public void focusGained(FocusEvent e) {

                                                        }

                                                        @Override
                                                        public void focusLost(FocusEvent e) {

                                                            // Restaura a borda padrão quando o campo perde o foco
                                                            txtContacto_Email.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                                        }
                                                    });

                                                }
                                            }); // campo Numero Celular

                                            //Salvar Venda Pedido
                                            btnPagar.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    //Opção de Imprimir factura do pedido
                                                    btnRecibo.setEnabled(true);
                                                }

                                            });

                                        } else {
                                            if (jcTransacao.getSelectedIndex() == 3) {

                                                txtPesquisa.setVisible(true);

                                                jcTransacao.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                                Lista_Cli.setEnabled(true);

                                                lblIcon.setVisible(false);
                                                txtNome.setEnabled(false);
                                                jcGenero.setEnabled(false);
                                                jcTipo.setEnabled(false);
                                                txtContacto_Email.setEnabled(false);

                                                lblNome.setText("");
                                                lblNome.setText("Nome do Cliente");

                                                txtPesquisa.setBounds(470, 345, 200, 30);

                                                lblNome.setBounds(10, 355, 200, 30);
                                                txtNome.setBounds(10, 385, 200, 35);
                                                lblGenero.setBounds(10, 420, 200, 30);
                                                jcGenero.setBounds(10, 450, 200, 35);
                                                lblContacto.setBounds(10, 485, 200, 30);
                                                txtContacto_Email.setBounds(10, 515, 200, 35);

                                                jcTipo.setVisible(false);
                                                lblValor.setVisible(false);
                                                txtMontante.setVisible(false);
                                                lblnumero_cartao.setVisible(false);
                                                txtnumero_cartao.setVisible(false);
                                                lblPagamento.setVisible(false);
                                                jcTipo.setVisible(false);
                                                lblTrocos.setVisible(false);
                                                txtTrocos.setVisible(false);
                                                lblValidade_Cartao.setVisible(false);
                                                txtValidade_cartao.setVisible(false);
                                                lblCVV.setVisible(false);
                                                txtCVV.setVisible(false);

                                                lblIcon.setVisible(false);

                                                rol_Cli.setVisible(true);

                                                jcGenero.setSelectedIndex(0);

                                                btnPagar.setEnabled(false);

                                                txtNome.setText("");
                                                jcGenero.setSelectedIndex(0);
                                                txtContacto_Email.setText("");

                                                Lista_Cli.addMouseListener(new MouseListener() {
                                                    @Override
                                                    public void mouseClicked(MouseEvent e) {

                                                        btnPagar.setEnabled(true);

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

                                                //Salvar Venda Pedido
                                                btnPagar.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        //Opção de Imprimir factura do pedido
                                                        btnRecibo.setEnabled(true);
                                                    }

                                                });

                                            } else {
                                                jcTipo.setEnabled(false);
                                                jcTransacao.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.green));
                                                JOptionPane.showMessageDialog(null, "Escolha uma opção valida!!!");
                                            }

                                        }
                                    }
                                });

                                //////////////////////////////////////////////////////////////
                                rol_Vendas.setBounds(10, 100, 890, 200);
                                lblValor_a_Pagar.setBounds(10, 300, 100, 30);
                                lblValor_a_PagarView.setBounds(10, 325, 100, 30);

                                lblTransacao.setBounds(330, 10, 220, 30);
                                jcTransacao.setBounds(330, 40, 220, 35);
                                rol_Cli.setBounds(250, 385, 650, 165);

                                lblNome.setBounds(10, 355, 200, 30);
                                txtNome.setBounds(10, 385, 200, 35);
                                lblGenero.setBounds(10, 420, 200, 30);
                                jcGenero.setBounds(10, 450, 200, 35);
                                lblContacto.setBounds(10, 485, 200, 30);
                                txtContacto_Email.setBounds(10, 515, 200, 35);
                                btnPagar.setBounds(10, 590, 100, 30);
                                btnAlterar.setBounds(780, 315, 100, 30);
                                btnRecibo.setBounds(275, 590, 100, 30);
                                btnCancelar.setBounds(570, 590, 100, 30);
                                btnVoltar.setBounds(800, 590, 100, 30);

                                pnlVendas.add(rol_Vendas);
                                pnlVendas.add(rol_Cli);
                                pnlVendas.add(txtPesquisa);
                                pnlVendas.add(lblIcon);
                                pnlVendas.add(lblTransacao);
                                pnlVendas.add(jcTransacao);
                                pnlVendas.add(lblNome);
                                pnlVendas.add(lblGenero);
                                pnlVendas.add(lblContacto);
                                pnlVendas.add(lblnumero_cartao);
                                pnlVendas.add(lblPagamento);
                                pnlVendas.add(lblValidade_Cartao);
                                pnlVendas.add(lblValor_a_Pagar);
                                pnlVendas.add(lblValor_a_PagarView);
                                pnlVendas.add(lblPagamento);
                                pnlVendas.add(lblValor);
                                pnlVendas.add(lblTrocos);
                                pnlVendas.add(lblCVV);
                                pnlVendas.add(txtNome);
                                pnlVendas.add(jcGenero);
                                pnlVendas.add(txtContacto_Email);
                                pnlVendas.add(txtnumero_cartao);
                                pnlVendas.add(txtValidade_cartao);
                                pnlVendas.add(jcTipo);
                                pnlVendas.add(txtMontante);
                                pnlVendas.add(txtTrocos);
                                pnlVendas.add(txtCVV);

                                pnlVendas.add(btnPagar);
                                pnlVendas.add(btnCancelar);
                                pnlVendas.add(btnRecibo);
                                pnlVendas.add(btnAlterar);
                                pnlVendas.add(btnVoltar);

                                pnlVendas.setVisible(true);

                            }
                        });

                        //Implementação da pesquisa google
                        txtPesquisa.addKeyListener(new KeyListener() {
                            @Override
                            public void keyTyped(KeyEvent e) {

                            }

                            @Override
                            public void keyPressed(KeyEvent e) {

                            }

                            @Override
                            public void keyReleased(KeyEvent e) {

                            }

                        });

                        pnlVenderProdutos.add(lblListar);
                        pnlVenderProdutos.add(txtPesquisa);
                        pnlVenderProdutos.add(lblLista_compras);
                        pnlVenderProdutos.add(rol);
                        pnlVenderProdutos.add(rol_Compras);
                        pnlVenderProdutos.add(btnAdicionar_carinho);
                        pnlVenderProdutos.add(btnEliminar_Carinho);
                        pnlVenderProdutos.add(lblTotal);
                        pnlVenderProdutos.add(lblViewMoney);
                        pnlVenderProdutos.add(btnProximo);

                        pnlVenderProdutos.setVisible(true);

                        JOptionPane.showMessageDialog(null, "Selecione o poduto que pretende vender e adicione ao carinho,Caso\nqueira remove-lo, selecione na lista de produtos e clique no carinho.", "Venda de Produtos", Font.BOLD);

                    }
                });

                //Neste vou permitir com que possa Colunas_Produtos os produtos existentes
                btnListarProdutos.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        pnlVenderProdutos.setVisible(false);
                        pnlProcurarProdutos.setVisible(false);
                        pnlVendas.setVisible(false);

                        pnlListar.setLayout(null);
                        pnlListar.setBounds(280, 0, 920, 700);
                        pnlListar.setBackground(Color.white);

                        JLabel lblListar = new JLabel();
                        JTextField txtPesquisa = new JTextField();
                        lblListar.setBounds(270, 0, 300, 30);

                        lblListar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        lblListar.setText("Lista de Produtos da Organizacao");
                        lblListar.setForeground(new Color(0, 102, 255));

                        String[] Colunas_Tabela = {"Nome_Produto", "Marca", "Codigo_Barra", "Preço", "Validade", "Qtd_Disponivel", "Imagem"};
                        String[][] inf = {{}};

                        DefaultTableModel Linhas_Colunas = new DefaultTableModel(inf, Colunas_Tabela);
                        JTable Lista_Produtos = new JTable(Linhas_Colunas);
                        JTableHeader header_Lista = Lista_Produtos.getTableHeader();

                        //Personalizando a Linhas_Colunas
                        header_Lista.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtPesquisa.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        header_Lista.setForeground(new Color(102, 102, 255));
                        Lista_Produtos.setShowGrid(false);

                        Lista_Produtos.setModel(Linhas_Colunas);
                        Lista_Produtos.setRowHeight(120);
                        Lista_Produtos.getColumnModel().getColumn(6).setPreferredWidth(200);
                        Lista_Produtos.getColumnModel().getColumn(0).setPreferredWidth(150);
                        Lista_Produtos.getColumnModel().getColumn(1).setPreferredWidth(110);
                        Lista_Produtos.getColumnModel().getColumn(2).setPreferredWidth(110);
                        Lista_Produtos.getColumnModel().getColumn(3).setPreferredWidth(110);
                        Lista_Produtos.getColumnModel().getColumn(5).setPreferredWidth(110);

                        Linhas_Colunas.setRowCount(10);
                        JScrollPane rol = new JScrollPane(Lista_Produtos);

                        txtPesquisa.setBounds(690, 0, 200, 30);

                        rol.setBounds(10, 40, 890, 600);

                        txtPesquisa.addKeyListener(new KeyListener() {
                            @Override
                            public void keyTyped(KeyEvent e) {

                            }

                            @Override
                            public void keyPressed(KeyEvent e) {

                            }

                            @Override
                            public void keyReleased(KeyEvent e) {

                            }

                        });

                        pnlListar.add(lblListar);

                        pnlListar.add(txtPesquisa);

                        pnlListar.add(rol);

                        pnlListar.setVisible(true);

                    }
                });

                //Neste vou permitir que possam visualizar os pedidos
                btnPedidos.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pnlPrincipal.setVisible(true);
                        pnlListar.setVisible(false);
                        pnlVenderProdutos.setVisible(false);
                        pnlVendas.setVisible(false);
                        MenuServicos.setVisible(false);

                        JTextField txtbarra2 = new JTextField();
                        JLabel lblFotografia = new JLabel();

                        // Paineis que vao ajudar na gestao de pedidos
                        JPanel MenuPedidos = new JPanel();

                        JButton btnPendentes = new JButton("   Pendentes");
                        JButton btnFinalizados = new JButton("   Finalizados");
                        JButton btnDescartados = new JButton("   Descartados");
                        JButton btnVoltarPrincipal = new JButton("   Voltar");

                        lblFotografia.setBounds(45, 50, 180, 180);
                        txtbarra2.setBounds(30, 251, 210, 1);
                        MenuPedidos.setBounds(0, 0, 280, 700);
                        btnPendentes.setBounds(40, 281, 150, 40);
                        btnFinalizados.setBounds(43, 351, 150, 40);
                        btnDescartados.setBounds(42, 421, 160, 40);
                        btnVoltarPrincipal.setBounds(20, 491, 150, 40);

                        MenuPedidos.setLayout(null);
                        btnPendentes.setBackground(new Color(102, 102, 255));
                        btnFinalizados.setBackground(new Color(102, 102, 255));
                        btnDescartados.setBackground(new Color(102, 102, 255));
                        btnVoltarPrincipal.setBackground(new Color(102, 102, 255));
                        MenuPedidos.setBackground(new Color(102, 102, 255));

                        btnPendentes.setForeground(Color.white);
                        btnFinalizados.setForeground(Color.white);
                        btnDescartados.setForeground(Color.white);
                        btnVoltarPrincipal.setForeground(Color.white);

                        btnPendentes.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                        btnFinalizados.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                        btnDescartados.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                        btnVoltarPrincipal.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));

                        btnVoltarPrincipal.setBorder(BorderFactory.createEmptyBorder());
                        btnVoltarPrincipal.setFocusPainted(false);
                        btnPendentes.setBorder(BorderFactory.createEmptyBorder());
                        btnPendentes.setFocusPainted(false);
                        btnFinalizados.setBorder(BorderFactory.createEmptyBorder());
                        btnFinalizados.setFocusPainted(false);
                        btnDescartados.setBorder(BorderFactory.createEmptyBorder());
                        btnDescartados.setFocusPainted(false);

                        //Colocando Icones
                        lblFotografia.setIcon(Imagem_Fundo);
                        btnVoltarPrincipal.setIcon(Icon_Voltar);
                        btnFinalizados.setIcon(Icon_Listar);
                        btnPendentes.setIcon(Icon_Vender);
                        btnDescartados.setIcon(Icon_Procurar);

                        JPanel pnlPendentes = new JPanel();
                        JPanel pnlFinalizados = new JPanel();
                        JPanel pnlDescartados = new JPanel();
                        JPanel pnlRelatorios = new JPanel();

                        //Pedidos no estado pendente
                        btnPendentes.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                pnlPrincipal.setVisible(false);
                                pnlDescartados.setVisible(false);
                                pnlFinalizados.setVisible(false);

                                pnlPendentes.setLayout(null);
                                pnlPendentes.setBounds(280, 0, 920, 700);
                                pnlPendentes.setBackground(Color.white);

                                JLabel lblListar = new JLabel();
                                JLabel lblProdutos = new JLabel();
                                JLabel lblPedido = new JLabel();

                                JTextField txtPesquisa = new JTextField();

                                //Criando os botoes
                                BotaoPersonalizado btnPagar = new BotaoPersonalizado("Pagar");
                                BotaoPersonalizado btnRelatorio = new BotaoPersonalizado("PDF");
                                BotaoPersonalizado btnEditar = new BotaoPersonalizado("Alterar");

                                //Mundando o background
                                btnPagar.setBackground(Color.white);
                                btnRelatorio.setBackground(Color.white);
                                btnEditar.setBackground(Color.white);

                                // Mundando o Foreground
                                btnPagar.setForeground(new Color(0, 102, 255));
                                btnRelatorio.setForeground(new Color(0, 102, 255));
                                btnEditar.setForeground(new Color(0, 102, 255));

                                //Tirando a Borda
                                btnPagar.setBorder(BorderFactory.createEmptyBorder());
                                btnRelatorio.setBorder(BorderFactory.createEmptyBorder());
                                btnEditar.setBorder(BorderFactory.createEmptyBorder());

                                btnPagar.setFocusPainted(false);
                                btnRelatorio.setFocusPainted(false);
                                btnEditar.setFocusPainted(false);

                                lblListar.setBounds(365, 0, 350, 30);

                                lblListar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                                lblProdutos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                                lblPedido.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                                btnPagar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                                btnRelatorio.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                                btnEditar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                                txtPesquisa.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));

                                lblListar.setText("Clientes com Pedidos");
                                lblListar.setForeground(new Color(0, 102, 255));

                                lblPedido.setText("Pedidos do Cliente");
                                lblPedido.setForeground(new Color(0, 102, 255));

                                lblProdutos.setText("Produtos do Pedido");
                                lblProdutos.setForeground(new Color(0, 102, 255));

                                //Lista de Clientes
                                String[] Colunas_Cliente = {"Cliente", "Genero", "Contacto", "Email", "Status"};
                                String[][] inf_Cliente = {{}};

                                DefaultTableModel Linhas_Cliente = new DefaultTableModel(inf_Cliente, Colunas_Cliente);
                                JTable Lista_Cliente = new JTable(Linhas_Cliente);
                                JTableHeader header_Cliente = Lista_Cliente.getTableHeader();

                                //Personalizando a Linhas_Colunas
                                header_Cliente.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                header_Cliente.setForeground(new Color(102, 102, 255));
                                Lista_Cliente.setShowGrid(false);

                                Lista_Cliente.setModel(Linhas_Cliente);
                                Lista_Cliente.setRowHeight(30);

                                Linhas_Cliente.setRowCount(10);
                                JScrollPane rol_Cliente1 = new JScrollPane(Lista_Cliente);

                                //Lista de PedidosCodigo_
                                String[] Colunas_Pedido = {"Codigo", "Data ", "Prazo", "Status"};
                                String[][] inf_Pedido = {{}};

                                DefaultTableModel Linhas_Pedido = new DefaultTableModel(inf_Pedido, Colunas_Pedido);
                                JTable Lista_Pedido = new JTable(Linhas_Pedido);
                                JTableHeader header_Pedido = Lista_Pedido.getTableHeader();

                                //Personalizando a Linhas_Colunas
                                header_Pedido.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                header_Pedido.setForeground(new Color(102, 102, 255));
                                Lista_Pedido.setShowGrid(false);

                                Lista_Pedido.setModel(Linhas_Pedido);
                                Lista_Pedido.setRowHeight(30);

                                Linhas_Pedido.setRowCount(10);

                                JScrollPane rol_Pedido = new JScrollPane(Lista_Pedido);

                                //Lista de Produtos
                                String[] Colunas_Tabela1 = {"Produto", "Marca", "Descrição", "Preço", "Quantidade", "Imagem", "Sub Total", "Total"};
                                String[][] inf1 = {{}};

                                DefaultTableModel Linhas = new DefaultTableModel(inf1, Colunas_Tabela1);
                                JTable Lista_Produtos = new JTable(Linhas);
                                JTableHeader header = Lista_Produtos.getTableHeader();

                                //Personalizando a Linhas_Coluna
                                header.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                header.setForeground(new Color(102, 102, 255));
                                Lista_Produtos.setShowGrid(false);

                                Lista_Produtos.setModel(Linhas);
                                Lista_Produtos.setRowHeight(120);

                                Lista_Produtos.getColumnModel().getColumn(5).setPreferredWidth(180);

                                Linhas.setRowCount(10);
                                JScrollPane rol_Produtos = new JScrollPane(Lista_Produtos);

                                lblProdutos.setBounds(365, 410, 200, 30);
                                lblPedido.setBounds(365, 210, 200, 30);

                                rol_Pedido.setBounds(150, 250, 600, 150);
                                txtPesquisa.setBounds(690, 0, 200, 30);
                                rol_Cliente1.setBounds(10, 40, 890, 150);
                                rol_Produtos.setBounds(10, 450, 890, 150);
                                btnPagar.setBounds(600, 615, 100, 30);
                                btnRelatorio.setBounds(390, 615, 100, 30);
                                btnEditar.setBounds(200, 615, 100, 30);

                                txtPesquisa.addKeyListener(new KeyListener() {
                                    @Override
                                    public void keyTyped(KeyEvent e) {

                                    }

                                    @Override
                                    public void keyPressed(KeyEvent e) {

                                    }

                                    @Override
                                    public void keyReleased(KeyEvent e) {

                                    }

                                });

                                //Instanciando o painel de Pagamentos
                                pnlPagamento.setVisible(false);

                                //Este botao vai chamar a tela de pagamento
                                btnPagar.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        pnlPendentes.setVisible(false);

                                        pnlPagamento.setLayout(null);
                                        pnlPagamento.setBounds(280, 0, 920, 700);
                                        pnlPagamento.setBackground(Color.white);

                                        JLabel lblLista = new JLabel("Produtos a Pagar");
                                        JLabel lblNome = new JLabel("Nome do Titular da Conta");
                                        JLabel lblGenero = new JLabel("Genero");
                                        JLabel lblContacto = new JLabel("Contacto/Email");
                                        JLabel lblnumero_cartao = new JLabel("Numero do cartao");
                                        JLabel lblValidade_Cartao = new JLabel("Validade do cartao");
                                        JLabel lblPagamento = new JLabel("Tipo de Pagamento");
                                        JLabel lblValor = new JLabel("Valor Pago");
                                        JLabel lblValor_a_Pagar = new JLabel("Total a Pagar");
                                        JLabel lblValor_a_PagarView = new JLabel("0");
                                        JLabel lblTrocos = new JLabel("Trocos");
                                        JLabel lblCVV = new JLabel("CVV");
                                        JLabel lblIcon = new JLabel();

                                        JTextField txtNome = new JTextField();
                                        JComboBox jcGenero = new JComboBox();
                                        JTextField txtnumero_cartao = new JTextField();
                                        JComboBox jcTipo = new JComboBox();
                                        JTextField txtMontante = new JTextField();
                                        JTextField txtContacto_Email = new JTextField();
                                        JTextField txtTrocos = new JTextField();
                                        JTextField txtCVV = new JTextField();
                                        JDateChooser txtValidade_cartao = new JDateChooser();

                                        //adicionando items nas JComboBox
                                        /////////////////////////////////////////////////
                                        jcGenero.setBackground(Color.white);
                                        jcGenero.addItem("");
                                        jcGenero.addItem("Masculino");
                                        jcGenero.addItem("Feminino");

                                        jcTipo.setBackground(Color.white);
                                        jcTipo.addItem("");
                                        jcTipo.addItem("Pagamento em Dinheiro");
                                        jcTipo.addItem("Pagamento por m-Pesa");
                                        jcTipo.addItem("Pagamento por emola");
                                        jcTipo.addItem("Pagamento por mKesh");
                                        jcTipo.addItem("Cartão de Credito");

                                        ////////////////////////////////////////////////////////////
                                        BotaoPersonalizado btnPagar = new BotaoPersonalizado("Registar ");

                                        BotaoPersonalizado btnRecibo = new BotaoPersonalizado("Recibo");

                                        BotaoPersonalizado btnVoltar = new BotaoPersonalizado("Voltar");

                                        String[] Colunas_Vendas = {"Produto", "Marca", "Descrição", "Preço", "Quantidade", "Imagem", "Sub Total"};
                                        String[][] inf_Vendas = {{}};
                                        DefaultTableModel tabela_Vendas = new DefaultTableModel(inf_Vendas, Colunas_Vendas);

                                        // Criando as Tabelas/Listas
                                        JTable Lista_Vendas = new JTable(tabela_Vendas);
                                        JTableHeader header_Vendas = Lista_Vendas.getTableHeader();

                                        Lista_Vendas.setModel(tabela_Vendas);
                                        Lista_Vendas.setRowHeight(120);
                                        Lista_Vendas.getColumnModel().getColumn(5).setPreferredWidth(180);
                                        Lista_Vendas.getColumnModel().getColumn(2).setPreferredWidth(100);
                                        Lista_Vendas.getColumnModel().getColumn(0).setPreferredWidth(100);

                                        //Personalizando a Linhas_Colunas/lista de Compras
                                        Lista_Vendas.setShowGrid(false);
                                        header_Vendas.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                        header_Vendas.setForeground(new Color(102, 102, 255));

                                        tabela_Vendas.setRowCount(10);

                                        JScrollPane rol_Vendas = new JScrollPane(Lista_Vendas);

                                        lblLista.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                                        lblNome.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                        lblGenero.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                        lblContacto.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                        lblPagamento.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                        lblnumero_cartao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                        lblValor.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                        lblTrocos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                        lblValor_a_Pagar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                        lblValor_a_PagarView.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                        lblValidade_Cartao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                        lblCVV.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));

                                        txtNome.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                        jcGenero.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                        txtContacto_Email.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                        txtMontante.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                        txtnumero_cartao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                        txtValidade_cartao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                        jcTipo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                        txtTrocos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                        txtCVV.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));

                                        btnPagar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                                        btnRecibo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                                        btnVoltar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));

                                        btnPagar.setFocusPainted(false);
                                        btnRecibo.setFocusPainted(false);
                                        btnVoltar.setFocusPainted(false);

                                        //Foreground
                                        lblLista.setForeground(new Color(0, 102, 255));
                                        lblNome.setForeground(new Color(102, 102, 255));
                                        lblGenero.setForeground(new Color(102, 102, 255));
                                        lblContacto.setForeground(new Color(102, 102, 255));
                                        lblPagamento.setForeground(new Color(102, 102, 255));
                                        lblValor.setForeground(new Color(102, 102, 255));
                                        lblnumero_cartao.setForeground(new Color(102, 102, 255));
                                        lblValidade_Cartao.setForeground(new Color(102, 102, 255));
                                        lblValor_a_Pagar.setForeground(new Color(102, 102, 255));
                                        lblTrocos.setForeground(new Color(102, 102, 255));
                                        lblCVV.setForeground(new Color(102, 102, 255));
                                        btnPagar.setForeground(new Color(0, 102, 255));

                                        btnVoltar.setForeground(new Color(0, 102, 255));

                                        //Visibilidade inicial das  Componentes
                                        txtNome.setEnabled(false);
                                        jcGenero.setEnabled(false);

                                        txtContacto_Email.setEnabled(false);
                                        txtMontante.setEnabled(false);
                                        txtnumero_cartao.setEnabled(false);
                                        txtValidade_cartao.setEnabled(false);
                                        txtTrocos.setEnabled(false);
                                        txtCVV.setEnabled(false);
                                        btnPagar.setEnabled(false);
                                        btnRecibo.setEnabled(false);

                                        jcTipo.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                if (jcTipo.getSelectedIndex() == 1) {

                                                    txtNome.setEnabled(false);
                                                    jcGenero.setEnabled(false);
                                                    txtContacto_Email.setEnabled(false);
                                                    txtnumero_cartao.setEnabled(false);
                                                    txtValidade_cartao.setEnabled(false);
                                                    txtCVV.setEnabled(false);
                                                    btnRecibo.setEnabled(false);

                                                    lblIcon.setBorder(BorderFactory.createEmptyBorder());

                                                    txtMontante.setEnabled(true);

                                                    txtMontante.addKeyListener(new KeyListener() {
                                                        @Override
                                                        public void keyTyped(KeyEvent e) {

                                                        }

                                                        @Override
                                                        public void keyPressed(KeyEvent e) {
                                                            char c = e.getKeyChar();
                                                            if (Character.isLetter(c)) {
                                                                txtMontante.setEditable(false);
                                                                JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                                            } else {
                                                                txtMontante.setEditable(true);

                                                            }

                                                        }

                                                        @Override
                                                        public void keyReleased(KeyEvent e) {
                                                            //Pegando o tamanho do texto
                                                            int comprimentoTexto = txtMontante.getText().length();

                                                            // Define a cor da borda com base no comprimento do texto
                                                            Color cor = (comprimentoTexto <= 1) ? Color.RED : Color.GREEN;

                                                            // Cria uma borda com a cor desejada
                                                            Border bordaColorida = BorderFactory.createLineBorder(cor);

                                                            // Aplica a borda ao campo de texto
                                                            txtMontante.setBorder(bordaColorida);

                                                            // Permitindo com que o campo seguinte seja aberto assim como nao
                                                            if (cor.equals(Color.GREEN)) {
                                                                btnPagar.setEnabled(true);

                                                            } else {
                                                                btnPagar.setEnabled(false);

                                                            }

                                                            txtMontante.addFocusListener(new FocusListener() {
                                                                @Override
                                                                public void focusGained(FocusEvent e) {

                                                                }

                                                                @Override
                                                                public void focusLost(FocusEvent e) {

                                                                    // Restaura a borda padrão quando o campo perde o foco
                                                                    txtMontante.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                                                }
                                                            });

                                                        }
                                                    }); // campo Montantr

                                                    //Salvar Venda por meio do pagamento em Dinheiro
                                                    btnPagar.setEnabled(true);
                                                    btnPagar.addActionListener(new ActionListener() {
                                                        @Override
                                                        public void actionPerformed(ActionEvent e) {

                                                        }

                                                    });

                                                } else {
                                                    if (jcTipo.getSelectedIndex() == 5) {

                                                        lblIcon.setBorder(BorderFactory.createEmptyBorder());

                                                        lblIcon.setIcon(Icon_catao);
                                                        lblNome.setText("");
                                                        lblNome.setText("Nome do Titular da Conta");
                                                        txtMontante.setEnabled(false);
                                                        txtNome.setEnabled(true);
                                                        jcGenero.setEnabled(false);
                                                        txtContacto_Email.setEnabled(false);
                                                        txtnumero_cartao.setEnabled(false);
                                                        txtValidade_cartao.setEnabled(false);
                                                        txtCVV.setEnabled(false);

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
                                                                        jcGenero.requestFocus();
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
                                                                    jcGenero.setEnabled(true);

                                                                } else {
                                                                    jcGenero.setEnabled(false);

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

                                                        jcGenero.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {

                                                                if (jcGenero.getSelectedIndex() != 0) {
                                                                    txtContacto_Email.setEnabled(true);

                                                                } else {
                                                                    txtContacto_Email.setEnabled(false);

                                                                }
                                                            }

                                                        });

                                                        //Numero ou Email
                                                        txtContacto_Email.addKeyListener(new KeyListener() {
                                                            @Override
                                                            public void keyTyped(KeyEvent e) {

                                                            }

                                                            @Override
                                                            public void keyPressed(KeyEvent e) {
                                                                txtContacto_Email.setEditable(true);
                                                                if (e.getKeyCode() == KeyEvent.VK_UP) {
                                                                    jcGenero.requestFocus();
                                                                } else if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_ENTER) {
                                                                    txtnumero_cartao.setEnabled(true);
                                                                }
                                                            }

                                                            @Override
                                                            public void keyReleased(KeyEvent e) {
                                                                //Pegando o tamanho do texto
                                                                int comprimentoTexto = txtContacto_Email.getText().length();

                                                                // Define a cor da borda com base no comprimento do texto
                                                                Color cor = (comprimentoTexto != 9 || (txtContacto_Email.getText().equals(""))) ? Color.RED : Color.GREEN;

                                                                // Cria uma borda com a cor desejada
                                                                Border bordaColorida = BorderFactory.createLineBorder(cor);

                                                                // Aplica a borda ao campo de texto
                                                                txtContacto_Email.setBorder(bordaColorida);

                                                                // Permitindo com que o campo seguinte seja aberto assim como nao
                                                                if (cor.equals(Color.GREEN)) {
                                                                    txtnumero_cartao.setEnabled(true);

                                                                } else {
                                                                    txtnumero_cartao.setEnabled(false);

                                                                }

                                                                txtContacto_Email.addFocusListener(new FocusListener() {
                                                                    @Override
                                                                    public void focusGained(FocusEvent e) {

                                                                    }

                                                                    @Override
                                                                    public void focusLost(FocusEvent e) {

                                                                        // Restaura a borda padrão quando o campo perde o foco
                                                                        txtContacto_Email.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                                                    }
                                                                });

                                                            }
                                                        }); // campo Numero Celular

                                                        //Numero de Cartao
                                                        txtnumero_cartao.addKeyListener(new KeyListener() {
                                                            @Override
                                                            public void keyTyped(KeyEvent e) {

                                                            }

                                                            @Override
                                                            public void keyPressed(KeyEvent e) {
                                                                char c = e.getKeyChar();
                                                                if (Character.isLetter(c)) {
                                                                    txtnumero_cartao.setEditable(false);
                                                                    JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                                                } else {
                                                                    txtnumero_cartao.setEditable(true);
                                                                    if (e.getKeyCode() == KeyEvent.VK_UP) {
                                                                        txtContacto_Email.requestFocus();
                                                                    }

                                                                }

                                                            }

                                                            @Override
                                                            public void keyReleased(KeyEvent e) {
                                                                //Pegando o tamanho do texto
                                                                int comprimentoTexto = txtnumero_cartao.getText().length();

                                                                // Define a cor da borda com base no comprimento do texto
                                                                Color cor = (comprimentoTexto != 12) ? Color.RED : Color.GREEN;

                                                                // Cria uma borda com a cor desejada
                                                                Border bordaColorida = BorderFactory.createLineBorder(cor);

                                                                // Aplica a borda ao campo de texto
                                                                txtnumero_cartao.setBorder(bordaColorida);

                                                                // Permitindo com que o campo seguinte seja aberto assim como nao
                                                                if (cor.equals(Color.GREEN)) {
                                                                    txtValidade_cartao.setEnabled(true);
                                                                    txtCVV.setEnabled(true);

                                                                } else {
                                                                    txtValidade_cartao.setEnabled(false);
                                                                    txtCVV.setEnabled(false);

                                                                }

                                                                txtnumero_cartao.addFocusListener(new FocusListener() {
                                                                    @Override
                                                                    public void focusGained(FocusEvent e) {

                                                                    }

                                                                    @Override
                                                                    public void focusLost(FocusEvent e) {

                                                                        // Restaura a borda padrão quando o campo perde o foco
                                                                        txtnumero_cartao.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                                                    }
                                                                });

                                                            }
                                                        }); // campo Numero do Cartão

                                                        //CVV
                                                        txtCVV.addKeyListener(new KeyListener() {
                                                            @Override
                                                            public void keyTyped(KeyEvent e) {

                                                            }

                                                            @Override
                                                            public void keyPressed(KeyEvent e) {
                                                                char c = e.getKeyChar();
                                                                if (Character.isLetter(c)) {
                                                                    txtCVV.setEditable(false);
                                                                    JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                                                } else {
                                                                    txtCVV.setEditable(true);
                                                                    if (e.getKeyCode() == KeyEvent.VK_UP) {
                                                                        txtnumero_cartao.requestFocus();
                                                                    }

                                                                }

                                                            }

                                                            @Override
                                                            public void keyReleased(KeyEvent e) {
                                                                //Pegando o tamanho do texto
                                                                int comprimentoTexto = txtCVV.getText().length();

                                                                // Define a cor da borda com base no comprimento do texto
                                                                Color cor = (comprimentoTexto != 3) ? Color.RED : Color.GREEN;

                                                                // Cria uma borda com a cor desejada
                                                                Border bordaColorida = BorderFactory.createLineBorder(cor);

                                                                // Aplica a borda ao campo de texto
                                                                txtCVV.setBorder(bordaColorida);

                                                                // Permitindo com que o campo seguinte seja aberto assim como nao
                                                                if (cor.equals(Color.GREEN)) {
                                                                    btnPagar.setEnabled(true);

                                                                } else {
                                                                    btnPagar.setEnabled(false);

                                                                }

                                                                txtCVV.addFocusListener(new FocusListener() {
                                                                    @Override
                                                                    public void focusGained(FocusEvent e) {

                                                                    }

                                                                    @Override
                                                                    public void focusLost(FocusEvent e) {

                                                                        // Restaura a borda padrão quando o campo perde o foco
                                                                        txtCVV.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                                                    }
                                                                });

                                                            }
                                                        }); // campo CVV

                                                        btnRecibo.setEnabled(false);

                                                    } else {
                                                        if (jcTipo.getSelectedIndex() == 2) {
                                                            txtContacto_Email.setEnabled(true);
                                                            lblIcon.setBorder(BorderFactory.createEmptyBorder());

                                                            lblIcon.setIcon(Icon_mpesa);
                                                            lblContacto.setText("");
                                                            lblContacto.setText("Contacto");
                                                            txtMontante.setEnabled(false);
                                                            txtNome.setEnabled(false);
                                                            jcGenero.setEnabled(false);
                                                            txtnumero_cartao.setEnabled(false);
                                                            txtValidade_cartao.setEnabled(false);
                                                            txtCVV.setEnabled(false);

                                                            txtContacto_Email.addKeyListener(new KeyListener() {
                                                                @Override
                                                                public void keyTyped(KeyEvent e) {

                                                                }

                                                                @Override
                                                                public void keyPressed(KeyEvent e) {

                                                                    char c = e.getKeyChar();

                                                                    if (Character.isLetter(c)) {

                                                                        txtContacto_Email.setEditable(false);
                                                                        JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                                                    } else {
                                                                        txtContacto_Email.setEditable(true);

                                                                    }

                                                                }

                                                                @Override
                                                                public void keyReleased(KeyEvent e) {
                                                                    //Pegando o tamanho do texto
                                                                    int comprimentoTexto = txtContacto_Email.getText().length();

                                                                    // Define a cor da borda com base no comprimento do texto
                                                                    Color cor = (comprimentoTexto != 9) ? Color.RED : Color.GREEN;

                                                                    // Cria uma borda com a cor desejada
                                                                    Border bordaColorida = BorderFactory.createLineBorder(cor);

                                                                    // Aplica a borda ao campo de texto
                                                                    txtContacto_Email.setBorder(bordaColorida);

                                                                    // Permitindo com que o campo seguinte seja aberto assim como nao
                                                                    if (cor.equals(Color.GREEN)) {
                                                                        btnPagar.setEnabled(true);

                                                                    } else {
                                                                        btnPagar.setEnabled(false);
                                                                    }

                                                                    txtContacto_Email.addFocusListener(new FocusListener() {
                                                                        @Override
                                                                        public void focusGained(FocusEvent e) {

                                                                        }

                                                                        @Override
                                                                        public void focusLost(FocusEvent e) {

                                                                            // Restaura a borda padrão quando o campo perde o foco
                                                                            txtContacto_Email.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                                                        }
                                                                    });

                                                                }
                                                            }); // campo Contacto

                                                            btnRecibo.setEnabled(false);

                                                            //Salvar Venda por meio do M-pesa
                                                            btnPagar.addActionListener(new ActionListener() {
                                                                @Override
                                                                public void actionPerformed(ActionEvent e) {

                                                                    //Opção de imprimir factura desabilitada
                                                                    btnRecibo.setEnabled(true);
                                                                }

                                                            });
                                                        } else {
                                                            if (jcTipo.getSelectedIndex() == 3) {

                                                                lblIcon.setBorder(BorderFactory.createEmptyBorder());

                                                                lblIcon.setIcon(Icon_emola);
                                                                lblContacto.setText("");
                                                                lblContacto.setText("Contacto");
                                                                txtMontante.setEnabled(false);
                                                                txtNome.setEnabled(false);
                                                                jcGenero.setEnabled(false);
                                                                txtContacto_Email.setEnabled(true);
                                                                txtnumero_cartao.setEnabled(false);
                                                                txtValidade_cartao.setEnabled(false);
                                                                txtCVV.setEnabled(false);

                                                                txtContacto_Email.addKeyListener(new KeyListener() {
                                                                    @Override
                                                                    public void keyTyped(KeyEvent e) {

                                                                    }

                                                                    @Override
                                                                    public void keyPressed(KeyEvent e) {

                                                                        char c = e.getKeyChar();

                                                                        if (Character.isLetter(c)) {

                                                                            txtContacto_Email.setEditable(false);
                                                                            JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                                                        } else {
                                                                            txtContacto_Email.setEditable(true);

                                                                        }

                                                                    }

                                                                    @Override
                                                                    public void keyReleased(KeyEvent e) {
                                                                        //Pegando o tamanho do texto
                                                                        int comprimentoTexto = txtContacto_Email.getText().length();

                                                                        // Define a cor da borda com base no comprimento do texto
                                                                        Color cor = (comprimentoTexto != 9) ? Color.RED : Color.GREEN;

                                                                        // Cria uma borda com a cor desejada
                                                                        Border bordaColorida = BorderFactory.createLineBorder(cor);

                                                                        // Aplica a borda ao campo de texto
                                                                        txtContacto_Email.setBorder(bordaColorida);

                                                                        // Permitindo com que o campo seguinte seja aberto assim como nao
                                                                        if (cor.equals(Color.GREEN)) {
                                                                            btnPagar.setEnabled(true);

                                                                        } else {
                                                                            btnPagar.setEnabled(false);
                                                                        }

                                                                        txtContacto_Email.addFocusListener(new FocusListener() {
                                                                            @Override
                                                                            public void focusGained(FocusEvent e) {

                                                                            }

                                                                            @Override
                                                                            public void focusLost(FocusEvent e) {

                                                                                // Restaura a borda padrão quando o campo perde o foco
                                                                                txtContacto_Email.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                                                            }
                                                                        });

                                                                    }
                                                                }); // campo Contacto

                                                                btnRecibo.setEnabled(false);

                                                                //Salvar Venda por meio do emola
                                                                btnPagar.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {

                                                                        //Opção de imprimir factura desabilitada
                                                                        btnRecibo.setEnabled(true);
                                                                    }

                                                                });
                                                            } else {
                                                                if (jcTipo.getSelectedIndex() == 4) {

                                                                    lblIcon.setBorder(BorderFactory.createEmptyBorder());

                                                                    lblIcon.setIcon(Icon_mkesh);
                                                                    lblContacto.setText("");
                                                                    lblContacto.setText("Contacto");
                                                                    txtMontante.setEnabled(false);
                                                                    txtNome.setEnabled(false);
                                                                    jcGenero.setEnabled(false);
                                                                    txtContacto_Email.setEnabled(true);
                                                                    txtnumero_cartao.setEnabled(false);
                                                                    txtValidade_cartao.setEnabled(false);
                                                                    txtCVV.setEnabled(false);

                                                                    txtContacto_Email.addKeyListener(new KeyListener() {
                                                                        @Override
                                                                        public void keyTyped(KeyEvent e) {

                                                                        }

                                                                        @Override
                                                                        public void keyPressed(KeyEvent e) {

                                                                            char c = e.getKeyChar();

                                                                            if (Character.isLetter(c)) {

                                                                                txtContacto_Email.setEditable(false);
                                                                                JOptionPane.showMessageDialog(null, "Introduza Caracteres validos!!!");
                                                                            } else {
                                                                                txtContacto_Email.setEditable(true);

                                                                            }

                                                                        }

                                                                        @Override
                                                                        public void keyReleased(KeyEvent e) {
                                                                            //Pegando o tamanho do texto
                                                                            int comprimentoTexto = txtContacto_Email.getText().length();

                                                                            // Define a cor da borda com base no comprimento do texto
                                                                            Color cor = (comprimentoTexto != 9) ? Color.RED : Color.GREEN;

                                                                            // Cria uma borda com a cor desejada
                                                                            Border bordaColorida = BorderFactory.createLineBorder(cor);

                                                                            // Aplica a borda ao campo de texto
                                                                            txtContacto_Email.setBorder(bordaColorida);

                                                                            // Permitindo com que o campo seguinte seja aberto assim como nao
                                                                            if (cor.equals(Color.GREEN)) {
                                                                                btnPagar.setEnabled(true);

                                                                            } else {
                                                                                btnPagar.setEnabled(false);
                                                                            }

                                                                            txtContacto_Email.addFocusListener(new FocusListener() {
                                                                                @Override
                                                                                public void focusGained(FocusEvent e) {

                                                                                }

                                                                                @Override
                                                                                public void focusLost(FocusEvent e) {

                                                                                    // Restaura a borda padrão quando o campo perde o foco
                                                                                    txtContacto_Email.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));

                                                                                }
                                                                            });

                                                                        }
                                                                    }); // campo Contacto

                                                                    btnRecibo.setEnabled(false);

                                                                    //Salvar Venda por meio do m-kesh
                                                                    btnPagar.addActionListener(new ActionListener() {
                                                                        @Override
                                                                        public void actionPerformed(ActionEvent e) {

                                                                            //Opção de imprimir factura desabilitada
                                                                            btnRecibo.setEnabled(true);
                                                                        }

                                                                    });

                                                                } else {
                                                                    if (jcTipo.getSelectedIndex() == 0) {
                                                                        JOptionPane.showMessageDialog(null, "Escolha uma opção valida!!!");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }

                                        });// Fim da sequencia de pagamentos

                                        lblLista.setBounds(330, 0, 200, 30);
                                        rol_Vendas.setBounds(10, 30, 890, 270);
                                        lblValor_a_Pagar.setBounds(10, 300, 100, 30);
                                        lblValor_a_PagarView.setBounds(10, 325, 100, 30);

                                        lblPagamento.setBounds(10, 355, 200, 30);
                                        jcTipo.setBounds(10, 385, 200, 35);
                                        lblNome.setBounds(10, 420, 200, 30);
                                        txtNome.setBounds(10, 450, 200, 35);
                                        lblGenero.setBounds(10, 485, 200, 30);
                                        jcGenero.setBounds(10, 515, 200, 35);

                                        lblContacto.setBounds(250, 355, 200, 30);
                                        txtContacto_Email.setBounds(250, 385, 200, 35);
                                        lblnumero_cartao.setBounds(250, 420, 200, 30);
                                        txtnumero_cartao.setBounds(250, 450, 200, 35);
                                        lblValidade_Cartao.setBounds(250, 485, 200, 30);
                                        txtValidade_cartao.setBounds(250, 515, 200, 35);

                                        lblCVV.setBounds(490, 355, 200, 30);
                                        txtCVV.setBounds(490, 385, 200, 35);
                                        lblValor.setBounds(490, 420, 200, 30);
                                        txtMontante.setBounds(490, 450, 200, 35);
                                        lblTrocos.setBounds(490, 485, 200, 30);
                                        txtTrocos.setBounds(490, 515, 200, 35);
                                        lblIcon.setBounds(750, 385, 140, 165);

                                        btnPagar.setBounds(60, 590, 100, 30);

                                        btnRecibo.setBounds(290, 590, 100, 30);

                                        btnVoltar.setBounds(540, 590, 100, 30);

                                        pnlPagamento.add(rol_Vendas);
                                        pnlPagamento.add(lblLista);

                                        pnlPagamento.add(lblIcon);
                                        pnlPagamento.add(lblNome);
                                        pnlPagamento.add(lblGenero);
                                        pnlPagamento.add(lblContacto);
                                        pnlPagamento.add(lblnumero_cartao);
                                        pnlPagamento.add(lblPagamento);
                                        pnlPagamento.add(lblValidade_Cartao);
                                        pnlPagamento.add(lblValor_a_Pagar);
                                        pnlPagamento.add(lblValor_a_PagarView);
                                        pnlPagamento.add(lblPagamento);
                                        pnlPagamento.add(lblValor);
                                        pnlPagamento.add(lblTrocos);
                                        pnlPagamento.add(lblCVV);
                                        pnlPagamento.add(txtNome);
                                        pnlPagamento.add(jcGenero);
                                        pnlPagamento.add(txtContacto_Email);
                                        pnlPagamento.add(txtnumero_cartao);
                                        pnlPagamento.add(txtValidade_cartao);
                                        pnlPagamento.add(jcTipo);
                                        pnlPagamento.add(txtMontante);
                                        pnlPagamento.add(txtTrocos);
                                        pnlPagamento.add(txtCVV);

                                        pnlPagamento.add(btnPagar);
                                        pnlPagamento.add(btnRecibo);
                                        pnlPagamento.add(btnVoltar);

                                        pnlPagamento.setVisible(true);

                                    }

                                });

                                pnlPendentes.add(lblListar);
                                pnlPendentes.add(lblProdutos);
                                pnlPendentes.add(lblPedido);

                                pnlPendentes.add(txtPesquisa);
                                pnlPendentes.add(rol_Cliente1);
                                pnlPendentes.add(rol_Pedido);
                                pnlPendentes.add(rol_Produtos);
                                pnlPendentes.add(btnPagar);
                                pnlPendentes.add(btnEditar);
                                pnlPendentes.add(btnRelatorio);

                                pnlPendentes.setVisible(true);

                            }

                        });

                        // Pedidos Finalizados
                        btnFinalizados.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                pnlPrincipal.setVisible(false);
                                pnlDescartados.setVisible(false);
                                pnlPendentes.setVisible(false);

                                pnlFinalizados.setLayout(null);
                                pnlFinalizados.setBounds(280, 0, 920, 700);
                                pnlFinalizados.setBackground(Color.white);

                                JLabel lblListar = new JLabel();
                                JLabel lblProdutos = new JLabel();
                                JLabel lblPedido = new JLabel();

                                JTextField txtPesquisa = new JTextField();

                                BotaoPersonalizado btnRecuperar = new BotaoPersonalizado("PDF");

                                btnRecuperar.setBackground(Color.white);
                                btnRecuperar.setForeground(new Color(0, 102, 255));

                                lblListar.setBounds(365, 0, 350, 30);

                                lblListar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                                lblProdutos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                                lblPedido.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                                btnRecuperar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                                txtPesquisa.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));

                                lblListar.setText("Clientes com Pedidos");
                                lblListar.setForeground(new Color(0, 102, 255));

                                lblPedido.setText("Pedidos do Cliente");
                                lblPedido.setForeground(new Color(0, 102, 255));

                                lblProdutos.setText("Produtos do Pedido");
                                lblProdutos.setForeground(new Color(0, 102, 255));

                                //Lista de Clientes
                                String[] Colunas_Cliente = {"Cliente", "Genero", "Contacto", "Email", "Status"};
                                String[][] inf_Cliente = {{}};

                                DefaultTableModel Linhas_Cliente = new DefaultTableModel(inf_Cliente, Colunas_Cliente);
                                JTable Lista_Cliente = new JTable(Linhas_Cliente);
                                JTableHeader header_Cliente = Lista_Cliente.getTableHeader();

                                //Personalizando a Linhas_Colunas
                                header_Cliente.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                header_Cliente.setForeground(new Color(102, 102, 255));
                                Lista_Cliente.setShowGrid(false);

                                Lista_Cliente.setModel(Linhas_Cliente);
                                Lista_Cliente.setRowHeight(30);

                                Linhas_Cliente.setRowCount(10);
                                JScrollPane rol_Cliente1 = new JScrollPane(Lista_Cliente);

                                //Lista de PedidosCodigo_
                                String[] Colunas_Pedido = {"Codigo", "Data_Pedido ", "Data_Pagamento", "Status"};
                                String[][] inf_Pedido = {{}};

                                DefaultTableModel Linhas_Pedido = new DefaultTableModel(inf_Pedido, Colunas_Pedido);
                                JTable Lista_Pedido = new JTable(Linhas_Pedido);
                                JTableHeader header_Pedido = Lista_Pedido.getTableHeader();

                                //Personalizando a Linhas_Colunas
                                header_Pedido.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                header_Pedido.setForeground(new Color(102, 102, 255));
                                Lista_Pedido.setShowGrid(false);

                                Lista_Pedido.setModel(Linhas_Pedido);
                                Lista_Pedido.setRowHeight(30);

                                Linhas_Pedido.setRowCount(10);

                                JScrollPane rol_Pedido = new JScrollPane(Lista_Pedido);

                                //Lista de Produtos
                                String[] Colunas_Tabela1 = {"Produto", "Marca", "Descrição", "Preço", "Quantidade", "Imagem", "Sub Total", "Total"};
                                String[][] inf1 = {{}};

                                DefaultTableModel Linhas = new DefaultTableModel(inf1, Colunas_Tabela1);
                                JTable Lista_Produtos = new JTable(Linhas);
                                JTableHeader header = Lista_Produtos.getTableHeader();

                                //Personalizando a Linhas_Coluna
                                header.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                header.setForeground(new Color(102, 102, 255));
                                Lista_Produtos.setShowGrid(false);

                                Lista_Produtos.setModel(Linhas);
                                Lista_Produtos.setRowHeight(120);

                                Lista_Produtos.getColumnModel().getColumn(5).setPreferredWidth(180);

                                Linhas.setRowCount(10);
                                JScrollPane rol_Produtos = new JScrollPane(Lista_Produtos);

                                lblProdutos.setBounds(365, 410, 200, 30);
                                lblPedido.setBounds(365, 210, 200, 30);

                                rol_Pedido.setBounds(150, 250, 600, 150);
                                txtPesquisa.setBounds(690, 0, 200, 30);
                                rol_Cliente1.setBounds(10, 40, 890, 150);
                                rol_Produtos.setBounds(10, 450, 890, 150);
                                btnRecuperar.setBounds(395, 610, 80, 30);

                                txtPesquisa.addKeyListener(new KeyListener() {
                                    @Override
                                    public void keyTyped(KeyEvent e) {

                                    }

                                    @Override
                                    public void keyPressed(KeyEvent e) {

                                    }

                                    @Override
                                    public void keyReleased(KeyEvent e) {

                                    }

                                });

                                pnlFinalizados.add(lblListar);
                                pnlFinalizados.add(lblProdutos);
                                pnlFinalizados.add(lblPedido);
                                pnlFinalizados.add(btnRecuperar);

                                pnlFinalizados.add(txtPesquisa);
                                pnlFinalizados.add(rol_Cliente1);
                                pnlFinalizados.add(rol_Pedido);
                                pnlFinalizados.add(rol_Produtos);
                                pnlFinalizados.setVisible(true);

                            }
                        });

                        //Relatorios e Estatisticas
                        btnDescartados.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                pnlPrincipal.setVisible(false);
                                pnlPendentes.setVisible(false);
                                pnlFinalizados.setVisible(false);

                                pnlDescartados.setLayout(null);
                                pnlDescartados.setBounds(280, 0, 920, 700);
                                pnlDescartados.setBackground(Color.white);

                                JLabel lblListar = new JLabel();
                                JLabel lblProdutos = new JLabel();
                                JLabel lblPedido = new JLabel();

                                JTextField txtPesquisa = new JTextField();

                                //Criando os botoes
                                BotaoPersonalizado btnRecuperar = new BotaoPersonalizado("Recuperar");
                                BotaoPersonalizado btnProcurar = new BotaoPersonalizado("Procurar");
                                BotaoPersonalizado btnRelatorio = new BotaoPersonalizado("PDF");

                                //Mundando o background
                                btnRecuperar.setBackground(Color.white);
                                btnProcurar.setBackground(Color.white);
                                btnRelatorio.setBackground(Color.white);

                                // Mundando o Foreground
                                btnRecuperar.setForeground(new Color(0, 102, 255));
                                btnProcurar.setForeground(new Color(0, 102, 255));
                                btnRelatorio.setForeground(new Color(0, 102, 255));

                                //Tirando a Borda
                                btnRecuperar.setBorder(BorderFactory.createEmptyBorder());
                                btnProcurar.setBorder(BorderFactory.createEmptyBorder());
                                btnRelatorio.setBorder(BorderFactory.createEmptyBorder());

                                btnRecuperar.setFocusPainted(false);
                                btnProcurar.setFocusPainted(false);
                                btnRelatorio.setFocusPainted(false);

                                lblListar.setBounds(365, 0, 350, 30);

                                lblListar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                                lblProdutos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                                lblPedido.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                                btnRecuperar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                                btnProcurar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                                btnRelatorio.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                                txtPesquisa.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));

                                lblListar.setText("Clientes com Pedidos");
                                lblListar.setForeground(new Color(0, 102, 255));

                                lblPedido.setText("Pedidos do Cliente");
                                lblPedido.setForeground(new Color(0, 102, 255));

                                lblProdutos.setText("Produtos do Pedido");
                                lblProdutos.setForeground(new Color(0, 102, 255));

                                //Lista de Clientes
                                String[] Colunas_Cliente = {"Cliente", "Genero", "Contacto", "Email", "Status"};
                                String[][] inf_Cliente = {{}};

                                DefaultTableModel Linhas_Cliente = new DefaultTableModel(inf_Cliente, Colunas_Cliente);
                                JTable Lista_Cliente = new JTable(Linhas_Cliente);
                                JTableHeader header_Cliente = Lista_Cliente.getTableHeader();

                                //Personalizando a Linhas_Colunas
                                header_Cliente.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                header_Cliente.setForeground(new Color(102, 102, 255));
                                Lista_Cliente.setShowGrid(false);

                                Lista_Cliente.setModel(Linhas_Cliente);
                                Lista_Cliente.setRowHeight(30);

                                Linhas_Cliente.setRowCount(10);
                                JScrollPane rol_Cliente1 = new JScrollPane(Lista_Cliente);

                                //Lista de PedidosCodigo_
                                String[] Colunas_Pedido = {"Codigo", "Data_Pedido ", "Data_Descarte", "Status"};
                                String[][] inf_Pedido = {{}};

                                DefaultTableModel Linhas_Pedido = new DefaultTableModel(inf_Pedido, Colunas_Pedido);
                                JTable Lista_Pedido = new JTable(Linhas_Pedido);
                                JTableHeader header_Pedido = Lista_Pedido.getTableHeader();

                                //Personalizando a Linhas_Colunas
                                header_Pedido.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                header_Pedido.setForeground(new Color(102, 102, 255));
                                Lista_Pedido.setShowGrid(false);

                                Lista_Pedido.setModel(Linhas_Pedido);
                                Lista_Pedido.setRowHeight(30);

                                Linhas_Pedido.setRowCount(10);

                                JScrollPane rol_Pedido = new JScrollPane(Lista_Pedido);

                                //Lista de Produtos
                                String[] Colunas_Tabela1 = {"Produto", "Marca", "Descrição", "Preço", "Quantidade", "Imagem", "Sub Total", "Total"};
                                String[][] inf1 = {{}};

                                DefaultTableModel Linhas = new DefaultTableModel(inf1, Colunas_Tabela1);
                                JTable Lista_Produtos = new JTable(Linhas);
                                JTableHeader header = Lista_Produtos.getTableHeader();

                                //Personalizando a Linhas_Coluna
                                header.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                                header.setForeground(new Color(102, 102, 255));
                                Lista_Produtos.setShowGrid(false);

                                Lista_Produtos.setModel(Linhas);
                                Lista_Produtos.setRowHeight(120);

                                Lista_Produtos.getColumnModel().getColumn(5).setPreferredWidth(180);

                                Linhas.setRowCount(10);
                                JScrollPane rol_Produtos = new JScrollPane(Lista_Produtos);

                                lblProdutos.setBounds(365, 410, 200, 30);
                                lblPedido.setBounds(365, 210, 200, 30);

                                rol_Pedido.setBounds(150, 250, 600, 150);
                                txtPesquisa.setBounds(690, 0, 200, 30);
                                rol_Cliente1.setBounds(10, 40, 890, 150);
                                rol_Produtos.setBounds(10, 450, 890, 150);
                                btnRecuperar.setBounds(600, 615, 100, 30);
                                btnRelatorio.setBounds(230, 615, 100, 30);

                                txtPesquisa.addKeyListener(new KeyListener() {
                                    @Override
                                    public void keyTyped(KeyEvent e) {

                                    }

                                    @Override
                                    public void keyPressed(KeyEvent e) {

                                    }

                                    @Override
                                    public void keyReleased(KeyEvent e) {

                                    }

                                });

                                pnlDescartados.add(lblListar);
                                pnlDescartados.add(lblProdutos);
                                pnlDescartados.add(lblPedido);

                                pnlDescartados.add(txtPesquisa);
                                pnlDescartados.add(rol_Cliente1);
                                pnlDescartados.add(rol_Pedido);
                                pnlDescartados.add(rol_Produtos);
                                pnlDescartados.add(btnRecuperar);
                                pnlDescartados.add(btnRelatorio);
                                pnlDescartados.add(btnProcurar);

                                pnlDescartados.setVisible(true);

                            }
                        });

                        //Neste passo, vou colocar no false todos paineis que eu tenha usando neste metodo, para assegurar
                        //com que estes paineis nao se sobreponham e deixar apenas um visivel aqui antescede a esta.
                        btnVoltarPrincipal.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                MenuPedidos.setVisible(false);
                                pnlPendentes.setVisible(false);
                                pnlFinalizados.setVisible(false);
                                pnlDescartados.setVisible(false);
                                pnlRelatorios.setVisible(false);
                                pnlPagamento.setVisible(false);
                                pnlPrincipal.setVisible(true);
                                MenuServicos.setVisible(true);

                            }
                        });

                        MenuPedidos.add(lblFotografia);
                        MenuPedidos.add(txtbarra2);
                        MenuPedidos.add(btnPendentes);
                        MenuPedidos.add(btnFinalizados);
                        MenuPedidos.add(btnDescartados);
                        MenuPedidos.add(btnVoltarPrincipal);
                        pnlServicos.add(MenuPedidos);
                        pnlServicos.add(pnlPendentes);
                        pnlServicos.add(pnlFinalizados);
                        pnlServicos.add(pnlDescartados);
                        pnlServicos.add(pnlPagamento);
                        MenuPedidos.setVisible(true);
                    }
                });

                //Neste passo, vou colocar no false todos paineis que eu tenha usando neste metodo, para assegurar
                //com que estes paineis nao se sobrepoam e deixar apenas um visivel aqui antescede a esta.
                btnVoltarPrincipal.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pnlVenderProdutos.setVisible(false);
                        pnlProcurarProdutos.setVisible(false);
                        pnlListar.setVisible(false);
                        pnlVendas.setVisible(false);
                        MenuServicos.setVisible(false);
                        pnlPrincipal.setVisible(true);
                        pnlDe_Menu_Principal.setVisible(true);

                    }
                });

                lblFotografia.setIcon(fotografiaPerfil);

                MenuServicos.add(lblFotografia);
                MenuServicos.add(txtbarra2);
                MenuServicos.add(btnVender);
                MenuServicos.add(btnListarProdutos);
                MenuServicos.add(btnPedidos);
                MenuServicos.add(btnVoltarPrincipal);

                pnlServicos.add(MenuServicos);
                pnlServicos.add(pnlListar);
                pnlServicos.add(pnlProcurarProdutos);
                pnlServicos.add(pnlVenderProdutos);
                pnlServicos.add(pnlVendas);
                pnlServicos.add(pnlPrincipal);

                pnlauxPrincipal.add(pnlServicos);

                pnlServicos.setVisible(true);
            }
        });

        // aqui irei dar acção e instruções para o botao Minhas Vendas
        btnHistorico_Vendas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlPrincipal.setVisible(false);
                pnlServicos.setVisible(false);
                pnlDefinicoes.setVisible(false);
                pnlMeuPerfil.setVisible(false);
                pnlMenssagens.setVisible(false);

                pnlHistorico.setLayout(null);
                pnlHistorico.setBounds(280, 0, 920, 660);
                pnlHistorico.setBackground(Color.white);

                JLabel lblListar = new JLabel();
                JLabel lblTotal_Vendas = new JLabel();
                JLabel lblPedidos = new JLabel();

                JPanel pnlGraficoDesempenho = new JPanel();

                JLabel lblProdutos = new JLabel("Produtos Vendidos");

                lblListar.setBounds(380, 0, 350, 30);
                lblProdutos.setBounds(350, 180, 350, 30);

                lblListar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                lblProdutos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));

                lblTotal_Vendas.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                lblPedidos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));

                lblListar.setText("Minhas Vendas");

                lblListar.setForeground(new Color(0, 102, 225));
                lblProdutos.setForeground(new Color(0, 102, 225));

                String[] listar = {"Venda", "Tipo de Venda", "Forma de Pagamento", "Valor Pago", "Trocos", "Data"};
                String[][] inf = {{}};

                String[] produtos = {"Produto", "Marca", "Preço", "Quantidade", "Imagem", "Sub Total", "Total"};
                String[][] inf_Produtos = {{}};

                DefaultTableModel tabela = new DefaultTableModel(inf, listar);
                JTable infCa = new JTable(tabela);
                JTableHeader header = infCa.getTableHeader();
                infCa.getColumnModel().getColumn(2).setPreferredWidth(100);

                DefaultTableModel tabela_Produtos = new DefaultTableModel(inf_Produtos, produtos);
                JTable infCaProdutos = new JTable(tabela_Produtos);
                JTableHeader header_Produtos = infCaProdutos.getTableHeader();

                //Personalizando a fonte das informacoes da Linhas_Colunas
                header.setForeground(new Color(102, 102, 220));
                header.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                infCa.setShowGrid(false);

                header_Produtos.setForeground(new Color(102, 102, 220));
                header_Produtos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                infCaProdutos.setShowGrid(false);

                infCaProdutos.getColumnModel().getColumn(4).setPreferredWidth(200);

                infCa.setModel(tabela);
                infCaProdutos.setModel(tabela_Produtos);

                infCa.setRowHeight(30);
                infCaProdutos.setRowHeight(120);

                tabela.setRowCount(10);
                tabela_Produtos.setRowCount(10);

                JScrollPane rol = new JScrollPane(infCa);

                JScrollPane rol_Produtos = new JScrollPane(infCaProdutos);

                //
                pnlGraficoDesempenho.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                lblTotal_Vendas.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                lblPedidos.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                pnlGraficoDesempenho.setBackground(Color.white);

                rol.setBounds(40, 40, 845, 120);
                rol_Produtos.setBounds(40, 220, 845, 180);
                pnlGraficoDesempenho.setBounds(40, 430, 600, 230);
                lblTotal_Vendas.setBounds(680, 430, 200, 80);
                lblPedidos.setBounds(680, 580, 200, 80);

                pnlHistorico.add(lblListar);
                pnlHistorico.add(lblProdutos);
                pnlHistorico.add(lblTotal_Vendas);
                pnlHistorico.add(lblPedidos);
                pnlHistorico.add(pnlGraficoDesempenho);

                pnlHistorico.add(rol);
                pnlHistorico.add(rol_Produtos);

                pnlHistorico.setVisible(true);
                pnlauxPrincipal.add(pnlHistorico);
            }

        });

        btnMenssagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlPrincipal.setVisible(true);

                pnlServicos.setVisible(false);
                pnlHistorico.setVisible(false);
                pnlDefinicoes.setVisible(false);
                pnlMeuPerfil.setVisible(false);
                pnlDe_Menu_Principal.setVisible(false);

                JPanel pnlMenssagens = new JPanel();
                pnlMenssagens.setLayout(null);
                //
                pnlMenssagens.setBackground(new Color(102, 102, 255));
                pnlMenssagens.setBounds(0, 0, 280, 680);

                JButton btnEnviar = new JButton("   Escrever ");
                JButton btnCaixa = new JButton("   Recebidas");
                JButton btnGerir = new JButton("   Menssagens");
                JButton btnVoltarPrincipal = new JButton("    Voltar");

                JTextField txtbarra2 = new JTextField();
                JLabel lblFotografia = new JLabel();
                lblFotografia.setIcon(fotografiaPerfil);
                btnEnviar.setIcon(Icon_EscreverMenssagem);
                btnCaixa.setIcon(Icon_CaixaMenssagem);
                btnGerir.setIcon(Icon_Definições);
                btnVoltarPrincipal.setIcon(Icon_Voltar);

                lblFotografia.setBounds(45, 50, 180, 180);
                txtbarra2.setBounds(40, 251, 210, 1);
                btnEnviar.setBounds(47, 281, 135, 40);
                btnCaixa.setBounds(42, 351, 150, 40);
                btnGerir.setBounds(45, 421, 170, 40);
                btnVoltarPrincipal.setBounds(45, 491, 110, 40);

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
                        btnEnviar.setBackground(Color.white);
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
                        lblFotografia.setIcon(fotografiaPerfil);
                        btnRelatorio_enviadas.setIcon(Icon_RelatorioMenssagem);

                        lblFotografia.setBounds(45, 50, 180, 180);
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
                        btnVoltarPrincipal.setFocusPainted(false);
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
                        pnlDe_Menu_Principal.setVisible(true);
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
                pnlauxPrincipal.add(pnlPrincipal);
                pnlMenssagens.setVisible(true);
            }
        });//Fim da tela Menssagens

        // Definicoes
        btnDefinicoes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlPrincipal.setVisible(true);
                pnlDe_Menu_Principal.setVisible(false);
                pnlServicos.setVisible(false);
                pnlHistorico.setVisible(false);
                pnlMeuPerfil.setVisible(false);
                pnlMenssagens.setVisible(false);

                pnlDefinicoes.setBounds(0, 0, 280, 700);
                pnlDefinicoes.setBackground(new Color(102, 102, 255));
                pnlDefinicoes.setLayout(null);

                JButton btnActualizardados = new JButton("  Actualizar Dados");
                JButton btnAlterarSenha = new JButton(" Segurança e Privacidade");
                JButton btnVoltar = new JButton("  Voltar");

                JLabel lblFotografia = new JLabel();
                JTextField txtbarra = new JTextField();

                lblFotografia.setBounds(45, 50, 180, 180);
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

                lblFotografia.setIcon(fotografiaPerfil);
                btnVoltar.setIcon(Icon_Voltar);
                btnActualizardados.setIcon(Icon_btnActualizarFu);

                pnlDefinicoes.add(lblFotografia);
                pnlDefinicoes.add(txtbarra);
                pnlDefinicoes.add(btnVoltar);
                pnlDefinicoes.add(btnActualizardados);

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
                        String[] Colunas = {"Email", "Password", "Contacto", "Endereço", "Fotografia"};
                        String[][] inf = {{}};
                        DefaultTableModel tabela_Funcionarios = new DefaultTableModel(inf, Colunas);

                        // Criando as Tabelas/Listas
                        JTable Lista_Funcionarios = new JTable(tabela_Funcionarios);
                        JTableHeader header = Lista_Funcionarios.getTableHeader();

                        Lista_Funcionarios.setShowGrid(false);//
                        Lista_Funcionarios.setRowHeight(120);

                        Lista_Funcionarios.getColumnModel().getColumn(4).setPreferredWidth(200);

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
                        pnlActualizar_Dados.setVisible(true);

                    }
                });

                //Neste passo, vou colocar no false todos paineis que eu tenha usando neste metodo, para assegurar
                //com que estes paineis nao se sobrepoam e deixar apenas um visivel aqui antescede a esta.
                btnVoltar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pnlActualizar_Dados.setVisible(false);
                        pnlDefinicoes.setVisible(false);
                        pnlPrincipal.setVisible(true);
                        pnlDe_Menu_Principal.setVisible(true);

                    }
                });

                pnlauxPrincipal.add(pnlDefinicoes);
                pnlauxPrincipal.add(pnlMenssagens);
                pnlauxPrincipal.add(pnlActualizar_Dados);
                pnlauxPrincipal.add(pnlPrincipal);
                pnlDefinicoes.setVisible(true);

            }
        });

        this.add(pnlbarra1);
        this.add(pnlbarra2);
        this.add(pnlauxPrincipal);
        pnlauxPrincipal.add(pnlPrincipal);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Funcionario_Caixa().setVisible(true);
    }
}
