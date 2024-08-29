public class Maestro {
    //Atributos
    public static int id = 0;
    String nombre;
    String especialidad;

    //Constructor
    Maestro() {
        System.out.println("Hola yo me ejecuté primero");
        id++;
    }

    //Comportamientos
    public void mostrarNombre(){
        System.out.println("Nombre: " + this.nombre);
    }

    public void mostrarID(){
        System.out.println("ID: " + this.id);
    }


}
