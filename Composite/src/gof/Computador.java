package gof;

public class Computador implements Componente {
	private String nome, ip;
	
	

	public Computador(String nome, String ip) {

		this.nome = nome;
		this.ip = ip;
	}

	@Override
	public String getIp() {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return "Computador [nome=" + nome + ", ip=" + ip + "]";
	}
	

}
