
package celularmetodoespecial;

public class CelularMetodoEspecial {

    public static void main(String[] args) {
        
        //celular1
        ClasseCelularMetodoEspecial cel01 = new ClasseCelularMetodoEspecial(
                "Samsung",    //MARCA
                "Galaxy S7",  //MODELO
                2016,         //ANO
                "Dourado",    //COR
                123456,       //IMEI
                true,         //CHIP
                9999999,      //NUM.CELULAR
                false,         //LIGADO
                true,         //CAMERA
                1800          //PREÇO
        );
        
        
        ClasseCelularMetodoEspecial cel02 = new ClasseCelularMetodoEspecial("Xiaomi",
                "Redmi note 7", //MARCA
                2019,           //ANO
                "Vermelho",     //COR
                654321,         //IMEI
                true,           //CHIP
                888888888,      //NUM.CELULAR
                true,           //LIGADO
                false,          //CAMERA
                1100            //PREÇO
        );
        
        cel01.status();
        cel02.status();
    }  
}
