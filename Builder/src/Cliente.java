
public class Cliente {
	public static void main(String[] args) {
		PessoaBuilder pb = new PessoaBuilder();
		pb.nome("Val�ria");
		pb.idade(15);
		Pessoa p = pb.create();
		System.out.println(p.toString());
		
		Pessoa p2 = (new PessoaOutraAbordagemBuilder("Val�ria",15)
				.email("valeria.cavalcanti@ifpb.edu.br"))
				.create();
		System.out.println(p2);
	}

}
