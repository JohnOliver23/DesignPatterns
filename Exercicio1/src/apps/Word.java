package apps;


import classes.factorys.ArquivoBuilder;
import gof.Editor;


public class Word implements Editor{

	@Override
	public void abrir() {
		System.out.println("abrindo o word");
		
	}
	
	@Override
	public void fechar() {
		System.out.println("fechando o word");
		
	}

	@Override
	public ArquivoBuilder criar(String name, String path) {
		return new ArquivoBuilder(name, path);
	}

	

	


}
