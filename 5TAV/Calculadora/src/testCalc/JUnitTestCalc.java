package testCalc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tav.faeterj.Calculadora;

class JUnitTestCalc {

	@Test
	void TesteSoma3e2() {
		// Arrange
		Calculadora Calc = new Calculadora();
		int esperado = 5;
		
		// Act
		int resultado = Calc.Soma(3, 2);
		
		// Assert
		assertEquals(esperado, resultado);
	}
	
	@Test
	void TesteSubtracaoCom3e2() {
		
		// Arrange
		Calculadora Calc = new Calculadora();
		int esperado = 1;
		
		// Act
		int resultado = Calc.Subtracao(3, 2);
		
		// Assert
		assertEquals(esperado, resultado);
	}
	
	@Test
	void TesteMultiplicacao3e2() {
		
		// Arrange
		Calculadora Calc = new Calculadora();
		int esperado = 6;
				
		// Act
		int resultado = Calc.Multiplicacao(3, 2);
				
		// Assert
		assertEquals(esperado, resultado);
	}
	
	@Test
	void TesteDivisao6e2() {
		
		// Arrange
		Calculadora Calc = new Calculadora();
		int esperado = 3;
				
		// Act
		int resultado = Calc.Divisao(6, 2);
				
		// Assert
		assertEquals(esperado, resultado);
	}

}
