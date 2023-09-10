package UI;

import java.util.Scanner;

public class UISecretaria {

    public static void menuSecretaria(){
        System.out.println("..::Secretaria::..");
        System.out.println("Bienvenido: " + UIMenu.estudianteLogeado.getNombre());
        System.out.println("Seleccione una opcion: ");
        System.out.println("1. Administrar cursos");
        System.out.println("2. Ver todos los cursos");
        System.out.println("3. Cancelar");

        int respuesta = 0;
        do{
            Scanner sc = new Scanner(System.in);
            respuesta = sc.nextInt();

            switch(respuesta){
                case 1:
                    System.out.println("..::Administrar cursos::..");
                    break;
                case 2:
                    System.out.println("..::Ver todos los cursos::..");
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
}
