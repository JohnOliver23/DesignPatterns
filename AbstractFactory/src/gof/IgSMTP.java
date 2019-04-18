package gof;

public class IgSMTP implements SMTP {

	@Override
	public void enviar() {
		System.out.println("enviar via smtp com ig");
		
	}

	@Override
	public void enviarComAnexo() {
		System.out.println("enviar anexo smtp com ig");
		
	}
	

}
