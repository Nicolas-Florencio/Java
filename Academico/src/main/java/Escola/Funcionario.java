package escola;

public class Funcionario extends Pessoa{
    private String setor;
    private String periodo;
    private float salario;

    public Funcionario(String setor, String periodo, float salario, String nome, int telefone, String email, int Idade) {
        super(nome, telefone, email, Idade);
        this.setor = setor;
        this.periodo = periodo;
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public String mostrar_funcionario(){
        String msg;
        
        msg = this.mostrar_pessoa();
        msg += "\nSetor: " + this.getSetor();
        msg += "\nPeríodo: " + this.getPeriodo();
        msg += "\nSalário: " + this.getSalario();
        
        return msg;
    }
}
