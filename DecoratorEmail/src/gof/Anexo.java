package gof;

public class Anexo extends EmailDecorator {
	
	public Anexo(Email email) {
		super(email);
	}

	public Email email;
	


	@Override
	public void enviar() {
	this.getEmail().enviar();
	System.out.println("com anexo");
	
		
	}
	
	public void enviarAnexo() {
		System.out.println("enviando anexo");
	}

}
