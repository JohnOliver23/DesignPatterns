package gof;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private ArrayList<Contato> contatos;
	
	public Empresa() {
		this.contatos = new ArrayList<Contato>();
	}
			
	public void add(Contato contato) {
		this.contatos.add(contato);
	}
	
	public ArrayList<Contato> get() {
		return contatos;
	}

}
