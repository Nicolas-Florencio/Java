
package model.bean;

public class Produto {

    private int codigo;
    private String descricao;
    private int quantidade;
    private double preco;
    
    public Produto() {
        
    }

    public Produto(int codigo, String descricao, int quantidade, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quatidade) {
        this.quantidade = quatidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
}
