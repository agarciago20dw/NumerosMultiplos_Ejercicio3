
public class Prueba_numeros {
	public static void main(String[] args) {
		
		System.out.println("Escribe un n�mero");
		int num1 = Console.readInt();
		
		System.out.println("Escribe otro n�mero");
		int num2 = Console.readInt();
		
		NumerosMultiplos n1 = new NumerosMultiplos (num1, num2);
		
		n1.mostrar();
		System.out.println(n1.nNumerosDeN());
		
	}
}
