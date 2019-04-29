package gof;

public class CopiaOculta extends EmailDecorator {
	public CopiaOculta(Email email) {
		super(email);
	}

	@Override
	public void enviar() {
		this.getEmail().enviar();
		System.out.println("copia oculta");
		
	}

}
