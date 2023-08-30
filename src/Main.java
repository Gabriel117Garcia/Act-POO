import static UI.UIMenu.*;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!\n");

        Estudiante estudiante1 = new Estudiante("Rocael López", "rolopez@uv.mx");
        estudiante1.mostrarNombre();

        estudiante1.setNombre("Carlos Cortés");
        System.out.println(estudiante1.getNombre());
        estudiante1.setTelefono("7876767676");
        System.out.println(estudiante1.getTelefono());

        //mostrarMenu();

    }
}