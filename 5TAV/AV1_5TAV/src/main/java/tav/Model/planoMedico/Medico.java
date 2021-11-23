package tav.Model.planoMedico;

import java.util.ArrayList;

import tav.Interfaces.planoMedico.IMedico;

public class Medico implements IMedico {

    public Integer CRM;
    public String name;
    public String area;
    public Enderecos address;

	ArrayList<Enderecos> endereco = new ArrayList<>();
    ArrayList<Medico> medico = new ArrayList<>();

    public Medico() {

    }

    public Medico(Integer CRM, String name, String area, Enderecos address) {
        this.CRM = CRM;
        this.name = name;
        this.area = area;
        this.address = address;
    }

    public void adicionarMedico(Integer CRM, String name, String area, Enderecos address) {
        this.medico.add(new Medico(CRM, name, area, address));
        this.setCRM(CRM);
        this.setName(name);
        this.setArea(area);
        this.endereco.add(address);
        this.setAddress(address); 
    }

    public ArrayList<Medico> getMedicos() {
        return medico;
    }

    public void adicionarEndereco(Enderecos address) {
        this.endereco.add(address);
        setAddress(address);
    }

    public String toString() {
        return String.format("\nCRM: %d\nNome: %s\nEspecialidade: %s\n%s",
        getCRM(), getName(), getArea(), getAddress());
    }
    
    public void setCRM(Integer CRM) {
        this.CRM = CRM;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setAddress(Enderecos address) {
        this.address = address;
    }

    public Integer getCRM() {
        return this.CRM;
    }

    public String getName() {
        return this.name;
    }

    public String getArea() {
        return this.area;
    }

    public Enderecos getAddress() {
        return address;
    }
	public boolean ValidaCRM (IMedico medico){
		return true;
	}

	public boolean ValidaEndereco(IMedico medico) {
		return true;
	}

	public boolean ValidaDataPorEndereco(IMedico medico) {
		return true;
	}

	public boolean ValidaHoraPorData(IMedico medico) {
		return true;
	}
}