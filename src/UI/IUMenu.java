package UI;
import Models.Estudiante;
import Models.Maestro;
import Models.Secretaria;
import static UI.UIEstudiante.*;
import static UI.UIMaestro.*;
import static UI.UISecretaria.*;

import java.util.ArrayList;
import java.util.Scanner;

public class IUMenu {

    public static ArrayList<Maestro> maestros = new ArrayList<>();
    public static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    public static ArrayList<Secretaria> secretarias = new ArrayList<>();
    public static Maestro maestroLogeado;
    public static Estudiante estudianteLogeado;
    public static Secretaria secretariaLogeado;

    public final static String [] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};


    public static void mostrarMenu(){
        int respuesta = 0;
        do{
            System.out.println("..:: Bienvenido ::..");
            System.out.println("Selecciona una opción.");
            System.out.println("1. Maestros");
            System.out.println("2. Estudiantes");
            System.out.println("3. Secretarias");
            System.out.println("0. Salir");

            Scanner in = new Scanner(System.in);
            respuesta = Integer.valueOf(in.nextLine());

            switch(respuesta){
                case 1:
                    loginUsuario(1);
                    System.out.println("..:: Menú Maestros::..");
                    break;
                case 2:
                    loginUsuario(2);
                    System.out.println("..:: Menú Estudiantes::..");
                    estudianteMenu();
                    break;
                case 3:
                    loginUsuario(3);
                    System.out.println("..:: Menú Secretaria ::..");
                    secretariaMenu();

                case 0:
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Por favor ingrese una opción válida");
            }
        }while(respuesta != 0);
    }

    public static void loginUsuario(int tipoUsuario){
        // 1 maestro
        // 2 Estudiante
        // 3 Secretaria
        boolean bandera = true;
        do{
            System.out.println("Ingresa tu correo");
            Scanner in = new Scanner(System.in);
            String correo = in.nextLine();

            if(tipoUsuario == 1){
                for(Maestro maestro : maestros){
                    if(maestro.getCorreo().equals(correo)){
                        System.out.println("Hola maestro: " + maestro.getNombre());
                        bandera = false;
                        maestroLogeado = maestro;
                        maestroMenu();
                    }
                }
            }
            if (tipoUsuario == 2){
                for(Estudiante estudiante : estudiantes){
                    if(estudiante.getCorreo().equals(correo)){
                        System.out.println("Hola estudiante: " + estudiante.getNombre());
                        estudianteLogeado = estudiante;
                        bandera = false;
                        estudianteMenu();
                    }
                }
            }
            if(tipoUsuario == 3){
                for(Secretaria secretaria : secretarias){
                    if(secretaria.getCorreo().equals(correo)){
                        System.out.println("Hola secretaria: " + secretaria.getNombre());
                        bandera = false;
                        secretariaLogeado = secretaria;
                    }
                }
            }
        }while(true);


    }


//    public static void estudianteMenu(){
//        int respuesta = 0;
//        do{
//            System.out.println("..:: Estudiantes ::..");
//            System.out.println("1. Agendar tutoria");
//            System.out.println("2. Mis tutorias");
//            System.out.println("0. Calcelar");
//
//            Scanner in = new Scanner(System.in);
//            respuesta = Integer.valueOf(in.nextLine());
//
//            switch(respuesta){
//                case 1:
//                    System.out.println("..:: Agendar tutoria ::..");
//                    System.out.println("Selecciona una opcion.");
//                    for(int i = 1; i <= MESES.length; i++){
//                        System.out.println(i + ". " + MESES[i-1]);
//                    }
//                    break;
//                case 2:
//                    System.out.println("..:: Mis tutorias ::.."); break;
//                case 0:
//                    System.out.println("Saliendo..."); break;
//                default:
//                    System.out.println("Por favor ingrese una opción valida.");
//            }
//        }while(respuesta != 0);
//    }

}
