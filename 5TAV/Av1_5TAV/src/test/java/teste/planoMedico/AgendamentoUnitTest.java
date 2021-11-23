package teste.planoMedico;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import tav.Interfaces.planoMedico.IMedico;
import tav.Model.planoMedico.Agendamento;
import tav.Model.planoMedico.Funcionario;
import tav.Model.planoMedico.Medico;

public class AgendamentoUnitTest {
	
	@Test
	public void ValidaCRM(){
		//Arrange
		IMedico mockMedico = mock(IMedico.class);
		Agendamento agendar = new Agendamento(0, 0, "Consulta", 0, "Rua dos Bobos, 0","2020/01/03", "13:00");
		boolean esperado = false;
		IMedico medico = new Medico();
		
		
		
        when(mockMedico.ValidaCRM(medico)).thenReturn(true);
		
        //Act
        var resultado = agendar.ValidaCRM(medico);

        //Assert
        assertEquals(resultado, esperado);
		
	}
	
	@Test
	public void ValidaEnderecoPorCRM() {
		//Arrange
		IMedico mockMedico = mock(IMedico.class);
		Agendamento agendar = new Agendamento(0, 0, "Exame", 1, "Rua dos Bobos, 0", "2020/01/03", "11:00");
		boolean esperado = true;
		IMedico medico = new Medico();
		
		
		
        when(mockMedico.ValidaEndereco(medico)).thenReturn(true);
		
        //Act
        var resultado = agendar.ValidaEndereco(medico);

        //Assert
        assertEquals(resultado, esperado);
	}
	
	@Test
	public void ValidaDataPorEndereco() {
		//Arrange
		IMedico mockMedico = mock(IMedico.class);
		Agendamento agendar = new Agendamento(0, 0, "Internação", 1, "Rua dos Bobos, 0", "2020/05/03", "13:00");
		boolean esperado = false;
		IMedico medico = new Medico();
				
				
				
		when(mockMedico.ValidaDataPorEndereco(medico)).thenReturn(true);
				
		//Act
		var resultado = agendar.ValidaDataPorEndereco(medico);

        //Assert
        assertEquals(resultado, esperado);
	}
	
	@Test
	public void ValidaHoraPorData() {
		//Arrange
		IMedico mockMedico = mock(IMedico.class);
		Agendamento agendar = new Agendamento(0, 0, "Consulta", 1, "Rua dos Bobos, 0", "2020/05/03", "13:00");
		boolean esperado = true;
		IMedico medico = new Medico();
				
				
				
		when(mockMedico.ValidaHoraPorData(medico)).thenReturn(true);
				
		//Act
		var resultado = agendar.ValidaHoraPorData(medico);

        //Assert
        assertEquals(resultado, esperado);
	}
	
	@Test
	public void TestCarteirinha() {
		//Arrange
		Agendamento agendar = new Agendamento();
		Funcionario funcionario1 = new Funcionario(1, "Roberto", "Completo");
		String esperado = "ID:" + funcionario1.getIdFuncionario() + "\n" + "Nome:" + funcionario1.getNomeFuncionario() 
		+ "\n" + "Possui plano?" + funcionario1.planoTipo;
		
								
		//Act
		String resultado = agendar.carteirinhaFuncionario(1, "Roberto", "Completo");
		
		//Assert
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void ValidaCobertura() {
		Agendamento agendar = new Agendamento(0, 0, "Consulta", 1, "Rua dos Bobos, 0", "2020/05/03", "14:00");
		boolean esperado = false;
		Funcionario funcionario1 = new Funcionario(2, "Carla", "Exame");
				
		//Act
		var resultado = agendar.ValidaCobertura(funcionario1.planoTipo);
		
		//Assert
		assertEquals(resultado, esperado);
	}
}