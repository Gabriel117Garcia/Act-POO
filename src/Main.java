import static UI.UIMenu.*;

import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!\n");

        Maestro maestro1 = new Maestro("Luis Morales", "luismorales@uv.mx");
        System.out.println(maestro1.getNombre());

        maestro1.addCursoDisponible(new Date(), "7:00");
        maestro1.addCursoDisponible(new Date(), "8:00");
        maestro1.addCursoDisponible(new Date(), "9:00");
        maestro1.addCursoDisponible(new Date(), "10:00");

       for (Maestro.CursoDisponible cursosDisponibles : maestro1.getCursosDisponibles()) {
           System.out.println(cursosDisponibles);
       }

        /*Estudiante estudiante1 = new Estudiante("Rocael López", "rolopez@uv.mx");
        estudiante1.mostrarNombre();

        estudiante1.setNombre("Carlos Cortés");
        System.out.println(estudiante1.getNombre());
        estudiante1.setTelefono("7876767676");
        System.out.println(estudiante1.getTelefono());*/
        //System.out.println(maestro1);


        }
    //mostrarMenu();
}