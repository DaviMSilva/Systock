/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyReports;

import java.sql.ResultSet;
import java.sql.Connection;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import systock.factory;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ACER
 */
public class Report {
    
    
    public void relatorio(String sql, String caminho){
        
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pstm = null;
        try {
            
            con = factory.createConnection();
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
            JasperPrint jp = JasperFillManager.fillReport(caminho, null, jrRS);
            JasperViewer.viewReport(jp,false);
            
        } catch (ClassNotFoundException | SQLException | JRException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            factory.closeConection(con, pstm,rs);
        }
    }

}
