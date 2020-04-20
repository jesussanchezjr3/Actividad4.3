package zzzzzESELBUENO;

import java.util.ArrayList;

public class Clase2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		
		
		int resultado = 0;
		int media = 0;
		
		for (int i = 0; i < a.size(); i++) {
		resultado+=a.get(i) ;
			
		}
		
		media=resultado / a.size();
		metodoArrayList(a,media);
	}

	public static String metodoArrayList(ArrayList<Integer> a, int media) {
		if(a==null) {
			return"El arraylist es nulo";
		}else {
			if(a.size()==0) {
				return"El arraylist esta vacio";
			}else {
				return"La media de las notas es: "+media;
			}
		
		}
	}

}