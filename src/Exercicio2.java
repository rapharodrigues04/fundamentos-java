import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		Scanner lerTeclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero real do teclado: ");
		double numero1 = lerTeclado.nextDouble();
		
		System.out.print("Digite o segundo n�mero real do teclado: ");
		double numero2 = lerTeclado.nextDouble();
		
		double media = (numero1 + numero2) / 2;
		
		System.out.println("A sua m�dia �: " + media);

	}
}
