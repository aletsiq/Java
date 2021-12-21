package br.edu.faeterj.AV2TAV.models;

import java.util.Set;

public class GestaoPassagens {
	private Set<Onibus> listaOnibus;
	
	public Set<Onibus> getListaOnibus() {
		return listaOnibus;
	}	
	public void setListaOnibus(Set<Onibus> listaOnibus) {
		this.listaOnibus = listaOnibus;
	}

	private Double valorTotal;
	
	public Integer paradaSaida(Onibus onibus, Rota rota, Passageiro passageiro) {
		if(passageiro.getDestino() != rota.getDestino()) {
			for(String p : rota.getNomeParadas()) {
				if(passageiro.getDestino().equals(p)) {
					onibus.getPassageiros().remove(passageiro);
				}
			}
		}
		return onibus.getPassageiros().size();
	}
	
	public Double valorPassagem (Passageiro passageiro, Onibus onibus, Rota rota) {
			if (onibus.getTipo() == "L") {
				valorTotal = rota.getKm() * 0.6;
			} else if (onibus.getTipo() == "SL") {
				valorTotal = rota.getKm() * 0.55;
			} else {
				valorTotal = rota.getKm() * 0.5;
			}
			if (rota.getTrajeto() == "C") {
				valorTotal *= 0.9;
			}
		return valorTotal;
	}
	
	public boolean validaEntrada (Onibus onibus, Set<Passageiro> passageiros) {
		if (onibus.getLugares() > passageiros.size()) {
			return true;
		} else {			
			return false;
		}
	}
	
	
	public String alocarPassageiro (GestaoPassagens gestaoPassagens, Set<Passageiro> passageiros) {
		var maior = 0;
		
		for (Onibus o : gestaoPassagens.getListaOnibus()) {
			var dif = o.getLugares() - o.getPassageiros().size();
			if (dif > maior) {
				maior = dif;
			}
		}
		for (Onibus o : gestaoPassagens.getListaOnibus()) {
			var soma = o.getPassageiros().size() + o.getPassageiros().size();
			if (o.getLugares() - o.getPassageiros().size() == maior) {
				if (maior < soma) {
					return "Alocação mal sucedida";
				} else {
					o.setPassageiros(passageiros);
					return o.getId();
				}
			}
		}
		return "Alocação mal sucedida!";
	}
}