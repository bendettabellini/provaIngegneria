package provaLab;

import java.util.Comparator;
import java.util.List;

public class MyListUtil {
	
	public List<Integer> ordina(List<Integer> lista, int ordina) {
		if (ordina == 0) {
			lista.sort(null);
		}
		if (ordina == 1) {
			lista.sort(new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					return o1.compareTo(o2)*-1;
				}
				
			});
		}
		return lista;
	}
	
}
