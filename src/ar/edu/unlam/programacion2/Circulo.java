package ar.edu.unlam.programacion2;

public class Circulo {

	private Double radio;	
	private Double pi = 3.14159265359;
	
		public void definirRadio (Double radio) {
			this.radio=radio;
		}
		
		public Double devuelveElRadio () {
			return radio;
		}
		
		public Double calculaYDevuelveElPerimetro () {
			return pi * 2 * radio;
		}
		
		
}
