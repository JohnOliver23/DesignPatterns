package gof;

public class GmailSMTP implements SMTP {

	@Override
	public void enviar() {
		System.out.println("Enviar via gmail");
		
	}

	@Override
	public void enviarComAnexo() {
		System.out.println("Enviar anexo via gmail");
		
	}

}
