package Principal;
import java.util.HashSet;

public class Interpretadora {

	private HashSet<String> palavras;
	
	
	public Interpretadora() {
		palavras = new HashSet<>();
		
	}
	
	public HashSet<String> separarPalavras (String frase) {
		
		String[] palavras = frase.split(" ");
		for(String word: palavras) {
			this.palavras.add(word);
		}
		return this.palavras;
	}

}
