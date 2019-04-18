package apps;

import classes.factorys.ArquivoBuilder;
import gof.Editor;


public class Excel implements Editor {



	@Override
	public void abrir() {
		System.out.println("abrindo o excel");
		
	}
	
	@Override
	public void fechar() {
		System.out.println("fechando o excel");
		
	}

	@Override
	public ArquivoBuilder criar(String name, String path) {
		return new ArquivoBuilder(name, path);
	}



	
	

}
