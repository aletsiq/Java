package tav.Model.planoMedico;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    Medico medicos = new Medico();
   
    
    List<String> hour1 = new ArrayList<>();
    Enderecos endereco1 = new Enderecos();
    DateTime date1 = new DateTime("2020/01/03", hour1);
    
    Medico AddAgenda1() {
         
       
        date1.AddHour("13:00");
        date1.AddHour("14:00");
        
        
        endereco1.adicionarEnderecos("Rua dos Bobos, 0", date1);
        medicos.adicionarMedico(1, "Jose", "Ortopedista", endereco1);
		
        return medicos;
    }
    
    DateTime getDate1() {
    	return date1;
    }
    
    Enderecos getEndereco1() {
    	return endereco1; 
    }
}