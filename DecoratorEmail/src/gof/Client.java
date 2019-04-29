package gof;

public class Client {
	public static void main(String[] args) {
		Email e1 = new EmailNormal("de", "para", "assunto", "mensagem");
//		e1.enviar();
		Email e2 = new Anexo(e1);
//		e2.enviar();
		Email e3 = new Confirmacao(e2);
//		e3.enviar();
		Email e4 = new CopiaOculta(e3);
//		e4.enviar();
		
		new CopiaOculta(new Confirmacao(new Anexo(new EmailNormal("de", "para", "assunto", "mensagem")))).enviar();
	}

}
