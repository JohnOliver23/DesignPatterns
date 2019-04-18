package apps;

import classes.factorys.ArquivoBuilder;
import gof.Editor;

public class Calc implements Editor {



	@Override
	public ArquivoBuilder criar(String name, String path) {
		return new ArquivoBuilder(name, path);
	}

	@Override
	public void fechar() {
		System.out.println("fechando o calc");
		
	}

	@Override
	public void abrir() {
		System.out.println("abrindo o calc");
		
	}

	

	

}
