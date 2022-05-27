package campeonato;

import java.util.Random;

public class Partida {
    private int codigo;
    private String data;
    private Time mandante;
    private Time visitante;
    private int golsMandante;
    private int golsVisitante;
    private boolean confirmada;
    private boolean realizada;

    public Partida(int cod, String data, Time mandante, Time visitante){
        setCodigo(cod);
        setData(data);
        setMandante(mandante);
        setVisitante(visitante);

        if(mandante.getSerie() == visitante.getSerie()){
            setConfirmada(true);
            setGolsMandante(0);
            setGolsVisitante(0);
            setRealizada(false);
        }
        else{
            setConfirmada(false);
        }
    }

    Random gols = new Random();

            int gM = gols.nextInt(7);
            int gV = gols.nextInt(7);

    public void defineResultado(){
        if(getConfirmada() == true && getRealizada() == false){
            
            mandante.registrarResultado(gM, gV);
            visitante.registrarResultado(gV, gM);

            setRealizada(true);
        }
        else{
            System.out.println("Não é possível definir resultado");
        }
    }

    public void exibirResultado(){
        if(getRealizada() == false){
            System.out.println("\nPartida inválida");
        }
        else{
            System.out.println("\nPlacar");
            System.out.println(mandante.getNome() + " " + gM + " x " + gV + " " + visitante.getNome());
            
        }
    }

    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }

    public Time getMandante(){
        return mandante;
    }
    public void setMandante(Time mandante){
        this.mandante = mandante;
    }

    public Time getVisitante(){
        return visitante;
    }
    public void setVisitante(Time visitante){
        this.visitante = visitante;
    }

    public int getGolsMandante(){
        return golsMandante;
    }
    public void setGolsMandante(int golsMandante){
        this.golsMandante = golsMandante;
    }

    public int getGolsVisitante(){
        return golsVisitante;
    }
    public void setGolsVisitante(int golsVisitante){
        this.golsVisitante = golsVisitante;
    }

    public boolean getConfirmada(){
        return confirmada;
    }
    public void setConfirmada(boolean confirmada){
        this.confirmada = confirmada;
    }

    public boolean getRealizada(){
        return realizada;
    }
    public void setRealizada(boolean realizada){
        this.realizada = realizada;
    }
}