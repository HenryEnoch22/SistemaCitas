import java.util.SplittableRandom;

public class Estudiante extends Usuario{
    private String matricula;
    private String semestre;

    public Estudiante(String matricula, String semestre) {
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
}
