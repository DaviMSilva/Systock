
package systock;
import frames.login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author ACER
 */
public class Systock {
    
    // usar dados do banco de dados a ser acessado;
    private static final String USER="davi";
    
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
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        // TODO code application logic here
        Connection con = createConnection();
        
        //testar se esta ativo
        if (con!= null){
            JOptionPane.showMessageDialog(null, "conexao sucessida");
            
            con.close();
        }
        new login().setVisible(true);
    }
    
}
