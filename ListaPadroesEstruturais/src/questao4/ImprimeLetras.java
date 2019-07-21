package questao4;

public class ImprimeLetras extends ImplementacaoLista{

	@Override
	public void imprimeItensLista() {
		for(String item: lista) {
			System.out.println(item + " " + item.charAt(0));
		}
	}
	
}
