
public class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static void main(String[] args) {
        Persona Persona1 = new Persona();
        Persona1.setEdad(25);
        Persona1.setNombre("Lucas");
        Persona1.setTelefono("3512159065");

        System.out.println("La edad de la persona1 es = " + Persona1.getEdad());
        System.out.println("El nombre de la persona1 es = " + Persona1.getNombre());
        System.out.println("El numero telefonico de la persona1 es = " + Persona1.getTelefono());
    }
}
