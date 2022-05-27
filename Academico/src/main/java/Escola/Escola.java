package escola;

public class Escola {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Zelador","Noite",1045,"João Carlos",987654321,"carlao@jao.com",22);
        
        System.out.println("Funcionário");
        System.out.println(f.mostrar_funcionario());
        f.aniversario();
        System.out.println("\nAniversário funcionário");
        System.out.println(f.mostrar_funcionario());
        
        Professor p = new Professor("Ed. Física, História","História",1.75F,"Maurício",999779988,"mauricin.com",31);
        
        System.out.println("\nProfessor");
        System.out.println(p.mostrar_professor());
        p.aniversario();
        System.out.println("Salário: " + p.Salario());
        System.out.println("\nAniversario professor");
        //após aniversário
        System.out.println(p.mostrar_professor());
        System.out.println("Salário: " + p.Salario());
        
        Aluno a = new Aluno("Técnico em informática para internet","2º Módulo","Nicolas Florencio Alves",997788567,"nikitoomega@gmail.com",17);
        
        System.out.println("\nAluno");
        System.out.println(a.mostrar_aluno());
        a.aniversario();
        System.out.println("\nAluno depois Aniversário");
        System.out.println(a.mostrar_aluno());
  
    }
    
}
