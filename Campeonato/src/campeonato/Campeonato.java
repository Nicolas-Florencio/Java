package campeonato;

public class Campeonato {
    public static void main(String [] args){

        // Times
        Time time[] =  new Time[9];

        time[0] = new Time(0, "Vasco", "Minas Gerais", 1870, "A", true);

        time[1] = new Time(1, "Flamengo", "Rio de Janeiro", 1850, "C", true);

        time[2] = new Time(2, "Barcelona", "São Paulo", 1932, "A", true);

        time[3] = new Time(3, "Valencia", "Rio de Janeiro", 1840, "A", false);

        time[4] = new Time(4, "Manchester United", "Rio de Janeiro", 1998, "C", false);

        time[5] = new Time(5, "São Paulo", "Rio de Janeiro", 1870, "B", true);

        time[6] = new Time(6, "Palmeiras", "Rio de Janeiro", 1910, "A", false);

        time[7] = new Time(7, "Noroeste", "Ponta-Grossa", 1912, "A", false);

        time[8] = new Time(8, "NBA", "Marília", 1700, "B", true);

        for(int i = 0; i <= 8; i++){
            time[i].apresentar();
        }

        Partida partida[] = new Partida[5];

        partida[0] = new Partida(0, "20/10/2010", time[0], time[2]);
        time[0].apresentar();
        time[2].apresentar();
        
        partida[0].defineResultado();
        partida[0].exibirResultado();

        
        System.out.println("\nPrimeiro jogo\n");
        partida[1] = new Partida(0, "20/10/2010", time[1], time[6]);
        time[1].apresentar();
        time[6].apresentar();
        
        partida[1].defineResultado();
        partida[1].exibirResultado();
        System.out.println("\n----------------------\n");

        // Partida 2 - válida
        System.out.println("\nSegundo jogo\n");
        partida[2] = new Partida(0, "21/10/2010", time[3], time[5]);
        time[3].apresentar();
        time[5].apresentar();
        
        partida[2].defineResultado();
        partida[2].exibirResultado();
        System.out.println("\n----------------------\n");

        // Partida 3 - válida
        System.out.println("\nTerceiro jogo\n");
        partida[3] = new Partida(0, "21/10/2010", time[4], time[8]);
        time[4].apresentar();
        time[8].apresentar();
        
        partida[3].defineResultado();
        partida[3].exibirResultado();
        System.out.println("\n----------------------\n");

        // Partida 4 - inválida
        System.out.println("\nQuarto jogo\n");
        partida[4] = new Partida(0, "23/12/2015", time[1], time[2]);
        time[1].apresentar();
        time[2].apresentar();
        
        partida[4].defineResultado();
        partida[4].exibirResultado();
        System.out.println("\n----------------------\n");
    }
}