
package loja;

public class Produto {
    private int codigo;
    private String nome;
    private String tipo;
    private int estoque;
    private float preco;
    private boolean ativo;
    
    public Produto(int codigo, String nome, String tipo, int estoque, float preco) {
    this.codigo = codigo;
    this.nome = nome;
    this.tipo = tipo;
    this.estoque = estoque;
    this.preco = preco;
    this.ativo = true;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo <= 0){
            System.out.println("Código Inválido");
        }
        else{
         this.codigo = codigo;   
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == ""){
            System.out.println("Nome do produtivo inválido");
        }
        else{
            this.nome = nome;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo != "Notebook" && tipo != "SSD" && tipo != "Impressora"){
            System.out.println("Tipo de Mercadoria inválido");
        }
        else{
            this.tipo = tipo;
        }
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        if (estoque < 0){
            System.out.println("Estoque não pode ser negativo");
        }
        else{
            this.estoque = estoque;
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco < 0){
            System.out.println("Preço não pode ser negativo");
        }
        else{
            this.preco = preco;
        }
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    public void saidaProduto (int q){
        this.estoque = this.estoque - q;
        if (this.estoque <= 0){
            this.ativo = false;
        }
    }
    public void entradaProduto (int q) {
        this.estoque = this.estoque + q;
        if (this.estoque > 0){
            this.ativo = true;
        }
    }
    
    public void apresentar() {
        System.out.println("==============================");
        System.out.println(this.codigo + " - " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Qtde em estoque: " + this.estoque);
        System.out.println("Preço de venda: " + this.preco);
        System.out.println("Status: " + this.ativo);
        System.out.println("==============================");
    }
}
