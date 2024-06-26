package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    static{ //Bloque de inicialización estático
        System.out.println("Ejecución bloque estático");
        ++Persona.contadorPersona;
        //idPersona = 10; No es estático por esto tenemos un error
    }
    { //Bloque de inicialización NO estático (contexto dinámico)
        System.out.println("Ejecución del bloque NO estático");
        this.idPersona = Persona.contadorPersona++; //Incrementamos el atributo
    }
    
    //Los bloques de inicialización se ejecutan antes del constructor
    public Persona(){
        System.out.println("Ejecución del constructor");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
