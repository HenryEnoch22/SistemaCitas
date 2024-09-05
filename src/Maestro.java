public class Maestro {
    //Atributos
    private static int ID = 1;
    int id = 0;
    String nombre;
    String especialidad;

    //Constructor
    Maestro() {
        System.out.println("Hola, yo me ejecute porimero");
        id = ID++;
    }

    Maestro(String nombre) {
        this.nombre = nombre;
        id = ID++;
    }

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


}
