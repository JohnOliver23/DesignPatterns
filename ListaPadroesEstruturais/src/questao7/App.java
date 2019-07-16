package questao7;

public class App {
	public static void main(String[] args) {
		Componente c1 = new Celula("time");
		Componente c2 = new Celula("pontos");
		Componente c3 = new Celula("palmeiras");
		Componente c4 = new Celula("25");
		Componente c5 = new Celula("santos");
		Componente c6 = new Celula("20");
		Componente c7 = new Celula("flamengo");
		Componente c8 = new Celula("17");
		
		Linha l1 = new Linha();
		Linha l2 = new Linha();
		Linha l3 = new Linha();
		Linha l4 = new Linha();
		
		l1.adicionar(c1);
		l1.adicionar(c2);
		
		l2.adicionar(c3);
		l2.adicionar(c4);
		
		l3.adicionar(c5);
		l3.adicionar(c6);
		
		l4.adicionar(c7);
		l4.adicionar(c8);
		
		Tabela t = new Tabela();
		t.adicionar(l1);
		t.adicionar(l2);
		t.adicionar(l3);
		t.adicionar(l4);
		t.imprimir();
		
		
	}

}
