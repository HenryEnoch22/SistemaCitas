package UI;
import static UI.IUMenu.*;

import com.sun.source.tree.SwitchTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UIMaestro {
    public static void maestroMenu(){
        Scanner in  = new Scanner(System.in);
        int respuesta;

        do{
            System.out.println("..:: Maestro ::..");
            System.out.println("Seleccione opción");
            System.out.println("1. Agregar curso");
            System.out.println("2. Listar curso");
            System.out.println("3. Salir");

            respuesta = in.nextInt();

            switch(respuesta){
                case 1:
                    System.out.println("Agregar curso");

                    break;
                    case 2:
                        System.out.println("Listar curso");
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
        System.out.println("Agregar Tutoria");
        System.out.println("Ingresa la fecha del curso: [dd/mm/yyyy]");
        Scanner in = new Scanner(System.in);
        String fecha = in.nextLine();
        System.out.println("Ingresa la hora: [00:00]");
        String hora = in.nextLine();

    }

    public static void listarCursos(){
        System.out.println("Listado de cursos: ");
    }


}
