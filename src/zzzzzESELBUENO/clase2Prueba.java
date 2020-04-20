package zzzzzESELBUENO;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class clase2Prueba {

	@Test 
	void test() {
		ArrayList <Integer> nombre= new ArrayList<Integer>();
		String resultado=Clase2.metodoArrayList(nombre, 0);
		assertEquals("El arraylist esta vacio",resultado);
	}
	
	@Test
	void test1() {
		ArrayList <Integer> nombre= null;
		String resultado=Clase2.metodoArrayList(null, 0);
		assertEquals("El arraylist es nulo",resultado);
	}
	
	@Test
	void test2() {
		ArrayList <Integer> nombre= new ArrayList<Integer>();
		nombre.add(1);
		nombre.add(5);
		nombre.add(3);
		nombre.add(7);
		String resultado=Clase2.metodoArrayList(nombre, 4);
		assertEquals("La media de las notas es: 4",resultado);
	}
	
	

}
