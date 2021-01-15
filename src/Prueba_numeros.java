
public class Prueba_numeros {
	public static void main(String[] args) {
		
		System.out.println("Escribe un número");
		int num1 = Console.readInt();
		
		System.out.println("Escribe otro número");
		int num2 = Console.readInt();
		
		NumerosMultiplos n1 = new NumerosMultiplos (num1, num2);
		
		n1.mostrar();
		System.out.println(n1.nNumerosDeN());
		
	}
}
