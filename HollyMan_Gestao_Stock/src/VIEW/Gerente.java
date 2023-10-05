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
import javax.swing.JPanel;

/**
 *
 * @author HOLLY MAN
 */
public class Gerente extends JFrame {

    // Craindo instancias das Imagens
    ImageIcon Icon_Admin = new ImageIcon("src\\Imagens\\Gerente1.png");
    ImageIcon Icon_Configurações = new ImageIcon("src\\Imagens\\definicoes2.png");
    ImageIcon Icon_Perfil = new ImageIcon("src\\Imagens\\Perfil2.png");
    ImageIcon Icon_Gestao_Funcionario = new ImageIcon("src\\Imagens\\funcionarios.png");
    ImageIcon Icon_Voltar = new ImageIcon("src\\Imagens\\Voltar.png");

    public Gerente() {

        this.setSize(1200, 700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setUndecorated(true);

        JPanel pnlPrincipal = new JPanel();
        pnlPrincipal.setLayout(null);
        pnlPrincipal.setBounds(0, 40, 1200, 660);
        pnlPrincipal.setBackground(Color.blue);

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
        JButton btnGestao_Produtos = new JButton("Gestao de Produtos");
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
        btnGestao_Produtos.setBounds(12, 200, 150, 40);
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
        JPanel pnlGestao_Produtos = new JPanel();
        JPanel pnlGestao_Funcionarios = new JPanel();
        JPanel pnlVisaoGeral = new JPanel();
        JPanel pnlConfiguracoes = new JPanel();
        JPanel pnlPerfil = new JPanel();

        // Dando visibilidade inicial
        pnlGestao_Produtos.setVisible(false);
        pnlGestao_Funcionarios.setVisible(false);
        pnlVisaoGeral.setVisible(false);
        pnlConfiguracoes.setVisible(false);
        pnlPerfil.setVisible(false);
        
        //Background
        pnlGestao_Produtos.setBackground(Color.white);
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
                
                pnlGestao_Produtos.setLayout(null);
                JPanel pnlMenu_Gestaoprodutos =  new JPanel();
                pnlMenu_Gestaoprodutos.setLayout(null);
                
                //
                pnlMenu_Gestaoprodutos.setBackground(new Color(102,102,255));
                
                //
                pnlGestao_Produtos.setBounds(280,40,920,660);
                pnlMenu_Gestaoprodutos.setBounds(0,0,280,700);
                
             
                  pnlPrincipal.add(pnlGestao_Produtos);
                  pnlGestao_Produtos.add(pnlMenu_Gestaoprodutos);
                   pnlGestao_Produtos.setVisible(true);
            }
        });

        // Gestao de Funcionarios
        btnGestao_Funcionarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
        this.add(pnlPrincipal);
        pnlPrincipal.add(pnlMenu_Botoes);
        this.add(pnlBarra1);
        this.add(pnlBarra2);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Gerente().setVisible(true);
    }
}
