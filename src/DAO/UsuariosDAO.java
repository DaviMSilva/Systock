/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
}
