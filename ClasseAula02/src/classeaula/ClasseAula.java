
package classeaula;


public class ClasseAula {

    public static void main(String[] args) {
        
        //CARRO 1
        
        Carrin car1 = new Carrin();
        
        car1.marca = "Chevrolet";
        car1.modelo = "Monza";
        car1.cor = "Cinza";
        car1.ano = 2000;
        //car1.valor = 1800;
        //car1.ligado = true;   
        car1.ligar();
        car1.verStatus(); //vejo as informações do metodo
        car1.acelerar();
        
    }
    
}
