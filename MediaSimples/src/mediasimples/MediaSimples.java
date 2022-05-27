package mediasimples;

import java.util.Scanner;

public class MediaSimples {
    public static void main(String[] args) {
        float nota1 = 0;
        float nota2 = 0;
        
        float media = 0;
        
        final float mediaReprovado = 3; //abaixo de 3, o aluno serÃ¡ reprovado
        final float mediaAprovado = 6; //acima de 6 o aluno serÃ¡ aprovado
        
        Scanner teclado = new Scanner(System.in);
        
        int loopErroNota = 0;
        
        
        
        while (loopErroNota != 1) { 
                
                        try { 
                            //tenta armazenar a variÃ¡vel
                            System.out.println("Insira a nota 1: ");
                            nota1 = teclado.nextFloat();
                            
                            System.out.println("Insira a nota 2: ");
                            nota2 = teclado.nextFloat();
                            
                            if(nota1 >= 0 && nota1 <= 10 && nota2 >=0 && nota2 <=10) {
                                media = (nota1 + nota2) /2;
                                
                                if(media >= mediaReprovado) {
                                    System.out.println("Aluno reprovado");
                                }
                                else if (media >= mediaAprovado) {
                                    System.out.println("Aluno de recuperaÃ§Ã£o");
                                }
                                else {
                                    System.out.println("Aluno aprovado");
                                }
                                System.out.println("Dirija-se Ã  secretaria");
                                loopErroNota = 1; 
                                //sai do while e armazena o valor se estiver correto
                            }
                            else {
                                throw new Exception 
                                ("A nota deve ser numÃ©rica \n"
                               + "E estar entre 0 e 10");
                            }
                        } 
                        catch (Exception InputMismatchException) {    
                            
                            System.out.println("A nota deve ser numÃ©rica \n"
                               + "E estar entre 0 e 10");
                            teclado.next();
                        }
                        
        }
        
    }
    
}
