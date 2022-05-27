package banco;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(int numConta, String tipo, String dono, float saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    public void estadoConta(){
        this.cabecalho("Estado da Conta");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: "+ this.saldo);
        if(this.getStatus()) {
            System.out.println("Conta Ativa");
        } else {
            System.out.println("Conta Inativa");
        }
     }
    public void cabecalho(String titulo){
        System.out.println("\n=========================");
        System.out.println("    "+titulo);
        System.out.println("---------------------------");
    }
    public void abrirConta(String t){
        this.cabecalho("Abrir Conta");
        this.setTipo(t.toUpperCase());
        this.setStatus(true);
        if (t.toUpperCase().equals("CC")){
            this.setSaldo(50);
        }else if (t.toUpperCase().equals("CP")){
            this.setSaldo(150);
        }
        System.out.println("COnta aberta com sucesso!");
        this.estadoConta();
    }
    public void fecharConta(){
        this.cabecalho("Fechar conta");
        if(this.getSaldo() > 0){
            System.out.println("Conta nº " + this.getNumConta() + " de " + this.getDono() + "\nnão  pode ser fechada, pois posssui saldo!");
            System.out.println("Saldo dísponível: " + this.getSaldo());
            System.out.println("Saque este valor e tente novamente");
        }
        else if(this.getSaldo() < 0){
            System.out.println("Conta nº " + this.getNumConta() + " de " + this.getDono() + "\nnão  pode ser fechada, pois está devedora!");
            System.out.println("Débito: " + this.getSaldo());
            System.out.println("Deposite este valor e depois tente novamente");
        }
        else{
            this.setStatus(false);
            System.out.println("Conta nº " + this.getNumConta() + " de " + this.getDono() + "\npode ser fechada com sucesso!");
        }
    }
    public void depositar(float v){
        this.cabecalho("Depositar");
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito para " + this.getDono() + " no valor de " + v + "\nefetuado com sucesso");
            System.out.println("Saldo: " + this.getSaldo());
        }
        else{
            System.out.println("Impossível deposiatar!\nConta inativa!");
        }
    }
    public void sacar (float v){
        this.cabecalho("Sacar");
        if(this.getStatus()){
            if(this.getSaldo() < v){
                System.out.println("Saldo insuficiente na conta de: " + this.getDono());
                System.out.println("Saque solicitado: " + v);
                System.out.println("Saldo: " + this.getSaldo());
            }
            else{
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque de: " + this.getDono() + " no valor de " + v + "\nrealizado com sucesso!");
                System.out.println("Saldo: " + this.getSaldo());
            }
        }
        else{
            System.out.println("Impossível sacar!\nConta inativa");
        }
    }
    public void pagarMensalidade(){
        this.cabecalho("Pagar Mensalidade");
        float v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        }
        else{
            v = 20;
        }
        if(this.getStatus()){
            if(this.getSaldo() < v){
                System.out.println(this.getDono() + " está com saldo insuficiente para pagar a mensalidade");
                System.out.println("Mensalidade: " + v);
                System.out.println("Saldo: " + this.getSaldo());
            }
            else{
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Pagamento da mensalidade de " + this.getDono() + " no valor de " + v + "\nrealizado com sucesso!");
                System.out.println("Saldo: " + this.getSaldo());
            
        }
        }
        else{
            System.out.println("Impossível pagar a mensalidade! \nConta inativa");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
