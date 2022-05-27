
package classeaula;

public class Carrin {
    String marca;
    String modelo;
    int ano;
    String cor;
    float valor;
    boolean ligado;
    
    void ligar(){
        this.ligado = true;
    }
    
    void desligar(){
        this.ligado = false;
    }
    
    void acelerar(){
        if(this.ligado == true){
            System.out.println("Afunda o pé");
        }
        else{
            System.out.println("Não é possível acelerar pois está desligado ;)");
        }
    }
    
    void verStatus(){
        System.out.println("\n\nA marca do carro é: " + this.marca);
        System.out.println("O modelo do carro é: " + this.modelo);
        System.out.println("O ano do carro é: " + this.ano);
        System.out.println("A cor do carro é: " + this.cor);
        System.out.println("O valor do carro é: " + this.valor);
        if(ligado == true){
            System.out.println("O carro está ligado!");
        }
        else{
            System.out.println("O carro está desligado");
        }
        
    }
}
