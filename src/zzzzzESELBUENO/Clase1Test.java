package zzzzzESELBUENO;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
/**
 * 
 * @author Jesus
 * @version 27-04-2020
 */
class Clase1Test {
	/**
	 * Creamos un arraylist y le añadimos 5 numeros con el .add , creamos la variable resultado y con assertequals comprobamos las que acaban en 3.
	 * 
	 */
	@Test
	void test() {
		
		
		ArrayList <Integer> obj = new ArrayList<Integer>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(1);
		
		String resultado = Clase1Buena.metodoArray(obj, 1);
		assertEquals("La cantidad de numeros que acaba en 3 es: 1",resultado);
	
		
	}
	
	
	/**
	 * Mismo método que el test0 pero cambiando ejemplo. 
	 * Creamos un arraylist y le añadimos 5 numeros con el .add , creamos la variable resultado y con assertequals comprobamos las que acaban en 3.
	 * 
	 */
	@Test
	void test1() {
		
	
		ArrayList <Integer> obj = new ArrayList<Integer>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(3);
		obj.add(1);
		
		String resultado = Clase1Buena.metodoArray(obj, 2);
		assertEquals("La cantidad de numeros que acaba en 3 es: 2",resultado);
	
		
	}
	
	/**
	 * Creamos un arraylist nulo y la variable resultado a la que le pasamos el metodo de la clase normal y nos comprueba con assertequals que es nulo. 
	 */
	@Test
	void test2() {
		
		ArrayList <Integer> obj = null;
		
		String resultado = Clase1Buena.metodoArray(obj, 0);
		assertEquals("El ArrayList es nulo",resultado);
	
		
	}
	
	/**
	 * Creamos arraylist y la variable resultado a la que le pasamos el metodo de la clase normal y con assertequals comprobamos que es un array vacio.
	 */
	@Test
	void test3() {
		
		ArrayList <Integer> obj = new ArrayList<Integer>();
		
		String resultado = Clase1Buena.metodoArray(obj, 0);
		assertEquals("El ArrayList esta vacio",resultado);
	
		
	}

}
