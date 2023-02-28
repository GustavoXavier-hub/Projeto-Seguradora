package calculadora;

public class Multiplicacao {
	int a;
	int b;
	
	int resultado;
	
	public int Multiplicacao( int a, int b){
		if( a>b) {
		 resultado = (a*b);	
		}else {
	     resultado =(b*a);		
		}
		return resultado;
	}
}
