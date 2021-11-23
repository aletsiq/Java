package tav.Model.planoMedico;

import java.util.ArrayList;

public class Enderecos {
    
    public String address;
    public DateTime date;
    public ArrayList<String> hour;

    ArrayList<Enderecos> endereco = new ArrayList<>();

    public Enderecos() { 
    }

    public Enderecos(String address, DateTime date) {
        this.setAddress(address);
        this.setDate(date);
    }

    public void adicionarEnderecos(String address, DateTime date) {
        this.endereco.add(new Enderecos(address, date));
        setAddress(address);
        setDate(date);
    }

    public ArrayList<Enderecos> getEnderecos() {
        return this.endereco;
    }

    public String toString() {
        return String.format("Endereços: %s\n%s",
        getAddress(), getDate());
    }

    public String getAddress() {
        return this.address;
    }

    public DateTime getDate() {
        return this.date;
    }

    public ArrayList<String> getHour() {
        return this.hour;
    }

    public void setAddress(String address){
        this.address = address; 
    }

    public void setDate(DateTime date){
        this.date = date;
    }

    public void setHour(ArrayList<String> hour) {
        this.hour = hour;
    }

}