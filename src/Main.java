import com.sun.source.tree.MemberSelectTree;

import java.util.Date;

import static UI.IUMenu.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

//        mostrarMenu();

        Maestro maestro =  new Maestro("Henry", "Algo");

        // Agregar tutorias
        maestro.addCursoDisponible(new Date(), "12:00");
        maestro.addCursoDisponible(new Date(), "14:00");
        maestro.addCursoDisponible(new Date(), "16:00");

        //Listar tutorias
        System.out.println(maestro.getId() + ": " + maestro.getNombre());
        System.out.println("Cursos disponibles: ");
        for(Maestro.TutoriasDisponibles td : maestro.getTutoriasDisponibles()){
            System.out.println(td.getFecha() + " " + td.getHora());
        }


    }
}