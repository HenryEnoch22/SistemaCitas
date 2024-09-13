public class Secretaria extends Usuario{
    private String especialidad;
    private String turno;

    public Secretaria(String nombre, String correo, String especialidad, String turno) {
        super(nombre, correo);
        this.especialidad = especialidad;
        this.turno = turno;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", especialidad: " + especialidad +
                ", turno: " + turno;
    }
}
