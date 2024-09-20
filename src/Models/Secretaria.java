package Models;

import java.util.ArrayList;
import java.util.Date;

public class Secretaria extends Usuario {
    private String area;
    private String turno;

    public Secretaria(String nombre, String correo, String especialidad, String turno) {
        super(nombre, correo);
        this.area = especialidad;
        this.turno = turno;
    }

    public String getEspecialidad() {
        return area;
    }

    public void setEspecialidad(String especialidad) {
        this.area = especialidad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }


    ArrayList<Secretaria.TutoriasDisponibles> tutoriasDisponibles = new ArrayList<>();

    public void addTutoriaDisponible(String fecha, String hora) {
        tutoriasDisponibles.add(new Secretaria.TutoriasDisponibles(fecha, hora));
    }

    public ArrayList<Secretaria.TutoriasDisponibles> getTutoriasDisponibles() {
        return tutoriasDisponibles;
    }

    //CLASE ANIDADA
    public static class TutoriasDisponibles extends CitaTutoria {

        public TutoriasDisponibles(String fecha, String hora) {
            super(fecha, hora);
        }

//    @Override
//    public String toString() {
//        return super.toString() +
//                ", especialidad: " + area +
//                ", turno: " + turno;
//    }
    }
}
