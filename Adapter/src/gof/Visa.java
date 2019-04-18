package gof;

public class Visa implements Cartao{

	@Override
	public void autorizarCompra() {
		System.out.println("autorizou compra Visa");
		
	}

	@Override
	public void validar() {
		System.out.println("validou compra Visa");
		
	}

}
