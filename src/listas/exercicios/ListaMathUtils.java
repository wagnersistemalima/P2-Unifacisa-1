package listas.exercicios;

import java.util.ArrayList;
import java.util.List;

public class ListaMathUtils {

	public static List<Integer> calculaDivisores(int num) {
		List<Integer> divisores = new ArrayList<Integer>();
		for(int i = 1; i <= num/2; i++) {
			if(num%i==0)
				divisores.add(i);
		}
		divisores.add(num);
		return divisores;		
	}
}
