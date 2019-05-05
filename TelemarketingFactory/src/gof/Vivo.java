package gof;

public class Vivo implements Operadora{
	@Override
	public void ligar() {
		System.out.println("Ligar - Vivo");
		
	}

	@Override
	public void enviarSMS() {
		System.out.println("Enviar sms - Vivo");
		
	}
}
