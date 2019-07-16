package questao8;

public class ComponenteConcreto implements Componente {

	@Override
	public void executarTarefa() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
