
public class Cliente {
	public static void main(String[] args) {
		PessoaBuilder pb = new PessoaBuilder();
		pb.nome("Valéria");
		pb.idade(15);
		Pessoa p = pb.create();
		System.out.println(p.toString());
		
		Pessoa p2 = (new PessoaOutraAbordagemBuilder("Valéria",15)
				.email("valeria.cavalcanti@ifpb.edu.br"))
				.create();
		System.out.println(p2);
	}

}
