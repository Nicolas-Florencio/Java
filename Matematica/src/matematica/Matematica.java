package matematica;

public class Matematica {
	public boolean ehPar(int numero){
		if(numero % 2 == 0){
			return true;
		} else {
			return false;
		}
	}

	public double Media(double num1, double num2){
		return (num1 + num2) / 2;
	}
	
	public int Fatorial(int num){
		int atual = num;
		while(num > 1){
			atual = atual * (num - 1);
			num--;
		}
		return atual;
	}
}
