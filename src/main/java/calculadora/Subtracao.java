package calculadora;

public class Subtracao {
	
	int a,b;
	int resultado;
	
	public int subtracao(int a,int b) {
		
		resultado = (a-b);
		
		if(a <0) {
		System.out.println("não e possivel subtrair por 0" +resultado );	
		}else {
		System.out.print("o Resultado desta subtracao e:"+resultado);	
		}
			
		return resultado;
	}

}
