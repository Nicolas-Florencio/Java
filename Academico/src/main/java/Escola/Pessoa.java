package escola;

public class Pessoa {
    private String nome;
    private int telefone;
    private String email;
    private int Idade;

    public Pessoa(String nome, int telefone, String email, int Idade) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.Idade = Idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }
    
    public void aniversario(){
        this.Idade++;
    }
    
    public String mostrar_pessoa(){
        String msg;
        
        msg = "Nome: " + this.getNome();
        msg += "\nTelefone: " + this.getTelefone();
        msg += "\nIdade: " + this.getIdade();
        msg += "\nE-mail: " + this.getEmail();
        
        return msg;
    }
}
