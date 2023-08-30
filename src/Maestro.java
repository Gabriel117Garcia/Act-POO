import java.util.ArrayList;
import java.util.Date;

public class Maestro extends Usuario{
    //Atributos
    private String especialidad;
    private String rfc;



    //Constructor
    Maestro(String nombre, String correo){
        super(nombre, correo);
    }


    //Metodos

    public void mostrarNombre(){
        System.out.println("Hola mi nombre es: " + getNombre());
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    ArrayList<CursoDisponible> cursosDisponibles = new ArrayList<>();
    public void addCursoDisponible(Date fecha, String hora){
        cursosDisponibles.add(new Maestro.CursoDisponible(fecha, hora));
    }

    public ArrayList<CursoDisponible> getCursosDisponibles(){
        return cursosDisponibles;
    }

    public static class CursoDisponible{
        private int id_cursoDisponible;
        private Date fecha;
        private String hora;

        public CursoDisponible(Date fecha, String hora){
            this.fecha = fecha;
            this.hora = hora;
        }

        public int getId_cursoDisponible() {
            return id_cursoDisponible;
        }

        public void setId_cursoDisponible(int id_cursoDisponible) {
            this.id_cursoDisponible = id_cursoDisponible;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public String getHora() {
            return hora;
        }

        public void setHora(String hora) {
            this.hora = hora;
        }
    }
}