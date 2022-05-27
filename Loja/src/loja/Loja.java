
package loja;

public class Loja {

    public static void main(String[] args) throws InterruptedException {
        Produto prod[] = new Produto[6];
        Movimentacao mov[] = new Movimentacao[4];

        prod[0] = new Produto(111,"Inspiron 15 50000","Notebook", 3,3500);
        prod[1] = new Produto(222,"Samsung Book X30","Notebook", 5,3200);
        prod[2] = new Produto(333,"SSD Kingston 120Gb","SSD", 10,220);
        prod[3] = new Produto(444,"SSD Kingston 240Gb","SSD", 7,310);
        prod[4] = new Produto(555,"Multifuncional Epson Edotanque - L3150","Impressora", 3,1150);
        prod[5] = new Produto(666,"Impressora 3d Finder Flashforge","Impressora", 2,3420);
        
        mov[0] = new Movimentacao();
        prod[4].apresentar();
        mov[0].vendaProduto(3245, prod[4], 2);
        prod[4].apresentar();
        Thread.sleep(7000);

        mov[1] = new Movimentacao();
        mov[1].trocarProdutos(33221, prod[4], prod[5], 2, 1);
        prod[4].apresentar();
        Thread.sleep(7000);

        prod[1].apresentar();
        mov[2] = new Movimentacao();
        mov[2].vendaProduto(5463, prod[1], 10);
    }
    
}
