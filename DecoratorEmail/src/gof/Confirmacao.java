package gof;

public class Confirmacao extends EmailDecorator {

	public Confirmacao(Email email) {
		super(email);
	}

	@Override
	public void enviar() {
		this.getEmail().enviar();
		System.out.println("com confirmação");
		
	}

}
