package gof;

public class CartaoFactory {
	
	public static Cartao getCartao (Bandeira bandeira){
		if (bandeira == Bandeira.MASTER){
			return new Master();
		}else if(bandeira == Bandeira.VISA){
			return new Visa();
		}else if(bandeira == Bandeira.IfCard){
			return new IfCardAdapter();
		}
		return null;
	}

}
