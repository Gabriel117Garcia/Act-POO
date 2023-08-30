public class Estudiante extends Usuario{
    //Atributos
    private String semestre;

    //Constructor
    Estudiante(String nombre, String correo){
        super(nombre, correo);
    }

    //Método
    public void mostrarNombre(){
        System.out.println("Hola mi nombre es: " + getNombre());
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}
