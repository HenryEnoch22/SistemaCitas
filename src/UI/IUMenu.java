package UI;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IUMenu {
    public final static String [] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};


    public static void mostrarMenu(){
        int respuesta = 0;
        do{
            System.out.println("..:: Bienvenido ::..");
            System.out.println("Selecciona una opción.");
            System.out.println("1. Maestros");
            System.out.println("2. Estudiantes");
            System.out.println("0. Salir");

            Scanner in = new Scanner(System.in);
            respuesta = Integer.valueOf(in.nextLine());

            switch(respuesta){
                case 1:
                    System.out.println("..:: Menú Mestros::..");
                    break;
                case 2:
                    estudianteMenu();
                    break;
                case 0:
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Por favor ingrese una opción válida");
            }
        }while(respuesta != 0);
    }


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
                    System.out.println("..:: Agendar tutoria ::..");
                    System.out.println("Selecciona una opcion.");
                    for(int i = 1; i <= MESES.length; i++){
                        System.out.println(i + ". " + MESES[i-1]);
                    }
                    break;
                case 2:
                    System.out.println("..:: Mis tutorias ::.."); break;
                case 0:
                    System.out.println("Saliendo..."); break;
                default:
                    System.out.println("Por favor ingrese una opción valida.");
            }
        }while(respuesta != 0);
    }
}
