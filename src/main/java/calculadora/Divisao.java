package calculadora;

public class Divisao {
	
	int a,b;
	int resultado;
	
	public int Divisao() {
		
		resultado = (a-b)/2;
		
		if(resultado < 0) {
		System.out.print("não e possivel dividir por 0"+resultado);			
		}else {
		System.out.print("O resultado da divsao e:"+resultado);				
		}
		return resultado;
	}

}
