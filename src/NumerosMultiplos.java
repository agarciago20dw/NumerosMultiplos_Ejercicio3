
public class NumerosMultiplos {
	
	int n;
	int m;
	
	NumerosMultiplos (int n, int m) {
		this.n = n;
		this.m = m;
	}
	
	public String nNumerosDeN () {
		String resultado = "";
		
		for (int i = 1; i <= m; i++) {
			if ((i % n) == 0) {
				resultado = resultado + i + " ";
			}
		}
		return resultado;
	}
	
	public void mostrar () {
		System.out.println("n: " + n);
		System.out.println("m: " + m);
	}
	
}
