/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/**
 *
 * @author ACER
 */
public class Produto {
    private int cod;
    private String nome;
    private String desc;
    private int qnt;
    private double valUni;
    private int codFor;
    private double valTotal;
    private Date validade;

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCodFor() {
        return codFor;
    }

    public void setCodFor(int codFor) {
        this.codFor = codFor;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public double getValUni() {
        return valUni;
    }

    public void setValUni(double valUni) {
        this.valUni = valUni;
    }

    public double getValTotal() {
        return valTotal;
    }

    public void setValTotal(double valTotal) {
        this.valTotal = valTotal;
    }

    
    
    
}
