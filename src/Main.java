public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Maestro maestro1 = new Maestro();
        maestro1.nombre = "Morales";
        maestro1.mostrarNombre();
        maestro1.mostrarID();

        Maestro.id++;

        Maestro maestro2 = new Maestro();
        maestro2.nombre = "Nava";
        maestro2.mostrarNombre();
        maestro2.mostrarID();

        Maestro.id++;
        maestro1.mostrarID();


    }
}