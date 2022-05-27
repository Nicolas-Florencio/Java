package caixabranca;

import java.util.Scanner;

public class Caixabranca{

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int quantidade = 0;              
        final int pessoas = 19; //Limite de pessoas que podem entrar
        String nome[];             
        nome = new String[pessoas];  
        int opcao;                 
        float temperatura;            
         
        while(quantidade < pessoas){
                System.out.println("Nome: ");
                nome[quantidade] = teclado.next();
                
                System.out.println("\nApresentou carteira de vacinação?"
                        + "\n1 - Sim"
                        + "\n2 - Não");
                opcao = teclado.nextInt();
             
                    if(opcao == 1){
                        System.out.println("\nQual a temperatura indicada?");
                        temperatura = teclado.nextFloat();
             
                            if(temperatura <= 37.0){
                                System.out.println("\nEntrada autorizada\n");
                                quantidade = quantidade + 1;
                            }
                        
                            else if (temperatura > 37.0){
                                System.out.println("\nEntrada Negada."
                                        + "\nTemperatura acima do aceitável\n");
                            }
                    }
                    
                    else if(opcao == 2){
                        System.out.println("\nCarteira não apresentada, "
                                + nome[quantidade] +
                                " não poderá entrar, entrada negada\n");
                    }  
        }  
        System.out.println("Limite de pessoas atingido, não será mais aceito novas participações");
    }    
}