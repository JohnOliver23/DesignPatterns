package aplicacao;

import classes.factorys.Arquivo;
import classes.factorys.SuiteFactory;
import gof.Editor;
import gof.ISuite;
import gof.Suite;

public class Client {
	public static void main(String[] args) {
		ISuite microsoft = SuiteFactory.getInstance().getFactory(Suite.MICROSOFT);
		microsoft.abrir();
		Editor word = microsoft.createEditorTexto();
		word.abrir();
		Arquivo arquivo = word.criar("Quero um cabo", "/lab5").proprietario("John").autorizacao(true).create();
		Arquivo arquivo2 = arquivo.clone();
		arquivo2.setProprietario("Marlon");
		arquivo2.setAutorizacao(false);
		arquivo2.setNome("sim");
		System.out.println("Arquivo 1 : "+arquivo);
		System.out.println("Arquivo 2 : "+arquivo2);
		word.fechar();
		microsoft.fechar();
		ISuite libbre = SuiteFactory.getInstance().getFactory(Suite.LIBREOFFICE);
		libbre.abrir();
		Editor writer = libbre.createEditorTexto();
		writer.abrir();
		Arquivo a1 = writer.criar("Uma empresa muito inovadora","/sala28").proprietario("Pedro endevor").autorizacao(true).create();
		Arquivo a2 = a1.clone();
		a2.setNome("Só faltou quem não veio");
		a2.setAutorizacao(false);
		System.out.println(a1);
		System.out.println(a2);
		writer.fechar();
		libbre.fechar();
		
	}

}
