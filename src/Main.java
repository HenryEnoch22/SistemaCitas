import com.sun.source.tree.MemberSelectTree;

import java.util.Date;

import static UI.IUMenu.*;

public class Main {
    public static void main(String[] args) {

//        mostrarMenu();

        Maestro maestro = new Maestro("Tilin", "amorales@gmail.com", "92410215456", 123456, "Ingeniero" );
        System.out.println(maestro);

//        IBoton boton = new IBoton() {
//            @Override
//            public void pulsar() {
//                System.out.println("Encendiendo...");
//            }
//        };
//
//        boton.pulsar();


//        // Agregar tutorias
//        maestro.addCursoDisponible(new Date(), "12:00");
//        maestro.addCursoDisponible(new Date(), "14:00");
//        maestro.addCursoDisponible(new Date(), "16:00");

        //Listar tutorias
//        System.out.println(maestro.getNombre());
//        System.out.println("Cursos disponibles: ");
//        for(Maestro.TutoriasDisponibles td : maestro.getTutoriasDisponibles()){
//            System.out.println(td.getFecha() + " " + td.getHora());
//        }

//        ClaseExterna ce = new ClaseExterna();
//        ce.metodoExtero();

    }
}