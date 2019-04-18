package apps;

import classes.factorys.ArquivoBuilder;
import gof.Editor;

public class Writer implements Editor {

	@Override
	public void abrir() {
		System.out.println("abrindo o writer");
		
	}
	
	@Override
	public void fechar() {
		System.out.println("fechando o writer");
		
	}

	@Override
	public ArquivoBuilder criar(String name, String path) {
		return new ArquivoBuilder(name, path);
	}

	

	

}
