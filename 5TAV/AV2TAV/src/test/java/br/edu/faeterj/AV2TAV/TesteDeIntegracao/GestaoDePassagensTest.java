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

	// 1º Teste: Validando o método 'valorPassagem' para definir os campos necessários para ocorrer a compra de uma passagem
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
		var resultado = compraPassagem.valorPassagem(passageiro, onibus, rota);
		
		
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

		boolean esperado = false; // Implementar bloco try/catch

		//Act
		var resultado = compraPassagem.validaEntrada(onibus, passageiros);


		//Assert
		assertEquals(resultado, esperado);
	}

	// 4º Teste: Validando alocação
	@Test
	public void validaAlocacao() {
		
		// Arrange
		
		Onibus onibus = new Onibus();
		Onibus onibus1 = new Onibus();
		Onibus onibus2 = new Onibus();
		Onibus onibus3 = new Onibus();

		Passageiro passageiro = new Passageiro();
		Passageiro passageiro1 = new Passageiro();
		Passageiro passageiro2 = new Passageiro();
		Passageiro passageiro3 = new Passageiro();
		
		passageiro.setCpf("111.111.111-11");
		passageiro.setNome("José");
		passageiro.setDestino("Bahia");
		
		passageiro1.setCpf("222.222.222-11");
		passageiro1.setNome("Maria");
		passageiro1.setDestino("Espírito Santo");
		
		passageiro2.setCpf("333.333.333-33");
		passageiro2.setNome("Miguel");
		passageiro2.setDestino("Vitória");
		
		passageiro3.setCpf("123.123.123-33");
		passageiro3.setNome("Roberto");
		passageiro3.setDestino("Amapá");
		
		Set<Passageiro> lista1PassageiroE = new HashSet<Passageiro>(23);
		Set<Passageiro> lista1PassageiroSL = new HashSet<Passageiro>(28);
		Set<Passageiro> lista1PassageiroL = new HashSet<Passageiro>(32);
		Set<Passageiro> lista2PassageiroL = new HashSet<Passageiro>(32);
		
		lista1PassageiroE.add(passageiro);
		lista1PassageiroE.add(passageiro1);
		lista1PassageiroE.add(passageiro2);
		lista1PassageiroL.add(passageiro3);
		
		onibus.setId("123-Himalaia");
		onibus.setTipo("L");
		onibus.setLugares(32);
		onibus.setPassageiros(lista2PassageiroL);
		
		onibus1.setId("321-Cometa");
		onibus1.setTipo("SL");
		onibus1.setLugares(28);
		onibus1.setPassageiros(lista1PassageiroSL);

		
		onibus2.setId("421-Águia Branca");
		onibus2.setTipo("L");
		onibus2.setLugares(32);
		onibus2.setPassageiros(lista1PassageiroL);

		
		onibus3.setId("532-Cruzmaltino");
		onibus3.setTipo("E");
		onibus3.setLugares(23);
		onibus3.setPassageiros(lista1PassageiroE);
				

		Set<Onibus> listaOnibus = new HashSet<Onibus>();
		listaOnibus.add(onibus);
		listaOnibus.add(onibus1);
		listaOnibus.add(onibus2);
		listaOnibus.add(onibus3);
		
		GestaoPassagens gestaoPassagens = new GestaoPassagens();
		
		gestaoPassagens.setListaOnibus(listaOnibus);
		
		String esperado = "123-Himalaia";
		
		//Act
		var resultado = gestaoPassagens.alocarPassageiro(gestaoPassagens, lista2PassageiroL);
		

		//Assert
		assertEquals(resultado, esperado);		
	}
}
