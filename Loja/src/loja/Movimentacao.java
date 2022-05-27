package loja;

public class Movimentacao {
    private int numNota;
    private String tipo;
    private Produto prod1;
    private Produto prod2;
    private int qtde1;
    private int qtde2;
    
    public void vendaProduto (int nf, Produto p1, int q){
        System.out.println("------------------------");
        if(p1.getEstoque() < q || p1.isAtivo() == false){
            System.out.println("Esta venda não pode ser realizada!");
            System.out.println("Produto: " + p1.getNome() + " - Qtde: " + q);
            System.out.println("O estoque atual é " + p1.getEstoque());
            System.out.println("Ativo: " + p1.isAtivo());
            this.numNota = nf;
            this.tipo = "Cancelada";
            this.prod1 = null;
            this.prod2 = null;
            this.qtde1 = 0;
            this.qtde2 = 0;
        }
        else{
            System.out.println("Venda efetuada com sucesso");
            System.out.println(q + " " + p1.getNome());
            System.out.println("Valor da venda: " + p1.getPreco() * q);
            p1.saidaProduto (q);
            this.numNota = nf;
            this.tipo = "Venda";
            this.prod1 = p1;
            this.prod2 = null;
            this.qtde1 = q;
            this.qtde2 = 0;          
        }
        System.out.println("------------------------");
    }
    public void trocarProdutos(int nf, Produto p2, Produto p3, int q2, int q3) {
        System.out.println("------------------------------------------");
        if(p2.getTipo() != p3.getTipo()){
        System.out.println("Esta Troca não pode ser realizada");
        System.out.println("Os produtos são de tipos diferentes");
        this.numNota=nf;
        this.tipo = "Cancelada";
        this.prod1=null;
        this.prod2=null;
        this.qtde1=0;
        this.qtde2=0;    
        } 
        else if(p3.getEstoque() < q3 || p3.isAtivo() == false) {
            System.out.println("Essa troca não pode ser realizada!");
            System.out.println("Produto:" + p3.getNome() + " - Qtde: ");
            System.out.println("o Estoque atual é" + p3.getEstoque());
            System.out.println("Ativo: " + p3.isAtivo());
            this.numNota=nf;
            this.tipo = "Cancelada";
            this.prod1=null;
            this.prod2=null;
            this.qtde1=0;
            this.qtde2=0;
        } 
        else {
            System.out.println("Troca realizada com sucesso");
            System.out.println("Devolvendo " + q2 + " " + p3.getNome() + "\ne levando " + q3 + " " + p3.getNome()); 
            System.out.println("Valor do produto devolvido: " + p2.getPreco()*q3);
            System.out.println("Valor do produto levado: " + p2.getPreco()*q2);
            float dif = p2.getPreco()*q3 - p2.getPreco()*q2;
            if(dif<0){
                System.out.println("O cliente que pagar: " + -dif);
            } else {
                System.out.println("A loja tem que reembolsar: " + dif);
            }
            p2.entradaProduto(q2);
            p3.saidaProduto(q3);
            this.numNota = nf;
            this.tipo = "Venda";
            this.prod1 = p2;
            this.prod2 = p3;
            this.qtde1 = q2;
            this.qtde2 = q3;
        }
        System.out.println("------------------------------------------");
    }
}

