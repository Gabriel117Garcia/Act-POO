package UI;

import Model.Estudiante;
import Model.Maestro;

import java.util.List;
import java.util.Scanner;

import static UI.UIMenu.estudiantes;
import static UI.UIMenu.secretariaLogeada;

public class UISecretaria {

    public static void menuSecretaria(){
        System.out.println("..::Secretaria::..");
        System.out.println("Bienvenido: " + secretariaLogeada.getNombre());
        System.out.println("Seleccione una opcion: ");
        System.out.println("1. Agendar curso");
        System.out.println("2. Ver todos los cursos");
        System.out.println("3. Cancelar");

        int respuesta = 0;
        do{
            Scanner sc = new Scanner(System.in);
            respuesta = sc.nextInt();

            switch(respuesta){
                case 1:
                    System.out.println("..::AgendarUnCurso::..");
                    agendarCurso();
                    break;
                case 2:
                    System.out.println("..::Ver todos los cursos::..");
                    imprimirTodosLosCursos();
                    break;
                case 3:
                    System.out.println("..::Adiós::..");
                    UIMenu.mostrarMenu();
                    break;
                default:
                    System.out.println("Seleccione una opcion correcta.");
                    break;
            }
        } while (respuesta != 3);
    }

    public static void agendarCurso(){
        Scanner sc = new Scanner(System.in);
        // Listar estudiantes disponibles
        System.out.println("Estudiantes disponibles:");
        for (int i = 0; i < UIMenu.estudiantes.size(); i++) {
            Estudiante estudiante = UIMenu.estudiantes.get(i);
            System.out.println((i + 1) + ". " + estudiante.getNombre());
        }
        // El usuario selecciona un estudiante
        int respuestaEstudiante = Integer.valueOf(sc.nextLine());
        Estudiante estudianteSeleccionado = UIMenu.estudiantes.get(respuestaEstudiante - 1);
        // Listar maestros con cursos disponibles
        System.out.println("Maestros con cursos disponibles:");
        int respuestaMaestro;
        do {
            for (int i = 0; i < UIMenu.maestros.size(); i++) {
                Maestro maestro = UIMenu.maestros.get(i);
                if (maestro.getCursosDisponibles().size() > 0) {
                    System.out.println((i + 1) + ". " + maestro.getNombre());
                }
            }
            // El usuario selecciona un maestro
            respuestaMaestro = Integer.valueOf(sc.nextLine());
            if (UIMenu.maestros.get(respuestaMaestro).getCursosDisponibles().isEmpty()) {
                System.out.println("No existen cursos disponibles.");
                menuSecretaria();
            }else if (respuestaMaestro < 1 || respuestaMaestro > UIMenu.maestros.size()) {
                System.out.println("Seleccione una opción correcta.");
            }
        } while (respuestaMaestro < 1 || respuestaMaestro > UIMenu.maestros.size() || UIMenu.maestros.get(respuestaMaestro - 1).getCursosDisponibles().isEmpty());
        Maestro maestroSeleccionado = UIMenu.maestros.get(respuestaMaestro - 1);
        // Listar los cursos del maestro seleccionado
        System.out.println("Cursos disponibles del maestro " + maestroSeleccionado.getNombre());
        for (int i = 0; i < maestroSeleccionado.getCursosDisponibles().size(); i++) {
            System.out.println((i + 1) + ". " + maestroSeleccionado.getCursosDisponibles().get(i).getFecha(null)
                    + " " + maestroSeleccionado.getCursosDisponibles().get(i).getHora());
        }
        // El usuario selecciona un curso del maestro
        System.out.println("Seleccione un curso: ");
        int respuestaCurso = Integer.valueOf(sc.nextLine());
        Maestro.CursoDisponible cursoSeleccionado = maestroSeleccionado.getCursosDisponibles().get(respuestaCurso - 1);
        // Solicitar confirmación del maestro y curso seleccionado
        System.out.println("Confirma la cita con el maestro " + maestroSeleccionado.getNombre() + " para el estudiante " +
                estudianteSeleccionado.getNombre() + " el día " + cursoSeleccionado.getFecha() +
                " a las " + cursoSeleccionado.getHora() + "?");
        // En caso de confirmación, agregar el objeto CitaMaestro al estudiante logeado
        System.out.println("1. Confirmar");
        System.out.println("2. Cancelar");
        int respuesta = Integer.valueOf(sc.nextLine());
        if (respuesta == 1) {
            estudianteSeleccionado.agregarCitaMaestro(maestroSeleccionado, cursoSeleccionado.getFecha(), cursoSeleccionado.getHora());
            System.out.println("Cita agendada correctamente.");
            UIMenu.mostrarMenu();
        } else {
            System.out.println("Cita cancelada.");
        }
    }

    public static void imprimirTodosLosCursos() {
        List<Maestro> maestros = UIMenu.maestros;
        for (Maestro maestro : maestros) {
            List<Maestro.CursoDisponible> cursosDisponibles = maestro.getCursosDisponibles();
            if (!cursosDisponibles.isEmpty()) {
                System.out.println("Cursos disponibles para el maestro " + maestro.getNombre() + ":");
                for (Maestro.CursoDisponible curso : cursosDisponibles) {
                    System.out.println("Fecha: " + curso.getFecha() + ", Hora: " + curso.getHora());
                }
            }
        }
    }
}