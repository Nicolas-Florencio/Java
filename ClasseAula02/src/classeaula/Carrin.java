
package classeaula;

public class Carrin {
    public String marca;
    
    public String modelo;
    
    public int ano;
    
    public String cor;
    
    private float valor;
    
    private boolean ligado;
    
    public void ligar(){
        this.ligado = true;
    }
    
    public void desligar(){
        this.ligado = false;
    }
    
    public void acelerar(){
        if(this.ligado == true){
            System.out.println("Afunda o pé");
        }
        else{
            System.out.println("Não é possível acelerar pois está desligado ;)");
        }
    }
    
    public void verStatus(){
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
