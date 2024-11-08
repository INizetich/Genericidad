import java.lang.Object;
public class Persona implements Comparable<Persona> {
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;


    public Persona(){
        this.nombre = null;
        this.apellido = null;
        this.dni = null;
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, String dni,int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int hashCode() {
        return dni.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Verifica si son la misma referencia
        if (obj == null || getClass() != obj.getClass()) return false; // Compara la clase
        Persona persona = (Persona) obj;
        return dni.equals(persona.getDni()); // Compara por DNI
    }

    @Override
    public int compareTo(Persona o) {
        int apellido = this.apellido.compareTo(o.apellido);
        if(apellido != 0) return apellido;
        int dni = this.dni.compareTo(o.dni);
        if(dni != 0) return dni;
        int edad = this.edad - o.edad;
        if(edad != 0) return edad;
        return nombre.compareTo(o.nombre);
    }
}