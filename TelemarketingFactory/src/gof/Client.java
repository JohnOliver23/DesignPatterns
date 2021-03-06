package gof;

public class Client {
	public static void main(String[] args) {
		Empresa tel = new Empresa();
		tel.add(new Contato("Primeiro", "111111", Tipo.CLARO));
		tel.add(new Contato("Segundo", "222222", Tipo.OI));
		tel.add(new Contato("Terceiro", "333333", Tipo.TIM));
		tel.add(new Contato("Quarto", "444444", Tipo.VIVO));
		for (Contato c : tel.get()) {
			new OperadoraFactory().create(c.getOperadora()).ligar();
		}
	}
}
