package calculadora;
    public class Calculadora {
        public static void main(String[] args) {
            int num1_i = 7;
            int num2_i = 8;
            float num1_f = 7;
            float num2_f = 8;
            
            Calcula calcula = new Calcula();
            
            System.out.println(calcula.Media(num1_i, num2_i));
            System.out.println(calcula.Media(num1_f, num2_f));
}
}