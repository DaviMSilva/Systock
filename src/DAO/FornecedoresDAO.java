/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import object.Produto;
import systock.factory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import object.Fornecedor;
import systock.factory;

/**
 *
 * @author ACER
 */
public class FornecedoresDAO {
    
    public void save (Fornecedor fornecedor) throws SQLException, ClassNotFoundException{
        String sql ="INSERT INTO fornecedores(nomeForne, cnpj, fone, setor, email) VALUES(?,?,?,?,?)";
        Connection con = null;
        PreparedStatement pstm = null;
        
        try {
            // criar conexao
            con = (Connection) factory.createConnection();
            
            pstm = con.prepareStatement(sql);
            //passa valores
            pstm.setString(1, fornecedor.getNomeForne());
            pstm.setString(2, fornecedor.getCnpj());
            pstm.setString(3, fornecedor.getFone());
            pstm.setString(4, fornecedor.getSetor());
            pstm.setString(5, fornecedor.getEmail());
           
            //execute
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Fornecedor Salvo");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                
                //fechar conexoes
                if(pstm!=null){
                    pstm.close();
                }
                if(con!= null){
                    con.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"erro ao fechar conexoes "+ e);
            }
        }
    }
    
    public List<Fornecedor> procuraCod(Fornecedor f){
        String sql ="SELECT * FROM fornecedores WHERE idForne = ?";
        List <Fornecedor> forne = new ArrayList<Fornecedor>();
        
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            // criar conexao
            con = (Connection) factory.createConnection();
            
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, f.getIdForne());
            
            rs = pstm.executeQuery();
            //passa valores
            while(rs.next()){
                Fornecedor freturn = new Fornecedor();
                freturn.setNomeForne(rs.getString("nomeForne"));
                forne.add(freturn);
            }     
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                
                //fechar conexoes
                factory.closeConection(con, pstm);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"erro ao fechar conexoes "+ e);
            }
        }
      return forne;       
    }


    public List<Produto> getProdutos() throws SQLException{
        String sql ="SELECT * FROM produtos";
        List<Produto> produtos = new ArrayList<Produto>();
        
        
        Connection con = null;
        PreparedStatement pstm = null;
        // classe pra recuperar dados do banco SELECT;
        ResultSet rset  = null;
        
        try {
            con = factory.createConnection();
            pstm = con.prepareStatement(sql);
            
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Produto produto = new Produto();
                //recuperar dados
                produto.setCod(rset.getInt("idProd"));
                // recuperar nome
                produto.setNome(rset.getString("nomeProd"));
                // recuperar descriçao
                produto.setDesc(rset.getString("descProd"));
                // recuperar qnt de itens
                produto.setQnt(rset.getInt("qntProd"));
                //recuperar valor id fornecedor
                produto.setCodFor(rset.getInt("idForne"));
                // recupera valor uni 
                produto.setValUni(rset.getDouble("valUnitProd"));
                // recupera valor total 
                produto.setValTotal(rset.getDouble("valTotalProd"));
                // recupera validade 
                produto.setValidade(rset.getDate("validade"));
                
                produtos.add(produto);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, " erro ao recuperar dados do banco " +e);
        
        }finally{
           
            //fechar conexão 
            factory.closeConection(con, pstm, rset);
            
        }
        //retornar a lista
        return produtos;
    
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

