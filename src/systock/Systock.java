
package systock;
import com.mysql.cj.protocol.Resultset;
import frames.login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static systock.factory.createConnection;
/**
 *
 * @author ACER
 */
public class Systock {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        // TODO code application logic here
        Connection con = factory.createConnection();
        login l = new login();
        //testar se esta ativo
        if (con!= null){
            l.ConStatus(true);
        
            factory.closeConection(con);
            
        }
        l.setVisible(true);
    }
    
}
