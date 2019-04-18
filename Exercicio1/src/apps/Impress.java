package apps;

import classes.factorys.ArquivoBuilder;
import gof.Editor;

public class Impress implements Editor {

	@Override
	public void abrir() {
		System.out.println("abrindo o impress");
		
	}
	
	@Override
	public void fechar() {
		System.out.println("fechando o impress");
		
	}

	@Override
	public ArquivoBuilder criar(String name, String path) {
		return new ArquivoBuilder(name, path);
	}

	

	

	

}
