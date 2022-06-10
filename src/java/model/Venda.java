/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author aluno
 */
public class Venda {
    private int codigo;
    private double total;
    private Timestamp datav;
    private int codCli;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = Integer.parseInt(codigo);
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    public void setTotal(String total) {
        this.total = Double.parseDouble(total);
    }

    public Timestamp getDatav() {
        return datav;
    }

    public void setDatav(Timestamp data) {
        this.datav = data;
    }
    public void setDatav(String data) throws Exception {
        this.datav = Timestamp.valueOf(data);
    }

    public int getCodCli() {
        return codCli;
    }

    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }
    public void setCodCli(String codCli) {
        this.codCli = Integer.parseInt(codCli);
    }
}
