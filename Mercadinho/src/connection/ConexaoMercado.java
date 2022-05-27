package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoMercado {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://ec2-54-226-165-161.compute-1.amazonaws.com/etim_19283";
    private static final String USUARIO = "19283";
    private static final String SENHA = "19283nicolas";
    
    public static Connection getConexao(){
        
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão: ", ex);
        }
        
    }
    
    public static void fechaConexao(Connection con){
        try{
           if (con != null){
               con.close();
           } 
        }
        catch (SQLException ex){
            Logger.getLogger(ConexaoMercado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void fechaConexao(Connection con, PreparedStatement stmt){
       fechaConexao(con);
       
       try{
           if (stmt != null){
               stmt.close();
           } 
        }
        catch (SQLException ex){
            Logger.getLogger(ConexaoMercado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void fechaConexao(Connection con, PreparedStatement stmt, ResultSet rs){
       fechaConexao(con);
       fechaConexao(con, stmt);
       
       try{
           if (rs != null){
               rs.close();
           } 
        }
        catch (SQLException ex){
            Logger.getLogger(ConexaoMercado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
