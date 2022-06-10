/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aluno
 */
public class Item {
    private int qtde;
    private double precoUnit;
    private int codProduto;
    private int codVenda;

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    public void setQtde(String qtde) {
        this.qtde = Integer.parseInt(qtde);
    }

    public double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }
    public void setPrecoUnit(String precoUnit) {
        this.precoUnit = Double.parseDouble(precoUnit);
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }
    public void setCodProduto(String codProduto) {
        this.codProduto = Integer.parseInt(codProduto);
    }

    public int getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }
    public void setCodVenda(String codVenda) {
        this.codVenda = Integer.parseInt(codVenda);
    }
}
