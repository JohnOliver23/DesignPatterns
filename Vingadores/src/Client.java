
public class Client {
	public static void main(String[] args) {
		/*
		SuperHeroi s1 = new SuperHeroi("Rafael");
		s1.addPoderes("Fogo");
		s1.addPoderes("Super grito");
		s1.addPoderes("�gua");
		s1.addPoderes("Gelo");
		s1.addPoderes("Paga as contas");
		s1.addPoderes("Festa para o sr Fabr�cio");
		s1.addPoderes("Estudioso");
		s1.addPoderes("Super vis�o");
		s1.addPoderes("Raio do trov�o");
		s1.addPoderes("Super amigo");
		s1.addPoderes("Ler pensamento");
		s1.addPoderes("Futuro");
		s1.addPoderes("Presente");
		s1.addPoderes("Passado");
		
		SuperHeroi s2 =  s1.clone();
		s2.setNome("Pah");
		s2.addPoderes("Altura");
		System.out.println(s1);
		System.out.println(s2);*/
		SuperHeroi s1 =Prototype.get("FOGO");
		SuperHeroi s2 =Prototype.get("AGUA");
		s2.addPoderes("chorar");
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
