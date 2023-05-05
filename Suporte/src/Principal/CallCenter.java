package Principal;
import java.util.Scanner;

public class CallCenter {

	public static void main(String[] args) {

		SuporteTecnico sp = new SuporteTecnico();
		Interpretadora in = new Interpretadora();
		
		Scanner input = new Scanner(System.in);
		String problema = input.nextLine();
		
		System.out.println(sp.buscarSolucao(in.separarPalavras(problema)));

		input.close();
	}

}
