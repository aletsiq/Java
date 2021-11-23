package tav.Model.planoMedico;

import tav.Interfaces.planoMedico.IMedico;



public class Agendamento {
	public int id;
	public int idFuncionario;
	public int CRM;
	public String endereco;
	public String data;
	public String hora;
	String tipo;
	
	public Agendamento() {};
	
	public Agendamento (int _id, int _idFuncionario, String _tipo, int _CRM, String _endereco, String _data, String _hora) {
		id = _id;
		idFuncionario = _idFuncionario;
		CRM = _CRM;
		endereco = _endereco;
		data = _data;
		hora = _hora;
		tipo = _tipo;
	}
	
	public String carteirinhaFuncionario (int _idFuncionario, String _nomeFuncionario, String _possuiPlano) {
		return "ID:" + _idFuncionario + "\n" + "Nome:" + _nomeFuncionario + "\n" + "Possui plano?" + _possuiPlano;
	}	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public int getCRM() {
		return CRM;
	}

	public void setCRM(int cRM) {
		CRM = cRM;
	}
	
	Agenda agendar = new Agenda();
	Medico medico1 = new Medico();
	Enderecos enderecos1 = new Enderecos();	
    DateTime date1 = new DateTime();
	
	public boolean ValidaCRM(IMedico medico) {
		medico1 = agendar.AddAgenda1();
		boolean retVal = true;
		 for(Medico m : medico1.getMedicos()) {
	        	if(!m.getCRM().equals(CRM) || medico == null) {
	        		retVal = false;
	        		break;
	        	}
		 }
		 return retVal;
	}
	
	public boolean ValidaEndereco(IMedico medico) {
		medico1 = agendar.AddAgenda1();
        enderecos1 = agendar.getEndereco1();
        
		boolean retVal = true;
		 for(Medico m : medico1.getMedicos()) {
	        	if(m.getCRM().equals(CRM)){
	        		for(Enderecos e: enderecos1.getEnderecos()) {
	        			if(!e.getAddress().equals(endereco)) {
	        				retVal = false;
	        				break;
	        			}
	        	}
	        	}
		 }
		 return retVal;
	}
	
	public boolean ValidaDataPorEndereco(IMedico medico) {
		medico1 = agendar.AddAgenda1();
        enderecos1 = agendar.getEndereco1();
        date1 = agendar.getDate1();
        
		boolean retVal = true;
		for(Medico m : medico1.getMedicos()) {
        	if(m.getCRM().equals(CRM)) {
        		for(Enderecos e: enderecos1.getEnderecos()) {
        			if(e.getAddress().equals(endereco)) {
        				if(!date1.getDate().equals(data)) {
        						retVal = false;
        						break;
	        			}
        			}
        		}
        	}
		}
    	return retVal;
	}
	
	public boolean ValidaHoraPorData(IMedico medico) {
		medico1 = agendar.AddAgenda1();
        enderecos1 = agendar.getEndereco1();
        date1 = agendar.getDate1();
        
        boolean retVal;
        retVal = true;
		for(Medico m : medico1.getMedicos()) {
        	if(m.getCRM().equals(CRM)) {
        		for(Enderecos e: enderecos1.getEnderecos()) {
        			if(e.getAddress().equals(endereco)) {
        				if(date1.getDate().equals(data)) {
        					for(String d : date1.getHour()) {
        						if(!d.equals(hora)) {
        							retVal = false;
        						}
        					}
        				}
        			}
        		}
        	}	
        }
		return retVal;
	}
	public boolean ValidaCobertura(String planoTipo) {
		boolean retVal = false;
		if(planoTipo.equals("Completo")) {
			retVal = true;
		} else {
			if (planoTipo.equals(tipo)) {
				retVal = true;
			}
		}
		return retVal;
	}
}
