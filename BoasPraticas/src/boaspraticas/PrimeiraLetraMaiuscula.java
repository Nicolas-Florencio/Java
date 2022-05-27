
package boaspraticas;

public class PrimeiraLetraMaiuscula {
    public String Maiuscula(String nome){
        
        return nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();
        // a função coloca a palavra deseja com a primeira letra em maiúsculo
    }
}
