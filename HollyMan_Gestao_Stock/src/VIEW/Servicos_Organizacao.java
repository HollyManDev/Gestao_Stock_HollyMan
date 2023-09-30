/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HOLLY MAN
 */
public class Servicos_Organizacao extends JFrame {

    ImageIcon fotografiaPerfil = new ImageIcon("src\\Imagens\\Aten.jpeg");
    ImageIcon Imagem_Cumpany = new ImageIcon("src\\Imagens\\Aten.jpeg");
    ImageIcon Imagem_Fundo = new ImageIcon("src\\Imagens\\Aten.jpeg");
    ImageIcon Icon_Perfil = new ImageIcon("src\\Imagens\\Perfil2.png");
    ImageIcon Icon_Tarefas = new ImageIcon("src\\Imagens\\Tarefas2.png");
    ImageIcon Icon_Listar = new ImageIcon("src\\Imagens\\Listar.png");
    ImageIcon Icon_Definições = new ImageIcon("src\\Imagens\\definicoes2.png");
    ImageIcon Icon_Voltar = new ImageIcon("src\\Imagens\\botao-voltar.png");
    ImageIcon Icon_Vender = new ImageIcon("src\\Imagens\\produtos.png");
    ImageIcon Icon_Historico = new ImageIcon("src\\Imagens\\Historico.png");
    ImageIcon Icon_Procurar = new ImageIcon("src\\Imagens\\pesquisa.png");
    ImageIcon Icon_Adicionar_Carinha = new ImageIcon("src\\Imagens\\Carinho_add.png");
    ImageIcon Icon_Eliminar_Carinha = new ImageIcon("src\\Imagens\\carrinho-de-compras.png");

    JButton btnMeuPerfil = new JButton("   Meu Perfil");
    JButton btnServicos = new JButton("  Tarefas");
    JButton btnHistorico_Vendas = new JButton("   Minhas Vendas");
    JButton btnDefinicoes = new JButton("   Definiçoes");
    JLabel lblImagem = new JLabel();
    JButton btnSair = new JButton("   Voltar");

    JTextField txtbarra = new JTextField();
    JPanel pnlPrincipal = new JPanel();

    // Este é o construtor da classe respondavel pela criacaoda frame e tudo que nele existir
    public Servicos_Organizacao() {

        this.setSize(1200, 700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        pnlPrincipal.setLayout(null);
        pnlPrincipal.setBounds(0, 0, 1200, 700);
        pnlPrincipal.setBackground(Color.white);

        this.add(pnlPrincipal);
        lblImagem.setBounds(280, 0, 920, 700);
        //lblImagem.setIcon(fotografiaPerfil);
        pnlPrincipal.add(lblImagem);
        // O codigo abaixo é referente a criacao de um perfil para o funcionario
        // e tambem alguns paineis.

        JPanel pnlMenu_Botoes = new JPanel();
        pnlMenu_Botoes.setBounds(0, 0, 280, 700);
        pnlMenu_Botoes.setLayout(null);
        pnlMenu_Botoes.setBackground(new Color(102, 102, 255));

        pnlPrincipal.add(pnlMenu_Botoes);

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
        btnMeuPerfil.setBounds(10, 200, 170, 40);
        btnServicos.setBounds(12, 260, 150, 40);
        btnHistorico_Vendas.setBounds(8, 330, 230, 40);
        btnDefinicoes.setBounds(18, 400, 170, 40);
        btnSair.setBounds(13, 470, 140, 40);

        // Agoora, neste passo vou trabalhar a fonte.
        btnMeuPerfil.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
        btnServicos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
        btnHistorico_Vendas.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
        btnDefinicoes.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
        btnSair.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));

        // Neste passo, vou trabalhar o background
        btnMeuPerfil.setBackground(new Color(102, 102, 255));
        btnServicos.setBackground(new Color(102, 102, 255));
        btnHistorico_Vendas.setBackground(new Color(102, 102, 255));
        btnDefinicoes.setBackground(new Color(102, 102, 255));
        btnSair.setBackground(new Color(102, 102, 255));

        //Neste passo, vou trabalhar o Foreground
        btnMeuPerfil.setForeground(Color.white);
        btnServicos.setForeground(Color.white);
        btnHistorico_Vendas.setForeground(Color.white);
        btnDefinicoes.setForeground(Color.white);
        btnSair.setForeground(Color.white);

        // Neste passo, vou trabalhar as bordas dos botoes
        btnMeuPerfil.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
        btnServicos.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
        btnHistorico_Vendas.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
        btnDefinicoes.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
        btnSair.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));

        // Adiciobando Icon 
        btnMeuPerfil.setIcon(Icon_Perfil);
        btnDefinicoes.setIcon(Icon_Definições);
        btnHistorico_Vendas.setIcon(Icon_Historico);
        btnServicos.setIcon(Icon_Tarefas);
        btnSair.setIcon(Icon_Voltar);

        // Neste passo, adicionei as componenetes criadas acima criados.
        pnlMenu_Botoes.add(lblFoto);
        pnlMenu_Botoes.add(lblNomefuncionario);
        pnlMenu_Botoes.add(lblFormacao);
        pnlMenu_Botoes.add(txtbarra);
        pnlMenu_Botoes.add(btnMeuPerfil);
        pnlMenu_Botoes.add(btnServicos);
        pnlMenu_Botoes.add(btnHistorico_Vendas);
        pnlMenu_Botoes.add(btnDefinicoes);
        pnlMenu_Botoes.add(btnSair);

        // Neste passo vou criar paineis e dar accção para cada um desses botes.
        JPanel pnlMeuPerfil = new JPanel();
        JPanel pnlServicos = new JPanel();
        JPanel pnlHistorico = new JPanel();
        JPanel pnlDefinicoes = new JPanel();

        //Todos paineis comecam como false porque nao pretendo usa-los durante o programa todo somente em lugares especificos
        pnlMeuPerfil.setVisible(false);
        pnlServicos.setVisible(false);
        pnlHistorico.setVisible(false);
        pnlDefinicoes.setVisible(false);

        //primeiro sera o botao  meu perfil
        btnMeuPerfil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlServicos.setVisible(false);
                pnlHistorico.setVisible(false);
                pnlDefinicoes.setVisible(false);

                pnlMenu_Botoes.setVisible(false);

                pnlMeuPerfil.setBounds(0, 0, 280, 700);
                pnlMeuPerfil.setBackground(new Color(102, 102, 255));
                pnlMeuPerfil.setLayout(null);

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
                btnSair2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                btnSair2.setBackground(new Color(102, 102, 255));
                btnSair2.setForeground(Color.white);

                //Colocando Icon nos botoes
                btnSair2.setIcon(Icon_Voltar);

                //Personalizando a fonte da labels
                lblApelido.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 13));
                lblNomeFuncionario.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 13));
                lblGenero.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 13));
                lblData_Nascimento.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 13));
                lblNumeroBI.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 13));
                lblEmail.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 13));
                lblContacto.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 13));
                lblestado.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 13));
                btnSair2.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));

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
                pnlPrincipal.add(pnlMeuPerfil);
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

        // Neste passo, vou dar acção ao botao tarefas e craiar tudo que deve existir nele
        btnServicos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlHistorico.setVisible(false);
                pnlDefinicoes.setVisible(false);
                pnlMeuPerfil.setVisible(false);
                pnlMenu_Botoes.setVisible(false);

                JPanel pnlListar = new JPanel();
                JPanel pnlVenderProdutos = new JPanel();
                JPanel pnlProcurarProdutos = new JPanel();

                pnlServicos.setBounds(0, 0, 1200, 700);
                pnlServicos.setBackground(Color.white);
                pnlServicos.setLayout(null);

                JTextField txtbarra2 = new JTextField();
                JLabel lblFotografia = new JLabel();
                JPanel MenuServicos = new JPanel();
                JButton btnVender = new JButton("   Vender Produtos");
                JButton btnListarProdutos = new JButton("   Listar Produtos");
                JButton btnProcurarProduto = new JButton("   Procurar Produto");
                JButton btnVoltarPrincipal = new JButton("   Voltar");

                lblFotografia.setBounds(45, 50, 180, 180);
                txtbarra2.setBounds(30, 251, 210, 1);
                MenuServicos.setBounds(0, 0, 280, 700);
                btnVender.setBounds(20, 281, 240, 40);
                btnListarProdutos.setBounds(13, 351, 240, 40);
                btnProcurarProduto.setBounds(23, 421, 240, 40);
                btnVoltarPrincipal.setBounds(15, 491, 150, 40);

                MenuServicos.setLayout(null);
                btnVender.setBackground(new Color(102, 102, 255));
                btnListarProdutos.setBackground(new Color(102, 102, 255));
                btnProcurarProduto.setBackground(new Color(102, 102, 255));
                btnVoltarPrincipal.setBackground(new Color(102, 102, 255));
                MenuServicos.setBackground(new Color(102, 102, 255));

                btnVender.setForeground(Color.white);
                btnListarProdutos.setForeground(Color.white);
                btnProcurarProduto.setForeground(Color.white);
                btnVoltarPrincipal.setForeground(Color.white);

                btnVender.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
                btnListarProdutos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
                btnProcurarProduto.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
                btnVoltarPrincipal.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));

                btnVoltarPrincipal.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
                btnVender.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
                btnListarProdutos.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
                btnProcurarProduto.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));

                //Colocando Icones
                btnVoltarPrincipal.setIcon(Icon_Voltar);
                btnListarProdutos.setIcon(Icon_Listar);
                btnVender.setIcon(Icon_Vender);
                btnProcurarProduto.setIcon(Icon_Procurar);

                // neste, passo vou aqui permitir com que ao clicar no botao vender ele abra uma outra janela com os produtos
                btnVender.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pnlListar.setVisible(false);
                        pnlProcurarProdutos.setVisible(false);

                        pnlVenderProdutos.setLayout(null);
                        pnlVenderProdutos.setBounds(280, 0, 920, 700);
                        pnlVenderProdutos.setBackground(Color.white);

                        JLabel lblListar = new JLabel();
                        JLabel lblLista_compras = new JLabel();

                        JButton btnAdicionar_carinho = new JButton();
                        JButton btnEliminar_Carinho = new JButton();

                        lblListar.setBounds(270, 0, 350, 30);
                        lblListar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));

                        lblLista_compras.setBounds(270, 310, 350, 30);
                        lblLista_compras.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));

                        btnAdicionar_carinho.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
                        btnEliminar_Carinho.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));

                        lblListar.setText("Selecione o produto na Tabela");
                        lblLista_compras.setText("Lista de Produtos Selecionados");

                        lblListar.setForeground(new Color(102, 102, 255));
                        lblLista_compras.setForeground(new Color(102, 102, 255));

                        btnAdicionar_carinho.setBackground(Color.white);
                        btnEliminar_Carinho.setBackground(Color.white);

                        String[] listar = {"Id", "Nome_Produto", "Peso/Volume", "Codigo_Barra", "Preço_uni", "Validade", "Estado", "Imagem"};
                        String[][] inf = {{}};
                        DefaultTableModel tabela = new DefaultTableModel(inf, listar);

                        String[] listar_Compras = {"Nome_Produto", "Preço Unitario", "Quantidade", "Imagem", "Total a pagar"};
                        String[][] inf_Compras = {{}};
                        DefaultTableModel tabela_Compras = new DefaultTableModel(inf_Compras, listar_Compras);

                        JTable infCa = new JTable(tabela);
                        JTable infCa_Compras = new JTable(tabela_Compras);

                        infCa.setModel(tabela);
                        infCa.setRowHeight(120);
                        infCa.getColumnModel().getColumn(7).setPreferredWidth(230);
                        infCa.getColumnModel().getColumn(0).setPreferredWidth(1);
                        infCa.getColumnModel().getColumn(1).setPreferredWidth(150);

                        infCa_Compras.setModel(tabela_Compras);
                        infCa_Compras.setRowHeight(120);
                        infCa_Compras.getColumnModel().getColumn(3).setPreferredWidth(230);
                        infCa_Compras.getColumnModel().getColumn(0).setPreferredWidth(150);

                        tabela.setRowCount(10);
                        tabela_Compras.setRowCount(10);

                        JScrollPane rol = new JScrollPane(infCa);
                        JScrollPane rol_Compras = new JScrollPane(infCa_Compras);

                        rol.setBounds(10, 40, 890, 250);
                        rol_Compras.setBounds(10, 350, 890, 250);

                        btnAdicionar_carinho.setBounds(800, 300, 50, 40);
                        btnEliminar_Carinho.setBounds(800, 610, 50, 40);

                        btnAdicionar_carinho.setIcon(Icon_Adicionar_Carinha);
                        btnEliminar_Carinho.setIcon(Icon_Eliminar_Carinha);

                        pnlVenderProdutos.add(lblListar);
                        pnlVenderProdutos.add(lblLista_compras);
                        pnlVenderProdutos.add(rol);
                        pnlVenderProdutos.add(rol_Compras);
                        pnlVenderProdutos.add(btnAdicionar_carinho);
                        pnlVenderProdutos.add(btnEliminar_Carinho);

                        pnlVenderProdutos.setVisible(true);

                        JOptionPane.showMessageDialog(null, "Selecione o poduto que pretende vender e adicione ao carinho,Caso\nqueira remove-lo, selecione na lista de produtos e clique no carinho.", "Venda de Produtos", Font.BOLD);

                    }
                });

                //Neste vou permitir com que possa listar os produtos existentes
                btnListarProdutos.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        pnlVenderProdutos.setVisible(false);
                        pnlProcurarProdutos.setVisible(false);

                        pnlListar.setLayout(null);
                        pnlListar.setBounds(280, 0, 920, 700);
                        pnlListar.setBackground(Color.white);

                        JLabel lblListar = new JLabel();

                        lblListar.setBounds(270, 30, 350, 30);

                        lblListar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
                        lblListar.setText("Lista de Produtos da Organizacao");
                        lblListar.setForeground(new Color(102, 102, 255));

                        String[] listar = {"Id", "Nome_Produto", "Peso/Volume", "Codigo_Barra", "Preço_uni", "Validade", "Estado", "Imagem"};
                        String[][] inf = {{}};
                        DefaultTableModel tabela = new DefaultTableModel(inf, listar);
                        JTable infCa = new JTable(tabela);

                        infCa.setModel(tabela);
                        infCa.setRowHeight(120);
                        infCa.getColumnModel().getColumn(7).setPreferredWidth(230);
                        infCa.getColumnModel().getColumn(0).setPreferredWidth(1);
                        infCa.getColumnModel().getColumn(1).setPreferredWidth(150);

                        tabela.setRowCount(10);
                        JScrollPane rol = new JScrollPane(infCa);
                        rol.setBounds(10, 80, 890, 540);

                        pnlListar.add(lblListar);

                        pnlListar.add(rol);

                        pnlListar.setVisible(true);

                    }
                });

                //Neste vou permitir com que possa fazer a busca de um produto, usando varios aspectos
                btnProcurarProduto.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pnlListar.setVisible(false);
                        pnlVenderProdutos.setVisible(false);

                        pnlProcurarProdutos.setLayout(null);
                        pnlProcurarProdutos.setBounds(281, 0, 1000, 700);
                        pnlProcurarProdutos.setBackground(Color.white);

                        JTextField txtbuscar = new JTextField();
                        JButton btnBuscar = new JButton("");
                        JLabel lblLogo = new JLabel();

                        btnBuscar.setForeground(new Color(102, 102, 255));
                        btnBuscar.setBackground(Color.white);
                        btnBuscar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
                        txtbuscar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));

                        btnBuscar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));

                        btnBuscar.setIcon(Icon_Procurar);
                        lblLogo.setIcon(Imagem_Cumpany);

                        //Criando a Tabela que vai mostrar as informacoes
                        String[] listar = {"Id", "Nome_Produto", "Peso/Volume", "Codigo_Barra", "Preço_uni", "Validade", "Estado", "Imagem"};
                        String[][] inf = {{}};
                        DefaultTableModel tabela = new DefaultTableModel(inf, listar);
                        JTable infCa = new JTable(tabela);

                        // infCa.setModel(tabela);
                        infCa.setRowHeight(120);
                        infCa.getColumnModel().getColumn(7).setPreferredWidth(230);
                        infCa.getColumnModel().getColumn(0).setPreferredWidth(1);
                        infCa.getColumnModel().getColumn(1).setPreferredWidth(150);

                        JScrollPane rol = new JScrollPane(infCa);
                        lblLogo.setBounds(330, 35, 200, 200);
                        rol.setBounds(10, 370, 880, 130);
                        txtbuscar.setBounds(270, 290, 270, 40);
                        btnBuscar.setBounds(570, 290, 40, 40);
                        pnlProcurarProdutos.add(lblLogo);
                        pnlProcurarProdutos.add(rol);
                        pnlProcurarProdutos.add(txtbuscar);
                        pnlProcurarProdutos.add(btnBuscar);

                        pnlProcurarProdutos.setVisible(true);

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
                        MenuServicos.setVisible(false);
                        pnlMenu_Botoes.setVisible(true);

                    }
                });

                lblFotografia.setIcon(fotografiaPerfil);

                MenuServicos.add(lblFotografia);
                MenuServicos.add(txtbarra2);
                MenuServicos.add(btnVender);
                MenuServicos.add(btnListarProdutos);
                MenuServicos.add(btnProcurarProduto);
                MenuServicos.add(btnVoltarPrincipal);

                pnlServicos.add(MenuServicos);
                pnlServicos.add(pnlListar);
                pnlServicos.add(pnlProcurarProdutos);
                pnlServicos.add(pnlVenderProdutos);

                pnlPrincipal.add(pnlServicos);
                pnlServicos.setVisible(true);
            }
        });

        // aqui irei dar acção e instruções para o botao Minhas Vendas
        btnHistorico_Vendas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlServicos.setVisible(false);
                pnlDefinicoes.setVisible(false);
                pnlMeuPerfil.setVisible(false);

                pnlHistorico.setLayout(null);
                pnlHistorico.setBounds(280, 0, 920, 700);
                pnlHistorico.setBackground(Color.white);

                JLabel lblListar = new JLabel();
                lblListar.setBounds(270, 30, 350, 30);
                lblListar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
                lblListar.setText("Relatorio de Minhas Vendas");
                lblListar.setForeground(new Color(102, 102, 255));
                String[] listar = {"Categoria", "Nome_Produto", "Codigo_Barra", "Preço_uni", "Quantidade", "Pagemento", "Total_Pago", "Data", "Hora", "Imagem"};
                String[][] inf = {{}};
                DefaultTableModel tabela = new DefaultTableModel(inf, listar);
                JTable infCa = new JTable(tabela);

                infCa.setModel(tabela);

                infCa.setRowHeight(180);

                infCa.getColumnModel().getColumn(9).setPreferredWidth(230);
                infCa.getColumnModel().getColumn(0).setPreferredWidth(150);
                infCa.getColumnModel().getColumn(1).setPreferredWidth(150);
                infCa.getColumnModel().getColumn(5).setPreferredWidth(120);
                infCa.getColumnModel().getColumn(6).setPreferredWidth(120);
                infCa.getColumnModel().getColumn(7).setPreferredWidth(100);
                infCa.getColumnModel().getColumn(8).setPreferredWidth(100);
                infCa.getColumnModel().getColumn(3).setPreferredWidth(120);
                infCa.getColumnModel().getColumn(2).setPreferredWidth(120);
                infCa.getColumnModel().getColumn(4).setPreferredWidth(120);

                tabela.setRowCount(10);
                JScrollPane rol = new JScrollPane(infCa);
                rol.setBounds(10, 80, 890, 540);

                pnlHistorico.add(lblListar);

                pnlHistorico.add(rol);

                pnlPrincipal.add(pnlHistorico);

                pnlHistorico.setVisible(true);

            }
        });
        // Definicoes
        btnDefinicoes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlMenu_Botoes.setVisible(false);
                pnlServicos.setVisible(false);
                pnlHistorico.setVisible(false);
                pnlMeuPerfil.setVisible(false);

                pnlDefinicoes.setBounds(0, 0, 280, 700);
                pnlDefinicoes.setBackground(new Color(102, 102, 255));
                pnlDefinicoes.setLayout(null);

                JButton btnActualizardados = new JButton("   Actualizar Dados");
                JButton btnVoltar = new JButton("   Voltar");

                JLabel lblFotografia = new JLabel();
                JTextField txtbarra = new JTextField();

                lblFotografia.setBounds(45, 50, 180, 180);
                txtbarra.setBounds(30, 251, 210, 1);

                btnActualizardados.setBounds(20, 281, 240, 40);
                btnVoltar.setBounds(13, 351, 240, 40);

                btnActualizardados.setBackground(new Color(102, 102, 255));
                btnVoltar.setBackground(new Color(102, 102, 255));

                btnActualizardados.setForeground(Color.white);
                btnVoltar.setForeground(Color.white);

                btnActualizardados.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
                btnVoltar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));

                btnVoltar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
                btnActualizardados.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));

                lblFotografia.setIcon(fotografiaPerfil);

                pnlDefinicoes.add(lblFotografia);
                pnlDefinicoes.add(txtbarra);
                pnlDefinicoes.add(btnVoltar);
                pnlDefinicoes.add(btnActualizardados);

                // Declarando os paineis que irei usar no botao defincao
                JPanel pnlActualizar_Dados = new JPanel();

                //Neste passo , vou dar continuidade, colocando as componentes para actualizar dados
                btnActualizardados.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pnlActualizar_Dados.setBounds(280, 0, 920, 700);
                        pnlActualizar_Dados.setBackground(Color.red);
                        pnlActualizar_Dados.setLayout(null);

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
                        pnlMenu_Botoes.setVisible(true);
                                
                    }
                });

                pnlPrincipal.add(pnlDefinicoes);
                pnlPrincipal.add(pnlActualizar_Dados);
                pnlDefinicoes.setVisible(true);

            }
        });

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Servicos_Organizacao().setVisible(true);
    }
}
