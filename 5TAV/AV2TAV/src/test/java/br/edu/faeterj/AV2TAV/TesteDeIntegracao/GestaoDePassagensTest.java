package br.edu.faeterj.AV2TAV.TesteDeIntegracao;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import br.edu.faeterj.AV2TAV.models.GestaoPassagens;
import br.edu.faeterj.AV2TAV.models.Onibus;
import br.edu.faeterj.AV2TAV.models.Passageiro;
import br.edu.faeterj.AV2TAV.models.Rota;

class GestaoDePassagensTest {

	// 1º Teste: Validando o método 'venderPassagem' para definir os campos necessários para ocorrer a compra de uma passagem
	@Test
	public void validaCompra() {
		//Arrange
		
		// Onibus mockOnibus = mock(Onibus.class)
		// Passageiro mockPassageiro = mock(Passageiro.class)
		// Rota mockRota = mock(Rota.class)
		
		Set<Passageiro> passageiros = new HashSet<Passageiro>(28);
		Onibus onibus = new Onibus();
		
		onibus.setLugares(28);
		onibus.setTipo("L");
		
		Passageiro passageiro = new Passageiro();
		
		passageiro.setCpf("111.111.111-11");
		passageiro.setNome("José");
		passageiro.setDestino("São Paulo");
		
		passageiros.add(passageiro);
		
		onibus.setPassageiros(passageiros);
		
		Rota rota = new Rota();
		
		Set<String> paradas = new HashSet <String>();
		paradas.add("Volta Redonda");
		paradas.add("Resende");
		paradas.add("Graal");
		
		
		rota.setKm(449.5);
		rota.setTrajeto("C");
		rota.setParadas(3);
		rota.setDestino("São Paulo");
		rota.setNomeParadas(paradas);
		
		GestaoPassagens compraPassagem = new GestaoPassagens();
		
		Double esperado = (449.5 * 0.6) * 0.9;
		
		//Act
		var resultado = compraPassagem.venderPassagem(passageiro, onibus, rota);
		
		
		//Assert
		assertEquals(resultado, esperado);
	}
	
	// 2º Teste: Validando saída caso ocorra parada
	@Test
	public void saidaParada () {
		Set<Passageiro> passageiros = new HashSet<Passageiro>(28);
		Onibus onibus = new Onibus();
		
		onibus.setLugares(28);
		onibus.setTipo("L");
		
		Passageiro p = new Passageiro();
		
		
		p.setCpf("111.111.111-11");
		p.setNome("José");
		p.setDestino("São Paulo");
		
		
		passageiros.add(p);
		
		Passageiro p1 = new Passageiro();
		p1.setCpf("222.222.222-22");
		p1.setNome("Maria");
		p1.setDestino("São Paulo");
		
		passageiros.add(p1);
		
		Passageiro p2 = new Passageiro();
		p2.setCpf("333.333.333-22");
		p2.setNome("Carlos");
		p2.setDestino("Resende");
		
		passageiros.add(p2);
		
		onibus.setPassageiros(passageiros);
				
		Rota rota = new Rota();
		
		Set<String> paradas = new HashSet <String>();
		paradas.add("Volta Redonda");
		paradas.add("Resende");
		paradas.add("Graal");
		
		
		rota.setKm(449.5);
		rota.setTrajeto("C");
		rota.setParadas(3);
		rota.setDestino("São Paulo");
		rota.setNomeParadas(paradas);
		
		GestaoPassagens validaSaida = new GestaoPassagens();

		
		Integer esperado = 2;
		
		//Act
		var resultado = validaSaida.paradaSaida(onibus, rota, p2);
		

		//Assert
		assertEquals(resultado, esperado);

	}
	
	// 3º Teste: Validando entrada caso ocorra superlotação
	@Test
	public void validaEntrada() {
		//Arrange

		// Onibus mockOnibus = mock(Onibus.class)
		// Passageiro mockPassageiro = mock(Passageiro.class)
		// Rota mockRota = mock(Rota.class)

		Set<Passageiro> passageiros = new HashSet<Passageiro>(2);
		Onibus onibus = new Onibus();

		onibus.setLugares(2);
		onibus.setTipo("L");

		Passageiro passageiro = new Passageiro();
		Passageiro passageiro1 = new Passageiro();
		Passageiro passageiro2 = new Passageiro();

		passageiro.setCpf("111.111.111-11");
		passageiro.setNome("José");
		passageiro.setDestino("Bahia");

		passageiro1.setCpf("222.222.222-11");
		passageiro1.setNome("Maria");
		passageiro1.setDestino("Espírito Santo");
		
		passageiro2.setCpf("333.333.333-33");
		passageiro2.setNome("Miguel");
		passageiro2.setDestino("Vitória");
		
		passageiros.add(passageiro);
		passageiros.add(passageiro1);
		passageiros.add(passageiro2);


		onibus.setPassageiros(passageiros);

		Rota rota = new Rota();

		Set<String> paradas = new HashSet <String>();
		paradas.add("Volta Redonda");
		paradas.add("Resende");
		paradas.add("Graal");


		rota.setKm(449.5);
		rota.setTrajeto("C");
		rota.setParadas(3);
		rota.setDestino("São Paulo");
		rota.setNomeParadas(paradas);

		GestaoPassagens compraPassagem = new GestaoPassagens();

		Double esperado = 0.0; // Implementar bloco try/catch

		//Act
		var resultado = compraPassagem.venderPassagem(passageiro, onibus, rota);


		//Assert
		assertEquals(resultado, esperado);
	}
}
