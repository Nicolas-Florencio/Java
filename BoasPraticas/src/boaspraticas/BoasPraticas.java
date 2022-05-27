package boaspraticas;

import java.util.Scanner;

public class BoasPraticas {

    public static void main(String[] args) {
        //constantes
        final float mediaAprovacao = 7; //média necessária para ser aprovado
        Scanner teclado = new Scanner(System.in); //entrada de dados pelo teclado
        CalculaMedia calcMedia = new CalculaMedia(); //função que calcula a média do aluno
        PrimeiraLetraMaiuscula primeira = new PrimeiraLetraMaiuscula(); 
        //coloca a primeira letra da palavra em maiúsculo

        //variáveis, separadas por tipos
        float nota1 = 0; //recebe a nota1 do aluno
        float nota2 = 0; //recebe a nota2 do aluno

        int linha; //variável de controle de COLUNA para as matrizes e/ou arrays
        int coluna; //variável de controle de LINHA para as matrizes
        int maxFor = 5; //a quantidade de nomes que serão recebidos(linha)
        int maxFor2 = 1; //quantidade de campos da matriz(coluna)                   
        int opMenu = 1; //opção escolhida pelo user no menu switch case
        int loopErroNota;
        //var de controle se o usuário inserir um dado de tipo diferente nas notas
        int loopErroMenu;
        //var de controle se o usuário inserir um dado de tipo diferente no menu
        int erros = 0; //soma a quantidade de erros encontrados

        boolean found; //var de controle, utilizada caso o aluno seja encontrado/não na busca

        String nomeInformado; //recebe o nome solicitado para pesquisa
        String msg; //armazena a mensagem da pesquisa de aluno
        String aluno[][];
        aluno = new String[maxFor][2];
        /*
        armazena o nome do aluno na primeira coluna, começando do 0
        armazena se o aluno foi reprovado ou não na segunda coluna
        maxFor, como dito, se refere ao tamanho da matriz
        */
        float media[] = new float[maxFor];
        /*
        array que armazena a média do aluno, na posição respectiva ao nome com
        base na coluna
        */

        for (linha = 0; linha < maxFor; linha++) { 
            //for que delimita as linhas
            for (coluna = 0; coluna <= maxFor2; coluna++) { 
                //for que delimita as colunas

                if (coluna == maxFor2) { 
                //gambiarra ou genialidade? entenda no final do documento**
                    
                    loopErroNota = 0; //o laço de erro se inicia
                    
                    while (loopErroNota != 1) { 
                        //quando a var for 1, ele para

                        System.out.println("Insira a nota 1: ");
                        try { 
                            //tenta armazenar a variável
                            nota1 = teclado.nextFloat();
                            loopErroNota = 1; 
                            //sai do while e armazena o valor se estiver correto
                        } catch (Exception erroNota1) {
                            teclado.next(); 
                            //reiniciamos o teclado, ou seja, o deixamos vazio
                            
                            System.out.println(erroNota1); //exibe o erro encontrado
                            erros++; //soma mais um erro na variável
                            System.out.println("Insira um valor numérico.");
                            /*
                            por que um erro?, pois estamos esperando um numero
                            e se o usuário informa uma letra, precisamos contornar
                            o problema
                            */
                        }
                        //tudo citado aqui, vale para o próximo while
                    }
                    
                    loopErroNota = 0;
                    while (loopErroNota != 1) {

                        System.out.println("Insira a nota 2: ");
                        try {
                            nota2 = teclado.nextFloat();
                            loopErroNota = 1;
                        } catch (Exception erroNota2) {
                            teclado.next();
                            System.out.println(erroNota2);
                            erros++;
                            System.out.println("Insira um valor numérico.");
                        }
                    }
                    //agora, utilizando nossa função, vamos calcular a média
                    media[linha] = calcMedia.MediaAluno(nota1, nota2);

                    /* 
                    utilizando a condição ternária, vamos verificar se o aluno
                    foi reprovado ou aprovado, o que vem depois do ? é se a
                    condição for verdadeira, e o : se for falsa
                    */
                    aluno[linha][coluna] = media[linha] < mediaAprovacao
                            ? "Reprovado"
                            : "Aprovado";
                    break;
                }

                System.out.println("Insira o nome: ");
                aluno[linha][coluna] = teclado.next();
                aluno[linha][coluna] = aluno[linha][coluna].toLowerCase();
                /*Recebe o nome, armazena na variável e o coloca em minúsculo*/
            }
        }
        
        while (opMenu != 3) { 
        //iniciamos o ciclo infinito, até que a opção de encerramento seja escolhida
            loopErroMenu = 0; //lembra dela? vamos ver como ela funciona
            while (loopErroMenu != 1) { 
                //basicamente este while se comportará assim como os outros acima.
                // com exceção do while (opMenu != 3)

                //MENU DE OPÇÕES
                System.out.println("\n\nDigite o número da operação");
                System.out.println("1 - Realizar uma pesquisa.");           
                System.out.println("2 - Listar Alunos.");
                System.out.println("3 - Encerrar o programa.");    
                System.out.println("4 - Visualizar quantidade de erros encontrados.");

                try {
                    opMenu = teclado.nextInt();
                    loopErroMenu = 1;
                } catch (Exception erroMenu) {
                    teclado.next();
                    System.out.println(erroMenu);
                    erros++;
                    System.out.println("Insira um valor numérico.");
                }
            }
            switch (opMenu) {
                case 1: //procuar por alunos
                    found = false; //ainda não encontramos um aluno, logo, false
                    System.out.println("\nInforme o nome do aluno(a): ");
                    nomeInformado = teclado.next();

                    //agora vamos percorrer a matriz e buscar pelo nome solicitado
                    for (linha = 0; linha < maxFor; linha++) {
                        for (coluna = 0; coluna <= maxFor2; coluna++) {

                            if (nomeInformado.toLowerCase().equals(aluno[linha][coluna]) == true) {
                                /*
                                no if acima, comparamos as strings, 
                                que recebemos agora, e com a que já temos
                                */
                                msg = 
                                    "\nAluno(a) " + primeira.Maiuscula(aluno[linha][coluna])
                                    + "\nFoi " + aluno[linha][coluna + 1]
                                    + "\nCom média: " + media[linha];
                                
                                found = true; //encontramos um aluno? ok, true
                                System.out.println(msg); //exibir aluno
                            }
                        }
                    }

                    if (found == false) { //se aluno não existe, found false.
                        System.out.println("Aluno not found");
                    }
                break;

                case 2: //visualizar a lista de alunos
                    
                    for (linha = 0; linha < maxFor; linha++) {
                        for (coluna = 0; coluna < maxFor2; coluna++) {

                            System.out.println(
                                "\nAluno(a) " 
                                + 
                                primeira.Maiuscula(aluno[linha][coluna])
                                // lembra da nossa função para colocar a primeira
                                // letra em maiúsculo? aqui está ela
                            );
                                       
                        }
                    }
                    
                    break;
                    
                case 3: //encerrar programa
                    System.out.println("\n##################################");
                    System.out.println("        PROGRAMA ENCERRADO        ");
                    System.out.println("##################################");

                    break;

                case 4: // exibir a quantidade de erros
                    System.out.println("\n####### QUANTIDADE DE ERROS #######\n");
                    System.out.println(erros + " erros encontrados");
                    System.out.println("\n###################################");
                    
                    break;

                default: //opção inválida
                    System.out.println("\n#################################");
                    System.out.println("          OPÇÃO INVALIDA!         ");
                    System.out.println("#################################");
                    
                /*
                    **sobre o if, quando estivermos na segunda coluna, onde 
                    iremos armazenar a aprovação/reprovação, o valor da coluna 
                    será igual a variável de controle, maxFor2, ou seja, na 
                    última coluna, da linha X, iremos inserir se está aprovado ou
                    reprovado, sempre.
                    
                */
            }
        }
    }
}
