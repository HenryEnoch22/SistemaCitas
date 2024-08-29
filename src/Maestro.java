public class Maestro {
    //Atributos
    int id;
    String nombre;
    String especialidad;

    //Constructor
    Maestro() {
        System.out.println("Hola yo me ejecute primero");
    }

    //Comportamientos
    public void mostrarNombre(){
        System.out.println("Nombre: " + this.nombre);
    }


}
