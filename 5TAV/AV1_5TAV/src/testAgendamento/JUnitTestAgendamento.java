package testAgendamento;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;

import tav.faeterj.Agendamento;
import tav.faeterj.Funcionario;
import tav.faeterj.Medico;


class JUnitTestAgendamento {
	@Test
	void TestConsulta(){
		//Arrange
		Agendamento Agendar = new Agendamento();
		String esperado = "Consulta marcada com sucesso!";
		
		LocalTime hora = LocalTime.of(8,0);
		LocalDate data = LocalDate.of(2022, 8, 5);
		
        Medico<String, String> doutor = Medico.Ortopedista();

		
		//Act
		String resultado = Agendar.Consulta(1, doutor.getKey(), doutor.getValue(), 1, hora, data);
		
		//Assert
		assertEquals(esperado, resultado);
	}
	
	@Test
	void TestConsultaClinicoGeral() {
		
		//Arrange
		Agendamento Agendar = new Agendamento();
		String esperado = "Consulta marcada com sucesso!";
		
		LocalTime hora = LocalTime.of(8,0);
		LocalDate data = LocalDate.of(2022, 8, 5);
		
        Medico<String, String> doutor = Medico.ClinicoGeral();

		
		//Act
		String resultado = Agendar.Consulta(1, doutor.getKey(), doutor.getValue(), 1, hora, data);
		
		//Assert
		assertEquals(esperado, resultado);
	}
	@Test
	void TestExame() {
		//Arrange
		Agendamento Agendar = new Agendamento();
		String esperado = "Exame marcado com sucesso!";
		
		LocalTime hora = LocalTime.of(8,0);
		LocalDate data = LocalDate.of(2022, 8, 5);
		
        Medico<String, String> doutor = Medico.Laboratorio();

		
		//Act
		String resultado = Agendar.Exame(1, doutor.getKey(), doutor.getValue(), 1, hora, data);
		
		//Assert
		assertEquals(esperado, resultado);
	}
	@Test
	void TestInternacao() {
		//Arrange
		Agendamento Agendar = new Agendamento();
		String esperado = "Internação realizada!";
				
		LocalTime hora = LocalTime.of(8,0);
		LocalDate data = LocalDate.of(2022, 8, 5);
				
        Medico<String, String> doutor = Medico.Internacao();

				
		//Act
		String resultado = Agendar.Internacao(1, doutor.getKey(), doutor.getValue(), 1, hora, data);
				
		//Assert
		assertEquals(esperado, resultado);
	}
	@Test
	void TestCarteirinha() {
		
		
		
		//Arrange
		Funcionario Funcionario = new Funcionario();
		
		int id = 1;
		String nome = "Roberto";
		String temPlano = "Sim.";
		
		String esperado = "ID:" + id + "\n" + "Nome:" + nome + "\n" + "Possui plano?" + temPlano;
		
								
		//Act
		String resultado = Funcionario.carteirinhaFuncionario(id, nome, true);
		
		//Assert
		assertEquals(esperado,resultado);
	}

}
