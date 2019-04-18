package gof;

public class Log {
	private static Log instancia = null;
	
	private Log(){};
	
	public static synchronized Log getInstance(){
		if (Log.instancia == null)
			Log.instancia = new Log();
		return Log.instancia;
		
	}

}
