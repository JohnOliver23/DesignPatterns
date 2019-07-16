package questao1;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Client {
	public static void main(String[] args) {
		HashMapAdapter hm = new HashMapAdapter();
		String [][] matrix =  { {"10","20","OK"}, {"5","30","KO"}};
		hm.put(matrix);
		System.out.println(hm);
		
		
	}

}
