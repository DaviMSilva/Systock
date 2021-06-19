/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import object.Fornecedor;
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
                freturn.setIdForne(rs.getInt("idForne"));
                freturn.setNomeForne(rs.getString("nomeForne"));
                freturn.setCnpj(rs.getString("cnpj"));
                freturn.setEmail(rs.getString("email"));
                freturn.setFone(rs.getString("fone"));
                freturn.setSetor(rs.getString("setor"));
                
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


    public List<Fornecedor> getFornecedores() throws SQLException{
        String sql ="SELECT * FROM fornecedores";
        List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
        
        
        Connection con = null;
        PreparedStatement pstm = null;
        // classe pra recuperar dados do banco SELECT;
        ResultSet rset  = null;
        
        try {
            con = factory.createConnection();
            pstm = con.prepareStatement(sql);
            
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Fornecedor Forne = new Fornecedor();
                //recuperar dados
                Forne.setIdForne(rset.getInt("idForne"));
                // recuperar nome
                Forne.setNomeForne(rset.getString("nomeForne"));
                // recuperar descriçao
                Forne.setCnpj(rset.getString("cnpj"));
                // recuperar qnt de itens
                Forne.setEmail(rset.getString("email"));
                //recuperar valor id fornecedor
                Forne.setFone(rset.getString("fone"));
                // recupera valor uni 
                Forne.setSetor(rset.getString("setor"));
                // recupera valor total 
                
                
                fornecedores.add(Forne);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, " erro ao recuperar dados do banco " +e);
        
        }finally{
           
            //fechar conexão 
            factory.closeConection(con, pstm, rset);
            
        }
        //retornar a lista
        return fornecedores;
    
    }
    
    public void update(Fornecedor f){
        String sql = "UPDATE fornecedores SET nomeForne =?, cnpj =?, fone =?, setor =?, email =?  WHERE idForne = ?";
        
        Connection con = null;
        PreparedStatement pstm = null;
        
        try {
            con = factory.createConnection();
            pstm = con.prepareStatement(sql);
            pstm.setString(1, f.getNomeForne());
            pstm.setString(2, f.getCnpj());
            pstm.setString(3, f.getFone());
            pstm.setString(4, f.getSetor());
            pstm.setString(5, f.getEmail());
            pstm.setInt(6, f.getIdForne());
            
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "erro",2);
        }
        finally{
            factory.closeConection(con, pstm);
        }
    }
    
    public void deleteCod(Fornecedor f){
        String sql ="DELETE FROM fornecedores WHERE idForne = ?";
        
        
        Connection con = null;
        PreparedStatement pstm = null;
        
        
        try {
            // criar conexao
            con = (Connection) factory.createConnection();
            
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, f.getIdForne());
            
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


