package UI;

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
