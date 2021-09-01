import java.util.Locale;
import java.util.Scanner;

public class Exercicios1 {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		Scanner lerTeclado = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = lerTeclado.next();
		
		System.out.print("Olá, " + nome);

	}

}
