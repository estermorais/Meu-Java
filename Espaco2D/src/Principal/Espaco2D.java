package Principal;
import java.util.ArrayList;

public class Espaco2D {
	
	private ArrayList<Forma> formas;
	
	public Espaco2D(){
		this.formas = new ArrayList<>();
	}
	
	public Espaco2D( ArrayList<Forma> formas) {
		this.formas = new ArrayList<>(formas);
	}
	
	public String mostraTipoTriangulo() {
		String retorno = "";
		for(Forma forma: formas) {
			if(forma instanceof Triangulo) {
				retorno += " " +((Triangulo)forma).tipoTriangulo();
			}
		}
		return retorno;
	}
	
	public Forma criaForma(Ponto2D[] pontos) {
		Forma figura = Forma.geraForma(pontos);
		return figura;
	}
	
	public boolean adicionaFormas(Forma forma) {
		
		if(forma instanceof Forma) {
			formas.add(forma);
			return true;
		}
		
		else
			return false;
	}
	
	public double calculaAreaTotal() {
		
		double area = 0;
		
		for(Forma figura : this.formas) {
			area += figura.calculaArea(); 
		}
		
		return area;
	}
	
	public double calculaPerimetroTotal() {
		
		double perimetro = 0;
		
		for(Forma figura : this.formas) {
			perimetro+= figura.calculaPerimetro();
		}
				
		return perimetro;
	}

}
