package gof;

public class Client {
	public static void main(String[] args) {
		Persistencia json = new Json();
		Persistencia bd = new Bd();
		Publicacao p1 = new Livro();
		p1.setAutor("john");
		p1.setTitulo("Builder");
		
		p1.setPersistencia(json);
		p1.getPersistencia().persistir();
		p1.setPersistencia(bd);
		p1.getPersistencia().persistir();
		
		
	}

}
