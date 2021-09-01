import java.util.Locale;
import java.util.Scanner;

public class TipoReferenciadoString {

	public static void main(String[] args) {		
		Locale.setDefault(new Locale("en", "US"));

		Scanner lerTeclado = new Scanner(System.in);
		
		int a = lerTeclado.nextInt();
		String nome = lerTeclado.next();
		double nota = lerTeclado.nextDouble();
		
		System.out.println(a);
		System.out.println(nome);
		System.out.println(nota);
	}
}
