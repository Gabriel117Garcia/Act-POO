public class Maestro {
    //Atributos
    public static int id = 0; //id++
    public String nombre;
    public String correo;
    public String especialidad;

    //Constructor
    Maestro(){
        System.out.println("Objeto maestro creado.");
        id++;
    }

    Maestro(String nombre, String correo){
        this.nombre = nombre;
        this.correo = correo;
        id++;
    }

    //Metodos
    public void mostrarNombre(){
        System.out.println("Mi nombre es " + nombre);
    }

    public void mostrarId(){
        System.out.println("El ID del maestro es: " + id);
    }

}