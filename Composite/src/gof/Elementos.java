package gof;

import java.util.ArrayList;
import java.util.List;

public class Elementos {
	List<Componente> lista;

	public Elementos() {
		super();
		this.lista =  new ArrayList<Componente>();;
	}
	
	public void add(Componente novo) {
		this.lista.add(novo);
		
	}

	@Override
	public String toString() {
		return "Elementos [lista=" + lista + "]";
	}
	
	
	

}
