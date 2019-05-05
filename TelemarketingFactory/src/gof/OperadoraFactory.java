package gof;

public class OperadoraFactory implements Factory {

	@Override
	public Operadora create(Tipo tipo) {
		if (tipo == Tipo.VIVO) {
			return new Vivo();
		}else if (tipo == Tipo.CLARO){
			return new Claro();
		}else if (tipo == Tipo.OI) {
			return new Oi();
		}else if(tipo == Tipo.TIM) {
			return new Tim();
		}
		return null;
	}

}
