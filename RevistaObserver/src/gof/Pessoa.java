package gof;

public class Pessoa implements PessoaObserver {
	private String nome;

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
