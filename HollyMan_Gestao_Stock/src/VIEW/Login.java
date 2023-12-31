/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CONTROLLER.Controller_Funcionario;
import CSS.BotaoLogin;
import CSS.BotaoPersonalizado;
import DAO.DAO_Funcionario;
import MODEL.DTO.Funcionario;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;

/**
 *
 * @author HOLLY MAN
 */
public class Login extends javax.swing.JFrame {

    ImageIcon Icon_Logo = new ImageIcon(Login.class.getResource("/Imagens/logo2.png"));

    public static long id;

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Login.id = id;
    }

    public Login() {
        this.setSize(950, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);//permite com que a janela do login nao seja redimensionada
        this.setLayout(null);
        this.setUndecorated(true);
        // O codigo acima é referente a janela de login, sem nenhuma componente.

        JPanel pnlprincipal = new JPanel();
        JPanel pnlLogo = new JPanel();
        JPanel pnlLogin = new JPanel();
        JLabel lblLogo = new JLabel();
        JLabel lblData_Hora = new JLabel();

        JLabel lblTitulo = new JLabel("Login");
        JLabel lblEmail = new JLabel("Email");
        JLabel lblPassword = new JLabel("Password");
        JLabel lblInformativo = new JLabel();

        JTextField txtEmail = new JTextField();
        JPasswordField txtPassword = new JPasswordField();

        BotaoLogin btnLogin = new BotaoLogin("Entrar");
        JButton btnRecuperarSenha = new JButton("Esqueceu Senha?");
        btnRecuperarSenha.setForeground(new Color(73, 55, 3));

        pnlprincipal.setLayout(null);
        pnlprincipal.setBackground(new Color(3, 52, 73));
        pnlprincipal.setBounds(0, 0, 950, 600);

        pnlLogo.setLayout(null);
        pnlLogo.setBounds(70, 75, 400, 450);
        pnlLogo.setBackground(Color.white);

        pnlLogin.setLayout(null);
        pnlLogin.setBounds(472, 75, 400, 450);
        pnlLogin.setBackground(Color.white);

        lblData_Hora.setBounds(375, 545, 300, 30);

        lblLogo.setBounds(0, 0, 400, 450);
        lblLogo.setIcon(Icon_Logo);
        pnlLogo.add(lblLogo);

        lblTitulo.setBounds(150, 40, 235, 80);

        lblTitulo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 30));
        lblTitulo.setForeground(new Color(3, 52, 73));

        //  btnLogin.setFocusPainted(false);
        btnRecuperarSenha.setFocusPainted(false);
        btnRecuperarSenha.setBorder(BorderFactory.createEmptyBorder());

        lblEmail.setBounds(82, 145, 100, 25);
        txtEmail.setBounds(82, 175, 235, 25);

        lblPassword.setBounds(82, 200, 100, 25);
        txtPassword.setBounds(82, 230, 235, 25);

        //Trabalhando a Fonte
        lblEmail.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
        txtEmail.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
        lblPassword.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
        txtPassword.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
        lblInformativo.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
        btnRecuperarSenha.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
        btnLogin.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
        lblData_Hora.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 16));

        //Trabalhando o foreground
        lblEmail.setForeground(new Color(3, 52, 73));
        lblPassword.setForeground(new Color(3, 52, 73));
        btnLogin.setForeground(new Color(73, 55, 3));
        lblInformativo.setForeground(Color.red);
        lblData_Hora.setForeground(new Color(0, 102, 255));
        lblData_Hora.setForeground(Color.white);
        txtEmail.setForeground(Color.black);

        //background
        btnRecuperarSenha.setBackground(Color.white);

        //Trabalho a borda das Componentes
        txtEmail.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(204, 204, 255)));

        txtPassword.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(204, 204, 255)));

        btnLogin.setBounds(145, 285, 100, 25);
        btnRecuperarSenha.setBounds(126, 330, 150, 25);
        lblInformativo.setBounds(142, 375, 150, 25);

        btnLogin.setEnabled(false);
        txtPassword.setEnabled(false);

        //Email
        txtEmail.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN) {
                    txtPassword.requestFocus();

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
                Border bordaColorida = BorderFactory.createMatteBorder(0, 0, 1, 0, cor);

                // Aplica a borda ao campo de texto
                txtEmail.setBorder(bordaColorida);

                // Permitindo com que o campo seguinte seja aberto assim como nao
                if (cor.equals(Color.GREEN)) {
                    txtPassword.setEnabled(true);

                } else {
                    txtPassword.setEnabled(false);
                    btnLogin.setEnabled(false);

                }

                txtEmail.addFocusListener(new FocusListener() {
                    @Override
                    public void focusGained(FocusEvent e) {

                    }

                    @Override
                    public void focusLost(FocusEvent e) {

                        // Restaura a borda padrão quando o campo perde o foco
                        txtEmail.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(204, 204, 255)));

                    }
                });

            }
        });

        //Password
        txtPassword.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_UP) {
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
                Border bordaColorida = BorderFactory.createMatteBorder(0, 0, 1, 0, cor);

                // Aplica a borda ao campo de texto
                txtPassword.setBorder(bordaColorida);

                // Permitindo com que o campo seguinte seja aberto assim como nao
                if (cor.equals(Color.GREEN)) {
                    btnLogin.setEnabled(true);

                } else {

                    btnLogin.setEnabled(false);

                }

                txtPassword.addFocusListener(new FocusListener() {
                    @Override
                    public void focusGained(FocusEvent e) {
                        txtPassword.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.red));
                    }

                    @Override
                    public void focusLost(FocusEvent e) {

                        // Restaura a borda padrão quando o campo perde o foco
                        txtPassword.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(204, 204, 255)));

                    }
                });

            }
        });

        //Inserindo a Data actual no Rodapé
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
        lblData_Hora.setText(formatador.format(data));

        this.add(pnlprincipal);
        pnlprincipal.add(pnlLogo);
        pnlprincipal.add(pnlLogin);
        pnlprincipal.add(lblData_Hora);
        pnlLogo.add(lblLogo);
        pnlLogin.add(lblTitulo);
        pnlLogin.add(lblEmail);
        pnlLogin.add(txtEmail);
        pnlLogin.add(lblPassword);
        pnlLogin.add(txtPassword);
        pnlLogin.add(txtEmail);
        pnlLogin.add(btnLogin);
        pnlLogin.add(btnRecuperarSenha);
        pnlLogin.add(lblInformativo);

//Instanciando o objecto dao que vai me gtrazer os metodos relativos ao funcionario
        DAO_Funcionario dao_fun = new DAO_Funcionario();

        //Buscando os Dados no Banco
        ArrayList<Funcionario> lista = dao_fun.FindAll_Login();

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblInformativo.setText("");

                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getEmail().equalsIgnoreCase(txtEmail.getText()) && (lista.get(i).getPassword().equalsIgnoreCase(txtPassword.getText()))) {

                        // Este metodo visa a pegar o id de quem se autenticou para entrar 
                        setId(lista.get(i).getId());

                        //Nesta condição verifico se a conta esta activa ou nao
                        if (lista.get(i).getEstado().equalsIgnoreCase(" Activo ")) {
                            //caso ela esteja activa, verifica-se qual funcionario esta acedendo o sistema
                            if ((lista.get(i).getFuncao().equals("Caixa")) && (lista.get(i).getNivel_acesso().equalsIgnoreCase("Funcionario"))) {

                                new Login().setVisible(false);
                                dispose();

                                //Chamando nova tela
                                new Funcionario_Caixa().setVisible(true);

                            } else {
                                // O mesmo acontece aqui
                                if ((lista.get(i).getNivel_acesso().equals("Gerente"))) {

                                    new Login().setVisible(false);

                                    //tirando 
                                    dispose();

                                    //Chamando nova tela
                                    new Admin().setVisible(true);
                                    break;
                                }
                            }

                        } else {

                            //aqui é quando a conta esta inactiva
                            JOptionPane.showMessageDialog(null, "Esta conta esta Inactiva!");
                            break;
                        }

                    } else {
                        //Neste passo , so e executado quando a combinacao de email e password esta incorrectas
                        lblInformativo.setText("Credencias Invalidas");
                    }
                }
            }

        });

        btnRecuperarSenha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        this.setVisible(true);
    }

}
