package calculadora;
public class Calcula {
    public int Media(int x, int y){
        int r;
            System.out.println("Cálculo de Média de Inteiros");
            r = (x + y)/2;
           return r;
        }
    
    public float Media(float x, float y){
        float r;
            System.out.println("Cálculo de Média de floats");
            r = (x + y)/2;
           return r;
        }
            /*
            Incluir um método com cálculo de médias ponderadas, usando polimorfismo
            - Nome do método: Media
            - Tipo float
            - Recebe duas notas (float) e dois pesos do tipo inteiro
            - media = (n1*p1 + n2*p2) / (p1+p2)
            */
}