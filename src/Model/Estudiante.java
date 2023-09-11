package Model;

import java.util.ArrayList;
import java.util.Date;

public class Estudiante extends Usuario {

    // ArrayList de citas
    private ArrayList<CitaMaestro> citasMaestro = new ArrayList<>();

    public ArrayList<CitaMaestro> getCitasMaestro() {
        return citasMaestro;
    }

    public void agregarCitaMaestro(Maestro maestro, Date fecha, String hora) {
        CitaMaestro cita = new CitaMaestro(maestro, this);
        cita.agendar(fecha, hora);
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