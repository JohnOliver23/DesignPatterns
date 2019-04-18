package apps;

import classes.factorys.ArquivoBuilder;
import gof.Editor;

public class PowerPoint implements Editor {

	@Override
	public void abrir() {
		System.out.println("abrindo o power point");
		
	}
	
	@Override
	public void fechar() {
		System.out.println("fechando o power point");
		
	}

	@Override
	public ArquivoBuilder criar(String name, String path) {
		return new ArquivoBuilder(name, path);
	}

	
	
	
	

	

}
