package Model;

import java.util.ArrayList;

public class Estudiante extends Usuario{

    // ArrayList de citas
    private static ArrayList<CitaMaestro> citasMaestro = new ArrayList<>();

    public static ArrayList<CitaMaestro> getCitasMaestro() {
        return citasMaestro;
    }

    public static void setCitasMaestro(ArrayList<CitaMaestro> citasMaestro) {
        Estudiante.citasMaestro = citasMaestro;
    }
    public void agregarCitaMaestro(CitaMaestro cita) {
        citasMaestro.add(cita);
    }



    //Atributos
    private String semestre;

    //Metodo constructor
    public Estudiante(String nombre, String correo){
        super(nombre,correo);
    }

    //Comportamientos
    public void mostrarNombre(){
        System.out.println("Mi nombre es: " + getNombre());
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return super.toString() + ", Semestre: " + semestre;
    }

    @Override
    public void mostrarInformacionUsuario() {
        System.out.println("Soy un estiante de LIS");
    }
}