package zzzzzESELBUENO;


	import java.util.Scanner;
	import java.util.ArrayList;

	public class Clase1Buena {

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
		
		public static void metodoArray(ArrayList numeros,int contador) {
			System.out.println("La cantidad de numeros que acaba en 3 es: "+contador);
			
		}

}
