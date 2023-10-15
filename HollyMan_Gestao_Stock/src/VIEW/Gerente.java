/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author HOLLY MAN
 */
public class Gerente extends JFrame {

    // Craindo instancias das Imagens
    ImageIcon Icon_Logo = new ImageIcon("src\\Imagens\\Logo.jpeg");
    ImageIcon Icon_Admin = new ImageIcon("src\\Imagens\\Gerente1.png");
    ImageIcon Icon_Configurações = new ImageIcon("src\\Imagens\\definicoes2.png");
    ImageIcon Icon_Perfil = new ImageIcon("src\\Imagens\\Perfil2.png");
    ImageIcon Icon_Gestao_Funcionario = new ImageIcon("src\\Imagens\\funcionarios.png");
    ImageIcon Icon_Voltar = new ImageIcon("src\\Imagens\\Voltar.png");
    ImageIcon Icon_Foto = new ImageIcon("src\\Imagens\\imagemGaleria.png");
    ImageIcon Icon_carregarImagem = new ImageIcon("src\\Imagens\\carregar.png");
    ImageIcon Icon_Produtos_Categoria = new ImageIcon("src\\Imagens\\categorias.png");
    ImageIcon Icon_VisaoGeral = new ImageIcon("src\\Imagens\\Visao_Geral.png");
    ImageIcon Icon_Procurar = new ImageIcon("src\\Imagens\\Busca1.png");

    //Icons
    ImageIcon Icon_Apelido = new ImageIcon("src\\Imagens\\");
    ImageIcon Icon_Nome = new ImageIcon("src\\Imagens\\");
    ImageIcon Icon_Genero = new ImageIcon("src\\Imagens\\genero.png");
    ImageIcon Icon_BI = new ImageIcon("src\\Imagens\\BI.png");
    ImageIcon Icon_Nascimento = new ImageIcon("src\\Imagens\\calendario.png");
    ImageIcon Icon_Email = new ImageIcon("src\\Imagens\\email.png");
    ImageIcon Icon_Password = new ImageIcon("src\\Imagens\\password.png");
    ImageIcon Icon_Contacto = new ImageIcon("src\\Imagens\\telefone.png");
    ImageIcon Icon_Contratacao = new ImageIcon("src\\Imagens\\Contratacao.png");
    ImageIcon Icon_Acesso = new ImageIcon("src\\Imagens\\");
    ImageIcon Icon_foto = new ImageIcon("src\\Imagens\\imagemGaleria.png");
    ImageIcon Icon_CarregarFoto = new ImageIcon("src\\Imagens\\carregar.png");
    ImageIcon Icon_Actualizar = new ImageIcon("src\\Imagens\\Actualizar.png");
    ImageIcon Icon_Menssagem = new ImageIcon("src\\Imagens\\Menssagen.png");

    public Gerente() {

        this.setSize(1200, 700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setUndecorated(true);

        JLabel lblLogo = new JLabel();
        lblLogo.setIcon(Icon_Logo);

        JPanel pnlPrincipal = new JPanel();
        JPanel pnlauxPrincipal = new JPanel();

        pnlPrincipal.setLayout(null);
        pnlauxPrincipal.setLayout(null);

        pnlauxPrincipal.setBounds(0, 40, 1200, 660);
        pnlPrincipal.setBounds(280, 0, 920, 660);
        lblLogo.setBounds(0, 0, 920, 660);
        pnlauxPrincipal.setBackground(Color.white);

        //Criando estancias dos paineis
        JPanel pnlMenu_Botoes = new JPanel();
        JPanel pnlBarra1 = new JPanel();
        JPanel pnlBarra2 = new JPanel();

        //Dando Cordenadas aos paineis
        pnlMenu_Botoes.setBounds(0, 0, 280, 700);
        pnlBarra1.setBounds(0, 0, 280, 40);
        pnlBarra2.setBounds(280, 0, 920, 40);

        //Definido o Layout dos paineis
        pnlMenu_Botoes.setLayout(null);
        pnlBarra1.setLayout(null);
        pnlBarra2.setLayout(null);

        //Personalizando o Background dos paineis
        pnlMenu_Botoes.setBackground(new Color(102, 102, 255));
        pnlBarra1.setBackground(Color.pink);
        pnlBarra2.setBackground(Color.red);

        //Criando instancias da Labels que irei colocar para definir o perfil
        JLabel lblFoto = new JLabel();
        JLabel lblNomefuncionario = new JLabel();
        JLabel lblFormacao = new JLabel();

        lblFoto.setBounds(10, 40, 130, 120);
        lblNomefuncionario.setBounds(150, 105, 280, 30);
        lblFormacao.setBounds(150, 95, 280, 100);
        lblNomefuncionario.setText("Holy Man");
        lblFormacao.setText("Gerente");
        lblFormacao.setForeground(Color.white);
        lblNomefuncionario.setForeground(Color.white);
        lblNomefuncionario.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
        lblFormacao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 12));

        //Criando instancias dos botoes da tela Gerente
        JButton btnPerfil = new JButton("  Meu Perfil");
        JButton btnGestao_Produtos = new JButton(" Categorias & Produtos");
        JButton btnGestao_Funcionarios = new JButton(" Funcionarios");
        JButton btnVisaoGeral = new JButton(" Visão Geral");
        JButton btnMenssagens = new JButton(" Menssagens ");
        JButton btnConfiguracoes = new JButton(" Configurações");
        JButton btnVoltar = new JButton("  Voltar");

        //Personalizando o Foreground dos botoes
        btnGestao_Produtos.setForeground(Color.white);
        btnGestao_Funcionarios.setForeground(Color.white);
        btnVisaoGeral.setForeground(Color.white);
        btnMenssagens.setForeground(Color.white);
        btnConfiguracoes.setForeground(Color.white);
        btnPerfil.setForeground(Color.white);
        btnVoltar.setForeground(Color.white);

        //Personalizando o Background dos Botoes
        btnGestao_Produtos.setBackground(new Color(102, 102, 255));
        btnGestao_Funcionarios.setBackground(new Color(102, 102, 255));
        btnVisaoGeral.setBackground(new Color(102, 102, 255));
        btnMenssagens.setBackground(new Color(102, 102, 255));
        btnConfiguracoes.setBackground(new Color(102, 102, 255));
        btnPerfil.setBackground(new Color(102, 102, 255));
        btnVoltar.setBackground(new Color(102, 102, 255));

        //Personalizando a Borda dos Botoes
        btnGestao_Produtos.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0, 0, 0, 0)));
        btnGestao_Funcionarios.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0, 0, 0, 0)));
        btnVisaoGeral.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0, 0, 0, 0)));
        btnMenssagens.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0, 0, 0, 0)));
        btnConfiguracoes.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0, 0, 0, 0)));
        btnPerfil.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0, 0, 0, 0)));
        btnVoltar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0, 0, 0, 0)));

        //Personalizando a Fonte
        btnGestao_Produtos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
        btnGestao_Funcionarios.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
        btnVisaoGeral.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
        btnMenssagens.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
        btnConfiguracoes.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
        btnPerfil.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
        btnVoltar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));

        //Colocando Icon
        lblFoto.setIcon(Icon_Admin);
        btnConfiguracoes.setIcon(Icon_Configurações);
        btnPerfil.setIcon(Icon_Perfil);
        btnVoltar.setIcon(Icon_Voltar);
        btnGestao_Funcionarios.setIcon(Icon_Gestao_Funcionario);
        btnGestao_Produtos.setIcon(Icon_Produtos_Categoria);
        btnVisaoGeral.setIcon(Icon_VisaoGeral);
        btnMenssagens.setIcon(Icon_Menssagem);

        //Dando Cordenadas aos Botoes
        btnGestao_Produtos.setBounds(5, 200, 260, 40);
        btnGestao_Funcionarios.setBounds(2, 260, 170, 40);
        btnVisaoGeral.setBounds(2, 330, 160, 40);
        btnMenssagens.setBounds(5, 400, 170, 40);
        btnConfiguracoes.setBounds(5, 470, 188, 40);
        btnPerfil.setBounds(5, 540, 145, 40);
        btnVoltar.setBounds(2, 610, 110, 40);

        //Adicionando as  Compomentes ao painel 
        pnlMenu_Botoes.add(lblFoto);
        pnlMenu_Botoes.add(lblFormacao);
        pnlMenu_Botoes.add(lblNomefuncionario);
        pnlMenu_Botoes.add(btnGestao_Produtos);
        pnlMenu_Botoes.add(btnGestao_Funcionarios);
        pnlMenu_Botoes.add(btnVisaoGeral);
        pnlMenu_Botoes.add(btnMenssagens);
        pnlMenu_Botoes.add(btnConfiguracoes);
        pnlMenu_Botoes.add(btnPerfil);
        pnlMenu_Botoes.add(btnVoltar);

        // Criando Instancias de paineis a serem usados  nos botoes abaixos
        JPanel pnlGestao_Funcionarios = new JPanel();
        JPanel pnlVisaoGeral = new JPanel();
        JPanel pnlMenssagens = new JPanel();
        JPanel pnlConfiguracoes = new JPanel();
        JPanel pnlPerfil = new JPanel();

        // Dando visibilidade inicial
        pnlGestao_Funcionarios.setVisible(false);
        pnlVisaoGeral.setVisible(false);
        pnlMenssagens.setVisible(false);
        pnlConfiguracoes.setVisible(false);
        pnlPerfil.setVisible(false);

        //Background
        pnlGestao_Funcionarios.setBackground(Color.white);
        pnlVisaoGeral.setBackground(Color.white);
        pnlMenssagens.setBackground(Color.white);
        pnlConfiguracoes.setBackground(Color.white);

        // dando acção ao botao Gestao de Produtos
        btnGestao_Produtos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlPrincipal.setVisible(true);
                pnlGestao_Funcionarios.setVisible(false);
                pnlVisaoGeral.setVisible(false);
                pnlMenssagens.setVisible(false);
                pnlConfiguracoes.setVisible(false);
                pnlPerfil.setVisible(false);
                pnlMenu_Botoes.setVisible(false);

                JPanel pnlMenu_Gestaoprodutos = new JPanel();
                pnlMenu_Gestaoprodutos.setLayout(null);
                //
                pnlMenu_Gestaoprodutos.setBackground(new Color(102, 102, 255));
                pnlMenu_Gestaoprodutos.setBounds(0, 0, 280, 660);
                
                pnlPrincipal.setBounds(280, 40, 920, 660);

                JButton btnGerirCategorias = new JButton("Gerir Categorias");
                JButton btnGerirProdutos = new JButton("Gerir Produtos");
                JButton btnRelatorio = new JButton("Relatorio de Vendas");
                JButton btnVoltarPrincipal = new JButton("Voltar");

                JTextField txtbarra2 = new JTextField();
                JLabel lblFotografia = new JLabel();
                lblFotografia.setIcon(Icon_Logo);

                lblFotografia.setBounds(45, 50, 180, 180);
                txtbarra2.setBounds(30, 251, 210, 1);
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

                btnGerirCategorias.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
                btnGerirProdutos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
                btnRelatorio.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
                btnVoltarPrincipal.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));

                btnVoltarPrincipal.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
                btnGerirCategorias.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
                btnGerirProdutos.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
                btnRelatorio.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));

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
                        pnlGeirCategorias.setBounds(280, 0, 920, 660);

                        //Neste passo, vou criar instancias dos objectos que vou usar.
                        JLabel lblTitulo = new JLabel("Gestão de Categorias");
                        JLabel lblFoto = new JLabel();
                        JLabel lblNome = new JLabel("Nome da Categoria");
                        JLabel lblData = new JLabel("Data");
                        JLabel lblSubCategoria = new JLabel("Nome da Sub-Categoria");

                        JTextField txtNome = new JTextField();
                        JTextField txtNomeSubCategoria = new JTextField();
                        JDateChooser data = new JDateChooser();

                        JButton btnCarregarImagem = new JButton("Carregar IMG");
                        JButton btnCadastrar = new JButton("Cadastrar");
                        JButton btnListar = new JButton(" Listar");
                        JButton btnCarregar = new JButton("Carregar Dados");
                        JButton btnActualizar = new JButton("Actualizar");
                        JButton btnEliminar = new JButton("Eliminar");
                        JButton btnReactivar = new JButton(" Reactivar");

                        String[] Colunas_Tabela = {"Id", "Nome da Categoria", "Nome da sub-Categoria", "Imagem", "Data", "Estado"};
                        String[][] inf = {{}};

                        DefaultTableModel Linhas_Colunas = new DefaultTableModel(inf, Colunas_Tabela);
                        JTable Lista_Produtos = new JTable(Linhas_Colunas);
                        JTableHeader header_Lista = Lista_Produtos.getTableHeader();

                        //Personalizando a Linhas_Colunas
                        header_Lista.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                        header_Lista.setForeground(new Color(102, 102, 255));
                        Lista_Produtos.setShowGrid(false);

                        Lista_Produtos.setModel(Linhas_Colunas);
                        Lista_Produtos.setRowHeight(160);

                        Lista_Produtos.setRowHeight(120);
                        Lista_Produtos.getColumnModel().getColumn(0).setPreferredWidth(3);
                        Lista_Produtos.getColumnModel().getColumn(3).setPreferredWidth(150);
                        Lista_Produtos.getColumnModel().getColumn(2).setPreferredWidth(150);
                        Lista_Produtos.getColumnModel().getColumn(1).setPreferredWidth(120);

                        Linhas_Colunas.setRowCount(10);
                        JScrollPane rol = new JScrollPane(Lista_Produtos);

                        // Adicionando Icon    
                        lblFoto.setIcon(Icon_Foto);
                        btnCarregarImagem.setIcon(Icon_carregarImagem);

                        //Aqui vou definir a cor das letras
                        lblTitulo.setForeground(new Color(0, 102, 255));
                        lblNome.setForeground(new Color(102, 102, 255));
                        lblData.setForeground(new Color(102, 102, 255));
                        lblSubCategoria.setForeground(new Color(102, 102, 255));
                        btnCarregarImagem.setForeground(new Color(0, 102, 255));
                        btnCadastrar.setForeground(new Color(0, 102, 255));
                        btnListar.setForeground(new Color(0, 102, 255));
                        btnCarregar.setForeground(new Color(0, 102, 255));
                        btnActualizar.setForeground(new Color(0, 102, 255));
                        btnEliminar.setForeground(new Color(0, 102, 255));
                        btnReactivar.setForeground(new Color(0, 102, 255));

                        //Aqui vou definir a fonte
                        lblTitulo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 22));
                        lblNome.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                        lblData.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                        lblSubCategoria.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                        btnCarregarImagem.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnCadastrar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnListar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnCarregar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnActualizar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnEliminar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnReactivar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));

                        txtNome.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 12));
                        data.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 12));
                        txtNomeSubCategoria.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 12));

                        //Aqui vou definir as Bordas
                        txtNome.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        txtNomeSubCategoria.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        data.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        data.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        btnCarregarImagem.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                        btnCadastrar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                        btnListar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                        btnCarregar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                        btnActualizar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                        btnEliminar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                        btnReactivar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));

                        //Background
                        btnCarregarImagem.setBackground(Color.white);
                        btnCadastrar.setBackground(Color.white);
                        btnListar.setBackground(Color.white);
                        btnCarregar.setBackground(Color.white);
                        btnActualizar.setBackground(Color.white);
                        btnEliminar.setBackground(Color.white);
                        btnReactivar.setBackground(Color.white);

                        //aqui vou configurar a localizacao
                        lblTitulo.setBounds(340, 30, 350, 30);
                        lblFoto.setBounds(500, 70, 225, 225);
                        lblNome.setBounds(150, 90, 150, 30);
                        txtNome.setBounds(150, 120, 270, 40);
                        lblSubCategoria.setBounds(150, 160, 270, 30);
                        txtNomeSubCategoria.setBounds(150, 190, 270, 40);
                        lblData.setBounds(150, 230, 270, 30);
                        data.setBounds(150, 260, 270, 40);
                        btnCarregarImagem.setBounds(540, 265, 160, 30);
                        btnCadastrar.setBounds(150, 330, 90, 30);
                        btnListar.setBounds(150, 375, 60, 30);
                        btnCarregar.setBounds(350, 330, 140, 30);
                        btnActualizar.setBounds(350, 375, 100, 30);
                        btnEliminar.setBounds(615, 330, 90, 30);
                        btnReactivar.setBounds(615, 375, 90, 30);
                        rol.setBounds(40, 430, 820, 210);

                        //Acção para cada um dos botoes
                        btnCadastrar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                            }
                        });
                        //Listar
                        btnListar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                            }
                        });
                        //Carrecar Campos
                        btnCarregar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                            }
                        });
                        //Actualizar
                        btnActualizar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                            }
                        });
                        //Eliminar
                        btnEliminar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                            }
                        });
                        //Reactivar
                        btnReactivar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                            }
                        });

                        //Aqui vou adicionar as componentes
                        pnlGeirCategorias.add(lblTitulo);
                        pnlGeirCategorias.add(lblFoto);
                        pnlGeirCategorias.add(lblNome);
                        pnlGeirCategorias.add(txtNome);
                        pnlGeirCategorias.add(lblData);
                        pnlGeirCategorias.add(data);
                        pnlGeirCategorias.add(lblSubCategoria);
                        pnlGeirCategorias.add(txtNomeSubCategoria);
                        pnlGeirCategorias.add(btnCarregarImagem);
                        pnlGeirCategorias.add(btnCadastrar);
                        pnlGeirCategorias.add(btnListar);
                        pnlGeirCategorias.add(btnCarregar);
                        pnlGeirCategorias.add(btnActualizar);
                        pnlGeirCategorias.add(btnEliminar);
                        pnlGeirCategorias.add(btnReactivar);
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
                        pnlPerfil.setVisible(false);

                        pnlGerirProdutos.setBackground(Color.white);
                        pnlGerirProdutos.setLayout(null);
                        pnlGerirProdutos.setBounds(280, 0, 920, 660);

                        //Craindo as Componentes
                        JLabel lblTitulo = new JLabel("Gerir Produtos");
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

                        JLabel lblCategoria_Produto = new JLabel("Categoria do Produto");
                        JLabel lblNome = new JLabel("Nome do Produto");
                        JLabel lblGenero = new JLabel("Codigo de Barra");
                        JLabel lblValidade = new JLabel("Validade");
                        JLabel lblNumero_Lote = new JLabel("Numero do Lote");
                        JLabel lblEmail = new JLabel("Email");
                        JLabel lblPassword = new JLabel("Palavra-passe");
                        JLabel lblContacto = new JLabel("Contacto");
                        JLabel lblAcesso = new JLabel("Perfil");
                        JLabel lblContratacao = new JLabel("Data da contratação");
                        JLabel lblEndereco = new JLabel("Endereço");

                        JComboBox jcCategoria_Produto = new JComboBox();
                        JTextField txtNome = new JTextField();
                        JTextField txtCodigo_Barra = new JTextField();
                        JDateChooser txtValidade = new JDateChooser();
                        JTextField txtNumero_Lote = new JTextField();
                        JTextField txtEmail = new JTextField();
                        JTextField txtPassword = new JTextField();
                        JTextField txtContacto = new JTextField();
                        JTextField txtAcesso = new JTextField();
                        JDateChooser txtData_Contratacao = new JDateChooser();
                        JTextField txtEndereco = new JTextField();

                        JButton btnCarregarFoto = new JButton("Carregar IMG");
                        JButton btnActualizar = new JButton("Actualizar");
                        JButton btnReset = new JButton("Limpar");
                        JButton btnCadastrar = new JButton("Cadastrar");
                        JButton btnListar = new JButton("Listar");
                        JButton btnProcurar = new JButton("procurar");
                        JButton btnEliminar = new JButton("Demitir");
                        JButton btnReademitir = new JButton("Reademitir");
                        JButton btnCarregar = new JButton("Carregar Dados");

                        //Foreground
                        lblTitulo.setForeground(new Color(102, 102, 255));

                        //Cordenadas
                        lblTitulo.setBounds(340, 0, 350, 30);

                        lblCategoria_Produto.setBounds(10, 50, 200, 30);
                        jcCategoria_Produto.setBounds(10, 80, 250, 40);
                        //imgApelido.setBounds(325, 160, 30, 30);

                        lblNome.setBounds(10, 120, 200, 30);
                        txtNome.setBounds(10, 150, 250, 40);

                        lblNumero_Lote.setBounds(10, 190, 200, 30);
                        txtNumero_Lote.setBounds(10, 220, 250, 40);
                        imgBI.setBounds(270, 225, 35, 34);

                        lblGenero.setBounds(10, 260, 200, 30);
                        txtCodigo_Barra.setBounds(10, 290, 250, 40);
                        imgGenero.setBounds(265, 290, 35, 40);

                        lblValidade.setBounds(10, 330, 200, 30);
                        txtValidade.setBounds(10, 360, 250, 40);
                        imgNascimento.setBounds(270, 360, 35, 40);

                        lblEmail.setBounds(320, 50, 200, 30);
                        txtEmail.setBounds(320, 80, 250, 40);
                        imgEmail.setBounds(575, 80, 35, 40);

                        lblPassword.setBounds(320, 120, 200, 30);
                        txtPassword.setBounds(320, 150, 250, 40);
                        imgPassword.setBounds(575, 145, 35, 40);

                        lblContacto.setBounds(320, 190, 200, 30);
                        txtContacto.setBounds(320, 220, 250, 40);
                        imgContacto.setBounds(575, 220, 350, 40);

                        lblContratacao.setBounds(320, 260, 200, 30);
                        txtData_Contratacao.setBounds(320, 290, 250, 40);
                        imgContratacao.setBounds(575, 290, 35, 40);

                        lblAcesso.setBounds(320, 330, 200, 30);
                        txtAcesso.setBounds(320, 360, 250, 40);
                        imgAcesso.setBounds(595, 360, 35, 40);
                        lblEndereco.setBounds(620, 50, 200, 30);
                        txtEndereco.setBounds(620, 80, 250, 40);
                        imgEndereço.setBounds(585, 360, 35, 40);

                        lblFoto.setBounds(620, 100, 225, 225);

                        btnCarregarFoto.setBounds(665, 310, 165, 30);
                        btnCadastrar.setBounds(10, 420, 100, 30);
                        btnListar.setBounds(120, 420, 70, 30);
                        btnCarregar.setBounds(200, 420, 140, 30);
                        btnActualizar.setBounds(350, 420, 130, 30);
                        btnEliminar.setBounds(490, 420, 100, 30);
                        btnReademitir.setBounds(600, 420, 100, 30);
                        btnReset.setBounds(710, 420, 100, 30);

                        //cOLOCANDO AS INFORMACOES NAS CAIXAS
                     
                        jcCategoria_Produto.addItem("  < Selecionar a Categoria >");
                        
                        txtPassword.setText("0000");
                        txtAcesso.setText("Funcionario");

                        txtPassword.setEnabled(false);
                        txtAcesso.setEnabled(false);

                        //Personalizando a fonte
                        lblTitulo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 24));
                        lblCategoria_Produto.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                        lblNome.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                        lblGenero.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                        lblValidade.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                        lblNumero_Lote.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                        lblEmail.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                        lblPassword.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                        lblContacto.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                        lblContratacao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                        lblAcesso.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                        lblEndereco.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                        btnCarregarFoto.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnActualizar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnReset.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnCadastrar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnCarregar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnEliminar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnListar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnReademitir.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnProcurar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));

                        // Neste passo, vou definir o tamanho e a fonte do conteudo a ser digitado.
                        jcCategoria_Produto.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtNome.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtCodigo_Barra.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtValidade.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtNumero_Lote.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtEmail.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtPassword.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtContacto.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtData_Contratacao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtAcesso.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        txtEndereco.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));

                        //////
                        jcCategoria_Produto.setForeground(new Color(102, 102, 255));
                        txtNome.setForeground(new Color(102, 102, 255));
                        txtCodigo_Barra.setForeground(new Color(102, 102, 255));
                        txtValidade.setForeground(new Color(102, 102, 255));
                        txtNumero_Lote.setForeground(new Color(102, 102, 255));
                        txtEmail.setForeground(new Color(102, 102, 255));
                        txtPassword.setForeground(new Color(102, 102, 255));
                        txtContacto.setForeground(new Color(102, 102, 255));
                        txtData_Contratacao.setForeground(new Color(102, 102, 255));
                        txtAcesso.setForeground(new Color(102, 102, 255));
                        txtEndereco.setForeground(new Color(102, 102, 255));
                        //Icons
                        imgBI.setIcon(Icon_BI);
                        imgGenero.setIcon(Icon_Genero);
                        imgNascimento.setIcon(Icon_Nascimento);
                        imgContacto.setIcon(Icon_Contacto);
                        imgEmail.setIcon(Icon_Email);
                        imgPassword.setIcon(Icon_Password);
                        imgContratacao.setIcon(Icon_Contratacao);
                        imgAcesso.setIcon(Icon_Acesso);
                        //    imgEndereço.setIcon();
                        lblFoto.setIcon(Icon_foto);
                        btnCarregarFoto.setIcon(Icon_CarregarFoto);
                        btnActualizar.setIcon(Icon_Actualizar);

                        //Personalizando as Bordas das componentes
                        jcCategoria_Produto.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        txtNome.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        txtCodigo_Barra.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        txtValidade.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        txtNumero_Lote.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        txtEmail.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        txtPassword.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        txtContacto.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        txtData_Contratacao.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        txtAcesso.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        txtEndereco.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        btnCarregarFoto.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                        btnActualizar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                        btnReset.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                        btnCadastrar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                        btnListar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                        btnCarregar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                        btnEliminar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                        btnReademitir.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                        btnProcurar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));

                        // Criando a tabela 
                        String[] Colunas_Compras = {"Apelido", "Nome", "Genero", "Idade", "Endereço", "Email", "Contacto", "Fotografia"};
                        String[][] inf_Compras = {{}};
                        DefaultTableModel tabela_Funcionarios = new DefaultTableModel(inf_Compras, Colunas_Compras);

                        // Criando as Tabelas/Listas
                        JTable Lista_Funcionarios = new JTable(tabela_Funcionarios);
                        JTableHeader header_Compras = Lista_Funcionarios.getTableHeader();
                        Lista_Funcionarios.setShowGrid(false);
                        header_Compras.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                        header_Compras.setForeground(new Color(102, 102, 255));
                        Lista_Funcionarios.setRowHeight(120);
                        Lista_Funcionarios.getColumnModel().getColumn(7).setPreferredWidth(230);
                        JScrollPane rol_Compras = new JScrollPane(Lista_Funcionarios);
                        tabela_Funcionarios.setRowCount(10);
                        rol_Compras.setBounds(10, 470, 900, 180);
                        //Adicionando
                        pnlGerirProdutos.add(lblTitulo);
                        pnlGerirProdutos.add(lblTitulo);
                        pnlGerirProdutos.add(lblCategoria_Produto);
                        pnlGerirProdutos.add(lblNome);
                        pnlGerirProdutos.add(lblGenero);
                        pnlGerirProdutos.add(lblValidade);
                        pnlGerirProdutos.add(lblNumero_Lote);
                        pnlGerirProdutos.add(lblEmail);
                        pnlGerirProdutos.add(lblPassword);
                        pnlGerirProdutos.add(lblContacto);
                        pnlGerirProdutos.add(lblContratacao);
                        pnlGerirProdutos.add(lblAcesso);
                        pnlGerirProdutos.add(lblEndereco);
                        pnlGerirProdutos.add(lblFoto);

                        pnlGerirProdutos.add(jcCategoria_Produto);
                        pnlGerirProdutos.add(txtNome);
                        pnlGerirProdutos.add(txtCodigo_Barra);
                        pnlGerirProdutos.add(txtValidade);
                        pnlGerirProdutos.add(txtNumero_Lote);
                        pnlGerirProdutos.add(txtEmail);
                        pnlGerirProdutos.add(txtPassword);
                        pnlGerirProdutos.add(txtContacto);
                        pnlGerirProdutos.add(txtData_Contratacao);
                        pnlGerirProdutos.add(txtAcesso);
                        pnlGerirProdutos.add(txtEndereco);

                        pnlGerirProdutos.add(imgBI);
                        pnlGerirProdutos.add(imgNascimento);
                        pnlGerirProdutos.add(imgGenero);
                        pnlGerirProdutos.add(imgEmail);
                        pnlGerirProdutos.add(imgPassword);
                        pnlGerirProdutos.add(imgContacto);
                        pnlGerirProdutos.add(imgContratacao);
                        pnlGerirProdutos.add(imgAcesso);
                        pnlGerirProdutos.add(imgEndereço);

                        pnlGerirProdutos.add(rol_Compras);

                        pnlGerirProdutos.add(btnCarregarFoto);
                        pnlGerirProdutos.add(btnReset);
                        pnlGerirProdutos.add(btnActualizar);
                        pnlGerirProdutos.add(btnCadastrar);
                        pnlGerirProdutos.add(btnListar);
                        pnlGerirProdutos.add(btnCarregar);
                        pnlGerirProdutos.add(btnProcurar);
                        pnlGerirProdutos.add(btnEliminar);
                        pnlGerirProdutos.add(btnReademitir);

                        //Fonte
                        lblTitulo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 22));
                        lblCategoria_Produto.setForeground(new Color(102, 102, 255));
                        lblNome.setForeground(new Color(102, 102, 255));
                        lblGenero.setForeground(new Color(102, 102, 255));
                        lblValidade.setForeground(new Color(102, 102, 255));
                        lblNumero_Lote.setForeground(new Color(102, 102, 255));
                        lblEmail.setForeground(new Color(102, 102, 255));
                        lblPassword.setForeground(new Color(102, 102, 255));
                        lblContacto.setForeground(new Color(102, 102, 255));
                        lblContratacao.setForeground(new Color(102, 102, 255));
                        lblAcesso.setForeground(new Color(102, 102, 255));
                        lblEndereco.setForeground(new Color(102, 102, 255));
                        btnCarregarFoto.setForeground(new Color(0, 102, 255));
                        btnActualizar.setForeground(new Color(0, 102, 255));
                        btnCadastrar.setForeground(new Color(0, 102, 255));
                        btnListar.setForeground(new Color(0, 102, 255));
                        btnCarregar.setForeground(new Color(0, 102, 255));
                        btnEliminar.setForeground(new Color(0, 102, 255));
                        btnProcurar.setForeground(new Color(0, 102, 255));
                        btnReademitir.setForeground(new Color(0, 102, 255));
                        btnReset.setForeground(new Color(0, 102, 255));

                        // Personalizando o BackGround
                        btnCarregarFoto.setBackground(Color.white);
                        btnActualizar.setBackground(Color.white);
                        btnReset.setBackground(Color.white);
                        btnCadastrar.setBackground(Color.white);
                        btnCarregar.setBackground(Color.white);
                        btnListar.setBackground(Color.white);
                        btnProcurar.setBackground(Color.white);
                        btnEliminar.setBackground(Color.white);
                        btnReademitir.setBackground(Color.white);

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
        }); // Fim  Gerir Produtos

        // Gestao de Funcionarios
        btnGestao_Funcionarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlPrincipal.setVisible(false);
                pnlVisaoGeral.setVisible(false);
                pnlMenssagens.setVisible(false);
                pnlConfiguracoes.setVisible(false);
                pnlPerfil.setVisible(false);

                pnlGestao_Funcionarios.setBackground(Color.white);
                pnlGestao_Funcionarios.setLayout(null);
                pnlGestao_Funcionarios.setBounds(280, 0, 920, 660);

                //Craindo as Componentes
                JLabel lblTitulo = new JLabel("Gerir Funcionarios");
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

                JTextField txtApelido = new JTextField();
                JTextField txtNome = new JTextField();
                JComboBox jcGenero = new JComboBox();
                JDateChooser txtNascimento = new JDateChooser();
                JTextField txtBI_Nuit = new JTextField();
                JTextField txtEmail = new JTextField();
                JTextField txtPassword = new JTextField();
                JTextField txtContacto = new JTextField();
                JTextField txtAcesso = new JTextField();
                JDateChooser txtData_Contratacao = new JDateChooser();
                JTextField txtEndereco = new JTextField();

                JButton btnCarregarFoto = new JButton("Carregar IMG");
                JButton btnActualizar = new JButton("Actualizar");
                JButton btnReset = new JButton("Limpar");
                JButton btnCadastrar = new JButton("Cadastrar");
                JButton btnListar = new JButton("Listar");
                JButton btnProcurar = new JButton("procurar");
                JButton btnEliminar = new JButton("Demitir");
                JButton btnReademitir = new JButton("Reademitir");
                JButton btnCarregar = new JButton("Carregar Dados");

                //Foreground
                lblTitulo.setForeground(new Color(102, 102, 255));

                //Cordenadas
                lblTitulo.setBounds(340, 0, 350, 30);

                lblApelido.setBounds(10, 50, 200, 30);
                txtApelido.setBounds(10, 80, 250, 40);
                //imgApelido.setBounds(325, 160, 30, 30);

                lblNome.setBounds(10, 120, 200, 30);
                txtNome.setBounds(10, 150, 250, 40);

                lblBI_Nuit.setBounds(10, 190, 200, 30);
                txtBI_Nuit.setBounds(10, 220, 250, 40);
                imgBI.setBounds(270, 225, 35, 34);

                lblGenero.setBounds(10, 260, 200, 30);
                jcGenero.setBounds(10, 290, 250, 40);
                imgGenero.setBounds(265, 290, 35, 40);

                lblNascimento.setBounds(10, 330, 200, 30);
                txtNascimento.setBounds(10, 360, 250, 40);
                imgNascimento.setBounds(270, 360, 35, 40);

                lblEmail.setBounds(320, 50, 200, 30);
                txtEmail.setBounds(320, 80, 250, 40);
                imgEmail.setBounds(575, 80, 35, 40);

                lblPassword.setBounds(320, 120, 200, 30);
                txtPassword.setBounds(320, 150, 250, 40);
                imgPassword.setBounds(575, 145, 35, 40);

                lblContacto.setBounds(320, 190, 200, 30);
                txtContacto.setBounds(320, 220, 250, 40);
                imgContacto.setBounds(575, 220, 350, 40);

                lblContratacao.setBounds(320, 260, 200, 30);
                txtData_Contratacao.setBounds(320, 290, 250, 40);
                imgContratacao.setBounds(575, 290, 35, 40);

                lblAcesso.setBounds(320, 330, 200, 30);
                txtAcesso.setBounds(320, 360, 250, 40);
                imgAcesso.setBounds(595, 360, 35, 40);
                lblEndereco.setBounds(620, 50, 200, 30);
                txtEndereco.setBounds(620, 80, 250, 40);
                imgEndereço.setBounds(585, 360, 35, 40);

                lblFoto.setBounds(620, 100, 225, 225);

                btnCarregarFoto.setBounds(665, 310, 165, 30);
                btnCadastrar.setBounds(10, 420, 100, 30);
                btnListar.setBounds(120, 420, 70, 30);
                btnCarregar.setBounds(200, 420, 140, 30);
                btnActualizar.setBounds(350, 420, 130, 30);
                btnEliminar.setBounds(490, 420, 100, 30);
                btnReademitir.setBounds(600, 420, 100, 30);
                btnReset.setBounds(710, 420, 100, 30);

                //cOLOCANDO AS INFORMACOES NAS CAIXAS
                jcGenero.addItem("< Genero >");
                jcGenero.addItem(" Masculino ");
                jcGenero.addItem(" Feminino ");

                txtPassword.setText("0000");
                txtAcesso.setText("Funcionario");

                txtPassword.setEnabled(false);
                txtAcesso.setEnabled(false);

                //Personalizando a fonte
                lblTitulo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 24));
                lblApelido.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                lblNome.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                lblGenero.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                lblNascimento.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                lblBI_Nuit.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                lblEmail.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                lblPassword.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                lblContacto.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                lblContratacao.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                lblAcesso.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                lblEndereco.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                btnCarregarFoto.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                btnActualizar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                btnReset.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                btnCadastrar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                btnCarregar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                btnEliminar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                btnListar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                btnReademitir.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
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

                //////
                txtApelido.setForeground(new Color(102, 102, 255));
                txtNome.setForeground(new Color(102, 102, 255));
                jcGenero.setForeground(new Color(102, 102, 255));
                txtNascimento.setForeground(new Color(102, 102, 255));
                txtBI_Nuit.setForeground(new Color(102, 102, 255));
                txtEmail.setForeground(new Color(102, 102, 255));
                txtPassword.setForeground(new Color(102, 102, 255));
                txtContacto.setForeground(new Color(102, 102, 255));
                txtData_Contratacao.setForeground(new Color(102, 102, 255));
                txtAcesso.setForeground(new Color(102, 102, 255));
                txtEndereco.setForeground(new Color(102, 102, 255));
                //Icons
                imgBI.setIcon(Icon_BI);
                imgGenero.setIcon(Icon_Genero);
                imgNascimento.setIcon(Icon_Nascimento);
                imgContacto.setIcon(Icon_Contacto);
                imgEmail.setIcon(Icon_Email);
                imgPassword.setIcon(Icon_Password);
                imgContratacao.setIcon(Icon_Contratacao);
                imgAcesso.setIcon(Icon_Acesso);
                //    imgEndereço.setIcon();
                lblFoto.setIcon(Icon_foto);
                btnCarregarFoto.setIcon(Icon_CarregarFoto);
                btnActualizar.setIcon(Icon_Actualizar);

                //Personalizando as Bordas das componentes
                txtApelido.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                txtNome.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                jcGenero.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                txtNascimento.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                txtBI_Nuit.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                txtEmail.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                txtPassword.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                txtContacto.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                txtData_Contratacao.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                txtAcesso.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                txtEndereco.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                btnCarregarFoto.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                btnActualizar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                btnReset.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                btnCadastrar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                btnListar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                btnCarregar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                btnEliminar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                btnReademitir.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                btnProcurar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));

                // Criando a tabela 
                String[] Colunas_Compras = {"Apelido", "Nome", "Genero", "Idade", "Endereço", "Email", "Contacto", "Fotografia"};
                String[][] inf_Compras = {{}};
                DefaultTableModel tabela_Funcionarios = new DefaultTableModel(inf_Compras, Colunas_Compras);

                // Criando as Tabelas/Listas
                JTable Lista_Funcionarios = new JTable(tabela_Funcionarios);
                JTableHeader header_Compras = Lista_Funcionarios.getTableHeader();
                Lista_Funcionarios.setShowGrid(false);
                header_Compras.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                header_Compras.setForeground(new Color(102, 102, 255));
                Lista_Funcionarios.setRowHeight(120);
                Lista_Funcionarios.getColumnModel().getColumn(7).setPreferredWidth(230);
                JScrollPane rol_Compras = new JScrollPane(Lista_Funcionarios);
                tabela_Funcionarios.setRowCount(10);
                rol_Compras.setBounds(10, 470, 900, 180);
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

                pnlGestao_Funcionarios.add(imgBI);
                pnlGestao_Funcionarios.add(imgNascimento);
                pnlGestao_Funcionarios.add(imgGenero);
                pnlGestao_Funcionarios.add(imgEmail);
                pnlGestao_Funcionarios.add(imgPassword);
                pnlGestao_Funcionarios.add(imgContacto);
                pnlGestao_Funcionarios.add(imgContratacao);
                pnlGestao_Funcionarios.add(imgAcesso);
                pnlGestao_Funcionarios.add(imgEndereço);

                pnlGestao_Funcionarios.add(rol_Compras);

                pnlGestao_Funcionarios.add(btnCarregarFoto);
                pnlGestao_Funcionarios.add(btnReset);
                pnlGestao_Funcionarios.add(btnActualizar);
                pnlGestao_Funcionarios.add(btnCadastrar);
                pnlGestao_Funcionarios.add(btnListar);
                pnlGestao_Funcionarios.add(btnCarregar);
                pnlGestao_Funcionarios.add(btnProcurar);
                pnlGestao_Funcionarios.add(btnEliminar);
                pnlGestao_Funcionarios.add(btnReademitir);

                //Fonte
                lblTitulo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 22));
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
                btnCarregarFoto.setForeground(new Color(0, 102, 255));
                btnActualizar.setForeground(new Color(0, 102, 255));
                btnCadastrar.setForeground(new Color(0, 102, 255));
                btnListar.setForeground(new Color(0, 102, 255));
                btnCarregar.setForeground(new Color(0, 102, 255));
                btnEliminar.setForeground(new Color(0, 102, 255));
                btnProcurar.setForeground(new Color(0, 102, 255));
                btnReademitir.setForeground(new Color(0, 102, 255));
                btnReset.setForeground(new Color(0, 102, 255));

                // Personalizando o BackGround
                btnCarregarFoto.setBackground(Color.white);
                btnActualizar.setBackground(Color.white);
                btnReset.setBackground(Color.white);
                btnCadastrar.setBackground(Color.white);
                btnCarregar.setBackground(Color.white);
                btnListar.setBackground(Color.white);
                btnProcurar.setBackground(Color.white);
                btnEliminar.setBackground(Color.white);
                btnReademitir.setBackground(Color.white);

                pnlauxPrincipal.add(pnlGestao_Funcionarios);
                pnlGestao_Funcionarios.setVisible(true);
            }
        });

        //Visao Gera l
        btnVisaoGeral.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //Menssagens
        btnMenssagens.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlMenu_Botoes.setVisible(false);
                pnlVisaoGeral.setVisible(false);
                pnlConfiguracoes.setVisible(false);
                pnlGestao_Funcionarios.setVisible(false);
                pnlPerfil.setVisible(false);

                JPanel pnlMenssagens = new JPanel();
                pnlMenssagens.setLayout(null);
                //
                pnlMenssagens.setBackground(new Color(102, 102, 255));
                pnlMenssagens.setBounds(0, 0, 280, 660);

                JButton btnEnviar = new JButton("Escrever Menssagem ");
                JButton btnCaixa = new JButton("Menssagens Recebidas");
                JButton btnGerir = new JButton("Gerir Menssagens");
                JButton btnVoltarPrincipal = new JButton("Voltar");

                JTextField txtbarra2 = new JTextField();
                JLabel lblFotografia = new JLabel();
                lblFotografia.setIcon(Icon_Logo);

                lblFotografia.setBounds(45, 50, 180, 180);
                txtbarra2.setBounds(30, 251, 210, 1);
                btnEnviar.setBounds(20, 281, 240, 40);
                btnCaixa.setBounds(13, 351, 240, 40);
                btnGerir.setBounds(23, 421, 240, 40);
                btnVoltarPrincipal.setBounds(15, 491, 150, 40);

                btnEnviar.setBackground(new Color(102, 102, 255));
                btnCaixa.setBackground(new Color(102, 102, 255));
                btnGerir.setBackground(new Color(102, 102, 255));
                btnVoltarPrincipal.setBackground(new Color(102, 102, 255));

                btnEnviar.setForeground(Color.white);
                btnCaixa.setForeground(Color.white);
                btnGerir.setForeground(Color.white);
                btnVoltarPrincipal.setForeground(Color.white);

                btnEnviar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
                btnCaixa.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
                btnGerir.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
                btnVoltarPrincipal.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));

                btnVoltarPrincipal.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
                btnEnviar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
                btnCaixa.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
                btnGerir.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));

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
                        pnlEnviar.setBounds(280, 0, 920, 660);

                        JLabel lblTitulo = new JLabel("Menssagem");
                        JLabel lblDestinatario = new JLabel("Destinatario");
                        JLabel lblRemetente = new JLabel("Remetente");
                        JComboBox jcDestinatario = new JComboBox();
                        JTextArea txta = new JTextArea();
                        JTextField txtRemetente = new JTextField();

                        //Botoes 
                        JButton btnEnviar = new JButton("Enviar");
                        JButton btnLimpar = new JButton("Apagar");

                        //Foreground
                        lblTitulo.setForeground(new Color(102, 102, 255));
                        lblDestinatario.setForeground(new Color(102, 102, 255));
                        lblRemetente.setForeground(new Color(102, 102, 255));
                        jcDestinatario.setForeground(new Color(102, 102, 255));
                        txta.setForeground(new Color(102, 102, 255));
                        btnLimpar.setForeground(new Color(0, 102, 255));
                        btnEnviar.setForeground(new Color(0, 102, 255));

                        //BackGround
                        btnEnviar.setBackground(Color.white
                        );
                        btnLimpar.setBackground(Color.white);

                        //Cordenadas
                        lblTitulo.setBounds(100, 130, 250, 30);
                        lblRemetente.setBounds(100, 30, 100, 30);
                        txtRemetente.setBounds(100, 60, 250, 40);
                        lblDestinatario.setBounds(570, 30, 100, 30);
                        jcDestinatario.setBounds(570, 60, 250, 40);
                        txta.setBounds(100, 160, 720, 400);
                        btnLimpar.setBounds(100, 600, 100, 30);
                        btnEnviar.setBounds(720, 600, 100, 30);

                        //Borda  
                        jcDestinatario.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        txta.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        txtRemetente.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        btnEnviar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));
                        btnLimpar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 102, 255)));

                        //Fonte 
                        lblTitulo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                        lblDestinatario.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                        lblRemetente.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                        txta.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        jcDestinatario.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 16));
                        txtRemetente.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
                        btnLimpar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
                        btnEnviar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));

                        // Instrucao que nao permite alterar
                        jcDestinatario.addItem("<Selecionar Destinatario>");
                        txtRemetente.setEditable(false);

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
                        pnlCaixa.setBounds(280, 0, 920, 660);

                        //CRIANDO AS COMPONENTES
                        JLabel lblMenssagem = new JLabel();
                        JLabel lblTitulo = new JLabel("Menssagens Recebidas");
                        JButton btnNext = new JButton("Next");
                        JButton btnPreview = new JButton("Back");
                        JButton btnProcurar = new JButton();
                        JComboBox jcRementente = new JComboBox();

                        //ForeGround
                        lblTitulo.setForeground(new Color(0, 102, 255));
                        lblMenssagem.setForeground(new Color(102, 102, 255));
                        jcRementente.setForeground(new Color(102, 102, 255));

                        //Background
                        btnNext.setBackground(Color.white);
                        btnPreview.setBackground(Color.white);
                        jcRementente.setBackground(Color.white);
                        btnProcurar.setBackground(Color.white);

                        //Bordas
                        lblMenssagem.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        jcRementente.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        btnNext.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
                        btnProcurar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
                        btnPreview.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));

                        //Localizacao
                        lblMenssagem.setBounds(105, 140, 700, 500);
                        jcRementente.setBounds(500, 90, 250, 40);
                        btnProcurar.setBounds(750, 90, 40, 40);
                        lblTitulo.setBounds(370, 0, 250, 30);
                        btnPreview.setBounds(20, 350, 40, 40);
                        btnNext.setBounds(850, 350, 40, 40);

                        // 
                        jcRementente.addItem("<Selecionar o Rementente>");
                        btnProcurar.setIcon(Icon_Procurar);

                        //Fonte
                        lblTitulo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 22));
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
                        pnlGerir.setBounds(0, 0, 280, 660);
                        JButton btnMenssagens_Envidas = new JButton("Menssagens Enviadas ");
                        JButton btnMenssagens_Recebidas = new JButton("Menssagens Recebidas");
                        JButton btnRelatorio_enviadas = new JButton("Relatorio de Envio");
                        JButton btnVoltarPrincipal = new JButton("Voltar");

                        JTextField txtbarra2 = new JTextField();
                        JLabel lblFotografia = new JLabel();
                        lblFotografia.setIcon(Icon_Logo);

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

                        btnMenssagens_Envidas.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
                        btnMenssagens_Recebidas.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
                        btnRelatorio_enviadas.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
                        btnVoltarPrincipal.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));

                        btnVoltarPrincipal.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
                        btnMenssagens_Envidas.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
                        btnMenssagens_Recebidas.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
                        btnRelatorio_enviadas.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));

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

            }
        });
        // Perfil
        btnPerfil.addActionListener(new ActionListener() {
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

        pnlauxPrincipal.add(pnlMenu_Botoes);
        pnlauxPrincipal.add(pnlPrincipal);
        pnlPrincipal.add(lblLogo);
        this.add(pnlBarra1);
        this.add(pnlBarra2);
        this.add(pnlauxPrincipal);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Gerente().setVisible(true);
    }
}
