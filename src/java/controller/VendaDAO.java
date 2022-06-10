/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Banco;
import model.Venda;


/**
 *
 * @author aluno
 */
public class VendaDAO {
    public int gravar(Venda obj) throws Exception {
        Banco bb;
        int qtde;
        try {
            bb = new Banco();
            bb.comando = Banco.conexao.prepareStatement(
                    "Insert into venda (codigo, total, datav, codcli) values(?,?,?,?)");
            bb.comando.setInt(1, obj.getCodigo());
            bb.comando.setDouble(2, obj.getTotal());
            bb.comando.setTimestamp(3, obj.getDatav());
            bb.comando.setInt(4, obj.getCodCli());
            qtde = bb.comando.executeUpdate();
            Banco.conexao.close();
            return (qtde);
        } catch (Exception ex) {
            throw new Exception("Erro ao gravar: " + ex.getMessage());
        }
    }
}
