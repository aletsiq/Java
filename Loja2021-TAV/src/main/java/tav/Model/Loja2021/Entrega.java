package tav.Model.Loja2021;

import java.time.LocalDateTime;

import tav.Interfaces.Loja2021.IEntrega;

public class Entrega implements IEntrega {
	public int idEntrega;
	public int idEndereco;
	
	public int getIdEntrega() {
		return idEntrega;
	}
	
	public void setIdEntrega(int idEntrega) {
		this.idEntrega = idEntrega;
	}

	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	public LocalDateTime getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(LocalDateTime agendamento) {
		this.agendamento = agendamento;
	}

	public LocalDateTime agendamento;
	
	public boolean ValidaEntrega (IEntrega entrega){
		return true;
	}
	
}
