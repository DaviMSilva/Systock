/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import object.Produto;
import systock.Systock;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class ProdutosDAO {
    
    public void save (Produto produto) throws SQLException, ClassNotFoundException{
        String sql ="INSERT INTO produtos(nomeProd, descProd,qntProd, valUnitProd,codFor,valTotalProd, validade) VALUES(?,?,?,?,?,?,?)";
        Connection con = null;
        PreparedStatement pstm = null;
        
        try {
            // criar conexao
            con = (Connection) Systock.createConnection();
            
            pstm = con.prepareStatement(sql);
            //passa valores
            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getDesc());
            pstm.setInt(3, produto.getQnt());
            pstm.setDouble(4, produto.getValUni());
            pstm.setInt(5, produto.getCodFor());
            pstm.setDouble(6, produto.getValTotal());
            pstm.setDate(7, (Date) produto.getValidade());
            //execute
            pstm.execute();
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
    
    public void deleteForCod(Produto produto){
        String sql ="DELETE FROM produtos WHERE idProd = ?";
        
        Connection con = null;
        PreparedStatement pstm = null;
        
        try {
            // criar conexao
            con = (Connection) Systock.createConnection();
            
            pstm = con.prepareStatement(sql);
            //passa valores
            pstm.setInt(1, produto.getCod());
            //execute
            pstm.execute();
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


    public List<Produto> getProdutos() throws SQLException{
        String sql ="SELECT * FROM produtos";
        List<Produto> produtos = new ArrayList<Produto>();
        
        
        Connection con = null;
        PreparedStatement pstm = null;
        // classe pra recuperar dados do banco SELECT;
        ResultSet rset  = null;
        
        try {
            con = Systock.createConnection();
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
                // recupera valor uni 
                produto.setValUni(rset.getDouble("valUnitProd"));
                // recupera valor total 
                produto.setValTotal(rset.getDouble("valTotalProd"));
                
                produtos.add(produto);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, " erro ao recuperar dados do banco " +e);
        
        }finally{
            if(rset!=null){
                rset.close();
            }
            if(pstm!= null){
                pstm.close();
            }              
            if(con != null){
                con.close();
            }
                
            
        }
        //retornar a lista
        return produtos;
    
    }

}
