package Models;

import java.util.ArrayList;
import java.util.Date;

public class Estudiante extends Usuario {
    private String matricula;
    private String semestre;
    ArrayList<CitaMaestro> tutoriasAgendadas = new ArrayList();

    public Estudiante(String nombre, String correo, String telefono, String matricula, String semestre) {
        super(nombre, correo, telefono);
        this.matricula = matricula;
        this.semestre = semestre;
    }



    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void añadirTutoriaMaestro(Maestro maestro, Date fecha, String hora) {
        tutoriasAgendadas.add(new CitaMaestro(maestro, this));
    }

    @Override
    public String toString() {
        return super.toString() + ", Matricula: " + matricula + ", Semestre:" + semestre;
    }
}
