package br.edu.faeterj.AV2TAV.models;

import java.util.Set;

public class Onibus {
	private String id;
	private String tipo;
	private Integer lugares;
	private Set<Passageiro> passageiros;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getLugares() {
		return lugares;
	}
	public void setLugares(Integer lugares) {
		this.lugares = lugares;
	}
	public Set<Passageiro> getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(Set<Passageiro> passageiros) {
		this.passageiros = passageiros;
	}
}
