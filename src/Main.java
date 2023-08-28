import static UI.UIMenu.*;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\n");

        Maestro maestro = new Maestro();
        Maestro maestro2 = new Maestro("Habib Jacinto", "hjacinto@uv.mx");

        mostrarMenu();

    }
}