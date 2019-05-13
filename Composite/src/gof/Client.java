package gof;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		Elementos e = new Elementos();
		
		Componente c1 = new Computador("computador 1","1.1");
		Componente c2 = new Computador("computador 2","1.2");
		Componente c3 = new Computador("computador 3","1.3");
		Componente c4 = new Computador("computador 4","1.4");
		Rede r1 = new Rede("Rede 1","2.1");
		r1.add(c1);
		r1.add(c2);
		
		Rede r2 = new Rede("Rede 2","2.2");
		r2.add(c3);
		r2.add(r1);
		
		e.add(c4);
		e.add(r2);
		
		System.out.println(e);
		
		
	}

}
