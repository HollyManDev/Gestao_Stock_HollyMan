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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
        JButton btnPerfil = new JButton("Meu Perfil");
        JButton btnGestao_Produtos = new JButton("Categorias & Produtos");
        JButton btnGestao_Funcionarios = new JButton("Gestao de Funcionarios");
        JButton btnVisaoGeral = new JButton("Visão Geral");
        JButton btnConfiguracoes = new JButton("Configurações");
        JButton btnVoltar = new JButton("Voltar");

        //Personalizando o Foreground dos botoes
        btnGestao_Produtos.setForeground(Color.white);
        btnGestao_Funcionarios.setForeground(Color.white);
        btnVisaoGeral.setForeground(Color.white);
        btnConfiguracoes.setForeground(Color.white);
        btnPerfil.setForeground(Color.white);
        btnVoltar.setForeground(Color.white);

        //Personalizando o Background dos Botoes
        btnGestao_Produtos.setBackground(new Color(102, 102, 255));
        btnGestao_Funcionarios.setBackground(new Color(102, 102, 255));
        btnVisaoGeral.setBackground(new Color(102, 102, 255));
        btnConfiguracoes.setBackground(new Color(102, 102, 255));
        btnPerfil.setBackground(new Color(102, 102, 255));
        btnVoltar.setBackground(new Color(102, 102, 255));

        //Personalizando a Borda dos Botoes
        btnGestao_Produtos.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0, 0, 0, 0)));
        btnGestao_Funcionarios.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0, 0, 0, 0)));
        btnVisaoGeral.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0, 0, 0, 0)));
        btnConfiguracoes.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0, 0, 0, 0)));
        btnPerfil.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0, 0, 0, 0)));
        btnVoltar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0, 0, 0, 0)));

        //Personalizando a Fonte
        btnGestao_Produtos.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
        btnGestao_Funcionarios.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
        btnVisaoGeral.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
        btnConfiguracoes.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
        btnPerfil.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));
        btnVoltar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20));

        //Colocando Icon
        lblFoto.setIcon(Icon_Admin);
        btnConfiguracoes.setIcon(Icon_Configurações);
        btnPerfil.setIcon(Icon_Perfil);
        btnVoltar.setIcon(Icon_Voltar);
        btnGestao_Funcionarios.setIcon(Icon_Gestao_Funcionario);

        //Dando Cordenadas aos Botoes
        btnGestao_Produtos.setBounds(12, 200, 220, 40);
        btnGestao_Funcionarios.setBounds(8, 260, 230, 40);
        btnVisaoGeral.setBounds(18, 330, 200, 40);
        btnConfiguracoes.setBounds(10, 400, 170, 40);
        btnPerfil.setBounds(10, 470, 170, 40);
        btnVoltar.setBounds(13, 540, 140, 40);

        //Adicionando as  Compomentes ao painel 
        pnlMenu_Botoes.add(lblFoto);
        pnlMenu_Botoes.add(lblFormacao);
        pnlMenu_Botoes.add(lblNomefuncionario);
        pnlMenu_Botoes.add(btnGestao_Produtos);
        pnlMenu_Botoes.add(btnGestao_Funcionarios);
        pnlMenu_Botoes.add(btnVisaoGeral);
        pnlMenu_Botoes.add(btnConfiguracoes);
        pnlMenu_Botoes.add(btnPerfil);
        pnlMenu_Botoes.add(btnVoltar);

        // Criando Instancias de paineis a serem usados  nos botoes abaixos
        JPanel pnlGestao_Funcionarios = new JPanel();
        JPanel pnlVisaoGeral = new JPanel();
        JPanel pnlConfiguracoes = new JPanel();
        JPanel pnlPerfil = new JPanel();

        // Dando visibilidade inicial
        pnlGestao_Funcionarios.setVisible(false);
        pnlVisaoGeral.setVisible(false);
        pnlConfiguracoes.setVisible(false);
        pnlPerfil.setVisible(false);

        //Background
        pnlGestao_Funcionarios.setBackground(Color.white);
        pnlVisaoGeral.setBackground(Color.white);
        pnlConfiguracoes.setBackground(Color.white);

        // dando acção ao botao Gestao de Produtos
        btnGestao_Produtos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlGestao_Funcionarios.setVisible(false);
                pnlVisaoGeral.setVisible(false);
                pnlConfiguracoes.setVisible(false);
                pnlPerfil.setVisible(false);
                pnlMenu_Botoes.setVisible(false);

                JPanel pnlMenu_Gestaoprodutos = new JPanel();
                pnlMenu_Gestaoprodutos.setLayout(null);
                //
                pnlMenu_Gestaoprodutos.setBackground(new Color(102, 102, 255));
                pnlMenu_Gestaoprodutos.setBounds(0, 0, 280, 660);

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

                        JButton btnCarregarImagem = new JButton("Carregar Imagem");
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
                        header_Lista.setForeground(new Color(102, 102, 220));
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
                        lblTitulo.setForeground(new Color(102, 102, 255));
                        lblNome.setForeground(new Color(102, 102, 220));
                        lblData.setForeground(new Color(102, 102, 220));
                        lblSubCategoria.setForeground(new Color(102, 102, 220));
                        btnCarregarImagem.setForeground(new Color(102, 102, 255));
                        btnCadastrar.setForeground(new Color(102, 102, 255));
                        btnListar.setForeground(new Color(102, 102, 255));
                        btnCarregar.setForeground(new Color(102, 102, 255));
                        btnActualizar.setForeground(new Color(102, 102, 255));
                        btnEliminar.setForeground(new Color(102, 102, 255));
                        btnReactivar.setForeground(new Color(102, 102, 255));

                        //Aqui vou definir a fonte
                        lblTitulo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 22));
                        lblNome.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                        lblData.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                        lblSubCategoria.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));
                        btnCarregarImagem.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                        btnCadastrar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                        btnListar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                        btnCarregar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                        btnActualizar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                        btnEliminar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));
                        btnReactivar.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 18));

                        txtNome.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 12));
                        data.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 12));
                        txtNomeSubCategoria.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 12));

                        //Aqui vou definir as Bordas
                        txtNome.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        txtNomeSubCategoria.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        data.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        data.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 255)));
                        btnCarregarImagem.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(102, 102, 255)));
                        btnCadastrar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(102, 102, 255)));
                        btnListar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(102, 102, 255)));
                        btnCarregar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(102, 102, 255)));
                        btnActualizar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(102, 102, 255)));
                        btnEliminar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(102, 102, 255)));
                        btnReactivar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(102, 102, 255)));

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
                        btnCarregarImagem.setBounds(540, 265, 180, 30);
                        btnCadastrar.setBounds(150, 330, 90, 30);
                        btnListar.setBounds(150, 365, 55, 30);
                        btnCarregar.setBounds(350, 330, 140, 30);
                        btnActualizar.setBounds(350, 365, 100, 30);
                        btnEliminar.setBounds(615, 330, 90, 30);
                        btnReactivar.setBounds(615, 365, 90, 30);
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

                btnGerirProdutos.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pnlPrincipal.setVisible(false);
                        pnlGeirCategorias.setVisible(false);
                        pnlGeirRelatorio.setVisible(false);

                        pnlGerirProdutos.setBackground(Color.white);
                        pnlGerirProdutos.setLayout(null);
                        pnlGerirProdutos.setBounds(280, 0, 920, 660);

                        JLabel lblTitulo = new JLabel("Gestão de Produtos");

                        //Foreground
                        lblTitulo.setForeground(new Color(102, 102, 255));

                        //Cordenadas
                        lblTitulo.setBounds(340, 30, 350, 30);

                        //Adicionando
                        pnlGerirProdutos.add(lblTitulo);

                        //Fonte
                        lblTitulo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 22));
                        
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

                pnlMenu_Gestaoprodutos.setVisible(true);
            }
        }); // Gerir Produtos

        // Gestao de Funcionarios
        btnGestao_Funcionarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlPrincipal.setVisible(false);

            }
        });

        //Visao Geral
        btnVisaoGeral.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
