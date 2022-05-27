package escola;

public class Professor extends Pessoa{
    private String formacao;
    private String disciplina;
    private float valorHoraAula;

    public Professor(String formacao, String disciplina, float valorHorauAla, String nome, int telefone, String email, int Idade) {
        super(nome, telefone, email, Idade);
        this.formacao = formacao;
        this.disciplina = disciplina;
        this.valorHoraAula = valorHorauAla;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public float getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(float valorHoraAla) {
        this.valorHoraAula = valorHoraAla;
    }
    
    public float Salario(){
        float sal;
        
        sal = this.getValorHoraAula() * 160; // 44 horas semanais * 4 = 176 horas | 176 horas * 15,50 a hora.
        
        return sal;
    }
    
    public String mostrar_professor(){
        String msg;
        
        msg = this.mostrar_pessoa();
        msg += "\nFormação: " + this.getFormacao();
        msg += "\nDisciplina atuante: " + this.getDisciplina();
        msg += "\nValor da Hora por Aula: " + this.getValorHoraAula();
        
        return msg;
    }
}
