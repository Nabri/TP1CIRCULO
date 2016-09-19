package ar.edu.unlam.programacion2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	@Test
	public void creandoCirculoDeRadio2() {
		
		Circulo circulo1 = new Circulo ();
		circulo1.definirRadio(2.0);
		assertEquals(2.0, circulo1.devuelveElRadio(), 0.1);
		
	}
	
	@Test
	public void creandoCirculoDeRadio3punto7() {
		
		Circulo circulo1 = new Circulo ();
		circulo1.definirRadio(3.7);
		assertEquals(3.7, circulo1.devuelveElRadio(), 0.1);
		
	}
	
	@Test
	public void creandoCirculoDeRadio5() {
		
		Circulo circulo1 = new Circulo ();
		circulo1.definirRadio(5.0);
		assertEquals(5.0, circulo1.devuelveElRadio(), 0.1);
		
	}
	
	@Test
	public void creandoCirculoDeRadio10punto9() {
		
		Circulo circulo1 = new Circulo ();
		circulo1.definirRadio(10.9);
		assertEquals(10.9, circulo1.devuelveElRadio(), 0.1);
		
	}
	
	@Test
	public void creandoCirculoDeRadio9punto8 () {
		
		Circulo circulo1 = new Circulo ();
		circulo1.definirRadio(9.8);
		assertEquals (61.57, circulo1.calculaYDevuelveElPerimetro(), 0.01);
	}

	@Test
	public void creandoCirculoDeRadio16punto6 () {
		Circulo circulo1 = new Circulo ();
		circulo1.definirRadio(16.6);
		assertEquals (104.30, circulo1.calculaYDevuelveElPerimetro(), 0.01);
	}



}
