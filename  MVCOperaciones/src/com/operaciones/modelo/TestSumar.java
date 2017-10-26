package com.operaciones.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSumar {

	@Test
	public void test() {
		
	
		OperacionesMatematicas test;
		test=new OperacionesMatematicas();
		
		test.setNumero1(1);
		test.setNumero2(2);
		float result =test.sumar();
		assertTrue(result==3);
		
		
		
		
	
	
	
	
	}	
	
}
