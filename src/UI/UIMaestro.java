package UI;
import static UI.IUMenu.*;

import Models.Maestro;
import com.sun.source.tree.SwitchTree;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMaestro {

    public static ArrayList<Maestro> maestrosConTutorias = new ArrayList<>();

    public static void maestroMenu(){
        Scanner in  = new Scanner(System.in);
        int respuesta = 0;
//        System.out.println("..:: Maestro - " + maestroLogeado.getNombre());
        do{
            System.out.println("..:: Maestro ::..");
            System.out.println("Seleccione opción");
            System.out.println("1. Agregar tutorias");
            System.out.println("2. Listar tutorias");
            System.out.println("3. Salir");

            respuesta = in.nextInt();

            switch(respuesta){
                case 1:
                    agregarTutoria();
                    break;
                    case 2:
                        listarTutorias();
                        break;
                        case 3:
                            System.out.println("Salir");
                            break;
                            default:
                                System.out.println("Opcion no valida");
                                break;

            }
        }while(respuesta != 0);
    }

    public static void agregarTutoria(){
        boolean banderaExterna = true;
        do{
            System.out.println("Ingresa la fecha del curso: [dd/mm/yyyy]");
            Scanner in = new Scanner(System.in);
            String fecha = in.nextLine();
            System.out.println("Ingresa la hora: [00:00]");
            String hora = in.nextLine();

            boolean banderaInterna = true;
            do{
                System.out.println("La tutoria es : " + fecha + " " + hora);
                System.out.println("""
                        1. Agregar Tutoria
                        2. Cambiar 
                        """);
                int respuesta = in.nextInt();
                if(respuesta == 2){
                    banderaInterna = false;
                }else if(respuesta == 1){
                    banderaInterna = false;
                    banderaExterna = false;
                    maestroLogeado.addTutoriaDisponible(fecha, hora);
                    consultarMaestroConTutoria(maestroLogeado);
                }else{
                    System.out.println("Opcion no valida");
                }
            }while(banderaInterna);
        }while(banderaExterna);
    }

    private static void consultarMaestroConTutoria(Maestro maestro) {
        if(!maestrosConTutorias.contains(maestro)){
            maestrosConTutorias.add(maestro);
        }
    }

    public static void listarTutorias(){
        System.out.println("Listado de tutorías: ");
        if(maestroLogeado.getTutoriasDisponibles().size() == 0){
            System.out.println("No hay registros.\n");
        }

        int j = 1;
        for(int i = 0; i < maestroLogeado.getTutoriasDisponibles().size(); i++){
            System.out.println(j +  ". " + maestroLogeado.getTutoriasDisponibles().get(i).getFecha() + " " + maestroLogeado.getTutoriasDisponibles().get(i).getHora());
            j++;
        }
        System.out.println();
    }


}
