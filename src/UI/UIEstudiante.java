package UI;

import Models.Maestro;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UIEstudiante {
    public final static String [] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};


    public static void estudianteMenu(){
        int respuesta = 0;
        do{
            System.out.println("..:: Estudiantes ::..");
            System.out.println("1. Agendar tutoria");
            System.out.println("2. Mis tutorias");
            System.out.println("0. Calcelar");

            Scanner in = new Scanner(System.in);
            respuesta = Integer.valueOf(in.nextLine());

            switch(respuesta){
                case 1:
                    agendarTutoria();
                    break;
                case 2:
                    listarTutorias();
                    break;
                case 0:
                    System.out.println("Saliendo..."); break;
                default:
                    System.out.println("Por favor ingrese una opción valida.");
            }
        }while(respuesta != 0);
    }


    public static void agendarTutoria() {
        System.out.println("..:: Agendar Tutoria ::..");

        int respuestaConfirmacion = 0;
        do {
            System.out.println("Seleccione un maestro: ");

            for (Maestro maestro : UIMaestro.maestrosConTutorias) {
                int i = UIMaestro.maestrosConTutorias.indexOf(maestro) + 1;
                System.out.println(i + ". " + maestro.getNombre());
            }

            Scanner sc = new Scanner(System.in);
            int respuestaMaestro = sc.nextInt();

            System.out.println("Seleccione una tutoria: ");
            Maestro maestroSeleccionado = UIMaestro.maestrosConTutorias.get(respuestaMaestro - 1);
            System.out.println(maestroSeleccionado.getNombre());

            for (Maestro.TutoriasDisponibles td : maestroSeleccionado.getTutoriasDisponibles()) {
                System.out.println((maestroSeleccionado.getTutoriasDisponibles().indexOf(td) + 1) + ". " + td.getFecha() + " - " + td.getHora());
            }

            int tutoriaSeleccionada = sc.nextInt();

            do{
                System.out.println("Maestro: " + maestroSeleccionado.getNombre() + ", Tutoria: "
                        + maestroSeleccionado.getTutoriasDisponibles().get(tutoriaSeleccionada - 1));
                System.out.println("""
                        1. Para continuar
                        2. Para cambiar tutoria
                        """);
                respuestaConfirmacion = sc.nextInt();
            }while(respuestaConfirmacion<1 || respuestaConfirmacion>2);

                if(respuestaConfirmacion == 1){
                    //Agenda
                    Maestro.TutoriasDisponibles ts = maestroSeleccionado.getTutoriasDisponibles().get(tutoriaSeleccionada-1);
                    IUMenu.estudianteLogeado.añadirTutoriaMaestro(maestroSeleccionado, ts.getFechaDate(), ts.getHora());
                }
        } while (respuestaConfirmacion != 1);
    }

    private static void listarTutorias() {
        System.out.println("..:: Mis tutorias ::..");
    }
}
