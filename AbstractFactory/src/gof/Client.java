package gof;

public class Client {
	public static void main(String[] args) {
		ProvedorFactory.getFactory(Provedor.IG).criarSMTP().enviar();
	}

}
