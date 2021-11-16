public class main {

    public static void main(String[] args) {
        
        Persona Fabio = Persona.getSingletonInstance("Fabio Benitez");
        Persona Luis = Persona.getSingletonInstance("Luis Lopez");
        
        // ricardo y ramon son referencias a un único objeto de la clase SoyUnico
        System.out.println(Fabio.getNombre());
        System.out.println(Luis.getNombre());   

    }
    
}
