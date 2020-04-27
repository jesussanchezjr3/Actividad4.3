package zzzzzESELBUENO;


	
	import java.util.ArrayList;
/**
 * 
 * @author Jesus
 * @version 27-04-2020
 */
	public class Clase1Buena {

		/**
		 * Metodo main, creacion de arraylist al cual le pasamos unos numeros y lo recorremos con un for comprobando con un if si acaba en 3 o no. 
		 * @param args
		 */
		public static void main(String[] args) {
			
			int contador=0;
			ArrayList<Integer> numeros= new ArrayList<Integer>();
			numeros.add(4);
			numeros.add(4);
			numeros.add(93);
			numeros.add(100003);
			
			for (int i = 0; i < numeros.size(); i++) {
				
					if(numeros.get(i) %10==3) {
						contador++;
						
					}
					
				}
			
			metodoArray(numeros,contador);
			
		}
		/**
		 * 
		 * Metodo al que le pasamos el arraylist y la variable contador y en el que hacemos las pruebas y comprobamos el tamaño del array.
		 * @param numeros
		 * @param contador
		 * @return
		 */
		public static String metodoArray(ArrayList<Integer> numeros,int contador) {
			
			if (numeros==null) {
				return "El ArrayList es nulo";
			}else {
				
				if (numeros.size()==0) {
					
					return "El ArrayList esta vacio";
				}else {
					return "La cantidad de numeros que acaba en 3 es: "+contador;
				}
			}
		
		}

}
