
package celular;

public class ClasseCelular {
    
    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    public int imei;
    private boolean chip;
    protected int numeroChip;
    public boolean ligado;
    public boolean camera;
    public float valor;
    
    
    //celular ligado
    public void ligar(){ 
        this.ligado = true;
    }
    //celular desligado
    public void desligar(){ 
        this.ligado = false;
    }
    // com chip
    public void comChip(){
        this.chip = true;
    }
    //sem chip
    public void semChip(){
        this.chip = false;
    }
    public void comCamera(){
        this.camera = true;
    }
    public void semCamera(){
        this.camera = false;
    }
    
    
    
    
    
    
    //posso realizar chamadas
    public void ligacao(){ 
        
        if(this.chip == true && this.ligado == true){
            System.out.println("Posso fazer ligação");
        }
        
        else if(this.chip == false && this.ligado == true){
            System.out.println("Não posso fazer ligação, estou sem chip");
        }
        else{
            System.out.println("Não posso fazer ligação, estou desligado");
        }
    }
    
    public void sms(){
        if(this.chip == true && this.ligado == true){
            System.out.println("Posso enviar SMS");
        }
        
        else if(this.chip == false && this.ligado == true){
            System.out.println("Não posso enviar SMS, estou sem chip");
        }
        else{
            System.out.println("Não posso enviar SMS, estou desligado");
        }
    }
    
    public void tirarFoto(){
        if(this.camera == true && this.ligado == true){
            System.out.println("Posso tirar fotos");
        }
        
        else if(this.camera == false && this.ligado == true){
            System.out.println("Não posso tirar fotos, não possuo câmera");
        }
        else{
            System.out.println("Não posso tirar fotos, estou desligado");
        }
    }
    public void status(){
        System.out.println("\n\nA marca do celular é: " + this.marca);
        System.out.println("O modelo do celular é: " + this.modelo);
        System.out.println("O ano do celular é: " + this.ano);
        System.out.println("A cor do celular é: " + this.cor);
        System.out.println("O valor do celular é: " + this.valor);
        System.out.println("O IMEI do celular é: "+ this.imei);
        if(this.chip == true){
            System.out.println("Possi CHIP");
        }
        else{
            System.out.println("Não possuo CHIP");
        }
        
        System.out.println("O número do celular é: "+ this.numeroChip);
        if(this.ligado == true){
            System.out.println("O celular está ligado");
        }
        else{
            System.out.println("O celular está desligado");
        }
        
    }
}
