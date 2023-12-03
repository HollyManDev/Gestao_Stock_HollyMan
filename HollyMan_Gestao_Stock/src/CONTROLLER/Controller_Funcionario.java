/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import DAO.DAO_Funcionario;
import MODEL.DTO.Funcionario;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.sql.Date;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author HOLLY MAN
 */
public class Controller_Funcionario {

    Funcionario fun = new Funcionario();
    Image img;

    DAO_Funcionario dao_fun = new DAO_Funcionario();

    public void Verificacao(String codigo_fun, String apelido, String nome, String bi, String genero, Date data_nascimento, String email, String password, int contacto,
            Date data_Contratacao, String perfil, String endereco, String funcao, String status, double salario, byte[] imagemBytes) {

        if ((apelido.equals("")) || (nome.equals("")) || (bi.equals("")) || (genero.equals("")) || (data_nascimento.equals("")) || (email.equals(""))
                || (password.equals("")) || (data_Contratacao.equals("")) || (perfil.equals("")) || (endereco.equals("")) || (funcao.equals("")) || (status.equals(""))
                || (salario == 0)) {
            JOptionPane.showMessageDialog(null, "Certifique-se de ter preenchido todos campos");
        } else {
            fun.setCodigo_Fun(codigo_fun);
            fun.setApelido(apelido);
            fun.setNome(nome);
            fun.setNumero_BI_Nuit(bi);
            fun.setGenero(genero);
            fun.setData_nascimento(data_nascimento);
            fun.setEmail(email);
            fun.setPassword(password);
            fun.setContacto(contacto);
            fun.setNivel_acesso(perfil);
            fun.setFuncao(funcao);
            fun.setEstado(status);
            fun.setSalario(salario);
            fun.setData_contratacao(data_Contratacao);
            fun.setEndereco(endereco);
            fun.setFoto(imagemBytes);

            //cadastrando 
            dao_fun.save_Fun(fun);
        }

    }

    public void Verificacao_Update_Manager(long id, String apelido, String nome, String bi, String genero, Date data_nascimento, String email, String password, int contacto,
            Date data_Contratacao, String perfil, String endereco, String funcao, String status, double salario, byte[] imagemBytes) {

        if ((apelido.equals("")) || (nome.equals("")) || (bi.equals("")) || (genero.equals("")) || (data_nascimento.equals("")) || (email.equals(""))
                || (password.equals("")) || (data_Contratacao.equals("")) || (perfil.equals("")) || (endereco.equals("")) || (funcao.equals("")) || (status.equals(""))
                || (salario == 0)) {
            JOptionPane.showMessageDialog(null, "Certifique-se de ter preenchido todos campos");
        } else {
            fun.setId(id);
            fun.setApelido(apelido);
            fun.setNome(nome);
            fun.setNumero_BI_Nuit(bi);
            fun.setGenero(genero);
            fun.setData_nascimento(data_nascimento);
            fun.setEmail(email);
            fun.setPassword(password);
            fun.setContacto(contacto);
            fun.setNivel_acesso(perfil);
            fun.setFuncao(funcao);
            fun.setEstado(status);
            fun.setSalario(salario);
            fun.setData_contratacao(data_Contratacao);
            fun.setEndereco(endereco);
            fun.setFoto(imagemBytes);

            //cadastrandLKo 
            dao_fun.Update_Manager(fun);
        }

    }

    byte[] imagemBytes;

    public byte[] CarregarImagem(JLabel lblFoto) {
        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Selecionar um arquivo");
        jfc.setFileFilter(new FileNameExtensionFilter("Arquivo de imagens (*.PNG, *.JPG,*.JPEG)", "png", "jpg", "jpeg"));
        int resultado = jfc.showOpenDialog(jfc);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            try {

                Image imagem = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(150, 150, Image.SCALE_SMOOTH);

                // Converta a imagem para um array de bytes
                BufferedImage bufferedImage = new BufferedImage(imagem.getWidth(null), imagem.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                Graphics g = bufferedImage.getGraphics();
                g.drawImage(imagem, 0, 0, null);
                g.dispose();

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(bufferedImage, "png", baos);

                imagemBytes = baos.toByteArray();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao carregar a imagem!!!");
            }
        }
        return imagemBytes;
    }

    public boolean validarEmail(String email) {
        String regex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public void validacao_Update(long id, String email, String password, String endereco, int contacto, byte[] foto) {
        if (email.equals("") || (password.equals("")) || (endereco.equals("")) || (contacto == 0) || foto.equals("")) {
            JOptionPane.showMessageDialog(null, "Certifique-se de que todos foram preenchidos!!!");
        } else {
            fun.setId(id);
            fun.setEmail(email);
            fun.setPassword(password);
            fun.setEndereco(endereco);
            fun.setContacto(contacto);
            fun.setFoto(foto);
            dao_fun.update_profile(fun);
        }
    }
}
