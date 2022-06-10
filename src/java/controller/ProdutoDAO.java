/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import model.Banco;

/**
 *
 * @author aluno
 */
public class ProdutoDAO { 
    public ResultSet listar(int codDep) throws Exception{
        Banco bb;
        try{
            bb = new Banco();
            bb.comando =Banco.conexao.prepareStatement(
            "Select codigo,descr, preco, qtde, imagem, coddep from produto where coddep = ?");
            bb.comando.setInt(1,codDep);
            bb.tabela = bb.comando.executeQuery();
            Banco.conexao.close();
            return(bb.tabela);
        }
        catch(Exception ex){
            throw new Exception("Erro ao listar:" + ex.getMessage());
        }
    }
}
