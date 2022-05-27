package campeonato;

public class Time {
    private int codigo;
    private String nome;
    private String cidade;
    private int anoFundacao;
    private String serie;
    private boolean estadioProprio;
    private int golsFeitos;
    private int golsSofridos;
    private int vitorias;
    private int empates;
    private int derrotas;

    public Time(int cod, String nome, String cidade, int anoFundacao, String serie, boolean estadioProprio){
        this.setGolsFeitos(0);
        this.setGolsSofridos(0);
        this.setVitorias(0);
        this.setEmpates(0);
        this.setDerrotas(0);
        setCodigo(cod);
        setNome(nome);
        setCidade(cidade);
        setAnoDeFundacao(anoFundacao);
        setSerie(serie);
        setEstadioProprio(estadioProprio);
    }

    public void registrarResultado(int golsFeitosPartida, int golsSofridosPartida){
        golsFeitos = golsFeitos + golsFeitosPartida;
        golsSofridos = golsSofridos + golsSofridosPartida;
        
        System.out.println(this.getNome() + 
                "\nMarcou: " + this.getGolsFeitos() + " Gols\n"
                + "Sofreu: " + this.getGolsSofridos() + " Gols");
        
        if(this.golsFeitos > this.golsSofridos){
            
            this.vitorias = this.vitorias + 1;
            
            System.out.println(this.getNome() + " possuí " + this.getVitorias() + " vitórias");
        }
        else if(this.golsFeitos < this.golsSofridos){
            
            this.derrotas = this.derrotas + 1;
            
            System.out.println(this.getNome() + " possuí " + this.getDerrotas() + " derrotas");
        }
        else{
            
            this.empates = this.empates + 1;
            
            System.out.println(this.getNome() + " possuí " + this.getEmpates() + " empates");
        }
    }

    public void apresentar(){
        System.out.println("\nTime" +
        "\nTime: " + this.getNome() +
        "\nVitórias: " + this.getVitorias() +
        "\nDerrotas: " + this.getDerrotas() +
        "\nEmpates: " + this.getEmpates() + 
        "\n----------------------");
    }

    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCidade(){
        return cidade;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public int getAnoDeFundacao(){
        return anoFundacao;
    }
    public void setAnoDeFundacao(int anoDeFundacao){
        this.anoFundacao = anoDeFundacao;
    }

    public String getSerie(){
        return serie;
    }
    public void setSerie(String serie){
        this.serie = serie;
    }

    public boolean getEstadioProprio(){
        return estadioProprio;
    }
    public void setEstadioProprio(boolean estadioProprio){
        this.estadioProprio = estadioProprio;
    }

    public int getGolsFeitos(){
        return golsFeitos;
    }
    public void setGolsFeitos(int golsFeitos){
        this.golsFeitos = golsFeitos;
    }

    public int getGolsSofridos(){
        return golsSofridos;
    }
    public void setGolsSofridos(int golsSofridos){
        this.golsSofridos = golsSofridos;
    }

    public int getVitorias(){
        return vitorias;
    }
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    public int getEmpates(){
        return empates;
    }
    public void setEmpates(int empates){
        this.empates = empates;
    }

    public int getDerrotas(){
        return derrotas;
    }
    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }
}