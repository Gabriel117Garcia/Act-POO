package UI;

public class UISecretaria {

    public static void menuSecretaria(){
        System.out.println("..::Secretaria::..");
        System.out.println("Bienvenido: " + UIMenu.estudianteLogeado.getNombre());
        System.out.println("Seleccione una opcion: ");
        System.out.println("1. Administrar cursos");
        System.out.println("2. Ver todos los cursos");
        System.out.println("3. Cancelar");
    }
}
