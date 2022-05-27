//Dupla: Marllon Silva Araujo Coelho - Rm: 19019 e Nicolas Florencio Alves - Rm:
package javaturmab;

public class Serie {
    private String nome;
    private String disponivel;
    private String dataLancamento;
    private int classificacao;
    private String genero;
    private String criacao;
    private int relevancia;
    private String plataforma;
    private int quantEp;
    private int duracaoMedEp;
    private int temporada;
    
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public String getDisponivel(){
        return this.disponivel;
    }
    public void setDisponivel(String d){
        this.disponivel = d;
    }
    public String getdataLancamento(){
        return this.dataLancamento;
    } 
    public void setdataLancamento(String dl){
        this.dataLancamento = dl;
    }
    public int getClassificacao(){
        return this.classificacao;
    }
    public void setClassificacao(int c){
        this.classificacao = c;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String g){
        this.genero = g;
    }
    public String getCriacao(){
        return this.criacao;
    }
    public void setCriacao(String cr){
        this.criacao = cr;
    }
    public int getRelevancia(){
        return this.relevancia;
    }
    public void setRelevancia(int r){
        this.relevancia = r;
    }
    public String getPlataforma(){
        return this.plataforma;
    }
    public void setPlataforma(String p){
        this.plataforma = p;
    }
    public int getQuantEp(){
        return this.quantEp;
    }
    public void setQuantEp(int qp){
        this.quantEp = qp;
    }
    public float getduracaoMedEp(){
        return this.duracaoMedEp;
    }
    public void setduracaoMedEp(int dme){
        this.duracaoMedEp = dme;
    }
    public int getTemporada(){
        return this.temporada;
    }
    public void setTemporada(int t){
        this.temporada = t;
    }
    public void status(){
        System.out.println("DADOS DA SÉRIE:\n");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Disponivel: "+this.getDisponivel());
        System.out.println("Data de Lançamento: "+this.getdataLancamento());
        System.out.println("Classificação: "+this.getClassificacao());
        System.out.println("Gênero: "+this.getGenero());
        System.out.println("Criaçao: "+this.getCriacao());
        System.out.println("Relevancia: "+this.getRelevancia() +"%");
        System.out.println("Plataforma: "+this.getPlataforma());
        System.out.println("Quantidade de Episódios: "+this.getQuantEp());
        System.out.println("Duração média dos Episódios: "+this.getduracaoMedEp() +" min");
        System.out.println("Quantidade de Temporadas: "+this.getTemporada()+"\n\n");
    }
}