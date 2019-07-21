package questao4;

public class Client {

	public static void main(String[] args) {
		
		ImplementacaoLista imprimeNumeros = new ImprimeNumeros();
		AbstracaoLista lista = new ListaOrdenada(imprimeNumeros);
		lista.adicionar("pah");
		lista.adicionar("fabricio");
		lista.adicionar("will");
		lista.imprimir();
		
		System.out.println("");
		
		
		ImplementacaoLista imprimeLetras = new ImprimeLetras();
		lista = new ListaNaoOrdenada(imprimeLetras);
		lista.adicionar("pah");
		lista.adicionar("fabricio");
		lista.adicionar("will");
		lista.imprimir();
		
		ImplementacaoLista imprimeMarcadores = new ImprimeMarcadores();
		lista = new ListaOrdenada(imprimeMarcadores);
		lista.adicionar("pah");
		lista.adicionar("fabricio");
		lista.adicionar("will");
		lista.imprimir();

		
	}

}
