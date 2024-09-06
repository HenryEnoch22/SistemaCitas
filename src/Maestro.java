import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Maestro {
    //Atributos
    private static int ID = 1;
    int id = 0;
    private String nombre;
    private String especialidad;

    //Constructor
    Maestro(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        id = ID++;
    }

    //Comportamientos
    public void mostrarNombre(){
        System.out.println("Nombre: " + this.nombre);
    }

    public void mostrarID(){
        System.out.println("ID: " + this.id);
    }

    //Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    ArrayList<TutoriasDisponibles> tutoriasDisponibles = new ArrayList<>();

    public void addCursoDisponible(Date fecha, String hora){
        tutoriasDisponibles.add(new TutoriasDisponibles(fecha, hora));
    }

    public ArrayList<TutoriasDisponibles> getTutoriasDisponibles() {
        return tutoriasDisponibles;
    }

    public static class TutoriasDisponibles{
        private int id;
        private Date fecha;
        private String hora;


        TutoriasDisponibles(Date fecha, String hora) {
            this.fecha = fecha;
            this.hora = hora;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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
