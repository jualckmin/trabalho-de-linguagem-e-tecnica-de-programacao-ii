/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Banco;
import model.Cliente;

/**
 *
 * @author aluno
 */
public class ClienteDAO {

    public int gravar(Cliente obj) throws Exception {
        Banco bb;
        int qtde;
        try {
            bb = new Banco();
            bb.comando = Banco.conexao.prepareStatement(
                    "Insert into cliente(codigo, nome, login, senha) values(?,?,?,?)");
            bb.comando.setInt(1, obj.getCodigo());
            bb.comando.setString(2, obj.getNome());
            bb.comando.setString(3, obj.getLogin());
            bb.comando.setString(4, obj.getSenha());
            // bb.comando.setDate(5, new java.sql.Date(obj.getDatacadastro().getTime())); //?
            qtde = bb.comando.executeUpdate();
            Banco.conexao.close();
            return (qtde);
        } catch (Exception ex) {
            throw new Exception("Erro ao gravar: " + ex.getMessage());
        }
    }

    public Cliente logar(String login, String senha) throws Exception {
        Banco bb;
        Cliente obj = null;
        try {
            bb = new Banco();
            bb.comando = Banco.conexao.prepareStatement("select codigo, nome, login, senha, datacadastro from cliente  where login=? and senha=?");
            bb.comando.setString(1, login);
            bb.comando.setString(2, senha);
            bb.tabela = bb.comando.executeQuery();
            if ((bb.tabela != null) && (bb.tabela.next())) {
                obj = new Cliente();
                obj.setCodigo(bb.tabela.getInt(1));
                obj.setNome(bb.tabela.getString(2));
                obj.setLogin(bb.tabela.getString(4));
                obj.setDatacadastro(bb.tabela.getString(5));

                bb.tabela.close();
            }
            Banco.conexao.close();
            return (obj);
        } catch (Exception ex) {
            throw new Exception("Erro ao logar: " + ex.getMessage());
        }
    }
}
