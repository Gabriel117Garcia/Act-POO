package UI;

import Model.Estudiante;
import Model.Maestro;
import Model.Secretaria;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static Maestro maestroLogeado;
    public static Estudiante estudianteLogeado;
    private int tipoUsuario;

    public static void mostrarMenu(){
        System.out.println("..:::Bienvenido:::..");
        System.out.println("Seleccione una opcion: ");
        System.out.println("1. Maestros");
        System.out.println("2. Estudiantes");
        System.out.println("3. Salir");

        int respuesta;


        do {
            Scanner sc = new Scanner(System.in);
            respuesta = sc.nextInt();

            switch(respuesta){
                case 1:
                    System.out.println("..::Maestro::..");
                    loginUsuario(1);

                    //Login Usuario
                    break;
                case 2:
                    System.out.println("..::Estudiante::..");
                    UIEstudiante.menuEstudiante();
                    break;
                case 3:
                    System.out.println("..::Adiós::..");
                    break;
                default:
                    System.out.println("Seleccione una opcion correcta.");
                    break;
            }
        } while (respuesta != 3);

    }

    private static void loginUsuario(int tipoUsuario){
        //Maestros T1
        //Estudiantes T2
        //Secretarias
        ArrayList<Maestro> maestros = new ArrayList<>();
        maestros.add(new Maestro("", ""));
        maestros.add(new Maestro("", ""));
        maestros.add(new Maestro("", ""));
        maestros.add(new Maestro("", ""));

        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Diego Domínguez", "didominguez@uv.mx"));
        estudiantes.add(new Estudiante("José Manzano", "jomanzano@uv.mx"));
        estudiantes.add(new Estudiante("Carlos Cortés", "cacortes@uv.mx"));
        estudiantes.add(new Estudiante("Victor Luévano", "vluevano@uv.mx"));

        ArrayList<Secretaria> secretarias = new ArrayList<>();
        secretarias.add(new Secretaria("Luisa González", " "));
        secretarias.add(new Secretaria("Sofía Martínez", " "));
        secretarias.add(new Secretaria("Jorge Sánchez", " "));

        System.out.println("Ingrese su correo: ");
        Scanner sc = new Scanner(System.in);
        String correo = sc.nextLine();

        boolean correoCorrecto = false;

        do{
            if(tipoUsuario == 1){
                for( Maestro maestro:maestros){
                    if(maestro.getCorreo().equals(correo)){
                        correoCorrecto = true;
                        maestroLogeado = maestro;
                        UIMaestro.mostrarMenuMaestro();
                    }
                }
            }
            System.out.println("Correo incorrecto");

            if(tipoUsuario == 2){
                for( Estudiante estudiante:estudiantes){
                    if(estudiante.getCorreo().equals(correo)){
                        correoCorrecto = true;
                        estudianteLogeado = estudiante;
                        UIEstudiante.menuEstudiante();
                    }
                }
            }
        }while (!correoCorrecto);


    }
}
