package questao4;

import java.util.Collections;

public class ListaOrdenada extends AbstracaoLista{

	public ListaOrdenada(ImplementacaoLista lista) {
		super(lista);
	}

	@Override
	public void adicionar(String s) {
		System.out.println("adiconando lista ordenada");
		lista.add(s);
	}

	@Override
	public void imprimir() {
		System.out.println("imprimindo lista ordenada");
		Collections.sort(lista.getLista());
		lista.imprimeItensLista();
	}

	
}

