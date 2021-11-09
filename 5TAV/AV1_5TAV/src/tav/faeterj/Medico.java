package tav.faeterj;


public class Medico<T1, T2> {
    public final T1 nome;
    public final T2 endereco;

    public Medico(T1 first, T2 second) {
        this.nome = first;
        this.endereco = second;
    }

    public T1 getKey() {
        return nome;
    }

    public T2 getValue() {
        return endereco;
    }
    
    public static Medico<String, String> Ortopedista() {
    	return new Medico <String, String>("Hudson", "Rua ABC");
    }
    
    public static Medico<String, String> ClinicoGeral() {
    	return new Medico <String, String>("Nelson", "Rua B");
    }
    
    public static Medico<String, String> Laboratorio() {
    	return new Medico <String, String>("Laboratorio Albert Einstein", "Rua 3190");
    }
    
    public static Medico<String, String> Internacao() {
    	return new Medico <String, String>("Hospital Newman", "Rua do Pavão");
    }
}