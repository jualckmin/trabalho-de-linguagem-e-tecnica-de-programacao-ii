/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author aluno
 */
public class Banco {
    public static Connection conexao;
    public PreparedStatement comando;
    public ResultSet tabela;

    static {
        conexao = null;
    }

    public Banco() throws Exception {
        try {
            Class.forName("org.postgresql.Driver"); 
            if ((conexao == null) || (conexao.isClosed())) {
conexao = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/trabalho", "postgres", "ifsp");
            }
        } catch (Exception ex) {
            throw new Exception("Erro na conexao com o banco: " + ex.getMessage());
        }
    } 
}
