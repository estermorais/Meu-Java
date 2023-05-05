package Principal;
import java.util.ArrayList;

public class Cinema {
	
	private ArrayList<Sala>salas;
	
	public Cinema(){
		this.salas = new ArrayList<>();
	}
	
	public Cinema( ArrayList<Sala> salas) {
		this.salas = salas;
	}
		
	public ArrayList<Sala> getSalas() {
		return salas;
	}

	public void setSalas(ArrayList<Sala> salas) {
		this.salas = salas;
	}	

	public void adicionaSala(Sala sala) {
		
		salas.add(sala);		
	}
	
	public void comprarBilhete(String assento, int quantidade, String tipo) {
		
		
		
	}	

	public void valorCompra() {
		
	}
	
}
