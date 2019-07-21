package questao4;

public class ImprimeMarcadores extends ImplementacaoLista{

	@Override
	public void imprimeItensLista() {
		for(String item: lista) {
			System.out.println(item + " " + "*");
		}
	}
}
