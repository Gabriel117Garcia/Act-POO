public class Usuario {
    //Atributos
    private int id;
    private String nombre;
    private String correo;
    private String matricula;
    private String telefono;

    public Usuario(String nombre, String correo){
        this.nombre = nombre;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Hola me llamo" + nombre + ", mi correo es " + correo + ", mi matricula es " + matricula + " y mi telefono es " + telefono;
    }

    public String getNombre() {
        return nombre;
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
        if (telefono.length() != 10){
            System.out.println("El número de teléfono debe ser de 10 dígitos");
        }
        else{
            this.telefono = telefono;
        }
    }
}
