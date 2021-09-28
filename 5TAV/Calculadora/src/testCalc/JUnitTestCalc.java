package testCalc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tav.faeterj.Calculadora;

class JUnitTestCalc {

	@Test
	void TesteSoma() {
		// Arrange
		Calculadora Calc = new Calculadora();
		int esperado = 5;
		
		// Act
		double resultado = Calc.Soma(3, 2);
		
		// Assert
		assertEquals(esperado, resultado);
	}
	
	@Test
	void TesteSubtracao() {
		
		// Arrange
		Calculadora Calc = new Calculadora();
		int esperado = 1;
		
		// Act
		double resultado = Calc.Subtracao(3, 2);
		
		// Assert
		assertEquals(esperado, resultado);
	}
	
	@Test
	void TesteMultiplicacao() {
		
		// Arrange
		Calculadora Calc = new Calculadora();
		int esperado = 6;
				
		// Act
		double resultado = Calc.Multiplicacao(3, 2);
				
		// Assert
		assertEquals(esperado, resultado);
	}
	
	@Test
	void TesteDivisao() {
		
		// Arrange
		Calculadora Calc = new Calculadora();
		int esperado = 3;
				
		// Act
		double resultado = Calc.Divisao(6, 2);
				
		// Assert
		assertEquals(esperado, resultado);
	}
	
	@Test
	void TesteSomaDouble() {
		
		// Arrange
		Calculadora Calc = new Calculadora();
		double esperado = 1.5;
		
		// Act
		double resultado = Calc.Soma(0.75, 0.75);
		
		// Assert
		assertEquals(esperado, resultado);
	}
	
	@Test 
	
	void TesteSubtracaoDouble(){
		// Arrange
		Calculadora Calc = new Calculadora();
		double esperado = 1.5;
				
		// Act
		double resultado = Calc.Subtracao(3, 1.5);
				
		// Assert
		assertEquals(esperado, resultado);
	}
	
	@Test
	void TestMultiplicacaoDouble() {
		// Arrange
		Calculadora Calc = new Calculadora();
		double esperado = 4.5;
					
		// Act
		double resultado = Calc.Multiplicacao(3, 1.5);
					
		// Assert
		assertEquals(esperado, resultado);
	}
	
	@Test
	void TesteDivisaoDouble() {
		
		// Arrange
		Calculadora Calc = new Calculadora();
		double esperado = 1.5;
		
		// Act
		double resultado = Calc.Divisao(3, 2);
		
		// Assert
		assertEquals(esperado, resultado);
	}
	
	@Test
	void TesteRaizQuadrada() {
		
		// Arrange
		Calculadora Calc = new Calculadora();
		double esperado = 2;
		
		// Act
		double resultado = Calc.Raiz(4);
		
		// Assert
		assertEquals(esperado, resultado);
	
	}
	
	@Test
	void TesteExponenciacao() {
		
		// Arrange
		Calculadora Calc = new Calculadora();
		double esperado = 4;
		
		// Act
		double resultado = Calc.Exponenciacao(2, 2);
		
		// Assert
		assertEquals (esperado, resultado);
	}
	
	@Test
	void TestePercentual() {
		
		// Arrange
		Calculadora Calc = new Calculadora();
		double esperado = 1;
		
		// Act
		double resultado = Calc.Percentual(1, 100);
		
		// Assert
		assertEquals (esperado, resultado);
	}

}
