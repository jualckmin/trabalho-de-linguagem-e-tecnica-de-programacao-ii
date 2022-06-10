/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import model.Banco;
//listar por departamento
/**
 *
 * @author aluno
 */
public class DepartamentoDAO {
      //"Insert into departamento(nome) values(md5(?)");
        public ResultSet listar(String parte) throws Exception{
        Banco bb;
        try{
            bb = new Banco();
            bb.comando =Banco.conexao.prepareStatement(
            "Select nome from Departamento where nome ilike ? order by nome");
            bb.comando.setString(1,"%"+ parte+"%");
            bb.tabela = bb.comando.executeQuery();
            Banco.conexao.close();
            return(bb.tabela);
        }
        catch(Exception ex){
            throw new Exception("Erro ao listar:" + ex.getMessage());
        }
    }
}
