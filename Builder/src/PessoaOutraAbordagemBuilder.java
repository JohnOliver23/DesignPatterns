
public class PessoaOutraAbordagemBuilder implements OutroBuilder<PessoaOutraAbordagemBuilder, Pessoa> {
	private String nome, cpf, rg, email, telefone;
	private int grau, idade;
	
	

	public PessoaOutraAbordagemBuilder(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
	}


	public PessoaOutraAbordagemBuilder cpf(String cpf) {
		this.cpf = cpf;
		return this;
	}

	public PessoaOutraAbordagemBuilder rg(String rg) {
		this.rg = rg;
		return this;
	}

	public PessoaOutraAbordagemBuilder email(String email) {
		this.email = email;
		return this;
	}

	public PessoaOutraAbordagemBuilder telefone(String telefone) {
		this.telefone = telefone;
		return this;
	}

	public PessoaOutraAbordagemBuilder grau(int grau) {
		this.grau = grau;
		return this;
	}
	public PessoaOutraAbordagemBuilder idade(int idade) {
		this.idade = idade;
		return this;
	}

	

	@Override
	public Pessoa create() {
		Pessoa p = new Pessoa();
		p.setCpf(this.cpf);
		p.setEmail(this.email);
		p.setGrau(this.grau);
		p.setIdade(this.idade);
		p.setNome(this.nome);
		p.setRg(this.rg);
		p.setTelefone(this.telefone);
		return p;
	}


	@Override
	public PessoaOutraAbordagemBuilder nome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}
