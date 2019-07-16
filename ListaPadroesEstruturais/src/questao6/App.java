package questao6;

public class App {
	public static void main(String[] args) {
		Congresso congresso = new Congresso("Congresso Nacional", 5);
	      ParticipanteComposite aecio = new Individuo("Aecio neves", 1);
	      ParticipanteComposite dilma = new Individuo("Dilma roussef", 2);
	 
	      congresso.adicionarParticipante(aecio);
	      congresso.adicionarParticipante(dilma);
	 
	      ParticipanteComposite eduardo = new Individuo("Eduardo Bolsonaro", 3);
	      ParticipanteComposite flavio = new Individuo("Flavio Bolsonaro", 4);
	 
	      Instituicao partidoSocialLiberal = new Instituicao("PSL");
	      partidoSocialLiberal.adicionar(eduardo);
	      partidoSocialLiberal.adicionar(flavio);
	 
	      congresso.adicionarParticipante(partidoSocialLiberal);
	 
	      System.out.println(congresso);
	      congresso.imprimeParticipantes();
	}

}
