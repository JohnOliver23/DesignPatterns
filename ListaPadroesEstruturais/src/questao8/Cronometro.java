package questao8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Cronometro extends Interceptador {

	public Cronometro(Componente componente) {
		super(componente);
	}

	@Override
	public void executarTarefa() {
		
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.getComponente().executarTarefa();
		
		
        //this.getComponente().executarTarefa();
		
	}
	

}
