/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class factory {
    
    // usar dados do banco de dados a ser acessado;
    private static final String USER="root";
    
    private static final String PASSWORD ="#myserver*";
    // caminho porta e banco
    private static final String URL="jdbc:mysql://localhost:3306/estoque?useTimezone=true&serverTimezone=UTC";
    
    /**
     *
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static Connection createConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection banco = DriverManager.getConnection(URL,USER,PASSWORD);
        return banco;
        
    }
    
    public static void closeConection(Connection con){
        try {
            if(con!=null){
            con.close();
            }
        } catch (Exception e) {
        }
    }
    public static void closeConection(Connection con, PreparedStatement stmt){
        
        closeConection(con);
        
        try {
            if(stmt !=null){
                stmt.close();
            }
            
        } catch (Exception e) {
        }
    }
    
    public static void closeConection(Connection con, PreparedStatement stmt, ResultSet rs){
        
        closeConection(con, stmt);
        
        try {
            if(rs !=null){
                rs.close();
            }
            
        } catch (Exception e) {
        }
    }
    
}
