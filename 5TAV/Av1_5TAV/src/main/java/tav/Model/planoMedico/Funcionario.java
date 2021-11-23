package tav.Model.planoMedico;

public class Funcionario {
	
	public int idFuncionario;
	public String nomeFuncionario;
	public String planoTipo;
	
	public Funcionario (int idFuncionario, String nomeFuncionario, String planoTipo) {
		this.idFuncionario = idFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.planoTipo = planoTipo;
	}

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

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

	public String getPlanoTipo() {
		return planoTipo;
	}

	public void setPlanoTipo(String planoTipo) {
		this.planoTipo = planoTipo;
	}

}
