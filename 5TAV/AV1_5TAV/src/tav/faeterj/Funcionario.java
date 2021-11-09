package tav.faeterj;

public class Funcionario {
	
	public int idFuncionario;
	public String nomeFuncionario;
	public boolean possuiPlano;
	
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public boolean isPossuiPlano() {
		return possuiPlano;
	}
	public void setPossuiPlano(boolean possuiPlano) {
		this.possuiPlano = possuiPlano;
	}
	
	public String carteirinhaFuncionario (int idFuncionario, String nomeFuncionario, boolean possuiPlano) {
		int id = idFuncionario;
		String nome = nomeFuncionario;
		String temPlano;
		
		if (possuiPlano == true) {
			temPlano = "Sim.";
		} else {
			temPlano = "Não.";
		}
		return "ID:" + id + "\n" + "Nome:" + nome + "\n" + "Possui plano?" + temPlano;
	}	
}
