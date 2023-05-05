package Principal;
import java.util.HashMap;

public class Teste {

	public static void main(String[] args) {

		Cinema cinema = new Cinema();
			
		cinema.adicionaSala(new Sala(1,100,new HashMap<>()));
		cinema.adicionaSala(new Sala(2,100,new HashMap<>()));
		cinema.adicionaSala(new Sala(3,100,new HashMap<>()));
		
		Sala sala = new Sala();
		
		sala.adicionaFilme(new Filme("Para sempre sao seu lado", "Drama", 2009, "Lasse Hallström", 1));
		
		System.out.println(sala.consultaFilme("Para sempre ao seu lado"));
		
		
		
		
	}

}
