/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import object.Usuario;

import systock.factory;

/**
 *
 * @author ACER
 */
public class UsuariosDAO {
    
    public void save(Usuario user){
        String sql="INSERT INTO usuarios (userName, userLogin, userPassword) VALUES(?,?,?)";
        
        Connection con = null;
        PreparedStatement pstm = null;
        
        
        try {
            con = factory.createConnection();
            pstm = con.prepareStatement(sql);
            
            pstm.setString(1, user.getUserName());
            pstm.setString(2, user.getUserLogin());
            pstm.setString(3, user.getUserPassword());
            
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Usuário Criado com Sucesso","Aviso", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }finally{
            try {
                factory.closeConection(con, pstm);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
    }
    public boolean auth(Usuario usuario){
        String sql="SELECT * FROM usuarios WHERE userLogin = ? AND userPassword = ?";
        
        //abrir conexões
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        //autenticacao
        boolean autenticado = false;
        
        try {
            // criar conexao
            con = (Connection) factory.createConnection();
            
            pstm = con.prepareStatement(sql);
            
            //passa valores
            pstm.setString(1, usuario.getUserLogin());
            pstm.setString(2, usuario.getUserPassword());
            //execute
            rs = pstm.executeQuery();
            if(rs.next()){
                 autenticado = true;
                 JOptionPane.showMessageDialog(null, "autenticado! ","Aviso",1);
            }
            
            return autenticado;
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            return autenticado;
        }finally{
            try {
                
                //fechar conexoes
                factory.closeConection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"erro ao fechar conexoes "+ e);
            }
        }
        
        
    }
    public List<Usuario> getUsuarios(){
        String sql ="SELECT * FROM usuarios";
        List<Usuario> usuarios = new ArrayList<Usuario>();
        
        
        Connection con = null;
        PreparedStatement pstm = null;
        // classe pra recuperar dados do banco SELECT;
        ResultSet rset  = null;
        
        try {
            con = factory.createConnection();
            pstm = con.prepareStatement(sql);
            
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Usuario user = new Usuario();
                //recuperar dados
                user.setIdUser(rset.getInt("idUser"));
                // recuperar nome
                user.setUserName(rset.getString("userName"));
                // recuperar descriçao
                user.setUserLogin(rset.getString("userLogin"));
                // recuperar qnt de itens
                user.setUserPassword(rset.getString("userPassword"));
                
                
                
                usuarios.add(user);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, " erro ao recuperar dados do banco " +e);
        
        }finally{
           
            //fechar conexão 
            factory.closeConection(con, pstm, rset);
            
        }
        //retornar a lista
        return usuarios;
    
    }
    
    public List<Usuario> procuraCod(Usuario p){
        String sql ="SELECT * FROM usuarios WHERE idUser = ?";
        List <Usuario> user = new ArrayList<Usuario>();
        
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            // criar conexao
            con = (Connection) factory.createConnection();
            
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, p.getIdUser());
            
            rs = pstm.executeQuery();
            //passa valores
            while(rs.next()){
                Usuario preturn = new Usuario();
                preturn.setUserName(rs.getString("userName"));
                preturn.setIdUser(rs.getInt("idUser"));
                preturn.setUserLogin(rs.getString("userLogin"));
                preturn.setUserPassword(rs.getString("userPassword"));
                
                
                user.add(preturn);
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
      return user;       
    }
    
    public void update(Usuario p){
        String sql = "UPDATE usuarios SET userName = ? , userLogin = ?, userPassword=?  WHERE idUser = ?";
        
        Connection con = null;
        PreparedStatement pstm = null;
        
        try {
            con = factory.createConnection();
            pstm = con.prepareStatement(sql);
            
            pstm.setString(1, p.getUserName());
            
            pstm.setString(2, p.getUserLogin());
            pstm.setString(3, p.getUserPassword());
            pstm.setInt(4, p.getIdUser());
            
            
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "erro",2);
        }
        finally{
            factory.closeConection(con, pstm);
        }
        
    }
    
    public void deleteCod(Usuario p){
        String sql ="DELETE FROM usuarios WHERE idUser = ?";
        
        
        Connection con = null;
        PreparedStatement pstm = null;
        
        
        try {
            // criar conexao
            con = (Connection) factory.createConnection();
            
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, p.getIdUser());
            
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
