
package celular;


public class Celular {

    public static void main(String[] args) {
        
        //celular 1
        
        ClasseCelular cel1 = new ClasseCelular();
        
        cel1.marca = "Samsung";
        cel1.modelo = "Galaxy S7";
        cel1.ano = 2016;
        cel1.cor = "Dourado";
        cel1.imei = 123456;
        cel1.comChip();
        cel1.numeroChip = 999999999;
        cel1.ligar();
        cel1.comCamera();
        cel1.valor = 1400;
        cel1.status();
        cel1.ligacao();
        cel1.sms();
        cel1.tirarFoto();
        
        //celular 2
        
        ClasseCelular cel2 = new ClasseCelular();
        
        cel2.marca = "Xiaomi";
        cel2.modelo = "Redmi Note 7";
        cel2.ano = 2019;
        cel2.cor = "Vermelho";
        cel2.imei = 123456;
        cel2.semChip();
        // não tem num de telefone pq n tem chip
        cel2.desligar();
        cel2.semCamera();
        cel2.valor = 900;
        cel2.status();
        cel2.ligacao();
        cel2.sms();
        cel2.tirarFoto();
        
        ClasseCelular cel3 = new ClasseCelular();
        
        cel3.marca = "Xiaomi";
        cel3.modelo = "Redmi Note 8";
        cel3.ano = 2019;
        cel3.cor = "Pearly white";
        cel3.imei = 123456;
        cel3.semChip();
        cel3.numeroChip = 77777777;
        cel3.ligar();
        cel3.comCamera();
        cel3.valor = 900;
        cel3.status();
        cel3.ligacao();
        cel3.sms();
        cel3.tirarFoto();
        
        ClasseCelular cel4 = new ClasseCelular();
        
        cel4.marca = "Samsung";
        cel4.modelo = "Galaxy J6";
        cel4.ano = 2019;
        cel4.cor = "Cinza";
        cel4.imei = 123456;
        cel4.semChip();
        cel4.numeroChip = 66666666;
        cel4.ligar();
        cel4.semCamera();
        cel4.valor = 900;
        cel4.status();
        cel4.ligacao();
        cel4.sms();
        cel4.tirarFoto();
    }
    
}
