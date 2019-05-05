package gof;

public class Claro implements Operadora {

	@Override
	public void ligar() {
		System.out.println("Ligar - Claro");
		
	}

	@Override
	public void enviarSMS() {
		System.out.println("Enviar sms - Claro");
		
	}

}
