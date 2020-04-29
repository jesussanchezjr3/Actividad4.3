package zzzzzESELBUENO;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * @author Pacop
 * 27/04/2020
 */
class clase2Prueba {
	
	@Test 
	
	/**
	 *  Creamos un ArrayList vacio y creamos una variable string resultado y añadamos la clase junto con el metodo
	 * 	Creamos un assertEquals mostramos el mismo mensaje que tenemos en la clase java y añadimos el string resultado que contiene lo necesario para comprobarlo.
	 */
	
	void test() {
		ArrayList <Integer> nombre= new ArrayList<Integer>();
		String resultado=Clase2.metodoArrayList(nombre, 0);
		assertEquals("El arraylist esta vacio",resultado);
	}
	
	
	
	@Test
	
	/**
	 * Creamos un ArrayList y lo igualamos a null, Creamos un String resultado con la clase y el método 
	 * Creamos un asserEquals y le pasamos el nombre del array y el 0 por que necesita en mi caso pasar una variable entonces le paso 0
	 * y ya se comprobaria si es null adjuntando el mismo texto y añadiendo la variable resultado
	 */
	
	void test1 () {
		ArrayList <Integer> nombre = null;
		String resultado=Clase2.metodoArrayList(null, 0);
		assertEquals(" El arraylist es nulo",resultado);
	}
	
	@Test
	
	/**
	 * Creamos un arrayList integer y le añadimos variables con el .add las que queramos
	 * Creamos String resultado y le añadimos la clase y le pasamos las variables y el resultado esperado
	 * Por Ultimo el assertEquals comprabara que la media se realiza correctamente.
	 */
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
