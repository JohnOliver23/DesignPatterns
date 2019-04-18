import java.util.Map;
import java.util.TreeMap;

public class Prototype {
	
		
		private static Map<String, SuperHeroi> liga = new TreeMap<String, SuperHeroi>();
		
		
		private static void loadSuperHerois() {
			SuperHeroi s1 = new SuperHeroi("Fogo");
			s1.addPoderes("Bola de fogo");
			s1.addPoderes("Incêndio");
			s1.addPoderes("Queima geral");
			
			SuperHeroi s2 = new SuperHeroi("Água");
			s2.addPoderes("Afogar");
			s2.addPoderes("chuva");
			s2.addPoderes("inundação");
			
			Prototype.liga.put("FOGO", s1);
			Prototype.liga.put("AGUA", s2);
		}
		public static SuperHeroi get(String tipo) {
			if(Prototype.liga.size() == 0) Prototype.loadSuperHerois();
			
			return Prototype.liga.get(tipo).clone();
		}
		
		
			
			
	}


