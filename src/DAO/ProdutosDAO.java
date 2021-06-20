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

/**
 *
 * @author ACER
 */
public class ProdutosDAO {
    
    public void save (Produto produto) throws SQLException, ClassNotFoundException{
        String sql ="INSERT INTO produtos set validade = STR_TO_DATE(?, ?), nomeProd=?, descProd=?,qntProd=?, valUnitProd=?,idForne=?,valTotalProd=?";
        Connection con = null;
        PreparedStatement pstm = null;
        
        try {
            // criar conexao
            con = (Connection) factory.createConnection();
            
            pstm = con.prepareStatement(sql);
            //passa valores
            pstm.setString(1,produto.getValidade());
            pstm.setString(2, "%d/%m/%Y");
            pstm.setString(3, produto.getNome());
            pstm.setString(4, produto.getDesc());
            pstm.setInt(5, produto.getQnt());
            pstm.setDouble(6, produto.getValUni());
            pstm.setInt(7, produto.getCodFor());
            pstm.setDouble(8, produto.getValTotal());
            
            //execute
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "salvo com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                
                //fechar conexoes
                factory.closeConection(con, pstm);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"erro ao fechar conexoes "+ e);
            }
        }
    }


    public List<Produto> getProdutos() throws SQLException{
        String sql ="SELECT *, date_format(validade,?) as validadef FROM produtos";
        List<Produto> produtos = new ArrayList<Produto>();
        
        
        Connection con = null;
        PreparedStatement pstm = null;
        // classe pra recuperar dados do banco SELECT;
        ResultSet rset  = null;
        
        try {
            con = factory.createConnection();
            pstm = con.prepareStatement(sql);
           
            pstm.setString(1, "%d/%m/%Y");
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
                produto.setValidade(rset.getString("validadef"));
                
                produtos.add(produto);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, " erro ao recuperar dados do banco " +e);
        
        }finally{
            factory.closeConection(con, pstm, rset);
                
            
        }
        //retornar a lista
        return produtos;
    
    }
    
    public List<Produto> procuraCod(Produto p){
        String sql ="SELECT *, date_format(validade,?) AS validadef FROM produtos WHERE idProd = ?";
        List <Produto> prod = new ArrayList<Produto>();
        
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            // criar conexao
            con = (Connection) factory.createConnection();
            
            pstm = con.prepareStatement(sql);
           
            pstm.setString(1, "%d/%m/%Y");
            pstm.setInt(2, p.getCod());
            
            rs = pstm.executeQuery();
            //passa valores
            while(rs.next()){
                Produto preturn = new Produto();
                preturn.setNome(rs.getString("nomeProd"));
                preturn.setCod(rs.getInt("idProd"));
                preturn.setDesc(rs.getString("descProd"));
                preturn.setQnt(rs.getInt("qntProd"));
                preturn.setValUni(rs.getDouble("valUnitProd"));
                preturn.setValTotal(rs.getDouble("valTotalProd"));
                preturn.setCodFor(rs.getInt("idForne"));
                preturn.setValidade(rs.getString("validadef"));
                prod.add(preturn);
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
      return prod;       
    }
    
    
    public void update(Produto p){
        String sql = "UPDATE produtos SET nomeProd = ? , descProd= ?,qntProd=? , valUnitProd=?,idForne=? ,valTotalProd=?, validade=STR_TO_DATE( ?, ?)  WHERE idProd = ?";
        String sql1 ="UPDATE produtos SET qntProd =? WHERE idProd = ?";
        
        Connection con = null;
        PreparedStatement pstm = null;
        
        try {
            con = factory.createConnection();
            
            if(p.getNome()==null){
                pstm = con.prepareStatement(sql1);
                pstm.setInt(1, p.getQnt());
                pstm.setInt(2, p.getCod());
                pstm.executeUpdate();
                JOptionPane.showMessageDialog(null, "Executado com sucesso!");
                
            }else{
                
                pstm = con.prepareStatement(sql);        
                pstm.setString(1, p.getNome());

                pstm.setString(2, p.getDesc());
                pstm.setInt(3, p.getQnt());
                pstm.setDouble(4, p.getValUni());
                pstm.setInt(5, p.getCodFor());
                pstm.setDouble(6, p.getValTotal());
                pstm.setString(7,p.getValidade());
                pstm.setString(8, "%d/%m/%Y");
                pstm.setInt(9, p.getCod());

                pstm.executeUpdate();
                JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
            
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "erro",2);
        }
        finally{
            factory.closeConection(con, pstm);
        }
        
    }
    
    public void deleteCod(Produto p){
        String sql ="DELETE FROM produtos WHERE idProd = ?";
        
        
        Connection con = null;
        PreparedStatement pstm = null;
        
        
        try {
            // criar conexao
            con = (Connection) factory.createConnection();
            
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, p.getCod());
            
            pstm.executeUpdate();
            //passa valores
            
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir!\n Item que deseja excluir está sendo usado em outra tabela.");
        }finally{
            try {
                
                //fechar conexoes
                factory.closeConection(con, pstm);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"erro ao fechar conexoes "+ e);
            }
        }

    } 

}
