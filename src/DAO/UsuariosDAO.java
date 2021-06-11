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
    public boolean auth(Usuario usuario){
        String sql="SELECT * FROM usuarios WHERE userLogin = ? AND userPassword = ?";
        
        Connection con = null;
        PreparedStatement pstm = null;
     
        boolean autenticado = false;
        
        try {
            // criar conexao
            con = (Connection) factory.createConnection();
            
            pstm = con.prepareStatement(sql);
            //passa valores
            pstm.setString(1, usuario.getUserLogin());
            pstm.setString(2, usuario.getUserPassword());
            //execute
            
            pstm.execute();
           
        
            
            return autenticado;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return autenticado;
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
