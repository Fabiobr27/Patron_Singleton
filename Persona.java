public class Persona {

  private String nombre;
  private static Persona persona;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Persona getPersona() {
        return persona;
    }
    

  private Persona(String nombre) {
    this.nombre = nombre;
    System.out.println("Mi nombre es: " + this.nombre);
  }

  public static Persona getSingletonInstance(String nombre) {
    if (persona == null) {
      persona = new Persona(nombre);
    } else {
      System.out.println(
        "No se puede crear el objeto " +
        nombre +
        " porque ya existe un objeto de la clase Persona"
      );
    }

    return persona;
  }
}
