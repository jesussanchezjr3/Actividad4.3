package zzzzzESELBUENO;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Clase1Test {

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
	
	
	@Test
	void test2() {
		
		ArrayList <Integer> obj = null;
		
		String resultado = Clase1Buena.metodoArray(obj, 0);
		assertEquals("El ArrayList es nulo",resultado);
	
		
	}
	
	@Test
	void test3() {
		
		ArrayList <Integer> obj = new ArrayList<Integer>();
		
		String resultado = Clase1Buena.metodoArray(obj, 0);
		assertEquals("El ArrayList esta vacio",resultado);
	
		
	}

}
