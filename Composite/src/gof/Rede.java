package gof;

import java.util.ArrayList;
import java.util.List;

public class Rede implements Componente{
	private String nome, ip;
	private List<Componente> componentes;
	
	
	public Rede(String nome, String ip) {
	
		this.nome = nome;
		this.ip = ip;
		this.componentes = new ArrayList<Componente>();
	}
	
	public void add(Componente comp) {
		componentes.add(comp);
	}

	@Override
	public String getIp() {
		return this.ip;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	public List<Componente> getComponentes() {
		return componentes;
	}

	public void setComponentes(List<Componente> componentes) {
		this.componentes = componentes;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		return String.format("R: %s - %s - %s", this.nome, this.ip, this.componentes);
	}
	

}
