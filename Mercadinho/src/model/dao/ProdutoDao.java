package model.dao;

import java.util.logging.Logger;
import connection.ConexaoMercado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import model.bean.Produto;

public class ProdutoDao {
    
    public void create(Produto p){
        
        Connection con = ConexaoMercado.getConexao();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("INSERT INTO Produto (descricao, quantidade, preco) VALUES (?, ?, ?)");
            
            stmt.setString(1, p.getDescricao());
            stmt.setInt(2, p.getQuantidade());
            stmt.setDouble(3, p.getPreco());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Inclusão realizada com sucesso!");
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir!\n" + ex);
        }
        finally{
            ConexaoMercado.fechaConexao(con, stmt);
        }
    }
    
    public List<Produto> read() { //listar
        Connection con = ConexaoMercado.getConexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM Produto");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                Produto produto = new Produto();
                
                produto.setCodigo(rs.getInt("codigo"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setPreco(rs.getDouble("preco"));
                produtos.add(produto);
            }
        }
        catch (SQLException ex){
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        }   
        finally{
            ConexaoMercado.fechaConexao(con, stmt, rs);
        }
        
        return produtos;
    }
    public List<Produto> readForDesc(String desc) {
        
        Connection con =ConexaoMercado.getConexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM Produto WHERE descricao LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Produto produto = new Produto();
                
                produto.setCodigo(rs.getInt("codigo"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setPreco(rs.getDouble("preco"));
                produtos.add(produto);
            }
        }
        catch (SQLException ex){
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        }   
        finally{
            ConexaoMercado.fechaConexao(con, stmt, rs);
        }
        
        return produtos;
        }
    
        public void update (Produto p){
            
            Connection con = ConexaoMercado.getConexao();
            
            PreparedStatement stmt = null;
            
            try{
                stmt = con.prepareStatement("UPDATE Produto SET descricao = ?, quantidade = ?, preco = ? WHERE codigo = ?");
                stmt.setString(1, p.getDescricao());
                stmt.setInt(2, p.getQuantidade());
                stmt.setDouble(3, p.getPreco());
                stmt.setInt(4,p.getCodigo());
                
                stmt.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
            }
            catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
            }
            finally{
                ConexaoMercado.fechaConexao(con, stmt);
            }
    }
        public void delete (Produto p){
            
            Connection con = ConexaoMercado.getConexao();
            
            PreparedStatement stmt = null;
            
            try{
                stmt = con. prepareStatement("DELETE FROM Produto WHERE codigo = ?");
                stmt.setInt(1, p.getCodigo());
                
                stmt.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            }
            catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
            }
            finally{
                ConexaoMercado.fechaConexao(con, stmt);
            }
        }
}
