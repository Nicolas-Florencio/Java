
package classeaula;


public class ClasseAula {

    public static void main(String[] args) {
        
        //CARRO 1
        
        Carrin car1 = new Carrin();
        car1.marca = "Chevrolet";
        car1.modelo = "Monza";
        car1.ano = 1986;
        car1.cor = "Marrom";
        car1.valor = 1800;
        car1.verStatus(); //vejo as informações do metodo
        car1.ligar();     //digo que está ligado
        car1.acelerar();  //digo se pode ou nao acelerar
        
        //CARRO 2
        
        Carrin car2 = new Carrin();
        
        car2.marca = "Volkswagen";
        car2.modelo = "Gol";
        car2.ano = 2002;
        car2.cor = "Branco";
        car2.valor = 5000;
        car2.verStatus();
        car2.desligar();
        car2.acelerar();
    }
    
}
