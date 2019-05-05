package gof;

public class Oi implements Operadora {
	@Override
	public void ligar() {
		System.out.println("Ligar - Oi");
		
	}

	@Override
	public void enviarSMS() {
		System.out.println("Enviar sms - Oi");
		
	}
}
