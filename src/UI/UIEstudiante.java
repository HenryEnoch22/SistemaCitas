package UI;

import Models.Maestro;

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

    private static void agendarTutoria() {
        System.out.println("..:: Agendar tutoria ::..");
        //1. Maestro 1
        //1. Tutoria 1
        //2. Tutoria 2
        //2. Maestro
        //1. Tutoria 1
        //3. Maestro
        //1. Tutorias 1


    }

    private static void listarTutorias() {
        System.out.println("..:: Mis tutorias ::..");
    }
}
