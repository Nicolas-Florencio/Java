package escola;

public class Aluno extends Pessoa{
    private String curso;
    private String serie;

    public Aluno(String curso, String serie, String nome, int telefone, String email, int Idade) {
        super(nome, telefone, email, Idade);
        this.curso = curso;
        this.serie = serie;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
    
    public String mostrar_aluno(){
        String msg;
        
        msg = this.mostrar_pessoa();
        msg += "\nCurso: " + this.getCurso();
        msg += "\nSérie: " + this.getSerie();
        
        return msg;
    }
}
