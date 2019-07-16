package questao1;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapAdapter extends HashMap {
	
    public  ArrayList<Object> put (String[][] matriz) {
    	ArrayList<Object>lista = new ArrayList<Object>();
    	  for(String[] linha: matriz) {
    		  for (String coluna: linha) {
    			  int i = 0;
    			  Object object = (Object) super.put(coluna, linha[i]);
    			  lista.add(object);
    			  i++;
    		  }
    	  }
    	  return lista;
    }

}

