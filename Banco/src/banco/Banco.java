
package banco;


public class Banco {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(5000);
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(12345);
        p1.setDono("Totó");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(56473);
        p2.setDono("Lessie");
        p2.abrirConta("cp");
      
        Thread.sleep(5000);
        
        p1.depositar(300);
        p2.depositar(500);
        Thread.sleep(5000);
        
        p1.sacar(155);
        p2.sacar(231);
        Thread.sleep(5000);
        
        p1.pagarMensalidade();
        p2.pagarMensalidade();
        Thread.sleep(5000);
        
        p1.sacar(1000);
        p2.sacar(1000);
        Thread.sleep(5000);
        
        p1.fecharConta();
        p2.fecharConta();
        Thread.sleep(10000);
        
        p1.sacar(183);
        Thread.sleep(5000);
        
        p1.fecharConta();
        p2.fecharConta();
        Thread.sleep(5000);        
        
        p1.estadoConta();
        p2.estadoConta();
    }
    
}
