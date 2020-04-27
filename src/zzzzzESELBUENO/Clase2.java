package zzzzzESELBUENO;

import java.util.ArrayList;


/**
 * @author Paco
 * @version 27/04/2020
 */
public class Clase2 {
	/**
	 * En el main introducimos la variable ArrayList y resultado, le añadimos 5 numeros, recorremos dicho ArrayList y almacenamos en resultado las variables del arraylist
	 * Hacemos un metodo que comprobara la media.
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		
		
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		
		
		int resultado = 0;
		
		
		for (int i = 0; i < a.size();  i++) {
		resultado+=a.get(i) ;
			
		}
		
		
		
		metodoArrayList(a, resultado);
	}
	
	/**
	 * Este método funciona de la siguiente forma: le pasamos el ArrayList de la clase main y la variable resultado, realizamos un for para recorrer todas las variables y luego la variable la resultado la dividimos entre la longitud del ArrayList para sacar la media.
	 * @param a
	 * @param resultado
	 * @return
	 */
	public static String metodoArrayList(ArrayList<Integer> a,int resultado) {
		
		
	
		for (int j = 0; j < a.size(); j++) {
			
		}
		return "La media de las notas es: " +resultado/a.size();
		
		
		
	}

}