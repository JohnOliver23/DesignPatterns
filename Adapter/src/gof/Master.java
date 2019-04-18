package gof;

public class Master implements Cartao {

	@Override
	public void autorizarCompra() {
		System.out.println("autorizou compra Master");
		
	}

	@Override
	public void validar() {
		System.out.println("validou compra master");
	}
	

}
