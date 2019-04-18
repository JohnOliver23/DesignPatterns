import java.util.ArrayList;
import java.util.List;

public class SuperHeroi implements Cloneable {
	private String nome;
	private List<String> poderes;
	public SuperHeroi(String nome) {
		super();
		this.nome = nome;
		this.poderes = new ArrayList<String>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<String> getPoderes() {
		return poderes;
	}
	
	public void addPoderes(String poder) {
		poderes.add(poder);
	}
	@Override
	public String toString() {
		return "SuperHeroi [nome=" + nome + ", poderes=" + poderes + "]";
	}
	@Override
	protected SuperHeroi clone()  {
		try {
			SuperHeroi clone = (SuperHeroi)super.clone();
			clone.poderes = new ArrayList<String>(this.poderes);
			return clone;
			
		}catch(CloneNotSupportedException e) {
			return null;
		}
	}

}
