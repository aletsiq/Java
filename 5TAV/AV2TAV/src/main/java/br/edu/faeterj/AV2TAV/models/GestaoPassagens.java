package br.edu.faeterj.AV2TAV.models;

public class GestaoPassagens {

	
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
	
	public Double venderPassagem (Passageiro passageiro, Onibus onibus, Rota rota) {
		
		if (onibus.getLugares() > onibus.getPassageiros().size()) {
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
		} else {
			return 0.0;
		}
	}
}
