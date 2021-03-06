
package celularmetodoespecial;

public class ClasseCelularMetodoEspecial {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int imei;
    private boolean chip;
    protected int numeroChip;
    private boolean ligado;
    private boolean camera;
    private float valor;

    public ClasseCelularMetodoEspecial(String marca, String modelo, int ano, String cor, int imei, boolean chip, int numeroChip, boolean ligado, boolean camera, float valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.imei = imei;
        this.chip = chip;
        this.numeroChip = numeroChip;
        this.ligado = ligado;
        this.valor = valor;
        this.camera = camera;
    }

    //MARCA
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    //MODELO
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //ANO
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    //COR
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    //IMEI
    public int getImei() {
        return imei;
    }
    public void setImei(int imei) {
        this.imei = imei;
    }

    //CHIP
    public boolean isChip() {
        return chip;
    }
    public void setChip(boolean chip) {
        this.chip = chip;
    }

    //NUMBERCHIP
    public int getNumeroChip() {
        return numeroChip;
    }
    public void setNumeroChip(int numeroChip) {
        this.numeroChip = numeroChip;
    }

    //LIGADO
    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    //CAMERA
    public boolean isCamera() {
        return camera;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }

    //VALOR
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    
    
    public void status(){
        System.out.println("\n\nA marca do celular ??: " + this.marca);
        System.out.println("O modelo do celular ??: " + this.modelo);
        System.out.println("O ano do celular ??: " + this.ano);
        System.out.println("A cor do celular ??: " + this.cor);
        System.out.println("O valor do celular ??: " + this.valor);
        System.out.println("O IMEI do celular ??: "+ this.imei);
        System.out.println("O n??mero do celular ??: "+ this.numeroChip);
        //TEM CHIP?
        if(this.chip == true){
            System.out.println("Possi CHIP");
        }
        else{
            System.out.println("N??o possuo CHIP");
        }
        
        //EST?? LIGADO/DESLIGADO?????
        if(this.ligado == true){
            System.out.println("O celular est?? ligado");
        }
        else{
            System.out.println("O celular est?? desligado");
        }
        
        //POSSO FAZER LIGA????O OU N??O?
        if(this.chip == true && this.ligado == true){
            System.out.println("Posso fazer liga????o");
        }
        
        else if(this.chip == false && this.ligado == true){
            System.out.println("N??o posso fazer liga????o, estou sem chip");
        }
        else{
            System.out.println("N??o posso fazer liga????o, estou desligado");
        }
        
        //POSSO ENVIAR SMS???
        
        if(this.chip == true && this.ligado == true){
            System.out.println("Posso enviar SMS");
        }
        
        else if(this.chip == false && this.ligado == true){
            System.out.println("N??o posso enviar SMS, estou sem chip");
        }
        else{
            System.out.println("N??o posso enviar SMS, estou desligado");
        }
        
        //POSSO TIRAR FOTOS??????
        if(this.camera == true){
            System.out.println("Possuo c??mera");
        }
        else if(this.camera == false){
            System.out.println("N??o possuo c??mera");
        }
        if(this.camera == true && this.ligado == true){
            System.out.println("Posso tirar fotos");
        }
        
        else if(this.camera == false && this.ligado == true){
            System.out.println("N??o posso tirar fotos, n??o possuo c??mera");
        }
        else{
            System.out.println("N??o posso tirar fotos, estou desligado");
        }
    }
}
