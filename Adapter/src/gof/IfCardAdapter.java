package gof;

public class IfCardAdapter implements Cartao{
	private IfCard cartao;
	
	
	public IfCardAdapter() {
		this.cartao = new IfCard();
	}

	@Override
	public void autorizarCompra() {
		this.cartao.getAutorizacao();
		
		
	}

	@Override
	public void validar() {
		this.cartao.getValidacao();
		
	}

}
