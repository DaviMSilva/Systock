/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author ACER
 */
public class Fornecedor {
    private int idForne;
    private String nomeForne;
    private String cnpj;
    private String fone;

    public int getIdForne() {
        return idForne;
    }

    public void setIdForne(int idForne) {
        this.idForne = idForne;
    }

    public String getNomeForne() {
        return nomeForne;
    }

    public void setNomeForne(String nomeForne) {
        this.nomeForne = nomeForne;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
    
    
}
