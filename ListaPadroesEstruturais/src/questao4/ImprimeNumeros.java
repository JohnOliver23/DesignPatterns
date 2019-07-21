package questao4;

public class ImprimeNumeros extends ImplementacaoLista{

	@Override
	public void imprimeItensLista() {
		for(String item: lista) {
			System.out.println(item + " " + lista.indexOf(item));
		}
	}

}
