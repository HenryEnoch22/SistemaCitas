package UI;

import java.util.Scanner;

    public class UISecretaria {
        public static void secretariaMenu(){
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
}



