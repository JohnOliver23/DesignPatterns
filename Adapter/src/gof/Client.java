package gof;

public class Client {
	public static void main(String[] args) {
		CartaoFactory.getCartao(Bandeira.VISA).autorizarCompra();
		CartaoFactory.getCartao(Bandeira.MASTER).validar();
		CartaoFactory.getCartao(Bandeira.IfCard).autorizarCompra();
	}

}
