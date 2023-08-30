public class Estudiante {
    //Atributos
    private String nombre;
    private String correo;
    private String matricula;
    private String telefono;
    private String semestre;

    //Constructor
    Estudiante(String nombre, String correo){
        this.nombre = nombre;
        this.correo = correo;
    }

    //Método
    public void mostrarNombre(){
        System.out.println("Hola mi nombre es: " + nombre);
    }

    public String getNombre() {
        return "Mi nombre es: " + nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.length() != 10)
            System.out.println("Ingrese un número válido");
        else {
            this.telefono = telefono;
        }
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}
