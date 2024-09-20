import Models.Estudiante;
import Models.Maestro;
import UI.UIMaestro;

import static UI.IUMenu.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        maestros.add(new Maestro("Luis Morales", "luis@gmail", "125466", 1, "Ing Software"));
        maestros.add(new Maestro("Javier Pino", "jpino@gmail", "1254566", 2, "Ing Software"));
        maestros.add(new Maestro("Magdiel", "mamercado@gmail", "12748486", 3, "Ing Software"));
        maestros.add(new Maestro("Paty", "pmartinez@gmail", "18486", 4, "Ing Software"));

        estudiantes.add(new Estudiante("Ricardo Landa", "tilininsano@gmail", "851666", "12254", "Quinto"));
        estudiantes.add(new Estudiante("Alexis Nava Moya", "amoyao@gmail", "851666", "12255", "Quinto"));

        mostrarMenu();

//        UIMaestro.agregarTutoria();


//        Maestro maestro = new Maestro("Tilin", "amorales@gmail.com", "92410215456", 123456, "Ingeniero" );
//
//        // Agregar tutorias
//        maestro.addTutoriaDisponible(new Date(), "12:00");
//        maestro.addTutoriaDisponible(new Date(), "14:00");
//        maestro.addTutoriaDisponible(new Date(), "16:00");
//
//        System.out.println(maestro);



//        IBoton boton = new IBoton() {
//            @Override
//            public void pulsar() {
//                System.out.println("Encendiendo...");
//            }
//        };
//
//        boton.pulsar();






        //Listar tutorias
//        System.out.println(maestro.getNombre());
//        System.out.println("Cursos disponibles: ");
//        for(Models.Maestro.TutoriasDisponibles td : maestro.getTutoriasDisponibles()){
//            System.out.println(td.getFecha() + " " + td.getHora());
//        }

//        Models.ClaseExterna ce = new Models.ClaseExterna();
//        ce.metodoExtero();

    }
}